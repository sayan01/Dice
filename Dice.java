//Dice Rolling Simulator
//Sayan Ghosh
class Dice{
	public static void main(String[] args) {

		int num = (int)(Math.random()*6)+1;
		int[][] comb = {{},{4,4},{2,2,6,6},{2,6,4,4,6,2},{2,2,2,6,6,2,6,6},{2,2,2,6,6,2,6,6,4,4},{2,2,2,6,4,2,4,6,6,2,6,6}};
		int[] pat = comb[num]; 
		for(int i = 0;i < 9;i++){
			for(int j =0 ; j < 9;j++){

				if(i==0||i==8){
					System.out.print("-");
				}
				else if ( j == 0 || j == 8 ){
					System.out.print("|");
				}
				else {
					boolean p = false;
					for(int k = 0; k < pat.length;k+=2){
						if (i==pat[k]&&j==pat[k+1]){
							System.out.print(".");
							p = true;
							break;
						}
					}
					if(!p)
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n"+num);
	}
}
