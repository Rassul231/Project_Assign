package models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "people")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullname;
    private boolean gender;
    private float gpa;
    private String occupation;
    private int salary;
    private String education;
    private boolean married;
    private String phone;
    private String university;
    private String address;
    private int count;
}