package com.jitesh.fhir.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitesh.fhir.mongodb.respository.ItemRepository;
import com.jitesh.fhir.practitioner.model.Practitioner;

@Service
public class PractitionerServiceImpl implements PractitionerService {

	@Autowired
	ItemRepository itemRepository;

	@Override
	public Practitioner save(Practitioner t) {
		return itemRepository.save(t);
	}

	@Override
	// TODO Auto-generated method stub
	public Optional<Practitioner> findById(String id) {
		return itemRepository.findById(id);
	}
}
