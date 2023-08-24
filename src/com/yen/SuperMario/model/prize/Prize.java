package com.yen.SuperMario.model.prize;

import com.yen.SuperMario.manager.GameEngine;
import com.yen.SuperMario.model.hero.Mario;

import java.awt.*;

public interface Prize {

    int getPoint();

    void reveal();

    Rectangle getBounds();

    void onTouch(Mario mario, GameEngine engine);

}
