package ahmet_kartal_vize_cevaplar;

import java.util.Scanner;

public class sekiller_soru3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Sayı Giriniz:");
		int n = sc.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Birinci Şekil:");
		birinciSekilOlustur(n);					//aşağıda yazılı olan 1. şekli oluşturacak fonksiyon
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("İkinci Şekil:");
		ikinciSekilOlustur(n);                  //aşağıda yazılı olan 2. şekli oluşturacak fonksiyon
		
	}
	
	
	
	public static void birinciSekilOlustur(int n) {
		
		// ilk üçgeni oluşturan 1. for döngüsü
	    //--------------------------------------------------------------------------------------------------------
		for(int j=1;j<n;j++) {
			int bosluk=((2*n-1)-(2*j-1))/2;           // ((max * sayısı) - (basılacak * sayısı)) nın yarısı kadar boşluk atması için değişken
			for(int k=0;k<bosluk;k++ ) {           	  // ve onun döngüsü
				System.out.print(" ");				  

				
			}
			for(int i = 0;i < 2*j-1;i++) {             //2*n-1 e kadar olan tek sayılar adedince yan yana * bastırması için döngü
				System.out.print("*");
			}
			System.out.println();					   // yeteri kadar bastırdıktan sonra satır atlasın diye
		}
		//--------------------------------------------------------------------------------------------------------

		
		
		
		
		// ortadaki dikdörtgeni oluşturan 2. for döngüsü
		//--------------------------------------------------------------------------------------------------------
																	
		for(int j=0;j<n;j++) {							// n+1 tane satır için bir döngü	
			for(int i = 1;i < 2*n;i++) {				// yan yana 2*n-1 tane * için bir döngü
				System.out.print("*");
			}
			System.out.println();                       //  yan yana 2*n-1 tane * bastırdıktan sonra satır atlasın
			
		}
		//--------------------------------------------------------------------------------------------------------
		
		
		
		

		// sondaki ters üçgeni oluşturacak 3. for döngüsü  
		//--------------------------------------------------------------------------------------------------------
		for(int j=n;j>0;j--) {
			int bosluk=((2*n-1)-(2*j-1))/2;              // ((max * sayısı) - (basılacak * sayısı)) nın yarısı kadar boşluk atması için değişken
			for(int k=0;k<bosluk;k++ ) {				 // ve onun döngüsü	
				System.out.print(" ");

				
			}
			for(int i = 0;i < 2*j-1;i++) {               //2*n-1 e kadar olan tek sayılar adedince yan yana * bastırması için döngü
				System.out.print("*");
			}
			System.out.println();
		}
		//--------------------------------------------------------------------------------------------------------

		
		
		

		
	}
	
	public static void ikinciSekilOlustur(int n) {
		// ilk üçgeni oluşturacak for döngüsü  
	    //--------------------------------------------------------------------------------------------------------
		for(int i=1;i<=n;i++) {
			if(i==1) {									// ilk yıldızdan sonra boşluk olmadığı için özel durum
				for(int j=0;j<n-1;j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			else {
				for(int j=0;j<n-i;j++) {				// diğer durumlar için i. adım için n-i adet boşluk kodu
					System.out.print(" ");				
				}
				System.out.print("*");					// ilk boşluktan sonraki yıldızı bastırsın
				for(int j=0;j<((i-1)*2-1);j++) {		// i. tek sayı adedince ara boşluk bırakması için bir for döngüsü
					System.out.print(" ");
				}
				System.out.println("*");				// 2. yıldızı bastırsın ve alt satıra geçsin
			}
		}
		// ikinci üçgeni oluşturacak for döngüsü  
	    //--------------------------------------------------------------------------------------------------------
		for(int i=n-1;0<i;i--) {					    // ters üçgenin tabanı ilk basılacağı için i'yi n-1 den başlatıyoruz					
			if(i==1) {
				for(int j=0;j<n-1;j++) {				// ilk yıldızdan sonra boşluk olmadığı için özel durum
					System.out.print(" ");
				}
				System.out.println("*");
			}
			else {
				for(int j=0;j<n-i;j++) {				// diğer durumlar için i. adım için n-i adet boşluk kodu
					System.out.print(" ");
				}
				System.out.print("*");					// ilk boşluktan sonraki yıldızı bastırsın
				for(int j=0;j<((i-1)*2-1);j++) {   		// i. tek sayı adedince ara boşluk bırakması için bir for döngüsü
					System.out.print(" ");
				}
				System.out.println("*");				// 2. yıldızı bastırsın ve alt satıra geçsin
			}
		}
	   //--------------------------------------------------------------------------------------------------------

		
	}


}
