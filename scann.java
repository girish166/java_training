package basics;
import java.util.Scanner;
public class scann {
	public static void main(String[] args)
	{
		String product;
		float price;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product");
		product=sc.next();
		System.out.println("enter the price");
		price=sc.nextFloat();
		System.out.println("Product:"+product);
		System.out.println("Price:"+price);
		
		
	}

}
