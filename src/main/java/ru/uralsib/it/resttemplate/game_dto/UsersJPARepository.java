package ru.uralsib.it.resttemplate.game_dto;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersJPARepository extends CrudRepository<UserJPA,Integer> {
    List<UserJPA> findAll();
}
