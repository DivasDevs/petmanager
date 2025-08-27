package br.com.fiap.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private Long id;
    private String nome;
    private String especie;
    private int idade;
    private String raca;
    private String sexo;
    private String nomeTutor;
    private String telefoneTutor;
}
