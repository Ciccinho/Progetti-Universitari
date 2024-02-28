package Pattern;

public class R1Concrete implements R1, Elettrico, Combustibile{

	private String marca;
	private int ruote;
	private String modello;
	private String targa;
	private String proprietario;
	private int posti;
	private String immatricolato;
	private String elettrico;
	private String combustione;
	
	
	public R1Concrete() {
		super();
		this.marca ="Yamaha";
		this.ruote = 2;
		this.posti = 2;
		this.modello ="R1";
		this.immatricolato =" ";
		this.targa =" ";
		this.proprietario =" ";
		this.elettrico =" ";
		this.combustione =" ";
		
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	@Override
	public int numeroRuote() {
		// TODO Auto-generated method stub
		return this.ruote;
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
	public String getCombustibile() {
		// TODO Auto-generated method stub
		return this.combustione;
	}

	@Override
	public String getElettrico() {
		// TODO Auto-generated method stub
		return this.elettrico;
	}

	@Override
	public String getModello() {
		// TODO Auto-generated method stub
		return this.modello;
	}
	@Override
	public R1 clone() {
		R1Concrete r = new R1Concrete();
		r.marca = this.marca;
		r.ruote= this.ruote;
		r.posti = this.posti;
		r.modello = this.modello;
		r.immatricolato = this.immatricolato;
		r.targa = this.targa;
		r.proprietario = this.proprietario;
		r.elettrico = this.elettrico;
		r.combustione = this.combustione;
		return r;
	}
	
}
