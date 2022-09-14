package com.example.backend.repo;

import com.example.backend.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepo extends JpaRepository<Comment, Long> {
    void deleteById(Long id);

    Optional<Comment> findCommentById(Long id);
}
