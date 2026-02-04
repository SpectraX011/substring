/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.substring;

/**
 *
 * @author Nullroot 13
 */
import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        // subsrtinf() = A method used to extract a portion of a string . substring (start, end)

        Scanner scanner = new Scanner(System.in);

        String email;

        String username;
        String domain;
        
        System.out.println("enter your email:   ");
        
        email = scanner.nextLine();
        
        if(email.contains("@")){
        
        username = email.substring(0, email.indexOf("@") + 1);
        domain = email.substring( email.indexOf("@") + 1);

        System.out.println(domain);

        System.out.println(username);
            
        }else{
            System.out.println("Emails must contaoin@");
        }
        
        
        
        
        
        
       

        scanner.close();
    }
}
