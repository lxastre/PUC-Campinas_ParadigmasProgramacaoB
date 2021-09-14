/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecomp.ppb.classeabstrata;

/**
 *
 * @author lxast
 */
public class ContaCorrente extends Conta_classeAbstrata{
    public ContaCorrente() {
        System.out.println("Criando Conta Corrente!");
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
        return "Agencia: "+agencia+" e Conta Corrente: "+numero_conta+" !!!!";
    }
    
    @Override
    public String conta_e_agencia()
    {
        return "Conta: 010101 e Ag.: 2020202";
    }
    
}
