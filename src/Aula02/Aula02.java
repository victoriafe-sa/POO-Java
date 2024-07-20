package Aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta02 c1 = new Caneta02();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();

    }
} 