package com.System.clinic.entity;

import com.System.clinic.entity.Enums.Resposta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_marcadoresConsumo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarcadoresConsumoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta refeicaoComCelular; // Usando o enum Resposta

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta refeicoesDia; // Usando o enum Resposta

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta consumiuFeijao; // Usando o enum Resposta

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta consumiuFrutas; // Usando o enum Resposta

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta consumiuVerduras; // Usando o enum Resposta

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta consumiuHamburguer; // Usando o enum Resposta

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta consumiuBebidasAdocadas; // Usando o enum Resposta

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta consumiuMacarraoInstantaneo; // Usando o enum Resposta

    @Column
    @NotBlank(message = "O campo é obrigatório responder")
    private Resposta consumiuBiscoitos; // Usando o enum Resposta

    public MarcadoresConsumoEntity(Long id) {
        this.id = id;
    }
}
