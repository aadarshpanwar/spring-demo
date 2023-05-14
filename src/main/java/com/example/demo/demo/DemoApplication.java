package com.example.demo.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	@GetMapping("/test") 
	public void test() throws InterruptedException {
		for(int i = 0;i<10;++i){
			List<Integer> list = new ArrayList<>();
			for(int j = 0;j<1000000;++j) {
				list.add(j);
			}
			System.out.println(list.size());
			Thread.sleep(500);
		}
	}
}


