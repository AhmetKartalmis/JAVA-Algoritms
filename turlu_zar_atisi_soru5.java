package ahmet_kartal_vize_cevaplar;

import java.util.Random;
import java.util.Scanner;

public class turlu_zar_atisi_soru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//---------------------------------------------------------------------------
		//Girdiler için scanner tanımlaması ve girdileri alma işlemi 
		Scanner sc = new Scanner(System.in);
		System.out.print("İlk oyuncu bakiyesi: ");
		int oyuncu1Para = sc.nextInt();
		System.out.print("İkinci oyuncu bakiyesi: ");
		int oyuncu2Para = sc.nextInt();
//----------------------------------------------------------------------------		
		
		System.out.println("-------------------------------------------------------------------------");
		int i=1;                                     // Turların sayısını tutmak için i değişkeni
		while(oyuncu1Para>0&&oyuncu2Para>0) {		 // oyuncuların ikisinin de parası 0 dan fazla olduğunda çalışması için döngü koşulu	
			Random random = new Random();			 // random değerler için değişke	
			
			// oyuncu 1in zar atışları için 1-6 arası random değer üretme ve atama
			int oyuncu1Zar1 = random.nextInt(6)+1;	
			int oyuncu1Zar2 = random.nextInt(6)+1;
			// oyuncu 1in zar atışları için 1-6 arası random değer üretme ve atama
			int oyuncu2Zar1 = random.nextInt(6)+1;
			int oyuncu2Zar2 = random.nextInt(6)+1;
			// oyuncu 2nin zar atışları için 1-6 arası random değer üretme ve atama
			int oyuncu1Toplam=oyuncu1Zar1+oyuncu1Zar2;
			int oyuncu2Toplam=oyuncu2Zar1+oyuncu2Zar2;
														
			int fark = Math.abs(oyuncu1Toplam-oyuncu2Toplam);	// herhangi bir galip durumunda farkın -li çıkmaması için abs()li tanım
			
			int galip =0;							  // güncel turda kimin kazandığının tutulması için değişken

			
			// Sonuçların gösterildiği print kısımları
			
			System.out.print((i )+".Turda 1. Oyuncunun zar toplamları: ");
			System.out.println("1.Zar değeri:"+oyuncu1Zar1+"  2.Zar değeri:"+oyuncu1Zar2);
			
			System.out.print((i)+".Turda 2. Oyuncunun zar toplamları: ");
			System.out.println("1.Zar değeri:"+oyuncu2Zar1+"  2.Zar değeri:"+oyuncu2Zar2);
			
			System.out.println("Zarlar arasındaki fark:"+fark);
			
			// Koşullu ifadeler kısmı										
			if(oyuncu1Toplam>oyuncu2Toplam) {							//1.oyuncu kazandıysa
				System.out.println("Oyuncu1 "+fark+" Para kazandı");	//kazandığı miktar yazdırılsın
				oyuncu1Para+=fark;										//kazandığı miktar bakiyesine eklensin
				oyuncu2Para-=fark;										//kazandığı miktar 2.oyuncunun bakiyesinden düşsün
				System.out.println("Oyuncu1 bakiye: "+oyuncu1Para+"| Oyuncu2 bakiye: "+oyuncu2Para);
				galip=1;												// galip değeri atansın

			}
			else if(oyuncu1Toplam<oyuncu2Toplam) {						//2.oyuncu kazandıysa
				System.out.println("Oyuncu2 "+fark+" Para kazandı");    //kazandığı miktar yazdırılsın
				oyuncu2Para+=fark;										//kazandığı miktar bakiyesine eklensin
				oyuncu1Para-=fark;										//kazandığı miktar 1.oyuncunun bakiyesinden düşsün
				System.out.println("Oyuncu1 bakiye: "+oyuncu1Para+"| Oyuncu2 bakiye: "+oyuncu2Para);
				galip=2;												// galip değeri atansın

			}
			System.out.println("--------------------------------------------------------------------");
			
			if(galip==1) System.out.println("1.oyuncu "+i+". turda "+oyuncu1Para+" Para ile Kazandı");
			if(galip==2) System.out.println("2.oyuncu "+i+". turda "+oyuncu2Para+" Para ile Kazandı");

			
			


			
			i++;

		}
		

	}

}
