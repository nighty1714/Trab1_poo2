/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;

import java.io.Serializable;

/**
 *
 * @author Nozawa
 */
public class Seguro implements Serializable{
    private int codigoSeguro;
    private String nome;
    private String tipo;
    private String descricao;
    private float valor;

    public Seguro(int codigoSeguro, String nome, String tipo, String descricao, float valor) {
        this.codigoSeguro = codigoSeguro;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodigoSeguro() {
        return codigoSeguro;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return "Código do seguro: " + Integer.toString(codigoSeguro) + "\nNome: " + nome + "\nTipo: " + tipo + "\nDescrição: " + descricao + "\nValor: " + Float.toString(valor);
    }
}
