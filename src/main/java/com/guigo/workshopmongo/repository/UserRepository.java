package com.guigo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.guigo.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> { //<tipo da classe de dominio que irá gerencias, qual tipo do ID desta Classe>

	
}
