package com.yen.SuperMario.model.brick;

import com.yen.SuperMario.manager.GameEngine;
import com.yen.SuperMario.model.prize.Prize;

import java.awt.image.BufferedImage;

public class SurpriseBrick extends Brick{

    private Prize prize;

    public SurpriseBrick(double x, double y, BufferedImage style, Prize prize) {
        super(x, y, style);
        setBreakable(false);
        setEmpty(false);
        this.prize = prize;
    }

    @Override
    public Prize reveal(GameEngine engine){
        BufferedImage newStyle = engine.getImageLoader().loadImage("/sprite.png");
        newStyle = engine.getImageLoader().getSubImage(newStyle, 1, 2, 48, 48);

        if(prize != null){
            prize.reveal();
        }

        setEmpty(true);
        setStyle(newStyle);

        Prize toReturn = this.prize;
        this.prize = null;
        return toReturn;
    }

    @Override
    public Prize getPrize(){
        return prize;
    }
}
