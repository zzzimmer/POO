package ads.poo.jogoAviao;

import java.util.ArrayList;

public class Aviao {

    private int tripulantes;
    private int maxPassageiros;
    private int litrosCombustivel;
    private boolean ligado;
    private ArrayList<Motor> motores;

    public Aviao(int tripulantes,
                 int maxPassageiros,
                 int litrosCombustivel,
                 boolean ligado,
                 ArrayList<Motor> motores) {

        this.tripulantes = tripulantes;
        this.maxPassageiros = maxPassageiros;
        this.litrosCombustivel = litrosCombustivel;
        this.ligado = ligado;
        this.motores = motores;
    }
}
