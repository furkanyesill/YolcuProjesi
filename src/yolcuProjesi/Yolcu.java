package yolcuProjesi;

public class Yolcu {
	private static int yolcuSayisi = 0;
	private String yolcuAdi;
	private String durakAdi;

	public Yolcu(String yolcuAdi, String durakAdi) {
		this.yolcuAdi = yolcuAdi;
		this.durakAdi = durakAdi;
		yolcuSayisi++;
	}

	public void cikti() {
		String yolcuBilgisi = yolcuAdi + " otobüsümüze " + durakAdi + " durağında bindi.";
		System.out.println(yolcuBilgisi);
	}

	public static int getYolcuSayisi() {
		return yolcuSayisi;
	}

	public static void setYolcuSayisi(int yolcuSayisi) {
		Yolcu.yolcuSayisi = yolcuSayisi;
	}

	public String getYolcuAdi() {
		return yolcuAdi;
	}

	public void setYolcuAdi(String yolcuAdi) {
		this.yolcuAdi = yolcuAdi;
	}

	public String getDurakAdi() {
		return durakAdi;
	}

	public void setDurakAdi(String durakAdi) {
		this.durakAdi = durakAdi;
	}

}
