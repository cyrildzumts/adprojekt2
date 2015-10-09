
public abstract class AbstractPrimzahlen {
	
	/**
	 * Gibt alle Primzahlen auf der Konsole aus für die gilt:
	 * Primzahl <= grenze.
	 *
	 * @param grenze
	 * @return
	 * 
	 * @require zahl >= 0
	 */
	public abstract void suchePrimzahlen(int grenze);
	
	/**
	 * Prüft ob gegebene Zahl eine Primzahl ist
	 * 
	 * @param zahl
	 * @return
	 * 
	 * @require zahl >= 0
	 */
	public boolean istPrimzahl(int zahl)
	{
		boolean result = true;		
		if(zahl == 2){
			result = true;
		}
		else if(zahl < 2){
			result = false;
		}
		else{
			for(int i = 2; i < zahl; i++){
				if(zahl % i == 0){
					result = false;
					break;
				}
			}
		}		
		return result;
	}
}
