package com.System.clinic.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Questionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate data;
    private String nome;
    private Integer idade;
    private String genero;
    private String escolaridade;
    private Integer tamanhoFamilia;
    private String emprego;
    private String auxilios;
    
    private Boolean preocupacaoAlimentosAcabarem;
    private Boolean alimentosAcabaramAntesComprar;
    
    @ElementCollection
    private List<String> refeicoesDia;
    
    
}