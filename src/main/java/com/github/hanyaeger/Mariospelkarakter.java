package com.github.hanyaeger.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;


import java.util.Set;

public class Mariospelkarakter extends DynamicSpriteEntity implements KeyListener, Newtonian {
    private boolean Springt = false;
    private int sprongHoogte = 50;
    private int sprongSnelheid = 10;
    private int fallSpeed = 10;

    public Mariospelkarakter(Coordinate2D location) {
        super("sprites/hanny.png", location, new Size(20, 40), 1, 2);
        setGravityConstant(0.005);
        setFrictionConstant(0.04);

    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> Pressed) {
        if (Pressed.contains(KeyCode.A)) {
            setMotion(3, 270d);
        } else if (Pressed.contains(KeyCode.D)) {
            setMotion(3, 90d);
        } else if (Pressed.contains(KeyCode.W)) {
        } else if (Pressed.isEmpty()) {
            setSpeed(0);
        }
    }
}