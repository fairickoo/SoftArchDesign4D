import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Flow;

public class NumberSubscriber extends StringSubscriber {
    public NumberSubscriber(){
        super();
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        ((StringSubscription)subscription).addSubscriber(this);
    }

    @Override
    public void onNext(String text) {
        if (text.toString().matches("(.*)[0-9](.*)")) {
            Path filePath = Paths.get(System.getProperty("user.dir"), "Files/","Number.txt");
            this.file = new File(filePath.toString());
            System.out.println("NumberSubscriber " + " receives : " + text);
            this.writeFile(text);
        }
    }
}