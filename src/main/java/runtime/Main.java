package org.example;

import gui.GUI;
import gui.GUIicons;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GUIicons GuiFiles = new GUIicons();
        try {
            GuiFiles.loadFilesFromSource();
        } catch (IOException e) {
            e.printStackTrace();
        }

        GUI G = new GUI();

        G.startJFrame();
    }
}