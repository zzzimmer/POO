package ads.poo;

public class Caneta {

    private double cargaDeTinta;


    public Caneta(double cargaDeTinta) {
        this.cargaDeTinta = cargaDeTinta;
    }

    public double getCargaDeTinta() {
        return cargaDeTinta;
    }

    public double desenhar(double y1, double x1, double y2, double x2) {

        double debito = calculaDebito(y1, x1, y2, x2);

        if (cargaDeTinta - debito >= 0) {

            cargaDeTinta = cargaDeTinta - debito;

            return (int) debito;

        }
        return -1;
    }

    private double calculaDebito(double y1, double x1, double y2, double x2) {
        return Math.sqrt(
                (
                        Math.pow((y1 - y2), 2) + Math.pow((y2 - x2), 2))
        );
    }
}
