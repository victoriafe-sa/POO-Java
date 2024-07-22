package Aula11;

public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();  UMA CLASSE ABSTRATA NÃO PODE SER INSTANCIADA

        Visitante v1 = new Visitante();
        v1.setIdade(18);
        v1.setNome("Luisa");
        v1.setSexo("F");
        v1.detalhes();

        Aluno a1 = new Aluno();
        a1.setCurso("ADS");
        a1.setMatr(1258);
        a1.setNome("Leo");
        a1.setIdade(24);
        a1.setSexo("M");
        a1.pagarMensal();

        Bolsista b1 = new Bolsista();
        b1.setCurso("ADM");
        b1.setMatr(12522);
        b1.setNome("Gabriela");
        b1.setIdade(27);
        b1.setSexo("F");
        b1.pagarMensal();
        b1.setBolsa(25f);
    }
}
