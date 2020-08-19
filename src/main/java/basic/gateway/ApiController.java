package basic.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import reactor.blockhound.BlockHound;

@SpringBootApplication
public class ApiController {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		//BlockHound.install();
		SpringApplication.run(ApiController.class, args);
	}
}
