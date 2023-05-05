package com.Moonhalf;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.SceneFactory;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.util.Map;

import static com.almasb.fxgl.dsl.FXGL.*;


public class EscapeApp extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {
        //默认游戏主菜单
        //gameSettings.setMainMenuEnabled(true);

        //窗口设置
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
        //连接实体仓库
        getGameWorld().addEntityFactory(new EscapeEntityFactory());

        //第一个场景
        spawn("bg");
        spawn("arrowR1");
        spawn("arrowL1");
        Entity door = spawn("door",new SpawnData(550,400));
        Entity curtain = spawn("curtain",new SpawnData(180,220));
        spawn("letter");

        //开头
        spawn("s1");
    }

    @Override
    protected void onPreInit() {
        //预先加载一些资源
        //设置游戏的初始音量
        getSettings().setGlobalMusicVolume(0.05);
        getSettings().setGlobalSoundVolume(1.0);
        //添加游戏背景音乐
        loopBGM("bg.mp3");

    }

    @Override
    protected void initGameVars(Map<String, Object> vars) {
        //创造游戏变量，防止玩家多拿道具及判断道具拿取情况
        vars.put("cm",Login.i[0]);

        vars.put("drawer",0);

        vars.put("guizi",0);

        vars.put("wrench",0);
        vars.put("wrench1",0);

        vars.put("scissors",0);
        vars.put("gloves",0);
        vars.put("curtain",0);
        vars.put("cloth strip",0);

        vars.put("drawerkey1",0);
        vars.put("drawerkey11",0);
        vars.put("drawerkey2",0);
        vars.put("drawerkey22",0);

        vars.put("red",0);
        vars.put("yellow",0);
        vars.put("blue",0);
        vars.put("green",0);
    }

    public static void main(String[] args){
        launch(args);
    }
}
