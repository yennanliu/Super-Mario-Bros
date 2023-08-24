package model.prize;

import manager.SuperMarioApp;
import model.hero.Mario;

import java.awt.*;

public interface Prize {

    int getPoint();

    void reveal();

    Rectangle getBounds();

    void onTouch(Mario mario, SuperMarioApp engine);

}
