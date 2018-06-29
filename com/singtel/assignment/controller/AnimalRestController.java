package com.singtel.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.singtel.assignment.ISwimmable;

@Controller
public class AnimalRestController {
	
	@Autowired
	private IAnimalService animalService;
	
	/**
	 * This method will return the animal counts based on their abilities.
	 * Type can be FLY, WALK, SING, SWIM
	 * @param type
	 * @return
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(path="/getAnimalCountByType", method = RequestMethod.GET)
	public ResponseEntity<Integer> getAnimalCountByType(String type){
		return new ResponseEntity<Integer>(animalService.getAnimalCountByType(type), HttpStatus.OK);
	}
	
	/**
	 * This method adds a new Dolphin to the database
	 * @param dolphin
	 * @return
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(path="/addDolphin", method = RequestMethod.POST)
	public ResponseEntity<DolphinDto> saveSurvey(@RequestBody ISwimmable dolphin){
		DolphinDto savedDolphin = animalService.saveDolphind(dolphin);
		return new ResponseEntity<DolphinDto>(savedDolphin, HttpStatus.OK);
	}
	
		
}
