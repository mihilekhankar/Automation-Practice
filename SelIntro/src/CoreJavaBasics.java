
public class CoreJavaBasics {

	public static void main(String[] args) {
		
		//Variables and Datatypes eg:
		
		int myNum = 2;
		String website = "marvel.com";
		char letter = 'm';
		//float dec = 5.99;
		
		System.out.println(myNum + " is my lucky number! \n" + website + " is my website do visit! \n" + letter + " is my fav letter" );
		
		
		//Arrays:
		
		/*int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;*/
		
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		
		
		//For loop
		
	/*	for(int i =0; i <arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		for(int i =0; i <arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		*/
		
		
		//If else loop  -> Multiple of 2
		
	/*	for (int i = 0; i < arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}   */
		
		//Print string in reverse order
		
		String s = "Mihil is Automating";
		
		for (int i = s.length()-1; i>=0 ; i--)
		{
			System.out.println(s.charAt(i));
		}
		
	}

}
