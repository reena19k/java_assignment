public class CommandLine02 {
     public static void main(String[] args) {
		 System.out.println("length of an array " + args.length);
	        int[] freq = new int[100];
	        int i, j, count;
	       //frequency
	        for (i = 0; i < args.length; i++) {
	            freq[i] = -1;
	        }
	        for (i = 0; i < args.length; i++) {
	            count = 1;
	            for (j = i + 1; j < args.length; j++) {
	                if (Integer.parseInt(args[i]) == Integer.parseInt(args[j])) {
	                    count++;
	                    freq[j] = 0;

	                }
	            }
	            if (freq[i] != 0) {
	                freq[i] = count;

	            }
	        }
	        System.out.println("Frequency of all elements of array : ");
	        for (i = 0; i < args.length; i++) {
	            if (freq[i] != 0) {
	                System.out.println(Integer.parseInt(args[i]) + " occur " + freq[i] + " times ");

	            }
	        }
	        //minimum and maximum
	        int min = 999, max = 0;
	        for (int k = 0; k < args.length; k++) {
	            if (Integer.parseInt(args[k]) < min) {
	                min = Integer.parseInt(args[k]);
	            }
	        }
	        System.out.println("Minimun Element from the array is " + min);
	        for (int k = 0; k < args.length; k++) {
	            if (Integer.parseInt(args[k]) > max) {
	                max = Integer.parseInt(args[k]);
	            }
	        }
	        System.out.println("Maximum Element from the array is " + max);
	        
	        //sum
	        int sum=0;
	        for (int k = 0; k < args.length; k++) {
	            sum = sum + Integer.parseInt(args[k]);
	        }
	        System.out.println("Sum of elements in array  is "+sum);
	       
	        //median
	        int median=0;
	        if(args.length%2==0) {
	        median=	Integer.parseInt(args[(args.length/2)]);
	        }else {
	        median=(Integer.parseInt(args[(args.length-1)/2])+Integer.parseInt(args[(args.length/2)]))/2;
	        }
	        System.out.println("Median of array is "+median);
            
            //average
	        int avg = 0;
	        avg = sum/(args.length);
	        System.out.println("Average of array is: "+avg);
     }

}
