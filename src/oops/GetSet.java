package oops;

class Students {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid id!");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Students obj = new Students();
        obj.setId(-111);
        obj.setName("Max");

        System.out.println("Id : " + obj.getId());
        System.out.println("Name : " + obj.getName());
    }
}
