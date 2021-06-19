package ru.uralsib.it.resttemplate.game_dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

//    @JsonProperty("ID")
//    private int id;
//    @JsonProperty("Name")
//    private String nameUser;
//    @JsonProperty("position")
//    private String position;
//    @JsonProperty("salary")
//    private double salary;

    private int id;
    private String nameUser;
    private String position;
    private double salary;


    public UserDTO() {
    }

    public UserDTO(int id, String nameUser, String position, double salary) {
        this.id = id;
        this.nameUser = nameUser;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
