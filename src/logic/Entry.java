package logic;

public class Entry {

    int key;
    StolenCar value;
    Entry next;

    public Entry(int key, StolenCar value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public Entry() {
        next = null;
    }

    public int GetKey() {
        return key;
    }

    public StolenCar GetValue() {
        return value;
    }
}
