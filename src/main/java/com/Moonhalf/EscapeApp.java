package com.Moonhalf;

import com.Moonhalf.ui.MySubScene;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.SceneFactory;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;

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
    }

    @Override
    protected void onPreInit() {
        //预先加载一些资源
        //设置游戏的初始音量
    }

    @Override
    protected void initGameVars(Map<String, Object> vars) {
        vars.put("drawer",0);

        vars.put("wrench",0);
        vars.put("wrench1",0);

        vars.put("scissors",0);
        vars.put("cloth strip",0);
        vars.put("drawerkey1",0);
        vars.put("drawerkey11",0);
        vars.put("drawerkey2",0);

        vars.put("red",0);
        vars.put("yellow",0);
        vars.put("blue",0);
        vars.put("green",0);
    }

    public static void main(String[] args){launch(args);}
}
