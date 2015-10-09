
public class StartUp {

	public static void main(String[] args) {
		AbstractPrimzahlen p = new Primzahlen();
		long zeit = System.nanoTime();
		for(int i = 0; i < 400000; i++)
		{
			if(p.istPrimzahl(i))
			{
				System.out.println(i);
			}
		}
		System.out.println((System.nanoTime() - zeit)/1000000000 + "sek");

	}

}
