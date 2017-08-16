package com.gasmonitor.dao;

import com.gasmonitor.entity.Device;
import com.gasmonitor.pros.Consts;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by saplmm on 2017/6/26.
 */
@CacheConfig(cacheNames = Consts.CACHE_DEVICE)
public interface DeviceRepository extends JpaRepository<Device, Long> {

    //通过站点找到所有的设备
    @Cacheable(key = "'" + Consts.CACHE_DEVICE_LIST_SITE + "'+#p0")
    List<Device> findBySiteId(Long siteId);

    @Cacheable(key = "'" + Consts.CACHE_DEVICE_HARDWAREID + "'+#p0")
    Device findByHardwareId(String hardwareId);

    @Override
    @Cacheable(key = "'" + Consts.CACHE_DEVICE_ID + "'+#p0")
    Device findOne(Long id);


    @Query("select count(*) from Device as a where a.siteId in (select id from Site as s where s.tenantId = ?1)")
    Integer countByTenantId(Long tenantId);

    //通过站点找到父节点的id 找到设备
    List<Device> findBySiteIdAndParent(Long siteId, Long parent);

    //    通过租户ID找到他所有的设备
    @Query("select a from Device as a where a.siteId in (select id from Site as s where s.tenantId = ?1)")
    List<Device> findByTenantId(Long tenantId);

    @Modifying
    @Query("update  Device set status = :s where id = :did")
    Integer setStatus(@Param("did") Long did, @Param("s") Integer s);

    @Override
    @Caching(evict = {
            @CacheEvict(key = "'" + Consts.CACHE_DEVICE_LIST_SITE + "'+#p0.siteId"),
            @CacheEvict(key = "'" + Consts.CACHE_DEVICE_HARDWAREID + "'+#p0.hardwareId", condition = "#p0.hardwareId !=null"),
            @CacheEvict(key = "'" + Consts.CACHE_DEVICE_ID + "'+#p0.id", condition = "#p0.id !=null")
    })
    Device save(Device device);


}
