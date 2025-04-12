package com.System.clinic.entity;

import com.System.clinic.entity.Enums.Resposta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_Ebia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EbiaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Usando o enum Resposta para as perguntas
    @Column
    @NotNull(message = "Campo obrigatório")
    private Resposta p1;

    @Column
    @NotNull(message = "Campo obrigatório")
    private Resposta p2;

    @Column
    @NotNull(message = "Campo obrigatório")
    private Resposta p3;

    @Column
    @NotNull(message = "Campo obrigatório")
    private Resposta p4;

    @Column
    @NotNull(message = "Campo obrigatório")
    private Resposta p5;

    @Column
    @NotNull(message = "Campo obrigatório")
    private Resposta p6;

    @Column
    @NotNull(message = "Campo obrigatório")
    private Resposta p7;

    @Column
    @NotNull(message = "Campo obrigatório")
    private Resposta p8;

    public EbiaEntity(Long id) {
        this.id = id;
    }
}
