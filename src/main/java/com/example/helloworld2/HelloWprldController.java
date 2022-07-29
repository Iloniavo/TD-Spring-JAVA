<<<<<<< HEAD
package com.example.helloworld2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWprldController {
    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
=======
package com.example.helloworld2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWprldController {
    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
>>>>>>> f8e4d61d901565995985be8c2c2cc326e9e6d1d1
