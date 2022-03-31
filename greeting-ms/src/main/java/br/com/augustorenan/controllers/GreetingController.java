package br.com.augustorenan.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.augustorenan.configuration.GreetingConfiguration;
import br.com.augustorenan.models.GreetingModel;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
		@Autowired
		private GreetingConfiguration greetingConfiguration;
		
		private static final String template = "%s, %s!";
		private final AtomicLong counter = new AtomicLong();
		
		@GetMapping
		public GreetingModel greeting(@RequestParam(value = "name", defaultValue = "") String name) {
			
			if(name.isEmpty()) name = greetingConfiguration.getDefaultValue();
			
			return new GreetingModel(counter.incrementAndGet(), String.format(template,greetingConfiguration.getGreeting(), name));
		}

}
