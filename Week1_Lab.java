package Labs;
public class Week1_Lab
{
    public static void main(String[] args)
    {
        // Part 2a
        System.out.println("Hello, I am Matthew Chuang!");
        // Part 2b
        String coursecode = "CSC1009";
        switch(coursecode)
        {
            case "CSC2902":
            {
                System.out.println("Career and Professional Development");
                break;
            }

            case "CSC1006":
            {
                System.out.println("Mathematics II");
                break;
            }
            case "CSC1007":
            {
                System.out.println("Operating System");
                break;
            }
            case "CSC1008":
            {
                System.out.println("Data Structures and Algorithms");
                break;
            }
            case "CSC1009":
            {
                System.out.println("Object Oriented Programming");
                break;
            }
        }
        // Part 2c
        for(int i = 102; i >= 66; i--)
        {
            if(i%2==1)
            {
                System.out.println("Number is "+i);
            }
        }
    }
}


