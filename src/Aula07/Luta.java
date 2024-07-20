package Aula07;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador df) {
        this.desafiante = df;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean a) {
        this.aprovada = a;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("## DESAFIADO ##");
            this.desafiado.apresentar();
            System.out.println("");
            System.out.println("## DESAFIANTE ##");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor) {
                case 0: //EMPATE
                    System.out.println("");
                    System.out.println("========== RESULTADO ============");
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //DESAFIADO VENCE
                    System.out.println("");
                    System.out.println("========== RESULTADO ============");
                    System.out.println(desafiado.getNome() + " ganhou a luta.");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //DESAFIANTE VENCE
                    System.out.println("");
                    System.out.println("========== RESULTADO ============");
                    System.out.println(desafiante.getNome() + " venceu a luta.");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
