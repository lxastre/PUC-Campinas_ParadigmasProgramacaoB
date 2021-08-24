/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herancapolimorfismoexcecao;

/**
 *
 * @author lxast
 */
public class HerancaPolimorfismoExcecao {
    
    public static void main(String[] args) {
        
        
        /**************************
         * Instanciação de um objeto usando a classe Caneta.
         */
        Pessoa pessoa_1 = new Pessoa();
        pessoa_1.setNome_completo("Pedro Ninci");
        pessoa_1.setAltura(1.78f);
        pessoa_1.setIdade(21);
        
        Pessoa pessoa_2 = new Pessoa(19, "Lucas Brito", 1.65f);
        
        Pessoa pessoa_3 = new Pessoa("João Cavina", 19, 2.5f);
        
        System.out.println("Nome: "+pessoa_1.getNome_completo()+" Idade: "+pessoa_1.getIdade());
        
        System.out.println(pessoa_2.toString());
        
        System.out.println("Media de alturas: "+pessoa_3.media_alturas(pessoa_1.getAltura(), pessoa_2.getAltura(), 0));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        Pessoa pessoa_2 = new Pessoa("Leandro");        
        Pessoa pessoa_3 = new Pessoa("Xastre", 39, (float) 1.8);
        
        
        System.out.println(pessoa_1.toString());
        System.out.println(pessoa_2.toString());
        System.out.println(pessoa_3.toString());
        */
    }
    
    
    
}
