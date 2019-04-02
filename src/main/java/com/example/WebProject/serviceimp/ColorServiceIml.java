package com.example.WebProject.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WebProject.entity.Color;
import com.example.WebProject.repository.ColorRepository;
import com.example.WebProject.service.ColorService;
@Service
public class ColorServiceIml 	implements ColorService {
		
		@Autowired
	    private ColorRepository colorRepository;

		
		  @Override
		    public Iterable<Color> findAll() {
		        return colorRepository.findAll();
		    }

		    @Override
		    public List<Color> search(String q) {
		        return colorRepository.findByNameContaining(q);
		    }

		    @Override
		    public Color findOne(int id) {
		        return colorRepository.findOne(id);
		    }

		    @Override
		    public void save(Color contact) {
		    	colorRepository.save(contact);
		    }
		    
		    @Override
		    public void delete(int id) {
		    	colorRepository.delete(id);
		    }
		    @Override
		    public List<Color> findByNameContaining(String q){
		    	return colorRepository.findByNameContaining(q);
		    }
	}