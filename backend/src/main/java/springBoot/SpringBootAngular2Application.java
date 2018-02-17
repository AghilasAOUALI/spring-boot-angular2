package springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import src.service.Population;

import javax.xml.ws.Endpoint;

@SpringBootApplication
public class SpringBootAngular2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngular2Application.class, args);
		String url = "http://localhost:8081/";
		Endpoint.publish(url, new Population());
		System.out.println(url);
	}
}
