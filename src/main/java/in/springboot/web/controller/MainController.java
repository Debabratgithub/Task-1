package in.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.springboot.web.service.IeUserService;
import in.springboot.web.user.User;

@Controller
public class MainController {

	@Autowired
	private IeUserService service;

	@RequestMapping("/")
	public String home() {
		return "formPage";
	}

	@PostMapping("/save")
	public String createUser(@ModelAttribute("user") User user) {
		service.saveUser(user);
		return "success";
	}

	
	public String getAlluser(User user) {
		List<User> details = service.getAllUsers();
		System.out.println(details);
		return "getDetails_page";


	}
}
