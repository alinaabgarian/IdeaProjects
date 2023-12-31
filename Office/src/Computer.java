public class Computer implements Identifiable{

    private long id;

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    public Computer(long id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Computer id is " + id;
    }
}
