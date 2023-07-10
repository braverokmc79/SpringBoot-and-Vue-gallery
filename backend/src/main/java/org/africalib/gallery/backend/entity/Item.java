package org.africalib.gallery.backend.entity;


import jakarta.persistence.*;
import lombok.Getter;

//@Entity
@Getter
@Entity
@Table(name="items")
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "items_id")
    private  Integer id;

    @Column(length = 50, nullable = false)
    private String name;


    @Column(length = 100)
    private String imgPath;


    @Column
    private Integer price;

    @Column
    private Integer discountPer;


    @Column(length = 255)
    private String description;

}
