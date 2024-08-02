
public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.ligar();
		System.out.println("TV ligada? " +smartTv.ligada);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Volume atual: " +smartTv.volume);	
		
		
		smartTv.mudarCanal(13);
		System.out.println("Canal atual: " +smartTv.canal);
		
		
		
		System.out.println("Novo Status -> TV ligada? " +smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Volume atual: " +smartTv.volume);
		
		smartTv.diminuirVolume();
		System.out.println("Volume atual: " +smartTv.volume);
		

	}

}
