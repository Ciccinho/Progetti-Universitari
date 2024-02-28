package Pattern;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
				
		R1Concrete r1 = new R1Concrete();
		MonsterConcrete m = new MonsterConcrete();
		
		PuntoConcrete p = new PuntoConcrete();
		A4Concrete a = new A4Concrete();
		
		ArrayList<Veicolo> listV = new ArrayList<Veicolo>();
		listV.add(a);
		listV.add(p);
		listV.add(m);
		listV.add(r1);
		for(Veicolo i: listV) {
			System.out.println("numero posti veicolo: "+ i.getPosti());
		}
		
		ArrayList<QuattroRuote> listQ = new ArrayList<QuattroRuote>();
		listQ.add(a);
		listQ.add(p);
		for(QuattroRuote i: listQ) {
			System.out.println("numero posti quattro ruote: "+ i.getPosti());
		}
		
		ArrayList<R1> listD = new ArrayList<R1>();
		listD.add(r1);
		for(R1 i: listD) {
			System.out.println("Marca e Modello: " + i.getMarca() +" "+ i.getModello());
		}
		
		
	}

}
