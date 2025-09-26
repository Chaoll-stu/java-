package edu.hitsz.gameprops;

public class HpPropsFactory implements PropsFactory{
    public HpPropsFactory(){}
    @Override
    public HpProps createProps(int locationX, int locationY, int speedX, int speedY) {
        return new HpProps(locationX, locationY, speedX, speedY);
    }
}
