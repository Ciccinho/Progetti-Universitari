package Pattern;

public class A4Concrete implements A4, Elettrico, Combustibile{
	
	private  String marca;
	private  int nRuote;
	private  String targa;
	private  String proprietario;
	private  int posti;
	private  String immatricolato;
	private  String modello;
	private String elettrico;
	private String combustibile;

	public A4Concrete() {
		super();
		this.marca = "Audi";
		this.nRuote = 4;
		this.targa = " ";
		this.proprietario = " ";
		this.posti = 5;
		this.immatricolato = " ";
		this.modello ="A4 2.0";
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
	public A4 clone() {
		A4Concrete a = new A4Concrete();
		a.marca = this.marca;
		a.nRuote= this.nRuote;
		a.posti = this.posti;
		a.modello = this.modello;
		a.immatricolato = this.immatricolato;
		a.targa = this.targa;
		a.proprietario = this.proprietario;
		a.elettrico = this.elettrico;
		a.combustibile = this.combustibile;
		return a;
	}
}
