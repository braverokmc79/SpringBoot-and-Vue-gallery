package org.africalib.gallery.backend.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

//@Entity
@Getter
@Entity
@Table(name="members")
@ToString
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private  Integer id;

    @Column(length = 50, nullable = false, unique = true)
    private String email;


    @Column(length = 100, nullable = false)
    private String password;




}
