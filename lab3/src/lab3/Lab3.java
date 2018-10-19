/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Furkan
 */
import java.util.Scanner ;
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /* kullanıcıdan alınan strigin terside aynısına eşitmi diye bakan program */     
    Scanner veri=new Scanner(System.in);    
    String kelime ;
    System.out.println("tersi ile aynimi diye bakilmasi istediginiz veriyi girin:");
    kelime= veri.next();
    char []dizi=kelime.toCharArray();
    
    int i,j,g = 0;
    
    for(i=0;i<kelime.length();i++){
    if(dizi[i]==dizi[kelime.length()-(i+1)]){
    g=2;
    }
   
    }    
      if( g==2)
      {System.out.println("girilen verinin tersi o veriye esittir.");}
      else{
          System.out.println("girilen verinin tersi o veriye esit degildir.");
      }  
        
        
    }
    
}
