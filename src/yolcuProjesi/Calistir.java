package yolcuProjesi;

public class Calistir {

	public static void main(String[] args) {
		Yolcu o1=new Yolcu("Furkan Yeşil","Otogar");
		Yolcu o2=new Yolcu("Mehtap Yurt","Sakarya");
		Yolcu o3=new Yolcu("Ceyda Güneş","Kunduracılar");
		Yolcu o4=new Yolcu("Necati Kaya","Bosna");
		
		o1.cikti();
		o2.cikti();
		o3.cikti();
		o4.cikti();
		
		System.out.println("otobusteki yolcu sayısı:" + Yolcu.getYolcuSayisi());

	}

}
