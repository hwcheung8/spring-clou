package com.chaytech.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chaytech@163.com
 * @date 2019/07/31 22:17
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConfigClient_Applicaiton {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClient_Applicaiton.class, args);
    }
}
