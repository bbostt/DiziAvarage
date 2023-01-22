
public class DizilerdekiElemanlarinOrtBulma {

	public static void main(String[] args) {
		
		int[] dizi = {1,2,3,4,5};
		
		double sum = 0.0;
		
		for(int i=0; i<dizi.length; i++) {
			sum = sum + dizi[i];
		}
		
		double avarage = sum / dizi.length;
		
		System.out.println(avarage);

	}

}
