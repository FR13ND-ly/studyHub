package com.example.backend.repo;

import com.example.backend.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReportRepo extends JpaRepository<Report, Long> {
    void deleteById(Long id);

    Optional<Report> findReportById(Long id);
}
