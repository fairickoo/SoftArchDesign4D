import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber {
    public AlphabetSubscriber() {
        super();
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        ((StringSubscription)subscription).addSubscriber(this);
    }

    @Override
    public void onNext(String text) {
        if (text.toString().matches("(.*)[a-zA-z](.*)")) {
            Path filePath = Paths.get(System.getProperty("user.dir"), "Files/","Alphabet.txt");
            this.file = new File(filePath.toString());
            System.out.println("AlphabetSubscriber " + " receives : " + text);
            this.writeFile(text);
        }
    }
}