package com.tampro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tampro.Domain.Comment;

public interface CommentRepository  extends JpaRepository<Comment, Integer>{

}
