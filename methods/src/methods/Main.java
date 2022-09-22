package methods;

public class Main {

	public static void main(String[] args) {

		SayiBulmaca();
		SayiBulmaca();
		SayiBulmaca();
		SayiBulmaca();

	}

	public static void SayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 2;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi == true) {
			MesajVer("Sayı mevcuttur : "+aranacak);
		} else {
			MesajVer("Sayı mevcut değildir : "+aranacak);
		}
	}
	
	
	public static void MesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
