public class ToDos extends Task {

    public ToDos(String description) {
        super(description);
    }

    @Override
    public String textFormat() {
        return "T|" + (isDone ? 1 : 0) + "|" + description;
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}