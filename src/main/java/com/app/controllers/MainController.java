package com.app.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/app")
	public String getWelcomePage(Map<String, Object> model) {
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String dateTime = dateTimeFormat.format(LocalDateTime.now());
		Map<String,String> params = new HashMap<>();
		params.put("date_time", dateTime);
		model.put("date_time",dateTime);
		
		return "welcomePage";
	}
	
}
