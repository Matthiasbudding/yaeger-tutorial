package com.github.hanyaeger.button;

import com.github.hanyaeger.Mario;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Knop extends TextEntity implements MouseButtonPressedListener  {
    private Mario mario;
    public Knop(Coordinate2D initialLocation, String tekst, Mario mario) {
        super(initialLocation,tekst);
        setFill(Color.WHITE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 60));

        this.mario = mario;
    }
    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        mario.setActiveScene(1);
    }

}
