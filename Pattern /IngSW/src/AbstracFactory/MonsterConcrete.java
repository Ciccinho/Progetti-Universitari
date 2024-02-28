package Pattern;

public class MonsterConcrete implements Monster, Elettrico, Combustibile{
	
	private String marca;
	private int ruote;
	private String modello;
	private String targa;
	private String proprietario;
	private int posti;
	private String immatricolato;
	private String elettrico;
	private String combustione;
	
	
	public MonsterConcrete() {
		super();
		this.marca ="Ducati";
		this.ruote = 2;
		this.posti = 2;
		this.modello ="Monster";
		this.immatricolato =" ";
		this.targa =" ";
		this.proprietario =" ";
		this.elettrico =" ";
		this.combustione =" ";	}

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
	public String getModello() {
		// TODO Auto-generated method stub
		return this.modello;
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
	public Monster clone() {
		MonsterConcrete m = new MonsterConcrete();
		m.marca = this.marca;
		m.ruote= this.ruote;
		m.posti = this.posti;
		m.modello = this.modello;
		m.immatricolato = this.immatricolato;
		m.targa = this.targa;
		m.proprietario = this.proprietario;
		m.elettrico = this.elettrico;
		m.combustione = this.combustione;
		return m;
	}
}
