package com.github.hanyaeger;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.button.Knop;

public class Titlescene extends StaticScene {

    private Mario mario;

    public Titlescene(Mario mario) {
        this.mario = mario;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/titelschermAchtergrond.jpg");

    }

    @Override
    public void setupEntities() {
        Knop startknop = new Knop(new Coordinate2D(getWidth() / 10, getHeight() / 2), "Ga verder", mario);
        addEntity(startknop);
    }
}
