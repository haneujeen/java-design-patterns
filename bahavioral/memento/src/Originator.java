public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        state = memento.getState();
    }

    @Override
    public String toString() {
        return state;
    }
}