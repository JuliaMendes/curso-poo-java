package UltraEmojiCombat;

public class UltraEmojiCombat {
	public static void main (String[] args) {
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Script", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("UFO Santos", "Brasil", 30, 1.70f, 70.0f, 5, 2, 0);
		l[3] = new Lutador("Bernard", "EUA", 32, 1.80f, 80.0f, 6, 2, 2);
		l[4] = new Lutador("Punch", "Itália", 28, 1.67f, 59.3f, 1, 2, 3);
		l[5] = new Lutador("B4S", "EUA", 32, 1.86f, 100.4f, 2, 2, 2);
		
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
	}

}
