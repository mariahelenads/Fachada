/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 *
 * @author maria.hsantos30
 */
import sistema.*;
public class Fachada {
    public void gerarRelatorio(){
         
       // Gerar um relatorio
       BaseDados.inserir();
       
       //Pesquisar um cliente
       Cliente cliente = new Cliente();
       cliente = cliente.pesquisarClienteId(21);
       
       if(cliente != null)
       {
           System.out.println(cliente);
       }
       else
       {
           System.out.println("Não achou!");
       }
       
       //Pesquisar um Gerente
       Gerente gerente = new Gerente();
       gerente = gerente.pesquisarGerenteId(1);
       
       if(gerente != null)
       {
           System.out.println(gerente);
       }
       else
       {
           System.out.println("Não achou!");
       }
       
       //Pesquisar um Projeto
       Projeto projeto = new Projeto();
       projeto = projeto.pesquisarProjetoId(13);
       
       if(projeto != null)
       {
           System.out.println(projeto);
       }
       else
       {
           System.out.println("Não achou!");
       }
    }
}
