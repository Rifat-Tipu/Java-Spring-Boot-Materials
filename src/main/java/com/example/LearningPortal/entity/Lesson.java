package com.example.LearningPortal.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length=50)
    private String title;
    private int duration;
    @ManyToOne
    @JoinColumn(name="course_id")
            @JsonBackReference
    Course course;
}
