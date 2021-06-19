package ru.uralsib.it.resttemplate.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.uralsib.it.resttemplate.game_dto.UserDTO;
import ru.uralsib.it.resttemplate.game_dto.UsersJPARepository;

import java.util.Collections;
import java.util.List;

@RestController
public class RestControllerMF {

    @GetMapping("/users")
    public List<UserDTO> allUsers(){
        return Collections.singletonList(new UserDTO(10,"Alex","Manager",100.10));
    }

    @GetMapping("/userjpa")
    public String getListUserJPA(){
        return "test users";
    }
}
