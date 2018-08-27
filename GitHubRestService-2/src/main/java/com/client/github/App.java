package com.client.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.web.client.RestTemplate;

import com.client.github.model.Repository;



/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages={"com.stackroute"})
@EntityScan(basePackageClasses=Repository.class)
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
