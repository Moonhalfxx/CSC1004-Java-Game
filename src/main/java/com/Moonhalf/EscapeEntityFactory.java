package com.Moonhalf;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;

public class EscapeEntityFactory implements EntityFactory {

    @Spawns("bg")
    public Entity newBg(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Background.jpg")
                .build();
    }
    @Spawns("ceiling")
    public Entity newCeiling(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Ceiling.jpg")
                .build();
    }
    @Spawns("curtain")
    public Entity newCurtain(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage1/Stage1 Curtain.png")
                .build();
    }
    @Spawns("door")
    public Entity newDoor(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage1/Stage1 Door.png")
                .build();
    }
    @Spawns("chair")
    public Entity newChair(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage2/Stage2 chair.png")
                .build();
    }
    @Spawns("clock1")
    public Entity newClock1(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage2/Stage2 Clock.png")
                .build();
    }
    @Spawns("drawer")
    public Entity newDrawer(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage2/Stage2 Drawer.png")
                .build();
    }
    @Spawns("mirror")
    public Entity newMirror(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage3/Stage3 Mirror.png")
                .build();
    }
    @Spawns("tap")
    public Entity newTap(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage3/Stage3 tap.png")
                .build();
    }
    @Spawns("bed")
    public Entity newBed(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage4/Stage4 Bed.png")
                .build();
    }
    @Spawns("box")
    public Entity newBox(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage4/Stage4 Box.png")
                .build();
    }
    @Spawns("clock2")
    public Entity newClock2(SpawnData data){
        return FXGL.entityBuilder(data)
                .view("Stage4/Stage4 Clock.png")
                .build();
    }
}
