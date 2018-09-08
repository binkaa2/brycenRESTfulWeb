package RESTFULweb.sbcr;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controller"})
public class DemoApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationTests.class, args);
	}
}
