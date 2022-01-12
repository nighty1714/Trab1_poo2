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
public class Configuracao implements Serializable{
    private String arquivoLocacoes;
    private String arquivoVeiculos;
    private String arquivoClientes;
    private String arquivoFuncionarios;
    private String arquivoSeguros;
    
    public Configuracao() {
        this.arquivoLocacoes = "./locacoes.data";
        this.arquivoVeiculos = "./veiculos.data";
        this.arquivoClientes = "./clientes.data";
        this.arquivoFuncionarios = "./funcionarios.data";
        this.arquivoSeguros = "./seguros.data";
    }

    public Configuracao(String arquivoLocacoes, String arquivoVeiculos, String arquivoClientes, String arquivoFuncionarios, String arquivoSeguros) {
        this.arquivoLocacoes = arquivoLocacoes;
        this.arquivoVeiculos = arquivoVeiculos;
        this.arquivoClientes = arquivoClientes;
        this.arquivoFuncionarios = arquivoFuncionarios;
        this.arquivoSeguros = arquivoSeguros;
    }

    public String getArquivoLocacoes() {
        return arquivoLocacoes;
    }

    public String getArquivoVeiculos() {
        return arquivoVeiculos;
    }

    public String getArquivoClientes() {
        return arquivoClientes;
    }

    public String getArquivoFuncionarios() {
        return arquivoFuncionarios;
    }

    public String getArquivoSeguros() {
        return arquivoSeguros;
    }

    public void setArquivoLocacoes(String arquivoLocacoes) {
        this.arquivoLocacoes = arquivoLocacoes;
    }

    public void setArquivoVeiculos(String arquivoVeiculos) {
        this.arquivoVeiculos = arquivoVeiculos;
    }

    public void setArquivoClientes(String arquivoClientes) {
        this.arquivoClientes = arquivoClientes;
    }

    public void setArquivoFuncionarios(String arquivoFuncionarios) {
        this.arquivoFuncionarios = arquivoFuncionarios;
    }

    public void setArquivoSeguros(String arquivoSeguros) {
        this.arquivoSeguros = arquivoSeguros;
    }
    
    
    
    
}
