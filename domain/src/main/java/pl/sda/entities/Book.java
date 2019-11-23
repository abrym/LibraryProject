package pl.sda.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "borrow")
    private Boolean borrow;

    @Column(name = "category")
    private String category;

    @Column(name = "isbn_number")
    private String isbn;

    @Column(name = "number_of_pages")
    private Integer pages;

    @Column(name = "release_date")
    private Data releaseDate;

    @Column(name = "summary")
    private String summary;

    @Column(name = "title_name")
    private String title;
}
