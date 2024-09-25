package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping({"http://localhost:9000/HelloWorld", "http://localhost:9000/HelloWorld?nom=El meu nom"})
	public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
		return "Hola, " + nom + ". Estàs executant un projecte Maven";
	}
	
	@GetMapping({"http://localhost:9000/HelloWorld2/{nom}", "http://localhost:9000/HelloWorld2/elmeunom"})
	public String saluda2(@PathVariable(required = false) String nom) {

		return "Hola, " + nom + ". Estàs executant un projecte Maven";
	}

}
