package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import resource.UserResource;

/**
 * Created by wen on 2017/3/17.
 * 启动类
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = UserResource.class)
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
