package ahmet_kartal_vize_cevaplar;

import java.util.Random;
import java.util.Scanner;

public class zar_atisi_soru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Kaç kere zar atılsın:");
		int zarSayisi= sc.nextInt();					// Kaç kere  zar atılacağı bilgisi alınır
		
		System.out.print("Kaç kere tekrar etsin:");
		int atis = sc.nextInt();						// Kaç tekrar olacağı bilgisi alınır
		int toplam=0;									// En büyük atış toplamı bilgisi için toplam değeri tanımlaması
		int galip=0;									// En büyük atış için galip bilgisi tanımlaması
		int tempToplam=0;								// n. ve n-1. atışları karşılaştırmak için geçici değişken tanımlaması
		
		for(int i=0;i<atis;i++) {						// atis sayısı kadar tekrar içindöngü 
			
			System.out.print(i+1+". Atış:");			// Kaçıncı atış yapıldığına dair bilgi	
			for(int j=0;j<zarSayisi;j++) {				// Seçilen zar atışı sayısı kadar tekrar için döngü
				Random random = new Random();				
				int gelenZar = random.nextInt(6)+1;		// gelenZar değişkeni tanımlaması ve için 1-6 arası değer ataması
				tempToplam+=gelenZar;					// geçici değişkene gelen zarların eklenmesi
				zariGoster(gelenZar);					//gelen zar için zariGoster'me işlemi
			}
			if(tempToplam>toplam) {						// eğer geçiciToplam toplamdan büyükse
				galip = i+1;							// bu atış en büyük atıştır
				toplam=tempToplam;						// ve yeni toplam değeri temToplamdır
			}
			tempToplam=0;								// yeniden kullanabilmek için tempToplamı 0ladık
			System.out.println();						// Atışları gösterdikten sonra alt satıra geçsin
			
		}
		System.out.println(galip+". atış en büyük zar toplamına sahiptir");
	}
	
	
	// Gelen zarı şekil olarak gösteren fonksiyonumuz
	public static void zariGoster(int n) {
		switch(n){
		case 1:System.out.print("[ . ] "); break;
		case 2:System.out.print("[ : ] "); break;
		case 3:System.out.print("[. :] "); break;
		case 4:System.out.print("[: :] "); break;
		case 5:System.out.print("[:.:] "); break;
		case 6:System.out.print("[:::] "); break;
		}
			
	}

}
