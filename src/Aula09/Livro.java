package Aula09;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(){
        System.out.println("----------------------------------");
        System.out.println("Titulo do livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de páginas: " + getTotPag());
        System.out.println("Pagina atual: " + getPagAtual());
        System.out.println("O livro esta aberto?  " + getAberto());
        System.out.println("Sobre o leitor: nome: " + leitor.getNome()+", idade: "+ leitor.getIdade() + ", sexo: "+ leitor.getSexo());

    }

    public Livro(String t, String a, int tp, Pessoa l){
        this.titulo = t;
        this.autor = a;
        this.totPag = tp;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = l;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }

    public int getTotPag(){
        return totPag;
    }
    public void setTotPag(int tp){
        this.totPag = tp;
    }

    public int getPagAtual(){
        return pagAtual;
    }
    public void setPagAtual(int pa){
        this.pagAtual = pa;
    }

    public Boolean getAberto(){
        return aberto;
    }
    public void setAberto(Boolean ab){
        this.aberto = ab;
    }

    public Pessoa getLeitor(){
        return leitor;
    }
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p>this.totPag) {
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
        this.pagAtual = p;
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
