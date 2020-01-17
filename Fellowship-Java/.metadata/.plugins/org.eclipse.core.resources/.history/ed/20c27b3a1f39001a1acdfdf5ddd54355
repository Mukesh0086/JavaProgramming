class Test 
{ 
    // Print all the rotated string. 
    static void printRotatedString(String str) 
    { 
        int n = str.length(); 
        int k=1;
        
        StringBuffer sb = new StringBuffer(str); 
        // Concatenate str with itself 
        sb.append(str); 
       
        // Print all substrings of size n. 
        // Note that size of sb is 2n 
        for (int i = 0; i < n; i++) 
        { 
            for (int j=0; j < n; j++) 
            {
                System.out.print(sb.charAt((i + j)%3));
            }
            System.out.println(); 
        } 
        str=str.substring(k)+str.substring(0,k);
        k=k+1;
        while(k<str.length())
        {
        	printRotatedString(str);
        }
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        String  str = new String("ABC"); 
        printRotatedString(str); 
    } 
} 
