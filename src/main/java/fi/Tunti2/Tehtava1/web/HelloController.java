package fi.Tunti2.Tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller


public class HelloController {
	
	@RequestMapping("/hello")
	public String vastaus(@RequestParam(value="age") int age,
	@RequestParam(value="name") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "helloPerson";
		
	}

}
