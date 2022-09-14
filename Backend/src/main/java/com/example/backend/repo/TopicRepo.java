package com.example.backend.repo;

import com.example.backend.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepo extends JpaRepository<Topic, Long> {
    void deleteTopicById(Long id);

    Optional<Topic> findTopicById(Long id);
}
