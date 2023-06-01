package st;

public class Info {
    
	String name;
	float rollNo;
	 float age;
	 float marks;
	
	 Info(){
		  name = "";
		  rollNo=0;
		  age=0;
		  marks=0;
	 }
	 
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public float getRollNo() {
		return rollNo;
	}

	public void setRollNo(float rollNo) {
		this.rollNo = rollNo;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}


	

	
}
