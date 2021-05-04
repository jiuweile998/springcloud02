package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wlg
 * @create_time 2021-05-01 下午 15:54
 * @function
 */
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于使用consul或者zookeeper作为注册中心时，注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
