package com.lilong.design;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author lilong
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Slf4j
public class DesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);
        log.info("设计模式模块启动成功");
    }

}
