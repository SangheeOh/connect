package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Menu;
import com.example.demo.service.MenuService;

@Controller
public class MainController {

	
	@Autowired
	private MenuService menuService;
	
	@GetMapping("/")
	 public String test() {
		 return "index"; 
	 }

	
	@PostMapping("/start.me")
	public String insertMenu(@ModelAttribute Menu menu) {
		
		String memID=menu.getMemID();
		String title=menu.getTitle();
		
		//System.out.println(memID);
		
		menuService.insertMenu(menu);
		
		return "redirect:/";
	}
}
