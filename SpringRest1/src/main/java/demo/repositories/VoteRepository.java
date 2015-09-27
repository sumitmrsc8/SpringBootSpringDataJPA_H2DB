package demo.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.entities.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {

}
