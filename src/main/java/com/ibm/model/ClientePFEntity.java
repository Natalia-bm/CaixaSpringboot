package com.ibm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ClientePFEntity {
    @Id //chave estrangeira
    @GeneratedValue(strategy = GenerationType.AUTO) // chave estrangeira
    private int id;
    private String cpf;
    private LocalDateTime dataNascimento;
    private String banco;
    private LocalDateTime dataAdesao;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "cliente_id")
    private ContaEntity cliente_id;
}
