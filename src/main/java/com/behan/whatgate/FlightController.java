/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.behan.whatgate;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author john
 */
@RestController
public class FlightController {
    
    private static final String template = "Gate %s";
    private final AtomicLong counter = new AtomicLong();
    
    @GetMapping("/flight")
    public Flight flight(@RequestParam(value = "gate", defaultValue = "0") String gate) {
        return new Flight(counter.incrementAndGet(), String.format(template, gate));
    }
}
