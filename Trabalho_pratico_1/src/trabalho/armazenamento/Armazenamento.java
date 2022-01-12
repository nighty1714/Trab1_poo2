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
import java.util.Map;
import java.util.HashMap;
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
        this.locacoes = new ArrayList();
        this.veiculos = new ArrayList();
        this.clientes = new ArrayList();
        this.funcionarios = new ArrayList();
        this.seguros = new ArrayList();
        this.configuracoes = configuracoes;
    }
    
    public Armazenamento() {
        this.locacoes = new ArrayList();
        this.veiculos = new ArrayList();
        this.clientes = new ArrayList();
        this.funcionarios = new ArrayList();
        this.seguros = new ArrayList();
        this.configuracoes = new Configuracao();
    }
    
    public static Armazenamento getInstance() {
        if(instance == null){
            instance = new Armazenamento();
        }
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
        for(Usuario antigoCliente:clientes){
            //verifica se o codigo de cliente ja existe
            if(antigoCliente.getCodigoUsuario() == cliente.getCodigoUsuario()){
                return;
            }
        }
        for(Usuario antigoFuncionario: funcionarios){
            //verifica se o codigo de cliente ja existe em um funcionario
            if(antigoFuncionario.getCodigoUsuario() == cliente.getCodigoUsuario()){
                return;
            }
        }
        this.clientes.add(cliente);
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        for(Usuario antigoFuncionario:funcionarios){
            //verifica se o codigo de funcionario ja existe
            if(antigoFuncionario.getCodigoUsuario() == funcionario.getCodigoUsuario()){
                return;
            }
        }
        
        for(Usuario antigoCliente: clientes){
            //verifica se o codigo do funcionario ja esta em uso
            if(antigoCliente.getCodigoUsuario() == funcionario.getCodigoUsuario()){
                return;
            }
        }
        this.funcionarios.add(funcionario);
    }
    
    public void adicionarVeiculo(Veiculo veiculo){
        for(Veiculo antigoVeiculo: veiculos){
            //verifica se o veiculo ja esta na lista
            if(antigoVeiculo.getCodigoVeiculo() != veiculo.getCodigoVeiculo()){
                this.veiculos.add(veiculo);
            }
        }
    }
    
    public void adicionarLocacao(Locacao locacao){
        for(Locacao antigaLocacao: locacoes){
            //verifica se a locacao ja existe
            if(antigaLocacao.getCodigoLocacao() != locacao.getCodigoLocacao()){
                Veiculo veiculo = locacao.getVeiculo();
                //se a locacao nao estiver finalizada, verifica se o carro nao esta alugado
                if(!locacao.isFinalizada()){
                    if(!veiculo.isAlugado()){
                        alugarVeiculo(veiculo.getCodigoVeiculo());
                        this.locacoes.add(locacao);
                    }
                }else{
                    this.locacoes.add(locacao);
                }
            }
        }
    }
    
    public void adicionarSeguro(Seguro seguro){
        for(Seguro antigoSeguro: seguros){
            if(antigoSeguro.getCodigoSeguro() != seguro.getCodigoSeguro()){
                this.seguros.add(seguro);
            }
        }
    }
    
    public String clientesAtrasados(){
        ArrayList<Integer> listaAtrasos = new ArrayList();
        String listaClientes = "";
        for(Locacao locacao: locacoes){
            if(locacao.verificarAtraso()){
                int codigo = locacao.getCodigoCliente();
                if(listaAtrasos.contains(codigo)){
                    listaAtrasos.add(codigo);
                    for(Usuario cliente: clientes){
                        if(cliente.getCodigoUsuario() == codigo){
                            listaClientes += cliente.toString();
                        }
                    }
                }
            }
        }
        return listaClientes;
    }
    
    public String funcionarioDoMes(int mes, int ano){
        Map map = new HashMap();
        for(Usuario funcionario: funcionarios){
            map.put(funcionario.getCodigoUsuario(), (int) 0);
        }
        for(Locacao locacao: locacoesDoMes(mes, ano)){
            map.put(locacao.getCodigoFuncionario(), (int)map.get(locacao.getCodigoFuncionario())+1);
        }
        int maior = 0;
        Usuario funcionarioDoMes = funcionarios.get(0);
        for(Usuario funcionario: funcionarios){
            int temp = (int) map.get(funcionario.getCodigoUsuario());
            if(temp > maior){
                maior = temp;
                funcionarioDoMes = funcionario;
            }
        }
        String funcionario = funcionarioDoMes.toString();
        return funcionario;
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
    
    public String veiculosDoUsuario(int codigo){
        String listaVeiculos = "";
        for(Locacao locacao: locacoes){
            if(locacao.getCodigoCliente() == codigo){
                listaVeiculos += locacao.toString();
            }
        }
        return listaVeiculos;
    }
    
    public String locacoesDoUsuario(int codigo){
        String listaLocacao = "";
        for(Locacao locacao: locacoes){
            if(locacao.getCodigoCliente() == codigo){
                listaLocacao += locacao.toString();
            }
        }
        return listaLocacao;
    }
    
    public float valorTotalLocacao(int codigo){
        for (Locacao locacao: locacoes){
            if(locacao.getCodigoLocacao() == codigo){
                return locacao.getValorTotal();
            }
        }
        return 0;
    }
    
    public boolean verificarSeguroLocacao(int codigo){
        for (Locacao locacao: locacoes){
            if(locacao.getCodigoLocacao() == codigo){
                return locacao.possuiSeguro();
            }
        }
        return false;
    }
    
    public boolean verificarAtrasoLocacao(int codigo){
        for (Locacao locacao: locacoes){
            if(locacao.getCodigoLocacao() == codigo){
                return locacao.verificarAtraso();
            }
        }
        return false;
    }
    
    public Veiculo buscarVeiculo(int codigo){
        for(Veiculo veiculo: veiculos){
            if(veiculo.getCodigoVeiculo() == codigo){
                return veiculo;
            } 
        }
        return null;
    }
    
    public String dadosLocacao(int codigo){ 
        for (Locacao locacao: locacoes){
            if(locacao.getCodigoLocacao() == codigo){
                return locacao.toString();
            }
        }
        return "";
    }
    
    public boolean verificarVeiculoAlugado(int codigo){
        for (Veiculo veiculo: veiculos){
            if(veiculo.getCodigoVeiculo() == codigo){
                return veiculo.isAlugado();
            }
        }
        return false;
    }
    
    public void alugarVeiculo(int codigo){
        for (Veiculo veiculo: veiculos){
            if(veiculo.getCodigoVeiculo() == codigo){
                veiculo.setAlugado(true);
                return;
            }
        }
    }
    
    public void devolverVeiculo(int codigo){
        for (Veiculo veiculo: veiculos){
            if(veiculo.getCodigoVeiculo() == codigo){
                veiculo.setAlugado(false);
                return;
            }
        }
    }
    
    public String dadosVeiculo(int codigo){
        for(Veiculo veiculo: veiculos){
            if(veiculo.getCodigoVeiculo() == codigo){
                return veiculo.toString();
            } 
        }
        return "";
    }
    
    public String dadosCliente(int codigo){
        for (Usuario cliente: clientes){
            if(cliente.getCodigoUsuario() == codigo){
                return cliente.toString();
            } 
        }
        return "";
    }
    
    
    public float valorDiariaVeiculo(int codigo){
        for(Veiculo veiculo: veiculos){
            if(veiculo.getCodigoVeiculo() == codigo){
                return veiculo.calcularValorDiaria();
            }
        }
        return 0;
    }
    
    public String dadosFuncionarios(String codigo){
        for (Usuario funcionario: funcionarios){
            if(funcionario.getCPF().equals(codigo)){
                return funcionario.toString();
            }
        }
        return "";
    }
    
    
    public String dadosSeguro(int codigo){
        for (Seguro seguro: seguros){
            if(seguro.getCodigoSeguro() == codigo){
                return seguro.toString();      
            }
        }
        return "";   
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
