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
public class ClientePJEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cpf;
    private LocalDateTime dataAbertura;
    private String banco;
    private LocalDateTime dataAdesao;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "cliente_id")
    private ContaEntity cliente_id;
}
