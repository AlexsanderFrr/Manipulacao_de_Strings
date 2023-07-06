/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.removeduplicate;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alexs
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        // Obter a frase do usuário
        System.out.print("Digite uma frase: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // Remover caracteres duplicados
        String outputString = removeDuplicateCharacters(inputString);

        // Exibir o resultado
        System.out.println("Frase sem caracteres duplicados: " + outputString);
    }
     public static String removeDuplicateCharacters(String inputString) {
        // Usar um conjunto para armazenar os caracteres únicos em ordem
        Set<Character> uniqueCharacters = new LinkedHashSet<>();

        // Percorrer os caracteres da frase e adicioná-los ao conjunto
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            uniqueCharacters.add(currentChar);
        }

        // Construir a string final sem os caracteres duplicados
        StringBuilder outputBuilder = new StringBuilder();
        for (Character character : uniqueCharacters) {
            outputBuilder.append(character);
        }

        return outputBuilder.toString();
    }
}
