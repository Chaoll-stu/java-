package edu.hitsz.gameprops;

import edu.hitsz.aircraft.HeroAircraft;

public class HpProps extends BaseProps{
    public HpProps(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    public void act(HeroAircraft heroAircraft){
        System.out.println("回复生命值30\n");
        heroAircraft.decreaseHp(-30);
        if(heroAircraft.getHp() >= 100) {
            heroAircraft.decreaseHp(heroAircraft.getHp() - 100);
        }
    }
}
