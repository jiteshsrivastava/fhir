package com.jitesh.fhir.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jitesh.fhir.practitioner.model.Practitioner;
import com.jitesh.fhir.service.PractitionerService;

@RestController
@RequestMapping("practitioner/")
public class FirstRestController {

	@Autowired
	PractitionerService practitionerService;

	@GetMapping("{id}")
	public ResponseEntity<?> findbyid(@PathVariable String id) {
			Optional<Practitioner>  p= practitionerService.findById(id);
			return p.isPresent()?  ResponseEntity.status(HttpStatus.CREATED).body(p.get()):ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	@PostMapping
	public Practitioner getReq(@RequestBody Practitioner practitioner) {
		return practitionerService.save(practitioner);
	}
}
