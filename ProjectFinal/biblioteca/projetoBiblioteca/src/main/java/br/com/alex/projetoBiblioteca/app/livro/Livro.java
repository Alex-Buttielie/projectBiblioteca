package br.com.alex.projetoBiblioteca.app.livro;

import javax.persistence.*;

@Entity
@Table
public class Livro {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autores;
    private String editores;
    private String anoDePublicacao;
    private String edicaoDoLivro;
    private String data;
    private String opiniao;

    public Livro() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditores() {
        return editores;
    }

    public void setEditores(String editores) {
        this.editores = editores;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getEdicaoDoLivro() {
        return edicaoDoLivro;
    }

    public void setEdicaoDoLivro(String edicaoDoLivro) {
        this.edicaoDoLivro = edicaoDoLivro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }
}
