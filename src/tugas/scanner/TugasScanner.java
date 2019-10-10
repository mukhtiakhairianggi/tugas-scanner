/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.scanner;

import java.util.Scanner;

/**
 *
 * @author mukhtia khairi anggi
 */
public class TugasScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("IPK (0-4) = ");
        double nilai = a.nextDouble();
        if(nilai > 4.00){
            System.out.println("Error");        
        }else if(nilai >= 3.00){
            System.out.println("kuota 24 sks");            
        }else if (nilai >= 2.50){
            System.out.println("kuota 21 sks");
        }else if (nilai >= 2.00){
            System.out.println("kuota 18 sks");
        }else {
            System.out.println("kuota 15 sks");
        }
        
        
    }
    
}
    
    

