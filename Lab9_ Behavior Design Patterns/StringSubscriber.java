import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String>{

    protected File file;

    public abstract void onSubscribe(Flow.Subscription subscription);
    public abstract void onNext(String text);

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Exception: " + throwable.toString());
    }
    
    @Override
    public void onComplete() {
        System.out.println("---------complete----------");
    }

    protected void writeFile(String item){
        try {
            FileWriter fWriter = new FileWriter(file, true);
            System.out.println("save to file");
            fWriter.write(item + "\n");
            fWriter.flush();
            fWriter.close();
        } 
        catch (IOException  e) {
            System.out.println("Exception: "+e);
        }
    }


}