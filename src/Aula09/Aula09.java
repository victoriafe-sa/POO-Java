package Aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Julia", 25, "Feminino");
        p[1] = new Pessoa("Marcos", 18, "Masculino");

        l[0] = new Livro("Assim que acaba","Collin Hover",250,p[1]);
        l[1] = new Livro("Harry Potter","J.K.",450,p[0]);
        l[2] = new Livro("Andando com os lobos","Clarince L.",50,p[0]);

        
        l[0].abrir();
        l[0].avançarPag();
        l[0].detalhes();

        l[1].abrir();
        l[1].folhear(250);
        l[1].detalhes();

        l[2].detalhes();
    }
}
