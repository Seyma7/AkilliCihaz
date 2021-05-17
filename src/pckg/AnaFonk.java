package pckg;

import java.util.Scanner;

public class AnaFonk 
{
	static int secim1;
	static int secim2;
	
	static String username;
	static String password;

	static Sogutucu sogutucu=new Sogutucu();
	
	static int sicaklik;
	
	static Scanner scan = new Scanner(System.in);
	
	@SuppressWarnings("static-access")
	public static void Menu()
	{
		
		VeriTabani veritabani=new VeriTabani();
		veritabani.Baglan();
	
		System.out.println("**********************************************************************************");

		System.out.println(" 1-)Kullanici girisi icin tiklayiniz "); 
		
		System.out.println(" 2-) Cikis");
		
		System.out.println("Seciminiz : ");
		secim1=Integer.parseInt(scan.nextLine());
		

		
			System.out.println(" 1-)Kullanici adiniz :"); 
			username=scan.nextLine();
			System.out.println(" 2-)Parolaniz :"); 
			password=scan.nextLine();
			
			boolean ctrl=veritabani.LoginCtrl(username,password);
			
			if (ctrl==true) 
			{
				
				switch (secim1)
				{
					
				case 1:
					System.out.println( "1-) Sicaklik  goruntule");
					System.out.println("2-) Sogutucuyu ac ");
					System.out.println("3-) Sogutucuyu kapat");
					System.out.println("4-)Cikis Yap");
					System.out.println("Seciminiz  :") ;
					secim2=Integer.parseInt(scan.nextLine());

					
						switch (secim2)
						{
							case 1:
								RandomSicaklik rnd=new RandomSicaklik();
								rnd.SicaklikYazdir();
								break;

							case 2:
								sogutucu.SogutucuAc(sicaklik);
								break;
								
							case 3:
								sogutucu.SogutucuKapat();
								break;
								
								
							default: System.out.println("Çıkış yaptınız");
								break;
						}
						break;
						
					}
				
			  }

		System.out.println("**********************************************************************************");
	}
	
	public static void main(String[] args) 
	{
		Menu();
	}

}
