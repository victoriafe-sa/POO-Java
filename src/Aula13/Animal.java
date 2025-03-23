package Aula13;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void emitirSom();

    public int getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public float getPeso(){
        return peso;
    }
    public void setPeso(Float peso){
        this.peso = peso;
    }

    public int getMembros(){
        return membros;
    }
    public void setMembros(Integer membros){
        this.membros = membros;
    }
}
