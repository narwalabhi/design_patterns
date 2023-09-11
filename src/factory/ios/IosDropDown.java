package factory.ios;

import factory.DropDown;

public class IosDropDown implements DropDown {
    @Override
    public void render() {
        System.out.println("Render Ios DropDown");
    }

    @Override
    public void onClick() {
        System.out.println("Click Ios DropDown");
    }
}
