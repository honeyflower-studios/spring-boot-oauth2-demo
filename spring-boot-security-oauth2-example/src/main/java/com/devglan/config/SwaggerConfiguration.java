package com.devglan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Eugene Hanikblum
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("REST API")
        		.apiInfo(getApiInfo())
                .select()
                //.apis(RequestHandlerSelectors.basePackage("com.rebring.controller.api"))
                .build();
    }
    
    private ApiInfo getApiInfo() {
    	Contact contact = new Contact("ReBring R&D", "https://twitter.com/rebring", "support@rebring.com");
    	return new ApiInfoBuilder()
    			.title("ReBring rest api")
    			.description("rest api for rebring services")
    			.version("1.0.0")
    			.contact(contact)
    			.build();
    	
    }
}