package com.github.hanyaeger.tutorial.entities.button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.TitleScene;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Startbutton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    private TitleScene waterworld;

    public Startbutton(Coordinate2D initialLocation, TitleScene waterworld) {
        super(initialLocation, "Play game");
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        this.waterworld = waterworld;
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        waterworld.SetActiveSCENE(1);
    }

    @Override
    public void onMouseEntered(){
        setFill(Color.VIOLET);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited(){
        setFill(Color.PURPLE);
        setCursor(Cursor.DEFAULT);
    }

}
