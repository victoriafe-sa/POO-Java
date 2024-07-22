package Aula11;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    public float getBolsa(){
        return bolsa;
    }
    public void setBolsa(float b){
        this.bolsa = b;
    }

    @Override
    public void pagarMensal(){
        System.out.println(this.getNome() + " é bolsista.Pagamento realizado com sucesso");
    }
}
