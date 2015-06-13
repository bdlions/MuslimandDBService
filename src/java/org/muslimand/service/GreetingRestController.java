package org.muslimand.service;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.muslimand.service.Greeting;
/**
 *
 * @author alamgir
 */
@RestController
@RequestMapping("/ctrl")
public class GreetingRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
