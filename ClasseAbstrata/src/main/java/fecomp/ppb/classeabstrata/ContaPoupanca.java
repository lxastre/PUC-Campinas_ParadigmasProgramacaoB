/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecomp.ppb.classeabstrata;

/**
 *
 * @author Xastre
 * Classe que herda da classe abstrata
 */
public class ContaPoupanca extends Conta_classeAbstrata{
    
    public ContaPoupanca() {
        System.out.println("Criando Conta Poupança!");
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    @Override
    public int sua_agencia()
    {
        return agencia;
    }
    
    @Override
    public int sua_conta()
    {
        return numero_conta;
    }
    
    @Override
    public String sua_agencia_e_conta()
    {
        System.out.println("DENTRO: Agencia: "+agencia+" e Conta Poupança: "+numero_conta+" !");
        
        return "Agencia: "+agencia+" e Conta Poupança: "+numero_conta+" !";
    }
    
}
