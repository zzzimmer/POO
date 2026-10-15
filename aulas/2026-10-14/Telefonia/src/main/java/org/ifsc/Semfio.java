package org.ifsc;

public class Semfio extends Telefone {

    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public Semfio(long id, String numSerie, String modelo, double peso, Dimensao dimensao, boolean disco) {
        super(id, numSerie, modelo, peso, dimensao, disco);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSemfio{" +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distanciaOperacao=" + distanciaOperacao +
                '}';
    }
}
