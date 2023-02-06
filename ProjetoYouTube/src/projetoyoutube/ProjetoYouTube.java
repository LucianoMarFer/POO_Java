/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Luciano Martinez
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello world!!");
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 PHP");
        v[2] = new Video("Aula 10 HTML5");
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Luciano", 42, "M", "testando");
        a[1] = new Aluno("Chiquinha", 14, "F", "chica");
//       System.out.println( a[0].getNome());;

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(a[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(a[0], v[1]);
        vis[0].avaliar();
        System.out.println(v[1].toString());
        
        
        
        
//        System.out.println("-----------");
//        
//        System.out.println(vis[1].toString());
//        System.out.println("-----------");
//        vis[2] = new Visualizacao(a[1],v[1]);
//        vis[1].avaliar();
        
        
       
    
        
       
        
        
    }
    
}
