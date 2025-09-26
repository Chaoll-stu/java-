package edu.hitsz.aircraft;

public class EliteEnemyFactory implements EnemyAircraftFactory{
    public EliteEnemyFactory(){
    }

    @Override
    public AbstractAircraft createEnemyAricraft(int locationX, int locationY, int speedX, int speedY, int hp) {
        return new EliteEnemy(locationX, locationY, speedX, speedY, hp);
    }
}
