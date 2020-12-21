import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Por favor ingrese un numero por teclado:");
		String numero = "";
		Scanner entradaEscaner = new Scanner (System.in);
		numero = entradaEscaner.nextLine ();
		int num = Integer.parseInt(numero);
		int a =0 , b =1, c=0;

		for (int i = 0; i < num; i++)
		{
			a=b;
			b=c;
			c=a+b;

			if (c==num)
			{
				System.out.println("valor fibonacci: "  + c);
				break;
			}
			else
			{
				if(c>num)
				{
					break;
				}
				else
				{
					System.out.println("valor fibonacci: "  + c);
				}
			}
		}
	}
}