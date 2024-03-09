/*  Nama        : Clara Zita Nabilla
    NIM         : 24060122130057
    Nama File   : Tiket.java 
    Deskripsi   : Program class Tiket
*/

public class Tiket {
	public static void pesanJumlahTiket(int jumlahTiket) {
		// Asumsi jumlah tiket yang tersedia (boleh diganti)
		int tiketTersedia = 100;

		// To Do : Assertion untuk memastikan jumlah pemesanan lebih dari 0
		assert(jumlahTiket > 0):"Jumlah pemesanan harus lebih dari 0";

		// To Do : Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
		assert(jumlahTiket <= tiketTersedia):"Jumlah pemesanan tidak boleh melebihi tiket yang tersedia";

		System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
		}

	public static void isEWallet(int EWallet) {

 		// To Do : Memeriksa apakah index e-wallet yang dipilih valid
        assert(EWallet >=1 && EWallet <= 4):"Pilihan e-wallet tidak valid";
		
		// To Do : Assertion untuk memastikan e-wallet yang dipilih valid
		assert !getEWallet(EWallet).equals("") : "E-wallet yang dipilih tidak valid";

		System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
		}

	private static String getEWallet(int index) {
		switch (index) {
			case 1:
       		return "OVO";
			case 2:
       		return "GoPay";
			case 3:
       		return "DANA";
			case 4:
       		return "LinkAja";
			default:
       		return "";
		}
	}
}
