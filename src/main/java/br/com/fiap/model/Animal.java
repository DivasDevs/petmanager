package br.com.fiap.model;

public class Animal {
    private Long id;
    private String nome;
    private String especie;
    private int idade;
    private String raca;
    private String sexo;
    private String nomeTutor;
    private String telefoneTutor;

    // Default constructor
    public Animal() {}

    // Constructor with all fields
    public Animal(Long id, String nome, String especie, int idade, String raca, String sexo, String nomeTutor, String telefoneTutor) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;
        this.sexo = sexo;
        this.nomeTutor = nomeTutor;
        this.telefoneTutor = telefoneTutor;
    }

    // Getters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEspecie() { return especie; }
    public int getIdade() { return idade; }
    public String getRaca() { return raca; }
    public String getSexo() { return sexo; }
    public String getNomeTutor() { return nomeTutor; }
    public String getTelefoneTutor() { return telefoneTutor; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEspecie(String especie) { this.especie = especie; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setRaca(String raca) { this.raca = raca; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public void setNomeTutor(String nomeTutor) { this.nomeTutor = nomeTutor; }
    public void setTelefoneTutor(String telefoneTutor) { this.telefoneTutor = telefoneTutor; }
}
