package com.amdocs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AkankshaProjectSpringApplication {
	@GetMapping("/msg")
	
	public String show()
	{
		int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  return "Factorial of "+number+" is: "+fact;   
	}
	public static void main(String[] args) {
		SpringApplication.run(AkankshaProjectSpringApplication.class,args);
	}

}