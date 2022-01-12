/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;
import trabalho.armazenamento.Armazenamento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author Nozawa
 */
public class Controle implements Serializable{
    private Armazenamento armazenamento;
    
    public ArrayList<Locacao> getLocacoes() {
        return armazenamento.getLocacoes();
    }

    public ArrayList<Veiculo> getVeiculos() {
        return armazenamento.getVeiculos();
    }

    public ArrayList<Usuario> getClientes() {
        return armazenamento.getClientes();
    }

    public ArrayList<Usuario> getFuncionarios() {
        return armazenamento.getFuncionarios();
    }

    public ArrayList<Seguro> getSeguros() {
        return armazenamento.getSeguros();
    }

    public Configuracao getConfiguracoes() {
        return armazenamento.getConfiguracoes();
    }

    public void setLocacoes(ArrayList<Locacao> locacoes) {
        armazenamento.setLocacoes(locacoes);
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        armazenamento.setVeiculos(veiculos);
    }

    public void setClientes(ArrayList<Usuario> clientes) {
        armazenamento.setClientes(clientes);
    }

    public void setFuncionarios(ArrayList<Usuario> funcionarios) {
        armazenamento.setFuncionarios(funcionarios);
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        armazenamento.setSeguros(seguros);
    }

    public void setConfiguracoes(Configuracao configuracoes) {
        armazenamento.setConfiguracoes(configuracoes);
    }
    
    public void salvar(String path){
        armazenamento.salvar(path);
    }
    
    public void carregar(String path){
        armazenamento.carregar(path);
    }
    
    public void adicionarCliente(Cliente cliente){
        armazenamento.adicionarCliente(cliente);
    }
    
    public void adicionarVeiculo(Veiculo veiculo){
        armazenamento.adicionarVeiculo(veiculo);
    }
    
    public void adicionarLocacao(Locacao locacao){
        armazenamento.adicionarLocacao(locacao);
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        armazenamento.adicionarFuncionario(funcionario);
    }
    
    public void adicionarSeguro(Seguro seguro){
        armazenamento.adicionarSeguro(seguro);
    }

    public Controle(){
        this.armazenamento = Armazenamento.getInstance();
    }
    
    public String clientesAtrasados(){
        return armazenamento.clientesAtrasados();
    }
    
    public String veiculosDoUsuario(int codigo){
        return armazenamento.veiculosDoUsuario(codigo);
    }
    
    public String locacoesDoUsuario(int codigo){
        return armazenamento.locacoesDoUsuario(codigo);
    }
    
    public ArrayList<Locacao> locacoesDoMes(int mes, int ano){
        return armazenamento.locacoesDoMes(mes, ano);
    }
    
    public String funcionarioDoMes(int mes, int ano){
        return armazenamento.funcionarioDoMes(mes, ano);
    }
    
    public float valorTotalLocacao(int codigo){
        return armazenamento.valorTotalLocacao(codigo);
    }
    
    public boolean verificarSeguroLocacao(int codigo){
        return armazenamento.verificarSeguroLocacao(codigo);
    }
    
    public boolean verificarAtrasoLocacao(int codigo){
        return armazenamento.verificarAtrasoLocacao(codigo);
    }
    
    public String dadosLocacao(int codigo){ 
        return armazenamento.dadosLocacao(codigo);
    }
    
    public boolean verificarVeiculoAlugado(int codigo){
        return armazenamento.verificarVeiculoAlugado(codigo);
    }
    
    public String dadosVeiculo(int codigo){
        return armazenamento.dadosVeiculo(codigo);
    }
     
    public void alugarVeiculo(int codigo){
       armazenamento.alugarVeiculo(codigo);
    }
    
    public void devolverVeiculo(int codigo){
       armazenamento.devolverVeiculo(codigo);
    }
    
    public String dadosCliente(int codigo){
        return armazenamento.dadosCliente(codigo);
    }
    
    public float valorDiariaVeiculo(int codigo){
        return armazenamento.valorDiariaVeiculo(codigo);
    }
     
    public String dadosFuncionarios(String codigo){
        return armazenamento.dadosFuncionarios(codigo);
    }
    
    public String dadosSeguro(int codigo){
        return armazenamento.dadosSeguro(codigo);   
    }
    
    public void salvarClientes(){
        armazenamento.salvarClientes();
    }
    
    public void salvarFuncionarios(){
        armazenamento.salvarFuncionarios();
    }
    
    public void salvarVeiculos(){
        armazenamento.salvarVeiculos();
    }
    
    public void salvarConfiguracoes(String path){
        armazenamento.salvarConfiguracoes(path);
    }
    
    public void salvarLocacoes(){
        armazenamento.salvarLocacoes();
    }
    
    public void setArquivoLocacoes(String path){
        armazenamento.setArquivoLocacoes(path);
    }
    
    public void setArquivoVeiculos(String path){
        armazenamento.setArquivoVeiculos(path);
    }
    
    public void setArquivoClientes(String path){
        armazenamento.setArquivoClientes(path);
    }
    
    public void setArquivoFuncionarios(String path){
        armazenamento.setArquivoFuncionarios(path);
    }
    
    public void setArquivoSeguros(String path){
        armazenamento.setArquivoSeguros(path);
    }
    
    public void salvarseguros(){
        
        armazenamento.salvarSeguros();
        
    }
}
    
