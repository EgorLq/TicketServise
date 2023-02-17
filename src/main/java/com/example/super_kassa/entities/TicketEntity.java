package com.example.super_kassa.entities;
import com.example.super_kassa.config.MyJson;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sk_example_table")

public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   @Column(name = "obj")
   @JdbcTypeCode(SqlTypes.JSON)
   private MyJson obj;
}
