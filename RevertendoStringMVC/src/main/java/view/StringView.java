/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class StringView {
    
      public String getInputString() {
        System.out.print("Digite uma frase: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void displayOutputString(String outputString) {
        System.out.println("Resultado: " + outputString);
    }
}
