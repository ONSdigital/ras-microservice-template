package uk.gov.ons.ras.{{cookiecutter.project_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {
        "uk.gov.ons.ras.{{cookiecutter.ComponentScan}}" })

public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}