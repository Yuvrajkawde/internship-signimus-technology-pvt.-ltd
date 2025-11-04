package com.signimus.Student.Managment.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="student_profiles")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false, columnDefinition = "text")
    private String address;

    //One profile can have one student
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="student_id")
    private Studentt student;


}