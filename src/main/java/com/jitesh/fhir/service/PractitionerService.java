package com.jitesh.fhir.service;

import java.util.Optional;

import com.jitesh.fhir.practitioner.model.Practitioner;


public interface PractitionerService {

	Practitioner save(Practitioner t);
	Optional<Practitioner> findById(String id);
	

}
