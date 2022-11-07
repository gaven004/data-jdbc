package com.g.datajdbc;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRolesRepository extends
        PagingAndSortingRepository<SysRole, Long> {
}
