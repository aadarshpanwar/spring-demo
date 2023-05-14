package com.example.demo.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Runner implements CommandLineRunner {

   ObjectMapper mapper = new ObjectMapper();
   @Override
   public void run(String... args) throws Exception {
        // while(true) {
        //     File file = new File("./cibil.json");
        //     TypeReference<Map<String, Object>> ref = new TypeReference<Map<String, Object>>() {};
        //     Map<String, Object> json =  mapper.readValue(file, ref);
        //     System.out.println(json.size());
        // }
       
   }

  

}