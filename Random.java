
public class Random {
/*
 * strike=b1;
 * 0,2,4,5,6,-----1,3
 * 
 */
	
	public static void main(String[] args) throws InterruptedException {
//0 2 4 6 8 
		int min = 0;
		int max = 6;
		String batchsman1 = "ananthi";
		String batchman2 = "selva";
		int total = 0;
		int batchsman1Run = 0, batchman2Run = 0,wideNoball=1;
		String Strike = batchsman1;
		for (int i = 0; i < max; i++) {
			int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
			System.out.println(Strike+" :"+random_int);
			
			if(Strike.equals(batchsman1)) {
				if(random_int==5) {
					System.out.println("Wide Ball +1");
				}
				if (random_int ==1 || random_int ==3) {
					
					Strike=batchman2;
				}
				
				batchsman1Run=batchsman1Run+random_int;
			}
			else if(Strike.equals(batchman2)) {
				if(random_int==5) {
					System.out.println("Wide Ball +1");
				}
				if (random_int ==1 ||random_int ==3) {
					
					Strike=batchsman1;
				}
				batchman2Run=batchman2Run+random_int;
			}
			Thread.sleep(2000);
		}
		total=batchsman1Run+batchman2Run;
		System.out.println(total);
		
	}

}
