package Aula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;


    public void mudarTrab(){
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor(){
        return setor;
    }
    public void setSetor(String s){
        this.setor = s;
    }

    public Boolean getTrabalhando(){
        return trabalhando;
    }
    public void setTrabalhando(Boolean t){
        this.trabalhando = t;
    }
}
