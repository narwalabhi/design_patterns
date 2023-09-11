package factory.windows;

import factory.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Click Windows Button");
    }
}
