/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;
import trabalho.armazenamento.Armazenamento;
import java.io.Serializable;
import java.util.ArrayList;
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
    
    /*
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
    */

    public Controle(){
        this.armazenamento = Armazenamento.getInstance();
    }
    
    public float controler_locacao_valor_total(int codigo){
        for (Locacao locacao: armazenamento.getLocacoes()){
            if(locacao.getCodigoLocacao() == codigo){
                return locacao.getValorTotal();
            }
        }
        return 0;
    }
    
    public boolean controlador_locacao_possui_seguro(int codigo){
        for (Locacao locacao: armazenamento.getLocacoes()){
            if(locacao.getCodigoLocacao() == codigo){
                return locacao.possuiSeguro();
            }
        }
        return false;
    }
    
    public boolean controlador_locacao_verificar_atraso(int codigo){
        for (Locacao locacao: armazenamento.getLocacoes()){
            if(locacao.getCodigoLocacao() == codigo){
                return locacao.verificarAtraso();
            }
        }
        return false;
    }
    
    public String controlador_locacao_dados_locacao(int codigo){ 
        for (Locacao locacao: armazenamento.getLocacoes()){
            if(locacao.getCodigoLocacao() == codigo){
                return locacao.toString();
            }
        }
        return "";
    }
     
    public boolean controle_veiculo_alugado(int codigo){
        for (Veiculo veiculo: armazenamento.getVeiculos()){
            if(veiculo.getCodigoVeiculo() == codigo){
                return veiculo.isAlugado();
            }
        }
        return false;
    }
     
    public void controle_veiculo_alugar(Veiculo veiculo){
       veiculo.alugar();
    }
    
    public void controle_veiculo_devolver(Veiculo veiculo){
       veiculo.devolver();
    }
    
    public String controle_veiculo_dados_veiculo(int codigo){
        for (Veiculo veiculo: armazenamento.getVeiculos()){
            if(veiculo.getCodigoVeiculo() == codigo){
                return veiculo.toString();
            } 
        }
        return "";
    }
    
    public float controle_veiculo_calcular_diaria(int codigo){
        for(Veiculo veiculo: armazenamento.getVeiculos()){
            if(veiculo.getCodigoVeiculo() == codigo){
                return veiculo.calcularValorDiaria();
            }
        }
        return 0;
    }
    
     public String controle_usuarios_dados_cliente(String codigo){
        for (Usuario cliente: armazenamento.getClientes()){
            if(cliente.getCPF().equals(codigo)){
                return cliente.toString();
            } 
        }
        return "";
    }
     
    public String controle_usuarios_dados_funcionarios(String codigo){
        for (Usuario funcionario: armazenamento.getFuncionarios()){
            if(funcionario.getCPF().equals(codigo)){
                return funcionario.toString();
            }
        }
        return "";
    }
    
    public String controle_usuarios_dados_seguro(int codigo){
        for (Seguro seguro: armazenamento.getSeguros()){
            if(seguro.getCodigoSeguro() == codigo){
                return seguro.toString();      
            }
        }
        return "";   
    }
    
    public void salvar_cliente(){
        
        armazenamento.salvarClientes();
        
    }
    
    public void salvar_funcionario(){
        
        armazenamento.salvarFuncionarios();
        
    }
    
    public void salvar_veiculo(){
        
        armazenamento.salvarVeiculos();
        
    }
}
    
