package fr.afpajulien.webapp.model;

import lombok.Data;

@Data
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String password;
    private String mail;

}
