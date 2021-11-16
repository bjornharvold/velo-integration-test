package com.velo.integration;

import com.velopayments.oa3.config.VeloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(VeloConfig.class)
public class VeloIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeloIntegrationApplication.class, args);
	}

}
