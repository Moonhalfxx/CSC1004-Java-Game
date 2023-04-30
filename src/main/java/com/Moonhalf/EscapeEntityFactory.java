package com.Moonhalf;

import com.Moonhalf.components.*;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import com.almasb.fxgl.texture.Texture;
import javafx.scene.paint.Color;
import static com.almasb.fxgl.dsl.FXGL.*;

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
    @Spawns("mengban")
    public Entity newMengban(SpawnData data){
        return entityBuilder(data)
                .view("Mengban.png")
                .build();
    }
    @Spawns("arrowR1")
    public Entity newArrowR(SpawnData data){
        Texture arrowR1 = texture("ArrowR.png",30,48);
        return FXGL.entityBuilder(data)
                .view(arrowR1)
                .with(new ArrowR1Component())
                .at(850,400)
                .build();
    }
    @Spawns("arrowR2")
    public Entity newArrowR2(SpawnData data){
        Texture arrowR2 = texture("ArrowR.png",30,48);
        return FXGL.entityBuilder(data)
                .view(arrowR2)
                .at(850,400)
                .build();
    }
    @Spawns("arrowR3")
    public Entity newArrowR3(SpawnData data){
        Texture arrowR3 = texture("ArrowR.png",30,48);
        return FXGL.entityBuilder(data)
                .view(arrowR3)
                .with(new ArrowR3Component())
                .at(850,400)
                .build();
    }
    @Spawns("arrowR4")
    public Entity newArrowR4(SpawnData data){
        Texture arrowR4 = texture("ArrowR.png",30,48);
        return FXGL.entityBuilder(data)
                .view(arrowR4)
                .with(new ArrowR4Component())
                .at(850,400)
                .build();
    }
    @Spawns("arrowL1")
    public Entity newArrowL1(SpawnData data){
        Texture arrowL1 = texture("ArrowR.png",30,48);
        arrowL1.setScaleX(-1);
        return FXGL.entityBuilder(data)
                .view(arrowL1)
                .with(new ArrowL1Component())
                .at(20,400)
                .build();
    }
    @Spawns("arrowL2")
    public Entity newArrowL2(SpawnData data){
        Texture arrowL2 = texture("ArrowR.png",30,48);
        arrowL2.setScaleX(-1);
        return FXGL.entityBuilder(data)
                .view(arrowL2)
                .with(new ArrowL2Componont())
                .at(20,400)
                .build();
    }
    @Spawns("arrowL3")
    public Entity newArrowL3(SpawnData data){
        Texture arrowL3 = texture("ArrowR.png",30,48);
        arrowL3.setScaleX(-1);
        return FXGL.entityBuilder(data)
                .view(arrowL3)
                .at(20,400)
                .build();
    }
    @Spawns("arrowL4")
    public Entity newArrowL4(SpawnData data){
        Texture arrowL4 = texture("ArrowR.png",30,48);
        arrowL4.setScaleX(-1);
        return FXGL.entityBuilder(data)
                .view(arrowL4)
                .with(new ArrowL4Component())
                .at(20,400)
                .build();
    }
    @Spawns("arrowD")
    public Entity newArrowD(SpawnData data){
        Texture arrowD = texture("ArrowD.png",48,30);
        return FXGL.entityBuilder(data)
                .view(arrowD)
                .at(430,850)
                .build();
    }
    @Spawns("arrowU")
    public Entity newArrowU(SpawnData data){
        Texture arrowU = texture("ArrowD.png",48,30);
        arrowU.setScaleY(-1);
        return FXGL.entityBuilder(data)
                .view(arrowU)
                .build();
    }
    @Spawns("curtain")
    public Entity newCurtain(SpawnData data){
        Texture curtain = texture("Stage1/Stage1 Curtain.png",320,350);
        return FXGL.entityBuilder(data)
                .view(curtain)
                .with(new CurtainComponent())
                .build();
    }
    @Spawns("c1")
    public Entity newC1(SpawnData data){
        Texture c1 = texture("Stage1/C1.png",320, 350);
        return entityBuilder(data)
                .view(c1)
                .at(180,220)
                .build();
    }
    @Spawns("c2")
    public Entity newC2(SpawnData data){
        Texture c2 = texture("Stage1/C2.png",320,350);
        return entityBuilder(data)
                .view(c2)
                .at(180,220)
                .build();
    }
    @Spawns("door")
    public Entity newDoor(SpawnData data){
        Texture door = texture("Stage1/Stage1 Door.png",200,350);
        return FXGL.entityBuilder(data)
                .view(door)
                .with(new DooorComponent())
                .build();
    }
    @Spawns("doorclick")
    public Entity newDoorClick(SpawnData data){
        Texture doorclick = texture("Stage1/DoorClick.jpg");
        return FXGL.entityBuilder(data)
                .view(doorclick)
                .build();
    }
    @Spawns("dy")
    public Entity newDoorYellow(SpawnData data){
        Texture dy = texture("Stage1/DY.png",120,255).toColor(Color.web("#e7d192"));
        return FXGL.entityBuilder(data)
                .view(dy)
                .with(new DyComponent())
                .build();
    }
    @Spawns("dr")
    public Entity newDoorRed(SpawnData data){
        Texture dr = texture("Stage1/DR.png").toColor(Color.web("#e37a80"));
        return FXGL.entityBuilder(data)
                .view(dr)
                .with(new DrComponent())
                .build();
    }
    @Spawns("db")
    public Entity newDoorBlue(SpawnData data){
        Texture db = texture("Stage1/DB.png").toColor(Color.web("#357aa1"));
        return FXGL.entityBuilder(data)
                .view(db)
                .with(new DbComponent())
                .build();
    }
    @Spawns("dg")
    public Entity newDoorGreen(SpawnData data){
        Texture dg = texture("Stage1/DG.png",120,255).toColor(Color.web("#638a7e"));
        return FXGL.entityBuilder(data)
                .view(dg)
                .with(new DgComponent())
                .build();
    }
    @Spawns("chair")
    public Entity newChair(SpawnData data){
        Texture chair = texture("Stage2/Stage2 Chair.png",170,370);
        return FXGL.entityBuilder(data)
                .view(chair)
                .with(new ChairComponent())
                .at(170,450)
                .build();
    }
    @Spawns("clock1")
    public Entity newClock1(SpawnData data){
        Texture clock1 = texture("Stage2/Stage2 Clock.png",100,65);
        return FXGL.entityBuilder(data)
                .view(clock1)
                .with(new Clock1Component())
                .at(520,400)
                .build();
    }
    @Spawns("drawer")
    public Entity newDrawer(SpawnData data){
        Texture drawer = texture("Stage2/Stage2 Drawer.png",200,300);
        return FXGL.entityBuilder(data)
                .at(520,450)
                .with(new DrawerComponent())
                .view(drawer)
                .build();
    }
    @Spawns("drawerclick")
    public Entity newDrawerclick(SpawnData data){
        Texture drawerclick = texture("Stage2/Drawer Click.jpg");
        return entityBuilder(data)
                .view(drawerclick)
                .build();
    }
    @Spawns("d1")
    public Entity newD1(SpawnData data){
        Texture d1 = texture("Stage2/D1.png");
        return entityBuilder(data)
                .at(193,150)
                .view(d1)
                .build();
    }
    @Spawns("d2")
    public Entity newD2(SpawnData data){
        Texture d2 = texture("Stage2/D2.png");
        return entityBuilder(data)
                .view(d2)
                .at(193,305)
                .build();
    }
    @Spawns("d3")
    public Entity newD3(SpawnData data){
        Texture d3 = texture("Stage2/D3.png");
        return entityBuilder(data)
                .view(d3)
                .at(193,455)
                .build();
    }
    @Spawns("d4")
    public Entity newD4(SpawnData data){
        Texture d4 = texture("Stage2/D4.png");
        return entityBuilder(data)
                .view(d4)
                .at(193,605)
                .build();
    }
    @Spawns("mirror")
    public Entity newMirror(SpawnData data){
        Texture mirror = texture("Stage3/Stage3 Mirror.png",150,152);
        return FXGL.entityBuilder(data)
                .view(mirror)
                .at(200,220)
                .with(new MirrorComponent())
                .build();
    }
    @Spawns("guahua")
    public Entity newGuahua(SpawnData data){
        Texture guahua = texture("Stage3/guahua.png",188,202.5);
        return FXGL.entityBuilder(data)
                .view(guahua)
                .at(500,90)
                .with(new GuahuaComponent())
                .build();
    }
    @Spawns("guahuac1")
    public Entity newGuahuac1(SpawnData data){
        Texture guahuac1 = texture("Stage3/guahuac1.png");
        return FXGL.entityBuilder(data)
                .view(guahuac1)
                .build();
    }
    @Spawns("guahuac2")
    public Entity newGuahuac2(SpawnData data){
        Texture guahuac2 = texture("Stage3/guahuac2.png");
        return FXGL.entityBuilder(data)
                .view(guahuac2)
                .build();
    }
    @Spawns("tap")
    public Entity newTap(SpawnData data){
        Texture tap = texture("Stage3/Stage3 Tap.png",172,202);
        return FXGL.entityBuilder(data)
                .view(tap)
                .at(185,380)
                .with(new TapComponent())
                .build();
    }
    @Spawns("tapc1")
    public Entity newTapc1(SpawnData data){
        Texture tap = texture("Stage3/Stage3 Tap1.png",172,202);
        return FXGL.entityBuilder(data)
                .view(tap)
                .at(185,380)
                .build();
    }
    @Spawns("tapc2")
    public Entity newTapc2(SpawnData data){
        Texture tap = texture("Stage3/Stage3 Tap2.png",172,202);
        return FXGL.entityBuilder(data)
                .view(tap)
                .at(185,380)
                .build();
    }
    @Spawns("yugang")
    public Entity newYugang(SpawnData data){
        Texture yugang = texture("Stage3/yugang.png",100,100);
        return FXGL.entityBuilder(data)
                .view(yugang)
                .with(new YugangComponent())
                .at(496,321)
                .build();
    }
    @Spawns("yugangc")
    public Entity newYugangc(SpawnData data){
        Texture yugangc = texture("Stage3/yugangc.jpg");
        return FXGL.entityBuilder(data)
                .view(yugangc)
                .build();
    }
    @Spawns("yugangc1")
    public Entity newYugangc1(SpawnData data){
        Texture yugangc1 = texture("Stage3/yugangc1.png");
        return FXGL.entityBuilder(data)
                .view(yugangc1)
                .build();
    }
    @Spawns("yugangc2")
    public Entity newYugangc2(SpawnData data){
        Texture yugangc2 = texture("Stage3/yugangc2.png");
        return FXGL.entityBuilder(data)
                .view(yugangc2)
                .build();
    }
    @Spawns("guizi")
    public Entity newGuizi(SpawnData data){
        Texture guizi = texture("Stage3/guizi.png",320,330);
        return entityBuilder(data)
                .view(guizi)
                .at(450,410)
                .build();
    }
    @Spawns("guizic1")
    public Entity newGuizic1(SpawnData data){
        Texture guizi = texture("Stage3/guizic1.png");
        return entityBuilder(data)
                .view(guizi)
                .build();
    }
    @Spawns("chouti")
    public Entity newchouti(SpawnData data){
        Texture chouti = texture("Stage3/chouti.png");
        return entityBuilder(data)
                .view(chouti)
                .build();
    }
    @Spawns("Do")
    public Entity newDo(SpawnData data){
        Texture note = texture("Stage3/yinfu/Do.png");
        return entityBuilder()
                .view(note)
                .build();
    }
    @Spawns("Re")
    public Entity newRe(SpawnData data){
        Texture note = texture("Stage3/yinfu/Re.png");
        return entityBuilder()
                .view(note)
                .build();
    }
    @Spawns("Mi")
    public Entity newMi(SpawnData data){
        Texture note = texture("Stage3/yinfu/Mi.png");
        return entityBuilder()
                .view(note)
                .build();
    }
    @Spawns("Fa")
    public Entity newFa(SpawnData data){
        Texture note = texture("Stage3/yinfu/Fa.png");
        return entityBuilder()
                .view(note)
                .build();
    }
    @Spawns("Sol")
    public Entity newSol(SpawnData data){
        Texture note = texture("Stage3/yinfu/Sol.png");
        return entityBuilder()
                .view(note)
                .build();
    }
    @Spawns("La")
    public Entity newLa(SpawnData data){
        Texture note = texture("Stage3/yinfu/La.png");
        return entityBuilder()
                .view(note)
                .build();
    }
    @Spawns("bed")
    public Entity newBed(SpawnData data){
        Texture bed = texture("Stage4/Stage4 Bed.png",400,410);
        return FXGL.entityBuilder(data)
                .view(bed)
                .at(500,505)
                .build();
    }
    @Spawns("box")
    public Entity newBox(SpawnData data){
        Texture box = texture("Stage4/Stage4 Box.png",200,200);
        return FXGL.entityBuilder(data)
                .view(box)
                .with(new BoxComponent())
                .at(200,591)
                .build();
    }
    @Spawns("painting")
    public Entity newPainting(SpawnData data){
        return entityBuilder()
                .view("Stage4/Painting.jpg")
                .at(100,100)
                .build();
    }
    @Spawns("clock2")
    public Entity newClock2(SpawnData data){
        Texture clock2 = texture("Stage4/Stage4 Clock.png",150,185);
        return FXGL.entityBuilder(data)
                .view(clock2)
                .with(new Clock2Component())
                .at(350,150)
                .build();
    }
    @Spawns("cl0")
    public Entity newCl0(SpawnData data){
        return entityBuilder(data)
                .view("Stage4/C0.png")
                .build();
    }
    @Spawns("cl1")
    public Entity newCl1(SpawnData data){
        return entityBuilder(data)
                .view("Stage4/C1.png")
                .build();
    }
    @Spawns("cl2")
    public Entity newCl2(SpawnData data){
        return entityBuilder(data)
                .view("Stage4/C2.png")
                .build();
    }
    @Spawns("cl3")
    public Entity newCl3(SpawnData data){
        return entityBuilder(data)
                .view("Stage4/C3.png")
                .build();
    }
    @Spawns("cl4")
    public Entity newCl4(SpawnData data){
        return entityBuilder(data)
                .view("Stage4/C4.png")
                .build();
    }
    @Spawns("cl5")
    public Entity newCl5(SpawnData data){
        return entityBuilder(data)
                .view("Stage4/C5.png")
                .build();
    }
    @Spawns("cl6")
    public Entity newCl6(SpawnData data){
        return entityBuilder(data)
                .view("Stage4/C6.png")
                .build();
    }
    @Spawns("cf")
    public Entity newCf(SpawnData data){
        return entityBuilder(data)
                .view("Stage4/Cf.png")
                .build();
    }
}
