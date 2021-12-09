/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;
import java.util.Calendar;
import java.util.ArrayList;
/**
 *
 * @author Nozawa
 */
public class Locacao {
    private int codigoLocacao;
    private int codigoCliente;
    private int codigoFuncionario;
    private Calendar dataLocacao;
    private Calendar dataDevolucao;
    private float valorTotal;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private boolean finalizada;

    public Locacao(int codigoLocacao, int codigoCliente, int codigoFuncionario, Calendar dataLocacao, Calendar dataDevolucao, float valorTotal, Pagamento formaPagamento, boolean finalizada) {
        this.codigoLocacao = codigoLocacao;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = new ArrayList();
        this.finalizada = finalizada;
    }

    public int getCodigoLocacao() {
        return codigoLocacao;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setCodigoLocacao(int codigoLocacao) {
        this.codigoLocacao = codigoLocacao;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    public float calcularValorTotal(){
        return valorTotal;
    }
    
    public boolean possuiSeguro(){
        if(segurosContratados.size() < 1)
            return false;
        else
            return true;
    }
    
    public boolean verificarAtraso(){
        if(finalizada){
            return false;
        }else{
            Calendar data = Calendar.getInstance();  
            return data.before(dataDevolucao);
        }
    }

    @Override
    public String toString() {
        String retorno = "Código de locacação: " + Integer.toString(codigoLocacao) + "\nCódigo do cliente: " + Integer.toString(codigoCliente) + "\nCódigo do Funcionário: " + Integer.toString(codigoFuncionario) + "\nData de locação: " + dataLocacao.get(Calendar.DATE) + "/" + dataLocacao.get(Calendar.MONTH) + "/" + dataLocacao.get(Calendar.YEAR) + "\nData de devolução: " + dataDevolucao.get(Calendar.DATE) + "/" + dataDevolucao.get(Calendar.MONTH) + "/" + dataDevolucao.get(Calendar.YEAR) + "\nValor Total: " + Float.toString(calcularValorTotal()) + "\nForma de pagamento: " + formaPagamento.getTipoPagamento() + "\nSeguros contratados: \n";
        for(Seguro seguro: segurosContratados){
            retorno += segurosContratados.toString();
        }
        retorno += "\nFinalizada: ";
        if(finalizada)
            retorno += "Não";
        else
            retorno += "Sim";
        return retorno;
    }
    
}