package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;
    private StringBuilder extenso;

    private static final String[] UNIDADES = {
            "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    private static final String [] DEZENAS = {"", "", "vinte", "trinta", "quarenta", "cinquenta"};

    private static String defineUnidade(int n, boolean feminino){
        if (feminino && n == 1){
            return "Uma";
        }
        if (feminino && n == 2){
            return "Duas";
        }
        return UNIDADES[n];
    }

    private static String numeroExtenso(int n, boolean feminino){
        if (n<20){
            return numeroExtenso(n,feminino);
        }
        String texto = DEZENAS[(n/10)];
        if (n % 10 != 0) {
            texto += "e" + defineUnidade(n % 10, feminino)
        }
        return texto;
    }

    public String porExtenso(){
        return numeroExtenso(hora,true) + (hora ==1 ? "hora, " : "horas, ")
                + numeroExtenso(minuto, false) + (minuto)


    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if (hora >=0 && hora<24){
            this.hora = hora;
            return true;
        }else {
            return false;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if (minuto >=0 && minuto<60){
            this.minuto = minuto;
            return true;
        }else {
            return false;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public boolean setSegundo(int segundo) {
        if (segundo >=0 && segundo<60){
        this.segundo = segundo;
        return true;
        }else {
            return false;
        }
    }

    public Horario(){

    }

    public Horario(int hora){
        this(hora,0,0);
    }

    public Horario (int hora, int minuto){
        this(hora,minuto,0);
    }

    public Horario(int hora, int minuto, int segundo) {
        if (segundo >= 0 && segundo < 60 &&
            minuto >= 0 && minuto < 60 &&
            hora >= 0 && hora <24){
                this.hora = hora;
                this.minuto = minuto;
                this.segundo = segundo;
        }
    }

    //o métdo funciona como format(mascara,valores)
    //o % é o início de um marcador
    //0 preenche o que estiver vazio dentro do marcado
    //2 indica o minimo de casas decimais desse marcado
    //d da o tipo de dado no marcador

    /*
     *   String.format("%02d", 5)    // "05"
     *      String.format("%2d", 5)     // " 5"  (espaço, sem o 0)
     *       String.format("%02d", 123)  // "123" (largura é mínima, não corta)
     */

    public String toString(){
        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }

}
