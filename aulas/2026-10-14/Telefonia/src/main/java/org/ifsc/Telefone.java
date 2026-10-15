package org.ifsc;

public class Telefone extends Produto{

    private boolean disco;


    public Telefone(long id, String numSerie, String modelo, double peso, Dimensao dimensao, boolean disco) {
        super(id, numSerie, modelo, peso, dimensao);
        this.disco = disco;
    }
}
