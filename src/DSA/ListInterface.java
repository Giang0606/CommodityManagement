package DSA;

public interface ListInterface<Employee> extends Iterable<Employee> {
	public void add(Employee data);
	public Employee get(int i);
	public void set(int i, Employee data);
	public void remove(Employee data);
	public void isContain(Employee data);
	public int size();
	public boolean isEmpty();

}
