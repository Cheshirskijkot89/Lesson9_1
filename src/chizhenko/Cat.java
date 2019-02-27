package chizhenko;

public class Cat {

	private String color;
	private String breed;
	private double veight;
	private double age;

	public Cat(String color, String breed, double veight, double age) {
		super();
		this.color = color;
		this.breed = breed;
		this.veight = veight;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getVeight() {
		return veight;
	}

	public void setVeight(double veight) {
		this.veight = veight;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void miaow() {
		if (age >= 1) {
			System.out.println("miiiiiiiiaaaaaaaoooooow");
		} else {
			System.out.println("miw");
		}
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", breed=" + breed + ", veight=" + veight + ", age=" + age + "]";
	}

}
