package fr.efrei.springrag.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleResource {

    @GetMapping("/samples/{value}")
    public String hello(@PathVariable(value = "value", required = false) final String value) {
        return "Hello " + value + "!";
    }

    /* @GetMapping("/samples/dto/{value}")
    public Sample helloJson(@PathVariable(value = "value", required = false) final String value) {
        String s1 = "Hello " + value + "!";
        return new Sample(s1);
    } */
}