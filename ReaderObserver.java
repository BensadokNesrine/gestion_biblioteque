
public class ReaderObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Lecteur re�oit la notification: " + message);
    }
}
