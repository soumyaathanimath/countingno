/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countingno;

/**
 *
 * @author dell1
 */
public class Countingno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        String str="      abc     def     gh   ijk    ";
        
        str=str.replaceAll("\\s+", " ").trim();
        
        String words[]=str.split("\\s");
        
        System.out.println(words.length);
        
    }
    
}
