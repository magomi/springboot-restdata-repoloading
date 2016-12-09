package org.codefromhell.test.repoloading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// exclude V03 (according to http://stackoverflow.com/questions/41046736/how-to-exclude-a-repository-from-component-scan-when-using-spring-data-rest)
@SpringBootApplication
@EnableJpaRepositories(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
                DataRepository.class})
})
//// exclude V02
//@SpringBootApplication
//@ComponentScan(excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
//                DataRepository.class})
//})
//// exclude V01
//@SpringBootApplication(exclude = { DataRepository.class })
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
