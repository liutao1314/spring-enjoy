package com.example.cap07;

import com.example.cap07.aware.Light;
import com.example.cap07.dao.TestDao;
import org.springframework.context.annotation.*;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
@Configuration
@ComponentScan(value = {"com.example.cap07.controller", "com.example.cap07.service", "com.example.cap07.dao", "com.example.cap07.bean"})
@Import({Light.class})
@PropertySource(value = "classpath:pro/test.properties")
public class Cap07Config {

//    @Primary
    @Bean("testDao")
    public TestDao testDao() {
        TestDao dao = new TestDao();
        dao.setFlag("2");
        return dao;
    }
}
