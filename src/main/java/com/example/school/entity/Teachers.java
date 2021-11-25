package com.example.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "teachers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teachers extends Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Title title;

    @OneToMany(mappedBy = "teachers", cascade = CascadeType.ALL)
    private Collection<Classroom> classrooms;




    private enum Title{
        Master,
        PhD,
        Professor
    }
}
