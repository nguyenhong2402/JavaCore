public class Waiter extends Employee {

    int compensate;

    public Waiter(int id, String name, int age, long basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    @Override
    public long calculatorSalary() {
        return basicSalary + compensate;
    }

    @Override
    public String toString() {
        return id +
                " - " + name +
                " - " + age +
                " - " + basicSalary +
                " - " + compensate+ " - " + calculatorSalary();
    }
}
