package org.ifsc;

public enum EDiaDaSemana {
    DOMINGO(1,"Domingo"),
    SEGUNDA(2,"Segunda-feira"),
    TERCA(3,"Terça-feira"),
    QUARTA(4,"Quarta-feira"),
    QUINTA(5,"Quinta-feira"),
    SEXTA(6,"Sexta-feira"),
    SABADO(7,"Sabado");

    public int codigo;
    public String nome;

    EDiaDaSemana(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
