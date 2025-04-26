
public class ReaderObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Lecteur reçoit la notification: " + message);
    }
}
