package dk.via.cashier;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CashRegister {
    private PropertyChangeSupport support;
    private double total;

    public CashRegister() {
        total = 0;
        support = new PropertyChangeSupport(this);
    }

    public void completeSale() {
        double oldTotal = total;
        total = 0;
        support.firePropertyChange("total", oldTotal, total);
    }

    public void registerSale(double amount) {
        double oldTotal = total;
        total += amount;
        support.firePropertyChange("total", oldTotal, total);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
