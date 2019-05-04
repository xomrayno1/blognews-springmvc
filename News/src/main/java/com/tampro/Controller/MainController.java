package com.tampro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tampro.Repository.NewsRepository;
import com.tampro.Service.CategoryService;

@Controller
public class MainController {


	@Autowired
	CategoryService categoryService;
	@Autowired
	NewsRepository newsRepository;
	
	@GetMapping(value= {"/","home"})
	public String home(ModelMap map) {
		return "home";
	}
	@GetMapping(value= "/{url}")
	public String listcontent(@PathVariable("url")String url,ModelMap map) {
    map.addAttribute("listContent", categoryService.getCategoryByUrl(url));
		return "listcontent";
	}

	@GetMapping(value= "/tin-tuc/{url}")
	public String content(ModelMap map,@PathVariable("url")String url) {
  
		map.addAttribute("news", newsRepository.getNewsByUrl(url));
		return "content";
	}

	
}
