package factory;

import factory.android.AndroidUiFactory;
import factory.ios.IosUiFactory;
import factory.windows.WindowsUiFactory;

public class AbstractUiFactory {

    public static UiFactory getUiFactory(Os os) {
        return switch (os) {
            case WINDOWS -> new WindowsUiFactory();
            case IOS -> new IosUiFactory();
            case ANDROID -> new AndroidUiFactory();
        };
    }

}
