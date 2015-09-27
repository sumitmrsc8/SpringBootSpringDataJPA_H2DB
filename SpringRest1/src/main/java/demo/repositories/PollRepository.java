package demo.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.entities.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
