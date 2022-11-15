package com.checker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	
	@GetMapping("/home")
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/actionPage")
	@ResponseBody
	public String actionPage(@RequestParam ("WORD") String WORD) {
		String s1 =WORD;
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
			s2+=s1.charAt(i);
		String result="";
		if(s1.equals(s2))
			result=WORD+(" It is palimdrome");
		else 
			result=WORD+(" Its not a palimdrome");
		return result;
	}

}
