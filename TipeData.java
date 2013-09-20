class TipeData{
	private String nama;
	public static void main(String[] args){
		TipeData isi = new TipeData();
		isi.setNama("Yanti");
		byte a = 100;
		short b = 100;
		
		System.out.println("Menampilkan nama = "+isi.getNama());
		System.out.println("Hasil dari a + b = "+(a+b));
		
	}
	
	public void setNama(String aNama){
		this.nama = aNama;
		}
		
		public String getNama(){
			return this.nama;
			}
}