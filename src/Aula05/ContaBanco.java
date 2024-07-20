package Aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;    
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco(){ //METODO CONSTRUTOR
        this.saldo = 0;
        this.status = false;
    }
    
    public void setNumConta(int n){ //METODO MODIFICADOR
        this.numConta = n;
    }

    public int getNumConta(){ //METODO ACESSOR
        return this.numConta;
    }

    public void setTipo(String t){ //METODO MODIFICADOR
        this.tipo = t;
    }

    public String getTipo(){ //METODO ACESSOR
        return this.tipo;
    }

    public void setDono(String d){ //METODO MODIFICADOR
        this.dono = d;
    }

    public String getDono(){ //METODO ACESSOR
        return this.dono;
    }

    public void setSaldo(float f){ //METODO MODIFICADOR
        this.saldo = f;
    }

    public float getSaldo(){ //METODO ACESSOR
        return this.saldo;
    }

    public void setStatus(Boolean s){ //METODO MODIFICADOR
        this.status = s;
    }

    public Boolean getStatus(){ //METODO ACESSOR
        return this.status;
    }

    public void abrirConta(String t){ //METODO PERSONALIZADOS
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){ //METODO PERSONALIZADOS
        if (this.getSaldo()>0) {
            System.out.println("A conta ainda possui saldo");
        }else if(this.getSaldo()<0){
            System.out.println("A conta esta negativada!");
        }else{
            this.setStatus(false);
            System.out.println("Conta de "+this.getDono()+" fechada com sucesso");
        }
    }

    public void depositar(float v){ //METODO PERSONALIZADOS
        if (this.status == true) {
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em conta fechada");
        }
    }

    public void sacar(float v){ //METODO PERSONALIZADOS
        if (this.getStatus()) {
            if (this.getSaldo()>= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossível sacar em uma conta fechada");
        }
    }

    public void pagarMensal(){ //METODO PERSONALIZADOS
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        }else{
            v = 20;
        }
        if (this.getStatus()) {
            setSaldo(getSaldo()-v);
            System.out.println("Mensaliade paga com sucesso");
        }else{
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }
}
