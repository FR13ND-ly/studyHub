package com.example.backend.repo;

import com.example.backend.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepo extends JpaRepository<Like, Long> {
    void deleteById(Long id);

    Optional<Like> findLikeById(Long id);
}
