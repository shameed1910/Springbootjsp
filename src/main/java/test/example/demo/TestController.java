package test.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
	@RequestMapping("/login")
	public String test()
	{
		return "login";

	}

}
