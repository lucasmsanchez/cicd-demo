package restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String baseLine = "HellooOoOoOooOOOOO!";
	
	@GetMapping("/greeting")
	public void greeting () {
		System.out.println(baseLine);
	}

}
