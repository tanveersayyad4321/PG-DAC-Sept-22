class P24{
	
	public static void main(String[] args){
		
		int n=5;
		int count = 0;
		for(int i=1; i<=n; i++){
			count = i;
			for(int j=1; j<=i; j++){
					System.out.print(count + " ");
					count+=n-j;
			}
			System.out.println();
		}
	}
}