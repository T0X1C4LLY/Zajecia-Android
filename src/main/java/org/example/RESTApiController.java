package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTApiController {

    @GetMapping("/hello")
    String page() {

        return "<script type=\"text/javascript\">" +
                "function helloWorld() { " +
                "document.getElementById(\'in\').value = \"Hello world\"; }" +
                "</script>" +
                "<input type=\"text\" id=\"in\">" +
                "<button onclick=\"helloWorld();\" name=\"but\">Click me</button>";
    }

    String helloWorld(){
        return "Hello World!";
    }

}
