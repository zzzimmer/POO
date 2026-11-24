package ads.poo.jogoAviao;

public class Motor {
    private boolean ligado = false;
    private String tipoMotor;
    private Aviao aviao;

    public Motor(String tipoMotor, Aviao aviao) {
        this.tipoMotor = tipoMotor;
        aviao.setMotor(this);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void Ligar(boolean estado) {
        this.ligado = estado;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }


}
