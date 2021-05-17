package pckg;

public class Sogutucu 
{
	
	public void SogutucuAc(int sicaklik)
	{
		System.out.println("Sogutucu acildi,oda sicakligina ayarlandi.");
		OdaSicakligi(sicaklik);
		
	}
	
	public int OdaSicakligi(int sicaklik)
	{
		sicaklik=24;
		return sicaklik;
	}
	
	
	public void SogutucuKapat()
	{
		System.out.println("Sogutucu kapatildi.");
	}
	
}
