/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univates_2019b;

/**
 *
 * @author luan.castoldi
 */
public class Pessoa {
    
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private double valorConta;
    private double valorAtualizado;

    public double getValorAtualizado() {
        return valorAtualizado;
    }

    public void setValorAtualizado(double valorAtualizado) {
        this.valorAtualizado = valorAtualizado;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }
    
    
    
    @Override
    public String toString(){
        return 
                "Nome = " + this.nome + 
                /*"\nEndereço = " + this.endereco + 
                "\nTelefone = " + this.telefone + */
                "\nValor = " + this.valorConta + 
                //"\nValor Atualizado = " + this.valorAtualizado + 
                "\n===========================";
    }
    
    boolean setCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}