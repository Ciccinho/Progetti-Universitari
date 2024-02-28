package Pattern;

public class PuntoConcrete implements Punto, Elettrico, Combustibile {

	private  String marca;
	private  int nRuote;
	private  String targa;
	private  String proprietario;
	private  int posti;
	private  String immatricolato;
	private  String modello;
	private String elettrico;
	private String combustibile;
	
	
	public PuntoConcrete() {
		super();
		this.marca = "Fiat";
		this.nRuote = 4;
		this.targa = " ";
		this.proprietario = " ";
		this.posti = 5;
		this.immatricolato = " ";
		this.modello ="Grande Punto";
		this.elettrico = " ";
		this.combustibile = " ";
	}
	
	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	@Override
	public int numeroRuote() {
		// TODO Auto-generated method stub
		return this.nRuote;
	}

	@Override
	public String getTarga() {
		// TODO Auto-generated method stub
		return this.targa;
	}

	@Override
	public String getProprietario() {
		// TODO Auto-generated method stub
		return this.proprietario;
	}

	@Override
	public int getPosti() {
		// TODO Auto-generated method stub
		return this.posti;
	}

	@Override
	public String getImmatricolazione() {
		// TODO Auto-generated method stub
		return this.immatricolato;
	}

	@Override
	public String getModello() {
		// TODO Auto-generated method stub
		return this.modello;
	}

	@Override
	public String getCombustibile() {
		// TODO Auto-generated method stub
		return this.combustibile;
	}

	@Override
	public String getElettrico() {
		// TODO Auto-generated method stub
		return this.elettrico;
	}
	@Override
	public Punto clone() {
		PuntoConcrete p = new PuntoConcrete();
		p.marca = this.marca;
		p.nRuote= this.nRuote;
		p.posti = this.posti;
		p.modello = this.modello;
		p.immatricolato = this.immatricolato;
		p.targa = this.targa;
		p.proprietario = this.proprietario;
		p.elettrico = this.elettrico;
		p.combustibile = this.combustibile;
		return p;
	}

}
