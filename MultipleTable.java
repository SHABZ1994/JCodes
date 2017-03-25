import java.util.Scanner;

public class MultipleTable{
	public static void main(String[]args){
		
		Scanner inVar = new Scanner(System.in);
		int value = 0;
		
		System.out.println("Insert a value whose table is to be create");
		value = inVar.nextInt();
		if(value<1){
			System.out.println("Insert proper Integer");
		}else{
			for(int i=1;  i <=10; i++){
			System.out.println(value +" X "+ i+ "="+ (value*i));
			}	
		}
		
	}
		
}
	
