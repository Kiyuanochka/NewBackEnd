package lesson6.model;
public class Categories {

    private Integer id;
    private String title;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
        public String getTitle() {
        return title;
    }
        public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}
