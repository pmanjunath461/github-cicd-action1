package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdAction1Application {

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to javatechie....";
	}

//	echo "# github-cicd-action1" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/pmanjunath461/github-cicd-action1.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdAction1Application.class, args);
	}

}
