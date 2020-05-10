package NestedLoops;

public class NestingLoops {
    
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
       
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )
            {            
                System.out.println( c + " " + n );
            }
        }
        


        // 1. variable n changes faster and it controlled by the inner loop.

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println("Added input here.");
        }

        System.out.println("\n");

    }

}