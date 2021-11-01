import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber {
    SymbolSubscriber() {
        super();
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        ((StringSubscription)subscription).addSubscriber(this);
    }

    @Override
    public void onNext(String text) {
        if (text.toString().matches("(.*)[^a-zA-z0-9](.*)")) {
            Path filePath = Paths.get(System.getProperty("user.dir"), "Files/","Symbol.txt");
            this.file = new File(filePath.toString());
            System.out.println("SymbolSubscriber " + " receives : " + text);
            this.writeFile(text);
        }
    }
}