package com.System.clinic.entity;

import com.System.clinic.entity.Enums.Auxilios;
import com.System.clinic.entity.Enums.Dependentes;
import com.System.clinic.entity.Enums.Emprego;
import com.System.clinic.entity.Enums.Escolaridade;
import com.System.clinic.entity.Enums.EstadoCivil;
import com.System.clinic.entity.Enums.Genero;
import com.System.clinic.entity.Enums.Raca;
import com.System.clinic.entity.Enums.Religiao;

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
@Table(name = "TB_Socioeconomico")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocioeconomicoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Gênero - Enum com opção "Outro"
  @Column
  @NotNull(message = "O campo gênero é obrigatório")
  private Genero genero;

  @Column
  private String outroGenero;

  // Raça - Enum com opção "Outro"
  @Column
  @NotNull(message = "O campo raça é obrigatório")
  private Raca raca;

  @Column
  private String outraRaca;

  // Escolaridade - Enum com opção "Outro"
  @Column
  @NotNull(message = "O campo escolaridade é obrigatório")
  private Escolaridade escolaridade;

  @Column
  private String outraEscolaridade;

  // Estado Civil - Enum com opção "Outro"
  @Column
  @NotNull(message = "O campo estado civil é obrigatório")
  private EstadoCivil estadoCivil;

  @Column
  private String outroEstadoCivil;

  // Emprego - Enum com opção "Outro"
  @Column
  @NotNull(message = "O campo emprego é obrigatório")
  private Emprego emprego;

  @Column
  private String outroEmprego;

  // Auxílios - Enum com opção "Outro"
  @Column
  @NotNull(message = "O campo auxílios é obrigatório")
  private Auxilios auxilios;

  @Column
  private String outrosAuxilios;

  // Dependentes - Enum com valores pré-definidos
  @Column
  @NotNull(message = "O campo dependentes é obrigatório")
  private Dependentes dependentes;

  // Religião - Enum com opção "Outro"
  @Column
  @NotNull(message = "O campo religião é obrigatório")
  private Religiao religiao;

  @Column
  private String outraReligiao;

  public SocioeconomicoEntity(Long id) {
    this.id = id;
  }
}
