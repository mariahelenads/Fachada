/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

/**
 *
 * @author maria.hsantos30
 */
import padrao.*;
public class Gerenciador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Fachada fachada = new Fachada();
       fachada.gerarRelatorio();
            
    }
//   
//    // sem fachada
//   public static void main(String[] args) {
//       // Gerar um relatorio
//       BaseDados.inserir();
//       
//       //Pesquisar um cliente
//       Cliente cliente = new Cliente();
//       cliente = cliente.pesquisarClienteId(21);
//       
//       if(cliente != null)
//       {
//           System.out.println(cliente);
//       }
//       else
//       {
//           System.out.println("Não achou!");
//       }
//       
//       //Pesquisar um Gerente
//       Gerente gerente = new Gerente();
//       gerente = gerente.pesquisarGerenteId(21);
//       
//       if(gerente != null)
//       {
//           System.out.println(gerente);
//       }
//       else
//       {
//           System.out.println("Não achou!");
//       }
//       
//       //Pesquisar um Projeto
//       Projeto projeto = new Projeto();
//       projeto = projeto.pesquisarProjetoId(21);
//       
//       if(projeto != null)
//       {
//           System.out.println(gerente);
//       }
//       else
//       {
//           System.out.println("Não achou!");
//       }
//       
//    }
       
       
    
}
