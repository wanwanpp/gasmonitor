package com.gasmonitor.dao;

import com.gasmonitor.entity.DeviceWarnEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by saplmm on 2017/8/28.
 */
public interface DeviceWarnEventRepository extends JpaRepository<DeviceWarnEvent, Long> {
    List<DeviceWarnEvent> findByTenantIdAndStatus(Long tenantId, Integer status);

    List<DeviceWarnEvent> findByDeviceIdAndStatus(Long deviceId, Integer status);

    @Query("update DeviceWarnEvent set status = :status ,msg =:msg where id = :warnId")
    @Modifying
    int updateStatus(@Param("status") Integer status, @Param("warnId") Long warnId, @Param("msg") String msg);


}
