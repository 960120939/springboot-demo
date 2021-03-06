package com.wz;

import com.wz.model.User;
import com.wz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * Created by wangzi on 2017-08-20.
 */
@SpringBootApplication
public class ShardingJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }

    @Autowired
    private UserService service;

    @PostConstruct
    private void run(){
        System.out.println(service.findByIds(Arrays.asList(1L)));
    }
}
