package cs2030.simulator;
import java.util.Comparator;

public class EventComparator implements Comparator<Event> { 
    @Override
    public int compare(Event e1, Event e2) {
        int result = Double.compare(e1.getEventTime(), e2.getEventTime());
        if (result == 0) {
            return Integer.compare(e1.getCustomer().getID(), e2.getCustomer().getID());
        } else {
            return result;
        }
    }
}
