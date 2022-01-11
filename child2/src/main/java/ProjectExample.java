public class ProjectExample {
    private int id;
    private String title;

    public ProjectExample() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ProjectExample {" +
                "id = " + id +
                ", title = '" + title + '\'' +
                '}';
    }
}
