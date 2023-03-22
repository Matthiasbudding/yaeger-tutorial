package com.github.hanyaeger;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class Mario extends YaegerGame {
    @Override
    public void setupGame() {
        setGameTitle("Mario");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new Titlescene(this));
        addScene(1, new Gamelevel(this));

    }

    public static void main(String[] args){
        launch(args);
    }
}
