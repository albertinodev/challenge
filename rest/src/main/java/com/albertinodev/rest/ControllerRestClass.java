package com.albertinodev.rest;

import org.json.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Albertino Augusto */

@RestController
@RequestMapping(value = "/")
public class ControllerRestClass {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping(value = "/sum") // sum controller
    public String producer(@RequestParam("a") String a, @RequestParam("b") String b) {

        String operation = a + b;
        amqpTemplate.convertAndSend("calc", "sumCalc", operation);

        // Response to client here
        return "";
    }


    @GetMapping(value = "/divide") // divide controller
    public String producer(@RequestParam("a") String a, @RequestParam("b") String b) {

        String operation = a + b;
        amqpTemplate.convertAndSend("calc", "divideCalc", operation);

        // Response to client here
        return "";
    }


    @GetMapping(value = "/multiply") // multiply controller
    public String producer(@RequestParam("a") String a, @RequestParam("b") String b) {

        String operation = a + b;
        amqpTemplate.convertAndSend("calc", "multiplyCalc", operation);

        // Response to client here
        return "";
    }


    @GetMapping(value = "/subtract") // subtract controller
    public String producer(@RequestParam("a") String a, @RequestParam("b") String b) {

        String operation = a + b;
        amqpTemplate.convertAndSend("calc", "subtractCalc", operation);

        // Response to client here
        return "";
    }

}
