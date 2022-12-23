package com.aws;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
public class AwsDeploymentAppApplicationTests {
	public static void main(String[] args) {
	SpringApplication.run(AwsDeploymentAppApplication.class,args);
}

@GetMapping("/")
public String Hello() {
	return "Hello this app has been deployed on an ec2 instance";
}
}