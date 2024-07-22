package Aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Joao");
        p4.setNome("Carla");

        p1.setIdade(25);
        p2.setSexo("F");

        p2.setCurso("Informatica");
        p3.setSalario(2500.78f);
        p4.setSetor("Estoque");

        
        p1.detalhes();
        p2.detalhes();
        p3.detalhes();
        p4.detalhes();
    }

}
