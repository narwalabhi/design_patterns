package creational.factory.android;

import creational.factory.Button;

public class AndroidButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Android Button");
    }

    @Override
    public void onClick() {
        System.out.println("Click Android Button");
    }
}
