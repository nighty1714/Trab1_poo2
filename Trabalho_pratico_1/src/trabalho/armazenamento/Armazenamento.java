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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nozawa
 */
public class Armazenamento {
    private ArrayList<Locacao> locacoes;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Usuario> clientes;
    private ArrayList<Usuario> funcionarios;
    private ArrayList<Seguro> seguros;
    private Configuracao configuracoes;
    private static Armazenamento instance;

    public Armazenamento(Configuracao configuracoes) {
        this.configuracoes = configuracoes;
    }

    public static Armazenamento getInstance() {
        return instance;
    }

    public ArrayList<Locacao> getLocacoes() {
        return locacoes;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public ArrayList<Usuario> getClientes() {
        return clientes;
    }

    public ArrayList<Usuario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Seguro> getSeguros() {
        return seguros;
    }

    public Configuracao getConfiguracoes() {
        return configuracoes;
    }

    public void setLocacoes(ArrayList<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void setClientes(ArrayList<Usuario> clientes) {
        this.clientes = clientes;
    }

    public void setFuncionarios(ArrayList<Usuario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void setConfiguracoes(Configuracao configuracoes) {
        this.configuracoes = configuracoes;
    }

    public static void setInstance(Armazenamento instance) {
        Armazenamento.instance = instance;
    }
    
    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void adicionarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    
    public void adicionarLocacao(Locacao locacao){
        this.locacoes.add(locacao);
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    
    public void adicionarSeguro(Seguro seguro){
        this.seguros.add(seguro);
    }
    
    public ArrayList<Usuario> clientesAtrasados(){
        ArrayList<Integer> listaAtrasos = new ArrayList();
        ArrayList<Usuario> listaClientes = new ArrayList();
        for(Locacao locacao: locacoes){
            if(locacao.verificarAtraso()){
                int codigo = locacao.getCodigoCliente();
                if(listaAtrasos.contains(codigo)){
                    listaAtrasos.add(codigo);
                    for(Usuario cliente: clientes){
                        if(cliente.getCodigoUsuario() == codigo){
                            listaClientes.add(cliente);
                        }
                    }
                }
            }
        }
        return listaClientes;
    }
    
    public ArrayList<Locacao> locacoesDoMes(int mes, int ano){
        ArrayList<Locacao> listaLocacoes = new ArrayList();
        for(Locacao locacao: locacoes){
            Calendar data = locacao.getDataLocacao();
            if(data.get(Calendar.YEAR) == ano){
                if(data.get(Calendar.MONTH) == mes){
                    listaLocacoes.add(locacao);
                }
            }
        }
        return listaLocacoes;
    }
    
    public ArrayList<Veiculo> veiculosDoUsuario(int codigo){
        ArrayList<Veiculo> listaVeiculos = new ArrayList();
        for(Locacao locacao: locacoes){
            if(locacao.getCodigoCliente() == codigo){
                listaVeiculos.add(locacao.getVeiculo());
            }
        }
        return listaVeiculos;
    }
    
    public void salvarLocacoes(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(configuracoes.getArquivoLocacoes());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(locacoes);
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
            oos.writeObject(veiculos);
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
            oos.writeObject(clientes);
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
            oos.writeObject(funcionarios);
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
            oos.writeObject(seguros);
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
    
    public void salvarConfiguracoes(String path){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(configuracoes);
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
    
    public void salvar(String path){
        salvarConfiguracoes(path);
        salvarLocacoes();
        salvarVeiculos();
        salvarClientes();
        salvarFuncionarios();
        salvarSeguros();
    }
    
    public void carregarLocacoes(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(configuracoes.getArquivoLocacoes());
            ois = new ObjectInputStream(fis);
            this.locacoes = (ArrayList<Locacao>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void carregarVeiculos(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(configuracoes.getArquivoVeiculos());
            ois = new ObjectInputStream(fis);
            this.veiculos = (ArrayList<Veiculo>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void carregarClientes(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(configuracoes.getArquivoClientes());
            ois = new ObjectInputStream(fis);
            this.clientes = (ArrayList<Usuario>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void carregarFuncionarios(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(configuracoes.getArquivoFuncionarios());
            ois = new ObjectInputStream(fis);
            this.funcionarios = (ArrayList<Usuario>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void carregarSeguros(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(configuracoes.getArquivoSeguros());
            ois = new ObjectInputStream(fis);
            this.seguros = (ArrayList<Seguro>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void carregarConfiguracoes(String path){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            this.configuracoes = (Configuracao) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Armazenamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void carregar(String path){
        carregarConfiguracoes(path);
        carregarLocacoes();
        carregarVeiculos();
        carregarFuncionarios();
        carregarClientes();
        carregarSeguros();
    }
    
    public void setArquivoLocacoes(String arquivoLocacoes){
        this.configuracoes.setArquivoLocacoes(arquivoLocacoes);
    }
    
    public void setArquivoVeiculos(String arquivoVeiculos){
        this.configuracoes.setArquivoVeiculos(arquivoVeiculos);
    }
    
    public void setArquivoClientes(String arquivoClientes){
        this.configuracoes.setArquivoClientes(arquivoClientes);
    }
    
    public void setArquivoFuncionarios(String arquivoFuncionarios){
        this.configuracoes.setArquivoFuncionarios(arquivoFuncionarios);
    }
    
    public void setArquivoSeguros(String arquivoSeguros){
        this.configuracoes.setArquivoSeguros(arquivoSeguros);
    }
    
}
