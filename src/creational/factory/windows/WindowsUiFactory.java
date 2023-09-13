package creational.factory.windows;

import creational.factory.Button;
import creational.factory.DropDown;
import creational.factory.UiFactory;

public class WindowsUiFactory implements UiFactory {
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown getDropDown() {
        return new WindowsDropDown();
    }
}
