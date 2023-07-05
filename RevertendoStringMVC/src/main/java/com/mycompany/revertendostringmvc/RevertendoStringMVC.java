package com.mycompany.revertendostringmvc;

import controller.StringController;
import model.StringModel;
import view.StringView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author alexs
 */
public class RevertendoStringMVC {

    public static void main(String[] args) {
         StringModel model = new StringModel();
        StringView view = new StringView();
        StringController controller = new StringController(model, view);
        controller.manipulateString();
    }
}
