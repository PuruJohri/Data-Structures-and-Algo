package ComparatorsandComparable;

public class Student {
		int marks;
		String name;
		public Student(int marks,String name) {
			super();
			this.marks=marks;
			this.name=name;
			}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Student [marks=" + marks +", name="+ name +"]" ;
		}

		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

//		@Override
//		public int compareTo(Student o) {
//			return this.marks-o.marks;
//		}
		
}
