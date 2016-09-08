package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() throws Exception   {
    	String message = System.getenv("POWERED_BY");
        String hostname = java.net.InetAddress.getLocalHost().getHostName();
        if (message == null) {
            message = "Deis ff";
        }
        return "Powered by " + message + " - " + hostname;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}