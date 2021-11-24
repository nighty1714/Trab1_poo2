/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;

/**
 *
 * @author Nozawa
 */
public abstract class Veiculo {
    protected int codigoVeiculo;
    protected String nomeModelo;
    protected String montadora;
    protected int anoFabricacao;
    protected String placa;
    protected String categoria;
    protected float valorFipe;
    protected float valorDiaria;
    protected boolean alugado;

    public Veiculo(int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, String placa, String categoria, float valorFipe, float valorDiaria, boolean alugado) {
        this.codigoVeiculo = codigoVeiculo;
        this.nomeModelo = nomeModelo;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.categoria = categoria;
        this.valorFipe = valorFipe;
        this.valorDiaria = valorDiaria;
        this.alugado = alugado;
    }
    
    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getValorFipe() {
        return valorFipe;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValorFipe(float valorFipe) {
        this.valorFipe = valorFipe;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    public abstract float calcularValorDiaria();
    
    public boolean estaAlugado(){
        return alugado;
    }
    
    public void alugar(){
        setAlugado(true);
    }
    
    public void devolver(){
        setAlugado(false);
    }

    @Override
    public String toString() {
        return "Veiculo{" + "codigoVeiculo=" + codigoVeiculo + ", nomeModelo=" + nomeModelo + ", montadora=" + montadora + ", anoFabricacao=" + anoFabricacao + ", placa=" + placa + ", categoria=" + categoria + ", valorFipe=" + valorFipe + ", valorDiaria=" + valorDiaria + ", alugado=" + alugado + '}';
    }
    
    
}
