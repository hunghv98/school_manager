package com.example.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;

    @Column(unique = true)
    private String email;
    @Column
    private String address;
    @Column(unique = true)
    private int phoneNumber;
    @Column
    private int age;
    @Column
    private Gender gender;

    private enum Gender{
        MALE,
        FEMALE
    }

}
