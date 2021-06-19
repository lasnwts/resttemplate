package ru.uralsib.it.resttemplate.game_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserJPA {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public UserJPA() {
    }

    public UserJPA(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
