package br.aulasbackend.petshop_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // ALTERAR PARA O "ENDEREÇO 0-1 -> 1-M USUÁRIO"
    @Column(name = "destinatario", nullable = false)
    private String destinatario;

    @Column(name = "logradouro", nullable = false)
    private String logradouro;
    
    @Column(name = "complemento", nullable = false)
    private String complemento;
    
    @Column(name = "cep", nullable = false)
    private String cep;
}