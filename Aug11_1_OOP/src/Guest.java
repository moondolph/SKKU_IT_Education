import java.util.Scanner;

public class Guest {

	String name;
	int age;
	Scanner mouth = new Scanner(System.in);
	double height;
	double weight;
	double bmi;
	String bmiResult;
	
	public void showPatient() {
		System.out.println(" < �մ� > ");
		System.out.println(name);
		System.out.println(age);
		System.out.println(" ---------------");
	}
	
	//Ű�� ���� ���
	public double answerHeight() {
		return mouth.nextDouble();
	}
	
	//�����Կ� ���� ���
	public double answerWeight() {
		return mouth.nextDouble();
	}
	
	
	
	
	
	
	
}
