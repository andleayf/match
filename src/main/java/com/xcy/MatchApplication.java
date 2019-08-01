package com.xcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
//@EnableElasticsearchRepositories(basePackages ="com.xcy.repository")
public class MatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatchApplication.class);
    }

}
