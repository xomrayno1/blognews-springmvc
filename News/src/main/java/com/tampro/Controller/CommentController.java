package com.tampro.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

import com.tampro.Domain.Comment;
import com.tampro.Domain.News;
import com.tampro.Service.CategoryService;
import com.tampro.Service.CommentService;
import com.tampro.Service.NewsService;

@Controller
public class CommentController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	NewsService newService;
	@Autowired
	CommentService commentService;
	
	@PostMapping(value= {"/add-comment"})
	public String home(ModelMap map,HttpServletRequest request) {
		String name = request.getParameter("name");
		String email =request.getParameter("email");
		String content = request.getParameter("content");
		String url = request.getParameter("url");
		Comment comment = new Comment();
		comment.setContent(content);
		comment.setEmail(email);
		comment.setName(name);
		News news = newService.getNewsByUrl(url);
		comment.setNews(news);
		commentService.addComment(comment);
		
		return "redirect:/tin-tuc/"+url;
	}
}
