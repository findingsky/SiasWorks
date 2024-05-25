package bean;

public class StudentBean {
          private String name;
          int age;
          int tall;
          int weight;
          String address;
          String school;
          String depart;
		public StudentBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		public StudentBean(String name, int age, int tall, int weight, String address, String school, String depart) {
			super();
			this.name = name;
			this.age = age;
			this.tall = tall;
			this.weight = weight;
			this.address = address;
			this.school = school;
			this.depart = depart;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getTall() {
			return tall;
		}
		public void setTall(int tall) {
			this.tall = tall;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getSchool() {
			return school;
		}
		public void setSchool(String school) {
			this.school = school;
		}
		public String getDepart() {
			return depart;
		}
		public void setDepart(String depart) {
			this.depart = depart;
		}
		@Override
		public String toString() {
			return "StudentBean [name=" + name + ", age=" + age + ", tall=" + tall + ", weight=" + weight + ", address="
					+ address + ", school=" + school + ", depart=" + depart + "]";
		}
      
		
          
	
	
}
