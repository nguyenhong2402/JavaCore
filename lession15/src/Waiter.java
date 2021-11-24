public class Waiter extends Employee{
    long compensate;

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
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
                " - " + calculatorSalary();
    }
}
