package com.dersev.ecampus.api.controller;

import com.dersev.ecampus.models.Lesson;
import com.dersev.ecampus.models.Student;
import com.dersev.ecampus.repositories.LessonDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lessons")
public class LessonsController {

    private final LessonDao lessonService;

    public LessonsController(LessonDao lessonService) {
        this.lessonService = lessonService;
    }
    @PostMapping
    public ResponseEntity add(@RequestBody Lesson lesson)  {

        return ResponseEntity.ok(lessonService.save(lesson));
    }

    @GetMapping("/getall")
    public List<Lesson> getAll(){
        return this.lessonService.findAll();
    }
}
