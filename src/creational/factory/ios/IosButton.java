package creational.factory.ios;

import creational.factory.Button;

public class IosButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Ios Button");
    }

    @Override
    public void onClick() {
        System.out.println("Click Ios Button");
    }
}
