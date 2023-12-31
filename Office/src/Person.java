public abstract class Person implements Identifiable{
    private long id;
    private String name;

    @Override
    public void setId(Long id) {
        this.id = id;

    }

    @Override
    public Long getId() {
        return this.id;
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Name=" + name + "  " + "Id=" + id;
    }


}
