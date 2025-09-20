package edu.hitsz.gameprops;

import edu.hitsz.aircraft.HeroAircraft;

public class FireProps extends BaseProps{
    public FireProps(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    public void act(HeroAircraft heroAircraft){
        System.out.println("FireSupply Active\n");
    }
}
