package com.bridgelabz.RestApiCall;


import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiCallController {

    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello from BridgeLabz.";
    }

    @GetMapping("query")
    public String getParamMessage(@RequestParam String name){
        return "Hello "  + name +  " from BridgeLabz";
    }

    @GetMapping("param/{name}")
    public String getPathMessage(@PathVariable String name){
        return "Hello "  + name + " from Bridgelabz";
    }

    @PostMapping("post")
    public String getJsonMessage(@RequestBody Person person){
        return "Hello " +person.getFirstname()+ " " +person.getLastname()+ " from Bridgelabz";
    }

    @PutMapping("put/{firstname}")
    public String getPutMessage(@PathVariable String firstname, @RequestParam String lastname) {
        return "Hello " + firstname + " " + lastname + " from BridgeLabz.";
    }
}
