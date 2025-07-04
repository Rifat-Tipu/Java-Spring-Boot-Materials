package com.example.LearningPortal.controller;

import com.example.LearningPortal.entity.Review;
import com.example.LearningPortal.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/portal")
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/review/add")
    public ResponseEntity<String> addReview(@RequestBody Review review) {
        reviewService.addReview(review);
        return ResponseEntity.ok("Review added successfully!");
    }

    @GetMapping("/review/get")
    public ResponseEntity<List<Review>> getAllReviews() {
        return ResponseEntity.ok(reviewService.getAllReviews());
    }

    @PutMapping("/review/update/{id}")
    public ResponseEntity<String> updateReview(@PathVariable int id, @RequestBody Review review) {
        reviewService.updateReview(id, review);
        return ResponseEntity.ok("Review updated successfully!");
    }

    @DeleteMapping("/review/delete/{id}")
    public ResponseEntity<String> deleteReview(@PathVariable int id) {
        reviewService.deleteReview(id);
        return ResponseEntity.ok("Review deleted successfully!");
    }
}
