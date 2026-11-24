package ads.poo;

public class BatedeiraPlanetaria {

    private int id;
//    private String marca;
    private long valor;
    private boolean descontoElegivel;

    public int getId() {
        return id;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public boolean isDescontoElegivel() {
        return descontoElegivel;
    }

    public void setDescontoElegivel(boolean descontoElegivel) {
        this.descontoElegivel = descontoElegivel;
    }
}
