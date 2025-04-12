package com.System.clinic.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "TB_formulario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class formularioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private SocioeconomicoEntity socioeconomico;

    @OneToOne(cascade = CascadeType.ALL)
    private MarcadoresConsumoEntity marcadoresConsumo;

    @OneToOne(cascade = CascadeType.ALL)
    private EbiaEntity ebia;

    private LocalDate dataPreenchimento = LocalDate.now();

}
