package Aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(float aum){
        this.salario += aum;
    }

    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String e){
        this.especialidade = e;
    }

    public Float getSalario(){
        return salario;
    }
    public void setSalario(Float s){
        this.salario = s;
    }
}
