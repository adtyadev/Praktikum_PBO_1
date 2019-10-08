
class Anjing{
	
	static int jumlahGonggongan = 0;
	
	void menggonggong() {
		jumlahGonggongan++;
		System.out.println(jumlahGonggongan);
	}
	
	int jumlahGonggong() {
		
		return 0;
	}
	
	
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anjing hachi = new Anjing();
		hachi.menggonggong();
		hachi.menggonggong();
		hachi.menggonggong();
		hachi.menggonggong();
		
		Anjing kabuto = new Anjing();
		kabuto.menggonggong();
		
		int jumlah = kabuto.jumlahGonggong();
		
		System.out.println(jumlah);
	}

}
