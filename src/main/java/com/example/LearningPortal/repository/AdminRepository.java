package com.example.LearningPortal.repository;

import com.example.LearningPortal.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository <Admin,Integer>{
}
