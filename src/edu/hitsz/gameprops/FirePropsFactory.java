package edu.hitsz.gameprops;

public class FirePropsFactory implements PropsFactory{
    public FirePropsFactory(){}
    @Override
    public FireProps createProps(int locationX, int locationY, int speedX, int speedY) {
        return new FireProps(locationX, locationY, speedX, speedY);
    }
}
