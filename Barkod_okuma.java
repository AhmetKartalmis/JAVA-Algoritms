package ahmet_kartal_vize_cevaplar;

import java.util.Scanner;

public class barkod_soru2 {
	public static void main(String[] args) {
		int[] dizi= new int[13];											// 12 büyüklüğündeki diziyi oluşturuyoruz
		Scanner girdi = new Scanner(System.in);								// girdiler için scanner tanımlama
		System.out.println("Barkod giriniz:");
		for(int i=0;i<13;i++) {										
			System.out.println("Barkodun " +(i+1)+". değeri:");
			dizi[i]=girdi.nextInt();										// diziye elemanları yerleştirme
			
		}
		int toplam=0;														// kontrol için toplam değeri tanımlaması 
		System.out.println("Barkodun son rakamı:"+dizi[12]);				// barkod son değer yazdırma
		System.out.println("Geçerli Barkod Numaranız:");					// barkod no yazdırma
		
																			//Barkod no formatında yazdırma
		System.out.print(dizi[0]+"-");
		for(int i = 1;i<12;i++) {
			System.out.print(dizi[i]);
		}
		System.out.println();
		


		
		for(int i = 0;i<12;i++) {
			if(i%2==0) {
				toplam+=2*dizi[i];												// çift indisleri 2 ile çarpıp toplama ekleme
				
			}else {
				toplam+=5*dizi[i];												// tek indisleri 5 ile çarpıp toplama ekleme
			}
		}
		int kontrolDeger= 10-(toplam%10);										// kontrol değerini oluşturduk
		if(kontrolDeger==dizi[0]||kontrolDeger==dizi[12]) {						// geçerli barkodda yapılacak işlemler
			System.out.println("Barkod Kontrol Rakamı:"+kontrolDeger);		
			System.out.println("Barkod Numarası Geçerlidir ");
		}
		else {																	// geçersiz barkodda yapılacak işlemler			
			System.out.println("Barkod Kontrol Rakamı:"+kontrolDeger);			
			System.out.println("Barkod Numarası Geçersizdir ");			
		}
		
		
	}

}
