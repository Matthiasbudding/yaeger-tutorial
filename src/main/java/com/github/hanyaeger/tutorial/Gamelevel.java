package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.Swordfish;
import com.github.hanyaeger.tutorial.entities.text.HealthText;

public class Gamelevel extends DynamicScene {

    private Waterworld waterworld;
    private HealthText healthText;

    public Gamelevel(Waterworld waterworld) {
        this.waterworld = waterworld;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        Swordfish swordfish = new Swordfish(new Coordinate2D(getWidth() / 2, getHeight() / 1.5));
        addEntity(swordfish);
        Hanny hanny = new Hanny(new Coordinate2D(getWidth() / 10, getHeight() / 10), healthText);
        addEntity(hanny);
        HealthText healthText = new HealthText(new Coordinate2D(50, 50));
        addEntity(healthText);
    }


}
