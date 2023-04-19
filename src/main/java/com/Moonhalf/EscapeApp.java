package com.Moonhalf;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

import static com.almasb.fxgl.dsl.FXGL.*;


public class EscapeApp extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(900);
        gameSettings.setHeight(900);
        gameSettings.setTitle("Escape");
        gameSettings.setVersion("0.1");
        //assets 是所有资源的父目录
        //textures 是专门用于存储图片的目录
        gameSettings.setAppIcon("Escape.png");
    }

    @Override
    protected void initGame() {
        getGameWorld().addEntityFactory(new EscapeEntityFactory());
        spawn("bg");
        spawn("door");
        spawn("curtain");
    }

    public static void main(String[] args){launch(args);}
}
