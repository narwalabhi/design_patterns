package creational.factory.ios;

import creational.factory.Button;
import creational.factory.DropDown;
import creational.factory.UiFactory;

public class IosUiFactory implements UiFactory {
    @Override
    public Button getButton() {
        return new IosButton();
    }

    @Override
    public DropDown getDropDown() {
        return new IosDropDown();
    }
}
