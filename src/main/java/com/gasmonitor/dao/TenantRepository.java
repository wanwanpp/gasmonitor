package com.gasmonitor.dao;

import com.gasmonitor.entity.Tenant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by saplmm on 2017/6/10.
 */
public interface TenantRepository extends JpaRepository<Tenant, Long>, CrudRepository<Tenant, Long> {
    Page<Tenant> findByNameContainingOrCompanyContaining(String name, String company, Pageable requestPage);

    Page<Tenant> findByNameContainingOrCompanyContainingOrderByCreatedateDesc(String name, String company, Pageable requestPage);

    Tenant findByName(String name);
}
