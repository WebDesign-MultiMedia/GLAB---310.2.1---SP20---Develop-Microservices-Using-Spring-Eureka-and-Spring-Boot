package glab31021.Sp20_EurekaClientTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"glab31021.Sp20_EurekaClientTwo"})
@EnableDiscoveryClient
public class Sp20EurekaClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp20EurekaClientTwoApplication.class, args);
	}

}
