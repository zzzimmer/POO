package org.ifsc;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Disciplina poo = new Disciplina("POO",
                EDiaDaSemana.QUARTA);


//        System.out.println(poo);

        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        Disciplina aoc = new Disciplina("AOC",EDiaDaSemana.TERCA);
        Disciplina log = new Disciplina("ICO",EDiaDaSemana.TERCA);

        disciplinas.add(aoc);
        disciplinas.add(log);

        for (Disciplina diaDaSemana : disciplinas){
            System.out.println(diaDaSemana.getDiaDaSemana());
        }


    }
}
