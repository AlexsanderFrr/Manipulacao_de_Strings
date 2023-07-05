/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.StringModel;
import view.StringView;

/**
 *
 * @author alexs
 */
public class StringController {
     private StringModel model;
    private StringView view;

    public StringController(StringModel model, StringView view) {
        this.model = model;
        this.view = view;
    }

    public void manipulateString() {
        String inputString = view.getInputString();
        model.setInputString(inputString);
        String outputString = model.reverseWords();
        view.displayOutputString(outputString);
    }
}
