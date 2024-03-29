package lessons.lesson9.note;

public class Note {

    private int id;
    private String description;

    public Note(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
