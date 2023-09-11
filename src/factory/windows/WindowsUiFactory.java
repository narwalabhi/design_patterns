package factory.windows;

import factory.Button;
import factory.DropDown;
import factory.UiFactory;

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
