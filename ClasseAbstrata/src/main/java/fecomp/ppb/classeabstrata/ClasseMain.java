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
public class ClasseMain {
    
    public static void main(String[] args) {
        
        //Instâncias dos objetos
        ContaPoupanca instancia_contaPoupanca = new ContaPoupanca();
        ContaCorrente instancia_contaCorrente = new ContaCorrente();
        
        instancia_contaPoupanca.setAgencia(1234);
        instancia_contaPoupanca.setNumero_conta(1234567);
        System.out.println(instancia_contaPoupanca.sua_agencia_e_conta());
        System.out.println(instancia_contaPoupanca.conta_e_agencia());
        
        instancia_contaCorrente.setAgencia(9876);
        instancia_contaCorrente.setNumero_conta(9876543);
        System.out.println(instancia_contaCorrente.sua_agencia_e_conta());
        System.out.println(instancia_contaCorrente.conta_e_agencia());
    }
    
}
