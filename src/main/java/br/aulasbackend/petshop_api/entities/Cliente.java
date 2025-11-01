package br.aulasbackend.petshop_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String nome;

    @Column(name = "telefone", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String telefone;

    @Column(name = "email", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String email;

}