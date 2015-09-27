package demo.controllers;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.entities.Poll;
import demo.repositories.PollRepository;

@RestController
public class PollController {
	
	@Inject
	private PollRepository pollRepository;
	
	@RequestMapping(value="/polls",method=RequestMethod.GET)
	public ResponseEntity<Iterable<Poll>> getPolls(){
		Iterable<Poll> allPolls=pollRepository.findAll();
		return new ResponseEntity<Iterable<Poll>>(allPolls,HttpStatus.OK);
	}
}
