package factory.android;

import factory.Button;
import factory.DropDown;
import factory.UiFactory;

public class AndroidUiFactory implements UiFactory {
    @Override
    public Button getButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown getDropDown() {
        return new AndroidDropDown();
    }
}
