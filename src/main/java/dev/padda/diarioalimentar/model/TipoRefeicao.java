package dev.padda.diarioalimentar.model;

public enum TipoRefeicao {

    CAFE_MANHA("Café da manhã"),
    ALMOCO("Almoço"),
    CAFE_TARDE("Café da tarde"),
    JANTA("Janta"),
    CEIA("Ceia"),
    LANCHE("Lanche");

    private String descricao;

    TipoRefeicao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
