package factory.android;

import factory.DropDown;

public class AndroidDropDown implements DropDown {
    @Override
    public void render() {
        System.out.println("Render Android DropDown");
    }

    @Override
    public void onClick() {
        System.out.println("Click Android DropDown");
    }
}
