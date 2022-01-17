package com.zensar;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MacysOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacysOrderApplication.class, args);
	}
	
	@Bean
	public Docket getDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.zensar"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
			      "MACY'S Message Order REST Api documention",
			      "MACY'S Message Order REST api doc released by Zensar",
			      "1.0",
			      "http://zensar.com",
			      new Contact("MACY'S Message Order","http://xensar.com","contact@zensar.com"),
			      "HTTP",
			      "GPA",
			      new ArrayList<VendorExtension>());
	}

}
