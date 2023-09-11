package factory;

public class Main {

    public static void main(String[] args) {
//        UiFactory uiFactory = AbstractUiFactory.getUiFactory(Os.ANDROID);
//        UiFactory uiFactory = AbstractUiFactory.getUiFactory(Os.IOS);
        UiFactory uiFactory = AbstractUiFactory.getUiFactory(Os.WINDOWS);
        Button button = uiFactory.getButton();
        DropDown dropDown = uiFactory.getDropDown();
        button.render();
        button.onClick();
        dropDown.render();
        dropDown.onClick();
    }

}
