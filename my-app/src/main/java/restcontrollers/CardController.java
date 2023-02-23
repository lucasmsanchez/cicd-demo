package restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
	
	@GetMapping("/all")
	public void initializeState () {
		
	}
	
	@PostMapping("/new")
	public void newCard () {
		
	}
	
	@PutMapping("/modify{i}")
	public void modifyCard () {
		
	}
}
