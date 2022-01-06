public class blackJack{
	public static void main(String [] args){
		boolean ganar=false;
		double dinero=6300;
		final double APUESTA=100;
		double apuesta;
		int ganadas=0;
		final int JUEGOS=2;
		double promedio=0;
	for(int j=0;j<1;j++){
		for(int i=1;dinero>=APUESTA && i<=JUEGOS;i++){//veces que se va a jugar 
			apuesta=APUESTA/2;
			ganar=false;
			System.out.println("Ronda "+i);
			while(!ganar && dinero>=apuesta*2){//mientras pierdas
				apuesta=apuesta*2;
				System.out.println("apuesta: "+apuesta);
				int azar=(int)((Math.random()*37)+1);
				System.out.println(azar);
				if(azar==1 || azar==3 || azar==5 || azar==7 || azar==9 || azar==12 || azar==14 || azar==16 || azar==18 || azar==19 
				|| azar==21 || azar==23 || azar==25 || azar==27 || azar==30 || azar==32 || azar==34 || azar==36){
					ganar=true;
				}
				if(ganar){
					dinero=dinero+apuesta;
				}
				else{
					dinero=dinero-apuesta;
				}
				System.out.println("dinero :"+dinero);
			}
			System.out.println("salimos de la ronda "+i+" con: $"+dinero);
			System.out.println();
			System.out.println();
			if(ganar)
				ganadas++;
		}
		double porcentaje=(ganadas*100)/JUEGOS;
		System.out.println(porcentaje/(j+1));
		promedio=promedio+porcentaje;
	}
	//	promedio=promedio/5;
		System.out.println(dinero);
		double a=100;
		double b=100;
		System.out.println(a);
		for(int j=0;j<20;j++){
			b=b*2;
			a=a+b;
			System.out.println(a);
		}
	}
}
