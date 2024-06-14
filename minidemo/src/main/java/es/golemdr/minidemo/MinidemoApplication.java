package es.golemdr.minidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinidemoApplication.class, args);
		
		System.out.println("#######################                                       #######################");
		System.out.println("####################### Minidemo funcionando correctamente... #######################");
		System.out.println("#######################                                       #######################");
	}

}
