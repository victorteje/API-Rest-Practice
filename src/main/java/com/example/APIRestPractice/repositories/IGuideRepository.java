package com.example.APIRestPractice.repositories;

import com.example.APIRestPractice.models.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGuideRepository extends JpaRepository<Guide, Long> {
}
