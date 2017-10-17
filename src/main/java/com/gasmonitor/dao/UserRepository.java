package com.gasmonitor.dao;

import com.gasmonitor.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by saplmm on 2017/6/10.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);

    /**
     * 修改user的密码
     *
     * @param newPassworld
     * @param userId
     */
    @Modifying
    @Query("update User set password = ?1 where id = ?2")
    void updatePassword(String newPassworld, long userId);

    /**
     * 通过名字和租户id查询user列表
     *
     * @param tenantId
     * @param username
     * @param pageable
     * @return
     */
    Page<User> findByTenantIdAndUsernameContaining(Long tenantId, String username, Pageable pageable);

    /**
     * 查询所有的user
     *
     * @return
     */
    @Override
    @Cacheable
    List<User> findAll();

    /**
     * 通过租户查询所有的user
     *
     * @param tenantId
     * @return
     */
    List<User> findByTenantId(Long tenantId);

}
