package com.sds.vuestarter.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.h2.tools.Server;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import liquibase.integration.spring.SpringLiquibase;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

    @Autowired ApplicationContext applicationContext;

    @Bean
    public SpringLiquibase liquibaseSetting(DataSource dataSource, LiquibaseProperties liquibaseProperties) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog("classpath:liquibase.xml");
        liquibase.setContexts(liquibaseProperties.getContexts());
        liquibase.setDefaultSchema(liquibaseProperties.getDefaultSchema());
        liquibase.setDropFirst(liquibaseProperties.isDropFirst());
        liquibase.setShouldRun(liquibaseProperties.isEnabled());
        return liquibase;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setVfs(SpringBootVFS.class);
        sessionFactoryBean.setTypeAliasesPackage("com.sds.vuestarter.entity");
        sessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis.config.xml"));
        sessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/**/*.xml"));
        return sessionFactoryBean.getObject();
    }
    
    @Bean
    public Server h2TcpServer() throws SQLException {
        return Server.createTcpServer().start();
    }
}
