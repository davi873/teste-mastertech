package br.com.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses = PontoMastertechApplication.class)
public class PontoMastertechApplication {

	public static void main(String[] args) {

		SpringApplication.run(PontoMastertechApplication.class, args);
	}

}
