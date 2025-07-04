package com.example.LearningPortal.service;

import com.example.LearningPortal.entity.Review;
import com.example.LearningPortal.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public void addReview(Review review) {
        reviewRepository.save(review);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public void updateReview(int id, Review updatedReview) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found with ID: " + id));

        review.setComment(updatedReview.getComment());
        review.setRating(updatedReview.getRating());
        review.setAdmin(updatedReview.getAdmin());
        review.setCourse(updatedReview.getCourse());
        review.setStudent(updatedReview.getStudent());

        reviewRepository.save(review);
    }

    public void deleteReview(int id) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found with ID: " + id));
        reviewRepository.delete(review);
    }
}
