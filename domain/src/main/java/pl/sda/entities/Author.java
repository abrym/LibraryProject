package pl.sda.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Author {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generuje klucz i wykorzystuje klucz identyfikowany
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_place")
    private String birthPlace;
}
