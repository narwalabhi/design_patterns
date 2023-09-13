package creational.factory.android;

import creational.factory.Button;
import creational.factory.DropDown;
import creational.factory.UiFactory;

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
