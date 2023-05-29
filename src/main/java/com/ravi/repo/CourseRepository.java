package com.ravi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.binding.Course;

public interface CourseRepository extends  JpaRepository<Course, Integer>{

}
