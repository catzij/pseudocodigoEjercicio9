import java.util.*;
public class Ejercicio9{
	public static void main(String args[]){

		Scanner read = new Scanner(System.in);

		int t1;
		int t2;
		float cantidad=0;
		float suma=0;
		float promedio;

		
			do{
				System.out.println("ingrese T1");
				t1 = read.nextInt();
				System.out.println("ingrese T2");
				t2 = read.nextInt();

				if (t1>5&&t2>5&& t1<15&&t2<15){
					cantidad=cantidad+2;
					suma=suma+t1+t2;
				
				}
			}while(t1!=0);

			promedio = suma / cantidad;
				System.out.println("el promedio es " +promedio);

		}
}
