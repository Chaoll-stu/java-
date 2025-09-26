package edu.hitsz.aircraft;

public interface EnemyAircraftFactory {
    public abstract AbstractAircraft createEnemyAricraft(int locationX, int locationY, int speedX, int speedY, int hp);
}
