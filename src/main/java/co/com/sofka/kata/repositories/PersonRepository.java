package co.com.sofka.kata.repositories;

import co.com.sofka.kata.models.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

    Mono<Person> findByNombre(String name);
}
