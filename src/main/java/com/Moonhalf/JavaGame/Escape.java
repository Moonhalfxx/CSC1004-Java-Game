package com.Moonhalf.JavaGame;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class Escape extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(800);
        gameSettings.setHeight(500);
        gameSettings.setTitle("Escape");
        gameSettings.setVersion("0.1");
        //assets 是所有资源的父目录
        //textures 是专门用于存储图片的目录
        gameSettings.setAppIcon("Escape.png");
    }


    public static void main(String[] args){
        launch(args);
    }
}
