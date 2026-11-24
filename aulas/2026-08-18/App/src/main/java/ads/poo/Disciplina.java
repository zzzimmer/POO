package ads.poo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    int id;
    boolean ativa;
    private String ementa;

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getId() {
        return id;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
}
