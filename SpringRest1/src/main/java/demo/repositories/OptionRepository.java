package demo.repositories;

import org.springframework.data.repository.CrudRepository;

import demo.entities.Option;

public interface OptionRepository extends CrudRepository<Option, Long>{

}
