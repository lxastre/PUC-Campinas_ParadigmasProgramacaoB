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
public class Pessoa {
    
    public String nome_completo;
    public int idade;
    public float altura;

    public Pessoa() {
        System.out.println("Construtor VAZIO!!");
    }

    public Pessoa(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome_completo, int idade, float altura) {
        this.nome_completo = nome_completo;
        this.idade = idade;
        this.altura = altura;
    }
    
    public Pessoa(int idade, String nome_completo, float altura) {
        this.nome_completo = nome_completo;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome_completo=" + nome_completo + ", idade=" + idade + ", altura=" + altura + '}';
    }
    
    public float media_alturas(float altura_1, float altura_2, int qtd_de_alturas)
    {        
/*        try
        {
            return (float)(altura_1 + altura_2)/qtd_de_alturas;
        }
        catch (Exception e)
        {
            System.out.println("Ocorreu um erro e estamos tratando ele.");
            System.out.println("O erro foi: "+e.getMessage());
            return 0;
        }
*/

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong. "+ e.getMessage();
        }
    }


    
    
    
    
    
   
    
}
