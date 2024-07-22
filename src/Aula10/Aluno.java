package Aula10;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    public void cancelarMatr(){
        System.out.println("Matricula sera cancelada!");
    }

    public int getMatr(){
        return matr;
    }
    public void setMatr(int m){
        this.matr = m;
    }

    public String getCurso(){
        return curso;
    }
    public void setCurso(String c){
        this.curso = c;
    }
}
