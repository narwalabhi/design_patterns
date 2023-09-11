package factory.ios;

import factory.Button;
import factory.DropDown;
import factory.UiFactory;

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
