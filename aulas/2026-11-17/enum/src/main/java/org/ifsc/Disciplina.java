package org.ifsc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disciplina {

    private String sigla;
    private List<EDiaDaSemana> diaDaSemana;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<EDiaDaSemana> getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(ArrayList<EDiaDaSemana> diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public Disciplina(String sigla, EDiaDaSemana[] diaDaSemana) {
        this.sigla = sigla;
        this.diaDaSemana = Arrays.asList(diaDaSemana);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "Sigla='" + sigla + '\'' +
                ", Dias com aula =" +
                diaDaSemana.toString() +
                '}';
    }
}
