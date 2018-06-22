package com.example.simplejsontopojoexample;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SimpleJsonToPojoExampleApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SimpleJsonToPojoExampleApplication.class, args);

        String jsonString = "{\n" +
                "  \"filename\":\"sample.png\",\n" +
                "  \"size\": 324,\n" +
                "  \"directory\":\"C:/folder1/folder2\",\n" +
                "  \"properties\": {\n" +
                "    \"title\":\"Sample Picture\",\n" +
                "    \"author\":\"billybob\"\n" +
                "  }\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();

        File result = mapper.readValue(jsonString, File.class);

        System.out.println();
        System.out.println("--------------------");
        System.out.println("RESULT (File object)");
        System.out.println("---------------------");
        System.out.println("filename : " + result.getFilename());
        System.out.println("size in bytes : " + result.getSize());
        System.out.println("directory : " + result.getDirectory());
        System.out.println("-----");
        System.out.println("title property : " + result.getProperties().getTitle());
        System.out.println("author property : " + result.getProperties().getAuthor());
        System.out.println("--------------------");
        System.out.println();
    }
}
