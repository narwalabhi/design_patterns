package factory.windows;

import factory.DropDown;

public class WindowsDropDown implements DropDown {
    @Override
    public void render() {
        System.out.println("Render Windows DropDown");
    }

    @Override
    public void onClick() {
        System.out.println("Click Windows DropDown");
    }
}
