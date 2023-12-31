import java.util.Objects;

public class Office implements Identifiable{

    private long id;

    public Office(long id){
        this.id = id;
    };

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Office office = (Office) o;
        return id == office.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
