package com.example.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "classroom")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String className;

    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
    private Collection<Students> students;

    @ManyToOne()
    @JoinColumn(name = "teachers_id", nullable = false)
    private Teachers teachers;
}
