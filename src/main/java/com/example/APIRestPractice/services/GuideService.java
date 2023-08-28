package com.example.APIRestPractice.services;

import com.example.APIRestPractice.models.Guide;
import com.example.APIRestPractice.repositories.IGuideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuideService {
    @Autowired
    IGuideRepository guideRepository;

    public List<Guide> getAllGuides(){
        return guideRepository.findAll();
    }

    public Optional<Guide> getGuideById(Long id){
        return guideRepository.findById(id);
    }

    public void createGuide(Guide guide){
        guideRepository.save(guide);
    }

    public void updateGuide(Guide guide, Long id){
        guide.setId(id);
        guideRepository.save(guide);
    }

    public void deleteGuide(Long id){
        guideRepository.deleteById(id);
    }
}
