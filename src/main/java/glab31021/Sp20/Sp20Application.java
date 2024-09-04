package glab31021.Sp20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sp20Application {

	public static void main(String[] args) {
		SpringApplication.run(Sp20Application.class, args);
	}

}
