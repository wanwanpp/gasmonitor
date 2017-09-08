package com.gasmonitor.dao;

import com.gasmonitor.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by saplmm on 2017/6/10.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);


    //    @Cacheable
    Page<User> findByTenantIdAndUsernameContaining(Long tenantId, String username, Pageable pageable);

    @Cacheable
    List<User> findAll();

    List<User> findByTenantId(Long tenantId);

}
