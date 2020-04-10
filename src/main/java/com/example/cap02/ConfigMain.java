package com.example.cap02;

import com.example.cap01.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/27
 */
//配置类===配置文件
@Configuration
public class ConfigMain {

    //给容器中注入一个bean，类型为返回值
    @Bean
    public Person p() {
        return new Person("tao", 22);
    }
}
