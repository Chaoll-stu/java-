package edu.hitsz.gameprops;

import edu.hitsz.aircraft.HeroAircraft;

public class BombProps extends BaseProps{
    public BombProps(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    public void act(HeroAircraft heroAircraft){
        System.out.println("BombSupply Active!\n");
    }
}
