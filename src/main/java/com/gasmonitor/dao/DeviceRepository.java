package com.gasmonitor.dao;

import com.gasmonitor.entity.Device;
import com.gasmonitor.pros.Consts;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author saplmm
 * @date 2017/6/26
 */
@CacheConfig(cacheNames = Consts.CACHE_DEVICE)
public interface DeviceRepository extends JpaRepository<Device, Long> {

    /**
     * 通过站点找到所有的设备
     *
     * @param siteId
     * @param pageable
     * @return
     * @Cacheable(key = "'" + Consts.CACHE_DEVICE_LIST_SITE + "'+#p0")
     */
    @Query("select a from Device as a where a.siteId = ?1 and ( a.hardwareId like ?2 or a.name like ?3)")
    Page<Device> findBySiteId(Long siteId, String hardwareId, String name, Pageable pageable);

    /**
     * 通过硬件id找到对应的硬件
     * 这里需要缓存的原因是，当有数据发送过来的时候，需要得到设备的信息，如果每次都从数据库中读取，mysql压力会很大
     *
     * @param hardwareId
     * @return
     */
    @Cacheable(key = "'" + Consts.CACHE_DEVICE_HARDWAREID + "'+#p0")
    Device findByHardwareId(String hardwareId);

    @Override
    @Cacheable(key = "'" + Consts.CACHE_DEVICE_ID + "'+#p0")
    Device findOne(Long id);


    @Query("select count(*) from Device as a where a.siteId in (select id from Site as s where s.tenantId = ?1)")
    Integer countByTenantId(Long tenantId);

    /**
     * 通过站点找到父节点的id 找到设备
     *
     * @param siteId
     * @param parent
     * @return
     */
    List<Device> findBySiteIdAndParent(Long siteId, Long parent);

    /**
     * 通过租户ID找到他所有的设备
     *
     * @param tenantId
     * @return
     */
    @Query("select a from Device as a where a.siteId in (select id from Site as s where s.tenantId = :tenantId)")
    List<Device> findByTenantId(@Param("tenantId") Long tenantId);

    /**
     * 更新设备的状态
     *
     * @param did
     * @param s
     * @return
     */
    @Modifying
    @Query("update  Device set status = :s where id = :did")
    Integer setStatus(@Param("did") Long did, @Param("s") Integer s);


    /**
     * 保存
     *
     * @param device
     * @return
     */
    @Override
    @Caching(evict = {
            @CacheEvict(key = "'" + Consts.CACHE_DEVICE_LIST_SITE + "'" + "+#p0.siteId"),
            @CacheEvict(key = "'" + Consts.CACHE_DEVICE_HARDWAREID + "'" + "+#p0.hardwareId", condition = "#p0.hardwareId !=null"),
            @CacheEvict(key = "'" + Consts.CACHE_DEVICE_ID + "'" + "+#p0.id", condition = "#p0.id !=null")
    })
    Device save(Device device);
}
