package edu.hitsz.gameprops;

public class BombPropsFactory implements PropsFactory{
    public BombPropsFactory(){}
    @Override
    public BaseProps createProps(int locationX, int locationY, int speedX, int speedY) {
        return new BombProps(locationX, locationY, speedX, speedY);
    }
}
