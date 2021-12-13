/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.armazenamento;
import trabalho.modeloDeDados.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nozawa
 */
public class Armazenamento {
    private Controle controle;
    private ArrayList<Locacao> locacoes;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Usuario> clientes;
    private ArrayList<Usuario> funcionarios;
    private ArrayList<Seguro> seguros;
    private Configuracao configuracoes;
    private static Armazenamento instance;

    public Armazenamento(Configuracao configuracoes, Controle controle) {
        this.configuracoes = configuracoes;
        this.controle = controle;
    }

    public static Armazenamento getInstance() {
        return instance;
    }
    
    public void salvarLocacoes(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(configuracoes.getArquivoLocacoes());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(controle.getLocacoes());
        }catch(FileNotFoundException ex){
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.flush();
                fos.close();
                oos.flush();
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void salvarVeiculos(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(configuracoes.getArquivoVeiculos());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(controle.getVeiculos());
        }catch(FileNotFoundException ex){
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.flush();
                fos.close();
                oos.flush();
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void salvarClientes(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(configuracoes.getArquivoClientes());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(controle.getClientes());
        }catch(FileNotFoundException ex){
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.flush();
                fos.close();
                oos.flush();
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void salvarFuncionarios(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(configuracoes.getArquivoFuncionarios());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(controle.getFuncionarios());
        }catch(FileNotFoundException ex){
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.flush();
                fos.close();
                oos.flush();
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void salvarSeguros(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(configuracoes.getArquivoSeguros());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(controle.getSeguros());
        }catch(FileNotFoundException ex){
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.flush();
                fos.close();
                oos.flush();
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void salvar(){
        salvarLocacoes();
        salvarVeiculos();
        salvarClientes();
        salvarFuncionarios();
        salvarSeguros();
    }
    
    public void carregar(){
        
    }
}
