package creational.factory;

import creational.factory.android.AndroidUiFactory;
import creational.factory.ios.IosUiFactory;
import creational.factory.windows.WindowsUiFactory;

public class AbstractUiFactory {

    public static UiFactory getUiFactory(Os os) {
        return switch (os) {
            case WINDOWS -> new WindowsUiFactory();
            case IOS -> new IosUiFactory();
            case ANDROID -> new AndroidUiFactory();
        };
    }

}
