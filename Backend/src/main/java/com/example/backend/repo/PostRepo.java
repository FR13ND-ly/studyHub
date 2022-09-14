package com.example.backend.repo;

import com.example.backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepo extends JpaRepository<Post, Long> {
    void deleteById(Long id);

    Optional<Post> findPostById(Long id);
}
