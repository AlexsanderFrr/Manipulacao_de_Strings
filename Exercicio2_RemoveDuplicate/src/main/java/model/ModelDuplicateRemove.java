/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alexs
 */
public class ModelDuplicateRemove {
    
     public String removeDuplicateCharacters(String inputString) {
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (outputBuilder.indexOf(String.valueOf(currentChar)) == -1) {
                outputBuilder.append(currentChar);
            }
        }
        return outputBuilder.toString();
    }
    
}
