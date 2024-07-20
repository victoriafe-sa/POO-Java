package Aula06;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;    
    private boolean tocando;

    //METODOS ESPECIAIS

    public ControleRemoto(){  //METODO CONSTRUTOR
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){ //METODO ACESSOR
        return this.volume;
    }

    private void setVolume(int v){ //METOD MODIFICADOR
        this.volume = v;
    }

    private boolean getLigado(){ //METODO ACESSOR
        return this.ligado;
    }

    private void setLigado(boolean l){ //METOD MODIFICADOR
        this.ligado = l;
    }

    private boolean getTocando(){ //METODO ACESSOR
        return this.tocando;
    }

    private void setTocando(boolean t){ //METOD MODIFICADOR
        this.tocando = t;
    }

    //METODOS ABSTRATOS

    public void ligar(){ 
        this.setLigado(true);
    }
    
    public void desligar(){
        this.setLigado(false);
    }
    
    public void abriMenu(){
        System.out.println("---------MENU----------");
        System.out.println("Ligado? " + this.getLigado());
        System.out.println("Tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i=0; i<=this.getVolume(); i+=10){
            System.out.print(" °");
        }
        System.out.println("");
    }
    
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    public void maisVolume(){
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    public void menosVolume(){
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    public void play(){
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    public void pause(){
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
