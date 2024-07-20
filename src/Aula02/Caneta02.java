package Aula02;

public class Caneta02 {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Uma caneta "+ this.cor);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga);
    System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rasbiscar");
        } else{
            System.out.println("Estou rasbiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
