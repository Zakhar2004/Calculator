package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameWindow extends JFrame {
    private static GameWindow game_window;
    private static Image background;
    private static  long last_frame_time;
    private static Image game_over;
    private static Image drop;// обявляем переменную,чтобы установить картинки
    private static float drop_left = -30; //координаты капли левый или какой-то там угол
    private static float drop_top = -100;// левый верхний угол,а мне надо будет сделать с левого верхнего до правого верхнего
    private static float drop_v = 200;


    public static void main(String[] args) throws IOException {
        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.jpg"));//
        game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.jpg"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.jpg"));
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//этой командой мы построили,что при закрытии
        game_window.setLocation(250,100);
        last_frame_time = System.nanoTime();//возвращает текущее время в наносекундах
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setSize(600, 478);
        game_window.setResizable(true);
        game_window.setVisible(true);
    }

    private static void onRepaint (Graphics g){
        long current_time = System.nanoTime();
        float delta_time = (current_time - last_frame_time) * 0.000000001f;
        last_frame_time = current_time;
        drop_top = drop_top + drop_v * delta_time;
        drop_left = drop_left + drop_v * delta_time;
        g.drawImage(background,0,0,null); // coordinate(возможно здесь и буду указывать распложение капли)
        g.drawImage(drop,(int)drop_left,(int)drop_top,null);//здесь и меняем движение картинки
         //g.drawImage(game_over,280,120,null);//левый верхний угол картинк
    }

    private static class GameField extends JPanel{
        @ Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            onRepaint(g);
            repaint();

        }
    }

}
