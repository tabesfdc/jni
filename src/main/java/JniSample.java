package com.jnisample;

import org.springframework.boot.*;  
import org.springframework.boot.autoconfigure.*;  
import org.springframework.stereotype.*;  
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class JniSample {
    static {
        System.loadLibrary("JniSample");
    }

    public native double exp(double a);
    public native boolean strcmp(String a, String b);

    @RequestMapping("/")
    @ResponseBody
    String home() {
        JniSample s = new JniSample();
        return "Hello World!<br /> Native call :exp(2.0) result => " + s.exp(2.0);
    }

    public static void main(String[] args) {
        JniSample s = new JniSample();
	System.out.println("exp(1.0) -> " + s.exp(1.0));
	System.out.println("exp(2.0) -> " + s.exp(2.0));
	System.out.println("strcmp(\"Mutsuki\", \"Namajima\") -> " + s.strcmp("Mutsuki", "Nakajima"));
	System.out.println("strcmp(\"Mutsuki\", \"Mutsuki\") -> " + s.strcmp("Mutsuki", "Mutsuki"));
	SpringApplication.run(JniSample.class, args);
    }
}
