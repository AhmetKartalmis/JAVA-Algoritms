package ahmet_kartal_vize_cevaplar;

import java.util.Scanner;

public class hanoi_soru6 {
	public static void main(String args[]) {
		
		System.out.print("Hanoi kulesinde kaç disk var:");
		Scanner sc = new Scanner(System.in);
		var diskSayisi= sc.nextInt();
		
		cozum(diskSayisi,"A","B","C");
		
		
		
	}
	// kulede kaç disk olacağını ve harflendirmelerin olduğu bir fonksiyon tanımlaması yaptık (özyinelemeli)
	public static void cozum(int diskSayisi,String A,String B,String C)
	{
		// 1 disk varsa olduğu gibi A dan C ye taşısın
		if(diskSayisi==1) {									// 1 disk varsa
			System.out.println(A + "--->" + C);				// olduğu gibi A dan C ye taşısın
		}
		else {												// 1 den fazla disk varsa 
			
			cozum(diskSayisi-1,A,C,B);						// 1 eksiğini önce A dan B ye taşısın 
			System.out.println(A + "--->" + C);				// En büyüğünü C ye koysun
			cozum(diskSayisi-1,B,A,C);						// Bdekileri de yine C ye eklesin
			
		}
		
	}

}
