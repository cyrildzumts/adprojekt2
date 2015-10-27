package primzahlen;

public class PrimzahlenExtended extends AbstractPrimzahlen {

	@Override
	public  void suchePrimzahlen(int grenze) {
		if( grenze < 2 ){
			System.out.println("Es gibt keine Primzahl unter dem Wert 2.");

		}
		else if ( grenze == 2){
			System.out.println(grenze);

		}
		
		else {
			boolean primZahlArray[] = new boolean[grenze + 1];
			primZahlArray[0] = false;
			primZahlArray[1] = false;
			for (int i = 2 ; i < primZahlArray.length; i++) {
				primZahlArray[i] = true;
			}

			for(int i = 2; i < Math.sqrt(grenze +1); i++) {
				if (primZahlArray[i] == true){
					for(int k = 2; k*i < grenze + 1; k++){
						primZahlArray[k*i] = false;
					}
				}
				
			}

			for (int i = 0; i < primZahlArray.length; i++){
				if(primZahlArray[i] == true){
					System.out.print(" " + i );
				}
			}
		}
		System.out.println();
	}

}
