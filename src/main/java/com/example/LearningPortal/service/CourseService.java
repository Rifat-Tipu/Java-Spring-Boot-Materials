package com.example.LearningPortal.service;

import com.example.LearningPortal.entity.Course;
import com.example.LearningPortal.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getCourseDetails() {
        return courseRepository.findAll();
    }

    public void updateCourse(int id, Course updateCourse) {
       Course course=courseRepository.findById(id).orElseThrow(()->new RuntimeException("Course not found"));
       course.setTitle(updateCourse.getTitle());
       course.setDescription(updateCourse.getDescription());
       course.setPrice(updateCourse.getPrice());
       course.setCategory(updateCourse.getCategory());
       course.setInstructor(updateCourse.getInstructor());
       courseRepository.save(course);

}

    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
    }
