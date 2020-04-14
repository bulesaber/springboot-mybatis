package com.github.dkp.springbootapiproject.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.github.dkp.springnbootapiproject.mbg.mapper","com.github.dkp.springnbootapiproject.dao"})
public class MyBatisConfig {
}
