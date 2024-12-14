package pl.javastart.task;

public class Category {
    String name;
    String description;

    Category(String n, String desc) {
        name = n;
        description = desc;
    }
    void showinfo() {
        System.out.println(name + " " + description);
    }
}
