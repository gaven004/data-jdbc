package com.g.datajdbc;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class DataJdbcApplicationTests {
    @Autowired
    SysRolesRepository repository;

    @Autowired
    SysRolesMapper mapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testBasic() {
        Iterable<SysRole> iterable = repository.findAll();
        Assertions.assertNotNull(iterable);

        log.info("Found roles, using jdbc");

        iterable.forEach(sysRole -> log.info("\t[{}]", sysRole));

        List<SysRole> list = mapper.list();
        Assertions.assertNotNull(list);

        log.info("Found roles, using mybatis");

        list.forEach(sysRole -> log.info("\t[{}]", sysRole));
    }

}
