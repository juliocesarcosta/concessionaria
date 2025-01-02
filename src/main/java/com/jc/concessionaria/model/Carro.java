package com.jc.concessionaria.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private Long id;

    @Column(name = "modelo", nullable = false)
    @JsonProperty("modelo")
    private String modelo;

    @Column(name = "ano", nullable = false)
    @JsonProperty("ano")
    private String ano;

    @Column(name = "km", nullable = false)
    @JsonProperty("km")
    private String km;

    @Column(name = "cambio", nullable = false)
    @JsonProperty("cambio")
    private String cambio;

    @Column(name = "portas", nullable = false)
    @JsonProperty("portas")
    private String portas;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id_cliente")
    @JsonProperty("clienteId")
    private Cliente cliente;

    // Adicionando manualmente os getters e setters para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


