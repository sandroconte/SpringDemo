package it.dstech.demo.restservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping()
public class GreetingController {

    @Value("${sentry.name}")
    private String name;

    @Value("${sentry.profile}")
    private String profile;

    @Value("${sentry.dns}")
    private String dns;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/properties")
    public String properties(){
        String properties = "name: " + this.name +  "; profile: " + profile + "; dns: " + dns;
        return properties;
    }
}
