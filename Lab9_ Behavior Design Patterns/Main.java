import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();

        StringSubscriber AlphabetSubscriber = new AlphabetSubscriber();
        StringSubscriber NumberSubscriber = new NumberSubscriber();
        StringSubscriber SymbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(AlphabetSubscriber);
        publisher.subscribe(NumberSubscriber);
        publisher.subscribe(SymbolSubscriber);

        Scanner scanner = new Scanner(System.in);
        String input;

        while(true) {
            
            System.out.print("----------------> Enter string : ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("x"))
                break;
            publisher.publish(input);
            
        }
        scanner.close();

    }
}