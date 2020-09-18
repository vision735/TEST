package toom;

import java.util.HashSet;

public class Student {
	private String name;
	private int id;

	public Student() {
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("张三", 1));
		hs.add(new Student("李四", 2));
		System.out.println("放入自定义类型数据之前打印---" + hs);
		System.out.println(hs.add(new Student("王麻子", 4)));
		System.out.println(hs.add(new Student("王麻子", 4)));
		System.out.println(hs);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
