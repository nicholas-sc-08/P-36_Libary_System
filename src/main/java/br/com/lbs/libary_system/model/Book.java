package br.com.lbs.libary_system.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "tbl_book") 
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Book {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "title", length = 50, nullable = false, unique = true)
    private String title;

    @Column(name = "description", length = 200, nullable = true)
    private String description;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "author", length = 30, nullable = false)
    private String author;

    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;
}
