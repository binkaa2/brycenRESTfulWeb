package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dao.StudentDao;

@RestController
public class mainRestController {

	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("/index")
	@ResponseBody
	public String welcome() {
		return "Welcome back my master!";
	}
}
