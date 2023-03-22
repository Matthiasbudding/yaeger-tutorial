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
        } else if (Pressed.contains(KeyCode.W) && !Springt) {
            Springt = true;
            Thread sprong = new Thread(new Springen());
            sprong.start();
        } else if (Pressed.isEmpty()) {
            setSpeed(0);
        }
    }

    private class Springen implements Runnable {
        @Override
        public void run() {
            double startY = getLocationInScene().getY();
            double targetY = startY + sprongHoogte;
            setSpeed(sprongSnelheid);
            try {
                while (getLocationInScene().getY() < targetY) {
                    Thread.sleep(50);
                    beweegOmhoog();
                }

                setSpeed(fallSpeed);
                while (getLocationInScene().getY() > startY) {
                    Thread.sleep(50);
                    beweegOmlaag();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Springt = false;
                run();
            } finally {
                Springt = false;
            }
        }

        private void beweegOmhoog() {
            setAnchorLocationY(getLocationInScene().getY() - 2);
        }

        private void beweegOmlaag() {
            setAnchorLocationY(getLocationInScene().getY() + 2);
        }

        private void setSpeed(int snelheid) {
            setMotion(snelheid, getDirection());
       }
    }
}
