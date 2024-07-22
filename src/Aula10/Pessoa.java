package Aula10;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    public void fazerAniver(){
        this.idade++;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
    public void detalhes(){
        System.out.println("------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }
}
