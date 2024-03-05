package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private JFrame main;
    private JButton[][] casillas;

    private JPanel JMain;


    public View(){
        inicializate();



    }

    private void inicializate() {
        main=new JFrame();
        main.setVisible(true);
        main.setSize(new Dimension(1000,800));
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        GridLayout gridLayout = new GridLayout(8, 8);

        JMain=new JPanel();

        JMain.setLayout(gridLayout);


        casillas = new JButton[8][8];

        main.setTitle("Chess");


        main.add(JMain);



    }



}




