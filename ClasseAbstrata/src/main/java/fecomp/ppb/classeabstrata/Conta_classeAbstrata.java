/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecomp.ppb.classeabstrata;

/**
 *
 * @author Xastre
 * Criando uma classe abstrata de exemplo
 */
abstract class Conta_classeAbstrata {
    
    //atributos
    int agencia;
    int numero_conta;
    
    //Assinatura de metodos abstrados que podem ser implementadod
    abstract int sua_agencia();
    abstract int sua_conta();
    abstract String sua_agencia_e_conta();
    
    //Método já implementado, mas que pode ser modificado por quem herdará
    public String conta_e_agencia()
    {
        return "Conta: 11111 e Ag.: 2222";
    }
    
}
