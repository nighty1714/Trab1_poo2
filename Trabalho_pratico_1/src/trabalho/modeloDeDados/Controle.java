/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;
import java.util.ArrayList;
/**
 *
 * @author Nozawa
 */
public class Controle {
    
    private ArrayList<Locacao> locacoes;
    
    private ArrayList<Veiculo> veiculos;
    
    private ArrayList<Usuario> clientes;
    
    private ArrayList<Usuario> funcionarios;
    
    private ArrayList<Seguro> seguros;
    
    private Configuracao configuracoes;
    
    Controle(){
        
        locacoes = new ArrayList();
        
        veiculos = new ArrayList();
        
        clientes = new ArrayList();
        
        funcionarios = new ArrayList();
        
        seguros = new ArrayList();
        
    }
    
    public int controler_locacao_valor_total(int codigo){
        
        int a = -1;
        
        for (int i = 0; i < locacoes.size(); i++){
     
          if(locacoes.get(i).getCodigoLocacao() == codigo){
              
             a = codigo;
              
             }
         
        }
        
        return a;
   
    }
    
    public boolean controlador_locacao_possui_seguro(int codigo){
        
        boolean a = false;
        
        for (int i = 0; i < locacoes.size(); i++){
     
          if(locacoes.get(i).getCodigoLocacao() == codigo){
              
             a = locacoes.get(i).possuiSeguro();
              
             }
         
        }
        
        return a;
        
    }
    
    public boolean controlador_locacao_verificar_atraso(int codigo){
        
        boolean a = false;
        
        for (int i = 0; i < locacoes.size(); i++){
     
          if(locacoes.get(i).getCodigoLocacao() == codigo){
              
             a = locacoes.get(i).verificarAtraso();
              
             }
         
        }
        
        return a;
        
    }
    
     public String controlador_locacao_dados_locacao(int codigo){
        
         String a = "a";
         
        for (int i = 0; i < locacoes.size(); i++){
     
          if(locacoes.get(i).getCodigoLocacao() == codigo){
              
             a = locacoes.get(i).toString();
              
             }
         
        }
        
        return a;
        
    }
     
    public boolean controle_veiculo_alugado(int codigo){
        
        boolean a = false;
        
        for (int i = 0; i < veiculos.size(); i++){
     
          if(veiculos.get(i).getCodigoVeiculo() == codigo){
              
             
              a = veiculos.get(i).isAlugado();
              
             }
         
        }
        
        return a;
        
    }
     
    public void controle_veiculo_alugar(Veiculo veiculo){
        
       veiculo.alugar();
        
    }
    
    public void controle_veiculo_devolver(Veiculo veiculo){
        
       veiculo.devolver();
        
    }
    
    public String controle_veiculo_dados_veiculo(int codigo){
        
        String a = "a";
        
        for (int i = 0; i < veiculos.size(); i++){
     
          if(veiculos.get(i).getCodigoVeiculo() == codigo){
              
             
              a = veiculos.get(i).toString();
              
             }
         
        }
        
        return a;
        
    }
    
    public float controle_veiculo_calcular_diaria(int codigo){
        
        float a = 0;
        
        for (int i = 0; i < veiculos.size(); i++){
     
          if(veiculos.get(i).getCodigoVeiculo() == codigo){
              
             
              a = veiculos.get(i).calcularValorDiaria();
              
             }
         
        }
        
        return a;
        
    }
    
     public String controle_usuarios_dados_cliente(String codigo){
        
        String a = "a";
        
        for (int i = 0; i < clientes.size(); i++){
     
          if(clientes.get(i).getcpf().equals(codigo)){
              
             
              a = clientes.get(i).toString();
              
             }
         
        }
        
        return a;
        
    }
     
    public String controle_usuarios_dados_funcionarios(String codigo){
        
        String a = "a";
        
        for (int i = 0; i < funcionarios.size(); i++){
     
          if(funcionarios.get(i).getcpf().equals(codigo)){
              
             
              a = funcionarios.get(i).toString();
              
             }
         
        }
        
        return a;
        
    }
    
    
    public String controle_usuarios_dados_seguro(int codigo){
        
        String a = "a";
        
        for (int i = 0; i < seguros.size(); i++){
     
          if(seguros.get(i).getCodigoSeguro() == codigo){
              
             
              a = seguros.get(i).toString();
              
             }
         
        }
        
        return a;
        
    }
    
}
    
