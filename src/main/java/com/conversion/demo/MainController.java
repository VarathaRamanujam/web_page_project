package com.conversion.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	
	@GetMapping("/ramanujam")
	//@ResponseBody
	public String home() {
		return "index";
	}
	
	
	@GetMapping("/takeConversion")
	@ResponseBody
	public String takeConversion(@RequestParam("time")String time) {
		 String ss[] = time.split(":");
	        String s1="";
	        String s2=ss[1];
	        String s3="";
	        
	        int hour = Integer.parseInt(ss[0]);// 7
	        s1=ss[0];
	        if(hour ==12){
	            if(ss[2].contains("AM")){
	              s1="00";  
	            }
	        }
	        
	        if(ss[2].contains("PM")){
	            if(hour==12){
	                s1=ss[0];
	            }
	            else
	            s1=hour+12+"";
	        }
	       
	      
	      //step3 
	       for(int i=0;i<2;i++)
	       s3+=ss[2].charAt(i);
	       
	        System.out.println( s1+":"+s2+":"+s3);
	        return  s1+":"+s2+":"+s3;

	}
	
	

}
