package com.myfirstweb.demo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration//告诉Spring容器来到这个类下面进行检索相关的Bean的方法
@MapperScan("com.myfirstweb.demo.config.dao")//配置Mybatis mapper的扫描路径
public class DataSourceConfiguration {
    //读取application.properties里面的内容
    @Value("${jdbc.driver}")
    private String jdbcDiver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDiver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        //关闭连接后不自动提交（commit）
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }

}
