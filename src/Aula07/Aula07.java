package Aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty boy", "França", 31,1.75f,68.9f,11,3,1);

        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,57.8f,14,2,3);

        l[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);

        l[3] = new Lutador("Dead Code","Australia",28,1.93f,81.6f,13,0,2);

        l[4] = new Lutador("Calcharo","China",21,1.89f,89.4f,15,3,7);

        l[5] = new Lutador("Neuvillete","França",25,1.87f,90.1f,15,1,0);

        Luta luta = new Luta();
        luta.marcarLuta(l[5],l[4]); //Definir os participantes aqui
        luta.lutar();

        /*l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
        l[4].apresentar();
        l[5].apresentar();
        

        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();*/
        l[4].status();
        l[5].status();
    }
}
