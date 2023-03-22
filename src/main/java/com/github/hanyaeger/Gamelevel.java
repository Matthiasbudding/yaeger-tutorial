package com.github.hanyaeger;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.entities.Mariospelkarakter;

public class Gamelevel extends DynamicScene {

    private Mario mario;

    public Gamelevel(Mario mario) {
        this.mario = mario;
    }
    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities() {
        Mariospelkarakter mariospelkarakter = new Mariospelkarakter(new Coordinate2D(50, 400));
        addEntity(mariospelkarakter);
    }
}
