package edu.hitsz.aircraft;

public class MobEnemyFactory implements EnemyAircraftFactory{
    public MobEnemyFactory(){
    }

    @Override
    public AbstractAircraft createEnemyAricraft(int locationX, int locationY, int speedX, int speedY, int hp) {
        return new MobEnemy(locationX, locationY, speedX, speedY, hp);
    }

}
