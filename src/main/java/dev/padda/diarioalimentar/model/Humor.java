package dev.padda.diarioalimentar.model;

public enum Humor {

    MUITO_FELIZ("Muito Feliz"),
    FELIZ("Feliz"),
    NORMAL("Normal"),
    DEPRIMIDO("Deprimido"),
    ANSIOSO("Ansioso"),
    CULPA("Culpa"),
    RAIVA("Raiva");

    private String descricao;


    Humor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
