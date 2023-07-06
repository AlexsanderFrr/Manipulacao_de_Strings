/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ModelDuplicateRemove;
import view.ViewDuplicateRemove;

/**
 *
 * @author alexs
 */
public class ControllerDuplicateRemove {
    
      private ModelDuplicateRemove model;
    private ViewDuplicateRemove view;

    public ControllerDuplicateRemove() {
        this.model = new ModelDuplicateRemove();
        this.view = new ViewDuplicateRemove();
    }

    public void removeDuplicateCharacters() {
        String inputString = view.getInputString();
        String outputString = model.removeDuplicateCharacters(inputString);
        view.displayOutputString(outputString);
    }
    
}
