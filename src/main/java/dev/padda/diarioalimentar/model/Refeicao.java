package dev.padda.diarioalimentar.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class Refeicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "descricaoSentimento")
    private String descricaoSentimento;

    @Column(name = "humor")
    private Humor humor;

    @Column(name = "tipo_refeicao")
    private TipoRefeicao tipoRefeicao;

    public Refeicao(){}

    public Refeicao(Long id, String descricao, LocalDate data, String descricaoSentimento, Humor humor, TipoRefeicao tipoRefeicao) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.descricaoSentimento = descricaoSentimento;
        this.humor = humor;
        this.tipoRefeicao = tipoRefeicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricaoSentimento() {
        return descricaoSentimento;
    }

    public void setDescricaoSentimento(String descricaoSentimento) {
        this.descricaoSentimento = descricaoSentimento;
    }

    public Humor getHumor() {
        return humor;
    }

    public void setHumor(Humor humor) {
        this.humor = humor;
    }

    public TipoRefeicao getTipoRefeicao() {
        return tipoRefeicao;
    }

    public void setTipoRefeicao(TipoRefeicao tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }
}
