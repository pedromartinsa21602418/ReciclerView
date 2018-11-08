package pt.ulp.ei.recyclerviewexample;

class Linguagem {
    String designacao;
    int valor;

    public Linguagem() {

    }

    public Linguagem(String designacao) {
        this.designacao = designacao;
        this.valor = 0;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
