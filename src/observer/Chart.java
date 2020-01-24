package observer;

public class Chart implements Observer{

    @Override
    public void update(int value) {
        System.out.println("Chart got updated");
        System.out.println("Value from data source: "+value);
    }
}
