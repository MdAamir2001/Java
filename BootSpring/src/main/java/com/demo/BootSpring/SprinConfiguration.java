package com.demo.BootSpring;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.demo.BootSpring"})
@PropertySource(value= {"classpath:/application.properties"})
public class SprinConfiguration {
//	@Bean
//	public ProductComponent getProduct() {
//		return new ProductComponent();
//	}
//	@Bean
//	public CartComponent getCart() {
//		return new CartComponent();
//	}
}