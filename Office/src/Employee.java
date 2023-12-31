import java.util.Objects;

public class Employee extends Person implements OfficeSupportEntity {

    private Computer computer;
    private Office office;

    public Employee(long id, String name, Office office, Computer computer) {
        super(id, name);
        this.office = office;
        this.computer = computer;
    }


    @Override
    public Computer getComputer() {
        return this.computer;

    }

    @Override
    public void setComputer(Computer c) {
        this.computer = computer;

    }


    @Override
    public Office getOffice() {
        return this.office;
    }

    @Override
    public void setOffice(Office c) {
        this.office = office;
    }
}




