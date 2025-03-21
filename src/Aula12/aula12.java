package Aula12;

public class aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.locomover();
        m.emitirSom();
        m.alimentar();

        r.setCorEscama("Verde");
        r.setIdade(15);

        a.locomover();
        a.emitirSom();
        a.fazerNinho();

        p.alimentar();
        p.emitirSom();
    
    }
}
