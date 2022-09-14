package com.example.backend.repo;

import com.example.backend.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FollowRepo extends JpaRepository<Follow, Long> {
    void deleteById(Long id);

    Optional<Follow> findFollowById(Long id);
}
