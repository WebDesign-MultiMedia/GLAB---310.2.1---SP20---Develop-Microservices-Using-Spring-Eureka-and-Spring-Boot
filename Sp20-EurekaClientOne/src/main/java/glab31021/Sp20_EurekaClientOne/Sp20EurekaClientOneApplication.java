package glab31021.Sp20_EurekaClientOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"glab31021.Sp20_EurekaClientOne"})
@EnableDiscoveryClient
public class Sp20EurekaClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp20EurekaClientOneApplication.class, args);
	}

}
