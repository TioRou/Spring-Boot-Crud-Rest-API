package com.example.crudrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudrest.models.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	// Custom finder methods
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitle(String title);
}
