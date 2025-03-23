package Aula13;

public class aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
    
        c.emitirSom();
        m.emitirSom();
        l.emitirSom();

        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 0);
        c.reagir(true);
        c.reagir(false);
        c.reagir(13, 12.40f);
        c.reagir(2,21.0f);
    }
}
