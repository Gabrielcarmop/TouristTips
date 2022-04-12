package com.example.springmvc.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    @NotBlank(message = "O nome do ponto turistico não pode ser vazio ")
    @Size(min = 3, max = 50, message = "O nome deve conter no minimo 3 caracteres")
    private String nome;
    @NotBlank(message = "O estado do ponto turistico não pode ser vazio ")
    @Size(min = 3, max = 50, message = "O estado  deve conter no minimo 3 caracteres")
    private String estado;
    @NotBlank(message = "O cidade do ponto turistico não pode ser vazio ")
    @Size(min = 3, max = 50, message = "A cidade deve conter no minimo 3 caracteres")
    private String Cidade;
    @NotNull
    private String horarioFunc;
    @NotNull
    private String site;
    @NotNull
    private String telefone;
    private String avaliacao;
    @Digits(integer = 6,fraction = 2,message = "O Telefone deve ser preenchido com dígitos")
    private Double preco;





    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getHorarioFunc() {
        return horarioFunc;
    }

    public void setHorarioFunc(String horarioFunc) {
        this.horarioFunc = horarioFunc;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
