package ProjetoFinal;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("POO em Java");
        v[1] = new Video("POO em PHP");
        v[2] = new Video("POO em Python");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Maria", 18, "F", "maria");
        g[1] = new Gafanhoto("Jonas", 25, "M", "joh");
        g[2] = new Gafanhoto("Victoria", 18, "F", "vic");

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar(32.5f);
        vis[1] = new Visualizacao(g[0], v[1]);

        System.out.println("VIZUALIZAÇÃO \n ------------------------");
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());

        /*
        System.out.println("VIDEOS \n ------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("GAFANHOTOS \n ------------------------");
        System.out.println(g[2].toString());
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}
