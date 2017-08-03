package com.gasmonitor.dao;

import com.gasmonitor.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by saplmm on 2017/6/26.
 */
public interface DeviceRepository extends JpaRepository<Device, Long> {

    //通过站点找到所有的设备
    List<Device> findBySiteId(Long siteId);

    //通过站点找到父节点的id 找到设备
    List<Device> findBySiteIdAndParent(Long siteId, Long parent);

    //    通过租户ID找到他所有的设备
    @Query("select a from Device as a where a.siteId in (select id from Site as s where s.tenantId = ?1)")
    List<Device> findByTenantId(Long tenantId);

    @Modifying
    @Query("update  Device set status = :s where id = :did")
    Integer setStatus(@Param("did") Long did, @Param("s") Integer s);
}
