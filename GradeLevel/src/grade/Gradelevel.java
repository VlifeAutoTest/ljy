package grade;
import java.util.Scanner;
public class Gradelevel {

   public static void main(String[] args){
   int score;
	System.out.println("������ɼ���");
	Scanner scan = new Scanner(System.in);
	score = scan.nextInt();
	studentLevel(score);
   }

	
	 
	public static  String  studentLevel(int score){
		if(score<0){
			System.out.println("err");
			return "err";
			}
		else if(score<60){
		System.out.println("D");
		return "D";
		}
		else if (score<80){
		System.out.println("C");
		return "C";
		}
		else if (score<90){
		System.out.println("B");
		return "B";
		}
		else if(score<=100){
		System.out.println("A");
		return "A";
		}
		else{
			System.out.println("ERR");
			return "ERR";
			}
	}
	
	
}