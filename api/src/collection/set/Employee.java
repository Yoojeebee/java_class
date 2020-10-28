package collection.set;


/**
 * @FileName : Employee.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 10. 27.
 * @Time    :오전 11:28:36
 */
public class Employee {
	private int no;
	private String name;
	private String dept;
	private long salary;
	
	public Employee() { super(); }

	public Employee(int no, String name, String dept, long salary) {
		super();
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (no != other.no)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
