package com.roumaysae.eurekadiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryApplication.class, args);
	}

}
//using this class or this microservice eureka just like : lr micro-service d'enregistrement.
//la gestion de route will be dynamic, on va creer eureka + gestion des routes dunamiques, LOAD BALANCER.