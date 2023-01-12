package com.dersev.ecampus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonDao extends JpaRepository<com.dersev.ecampus.models.Lesson,Integer> {
}
