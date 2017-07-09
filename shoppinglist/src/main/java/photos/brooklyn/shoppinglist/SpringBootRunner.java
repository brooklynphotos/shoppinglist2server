package photos.brooklyn.shoppinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="photos.brooklyn.shoppinglist")
public class SpringBootRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunner.class, args);
	}

}
