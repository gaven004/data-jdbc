package com.g.datajdbc;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("sys_roles")
public class SysRole implements java.io.Serializable {
    @Id
    private Long id;
    private String name;
    private String status;
}


