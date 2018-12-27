package com.example.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud-example
 * @description:
 * @author: pangxuegang@ruijie.com.cn
 * @create: 2018-12-27 19:22
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@RestController
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }
    private static String SERVICE_NAME ="EUREKA-SERVER";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/invoke")
    public String getInvoke(){
       return restTemplate.getForObject("http://"+SERVICE_NAME+"/getInfo",String.class);
    }

    @Bean(name = "restTemplate")
    @LoadBalanced
    public RestTemplate getRestTempplate(){
        return  new RestTemplate();
    }
}
