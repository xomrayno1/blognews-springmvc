package com.tampro.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tampro.Domain.Comment;
import com.tampro.Repository.CommentRepository;
import com.tampro.Service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository commentRepository;
	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		commentRepository.save(comment);
	} 

}
