package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping("/")
	public String get() {
		return "Hoşgeldiniz ürünleri listelemek için /products endpointini kullanınız";
	}
	
	@GetMapping("/products")
	public String[] get2() {
		return new String[]{"Telefon","Şarj Aleti","Batarya"};
	}
	
	
}
