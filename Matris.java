package ahmet_kartal_vize_cevaplar;

import java.util.Scanner;

public class Matris_soru1 {

	public static void main(String[] args) {
		
		
		
		Scanner girdi = new Scanner(System.in); // girdi almak için scanner oluşturma
		System.out.println("Oluşturmak istediğiniz matris büyüklüğünü giriniz:");
        int n = girdi.nextInt(); // matris büyüklüğünün alınması
        if (n > 2) {//2'den büyük mü sorgusu yapma 
        	
            int[][] matris = sihirliMatrisOluştur(n); // girdi 2 den büyükse matrisi oluştur
            matrisYazdir(n,matris);									  // ve yazdır
            

            
        } else { 
            System.out.println("Lütfen 2'den büyük bir sayı girin."); //büyük sayı girmesi için uyarı 
        }
		

			
		}
	

	//Matrisi ve Toplam Değeri Ekrana Yazdıracak Fonksiyon
	private static void matrisYazdir(int n,int[][]gelenMatris) {
		
		int toplam=0;                                           // toplam değeri için değişken
        System.out.println("Sihirli Kare:");
        for (int i = 0; i < n; i++) {						  						
            for (int j = 0; j < n; j++) {
                System.out.print(gelenMatris[i][j] + "\t");
                toplam += gelenMatris[i][j];				   // satırdaki elemanları toplama işlemi 		
            }
            System.out.println();

            
        }

       
        System.out.println("Toplam:"+toplam/n);               // toplam değerini yazdırma
		
	}


	//matrisi oluşturma fonksiyonumuz
	private static int[][] sihirliMatrisOluştur(int n) { 
        int[][] myMatris = new int[n][n]; // sihirli matrisi tanımladık

		 if (n % 2 != 0) { //tek-çift sorgusu 
	            int num = 1;
	            //i ve j yi matrisin ilk satır orta sütünu olacak şekilde tanımlıyoruz
	            int i = 0;
	            int j = n / 2;

	            while (num <= n * n) {
	                myMatris[i][j] = num;
	                num++;
	                int newI = (i - 1 + n) % n; // kendisinden önceki satıra gitmesi için (1 için son satırdır)
	                int newJ = (j + 1) % n;     // kendinden sonraki sütuna gitmesi için ( son sütun için 1'dir)

	                if (myMatris[newI][newJ] != 0) { 
	                    i++;                       // eğer gittiğimiz yer boş değilse bir alta geçelim
	                } else {
	                    i = newI;				  //boşsa newI ve newJ i ve j ye atansın
	                    j = newJ;
	                }
	            }
	        }
		 else if(n % 4==0) {//çift ve 4 e tam bölünüyorsa 
			 for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    myMatris[i][j] = (i * n) + j + 1; // matrisi sırasıyla 1 den n*n e kadar dolduruyoruz
	                }
	            }

	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    if ((i % 4 == j % 4) || ((i % 4 + j % 4) == 3))// köşegenleri seçmeyi sağlayan koşul ifadesidir
	                    {
	                        myMatris[i][j] = (n * n + 1) - myMatris[i][j]; // tersine çevirme işlemi yapar örn değer 4*4 lük kare 
	                        											   //  matris için 15 idiyse artık 1 olacak
	                    }
	                }
	            }
			 
	        	
			 
	        }
		 /* Burası genel olarak şu mantıkla çalışır:
		  * oluşacak matris çift ve dördün katı değil mi öyleyse ya yarısı tektir veya
		  *  bölünüyodur ya 1/4'ü ya 1/8 i bi yerde 4 veya bir tek sayıya bölünür.
		  */
		 else { 															// Eğer n çift ama 4'e tam bölünmüyorsa
			    int yarisi = n / 2; 										// Matrisin yarısı (alt karelerin boyutu)
			    int altKareBuyukluk = yarisi * yarisi; 						// Alt karelerin hücre sayısı (yarisi x yarisi)
			    int[][] subSquare = sihirliMatrisOluştur(yarisi);			 // Alt kare boyutunda sihirli matris oluşturuyoruz

			    															// 1. Alt Kare (Sol Üst)
			    for (int i = 0; i < yarisi; i++) {
			        for (int j = 0; j < yarisi; j++) {
			            myMatris[i][j] = subSquare[i][j];
			        }
			    }
			    															// Sol üst köşeye, oluşturulan küçük sihirli kareyi yerleştiriyoruz.

			    															// 2. Alt Kare (Sağ Üst)
			    for (int i = 0; i < yarisi; i++) {
			        for (int j = 0; j < yarisi; j++) {
			            myMatris[i][j + yarisi] = subSquare[i][j] + 2 * altKareBuyukluk;
			        }
			    }
			    									// Sağ üst köşeye, küçük sihirli kareyi yerleştirip, hücre değerlerini `2 * altKareBuyukluk` kadar artırıyoruz.

			    // 3. Alt Kare (Sol Alt)
			    for (int i = 0; i < yarisi; i++) {
			        for (int j = 0; j < yarisi; j++) {
			            myMatris[i + yarisi][j] = subSquare[i][j] + 3 * altKareBuyukluk;
			        }
			    }
			    								// Sol alt köşeye, küçük sihirli kareyi yerleştirip, hücre değerlerini `3 * altKareBuyukluk` kadar artırıyoruz.

			    // 4. Alt Kare (Sağ Alt)
			    for (int i = 0; i < yarisi; i++) {
			        for (int j = 0; j < yarisi; j++) {
			            myMatris[i + yarisi][j + yarisi] = subSquare[i][j] + altKareBuyukluk;
			        }
			    }
			    										// Sağ alt köşeye, küçük sihirli kareyi yerleştirip, hücre değerlerini `altKareBuyukluk` kadar artırıyoruz.

			    		// Alt kareleri yerleştirip değerleri ayarladıktan sonra, sihirli kare özelliklerini sağlamak için değişim yapılacak sütunları belirliyoruz
			    for (int i = 0; i < yarisi; i++) {
			        if (i != yarisi / 2) { 										// Orta satır hariç her satırda işlem yapılacak
			            for (int j = 0; j < yarisi / 2; j++) {
			                int temp = myMatris[i][j];
			                myMatris[i][j] = myMatris[i + yarisi][j];
			                myMatris[i + yarisi][j] = temp;
			            }
			        } else { 													// Orta satırda özel bir işlem
			            for (int j = 0; j < yarisi / 2 - 1; j++) {
			                int temp = myMatris[i][j];
			                myMatris[i][j] = myMatris[i + yarisi][j];
			                myMatris[i + yarisi][j] = temp;
			            }
			            														// Merkez sütunu da değiştiriyoruz
			            int temp = myMatris[i][yarisi / 2];
			            myMatris[i][yarisi / 2] = myMatris[i + yarisi][yarisi / 2];
			            myMatris[i + yarisi][yarisi / 2] = temp;
			        }
			    }
			}

		 
		
		return myMatris;														// Kekiniz hazır afiyetle yiyebilirsiniz... :)
	}
		
		
		
		

	}
	



