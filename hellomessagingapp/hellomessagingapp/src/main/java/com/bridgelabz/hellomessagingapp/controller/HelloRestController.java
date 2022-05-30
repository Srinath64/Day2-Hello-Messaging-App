package com.bridgelabz.hellomessagingapp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    //* UC - 1 ------------------>
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello Everyone!!!";
    }

    @RequestMapping(value = {"/hello -w"}, method = RequestMethod.GET)
    public String sayHelloDifferently()
    {
        return "Hello  from BridgeLabz !!!";
    }

    //* UC - 2 --------------------->
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name)
    {
        return "Hello " + name  + " from Bridgelabz !!!";
    }
    
    //* UC - 3 ----------------------->
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name)
    {
        return "Hello " + "Mr/Mrs." + name  + "!!!";
    }
}
