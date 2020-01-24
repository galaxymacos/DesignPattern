package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<EventHandler>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    protected void notifyEventHandlers(){
        for (EventHandler observer : eventHandlers){
            observer.update();
        }
    }
}
