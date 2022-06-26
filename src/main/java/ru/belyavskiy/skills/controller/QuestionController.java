package ru.belyavskiy.skills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.belyavskiy.skills.entity.Question;
import ru.belyavskiy.skills.service.QuestionService;

import java.util.Objects;
import java.util.Optional;

@Controller
@RequestMapping("/questions")
public class QuestionController {

    public QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Question question){
        return ResponseEntity.ok(questionService.save(question));
    }

    @GetMapping("/{id}")
    public  ResponseEntity findById(@PathVariable Long id){
        Optional<Question> byId = questionService.findById(id);
        return Objects.isNull(byId) ? ResponseEntity.notFound().build() : ResponseEntity.ok(byId);
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(questionService.findAll());

    }
}
