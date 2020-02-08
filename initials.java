import java.util.Scanner;
class initials
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    
    String sum;int k,x,l,m,n,o,p;char ch;
    int len;int c=6;double sum1=0.0;int s;String word=""; int a1,a2,a3,a4,a5,a6;double sum3=0.0;int f=5;
    String a11,a22,a33,a44,a55,a66;String lo;
    System.out.println("*#*#*#*#*#*#*#*#"+" "+"WELCOME TO EXHIBITION 2019-20"+" "+"*#*#*#*#*#*#*#*#");
    System.out.println("\t"+"Its a simple game we will tell your initial or number you thought in your mind "+"\t");
    System.out.println("**********"+" "+"PRESS 1 FOR INTITIALS OR 2 FOR NUMBER"+"********* ");
    int choose=sc.nextInt();
    switch(choose)
    {
        case 1:
     
    System.out.println("****"+"ENTER THE NUMBER OF INITILAS IN YOUR NAME"+"****");
    int y=sc.nextInt();s=y;
    
    
    System.out.println("*****"+"THE GAME STARTS IF YOUR INITIALS IS IN THE SHOWN LIST, THEN DO AS FOLLOWS"+"****");
    
    for (int z=1;z<=y;z++)
    {
         System.out.println();

        if(s>=1)
        {
            System.out.println("Checking for"+z+"intials");
            System.out.println();
        }
         
        
        System.out.println("A"+" "+"B"+" "+"C"+" "+"D"+" "+"E");
        System.out.println("F"+" "+"G"+" "+"H"+" "+"I"+" "+"J");
        System.out.println("K"+" "+"L"+" "+"M"+" "+"N"+" "+"O");
        System.out.println("P"+" "+"Q"+" "+"R"+" "+"S"+" "+"T");
        System.out.println("U"+" "+"V"+" "+"W"+" "+"X"+" "+"Y"+" "+"Z");
        System.out.println("Type 1 for YES and 0 for NO");
        k=sc.nextInt();
        x=k*10;
        
        System.out.println();
        
        System.out.println("P"+" "+"Q"+" "+"R"+" "+"S"+" "+"T");
        System.out.println("U"+" "+"V"+" "+"W"+" "+"X"+" "+"Y"+" "+"Z");
        System.out.println("Type 1 for YES and 0 for NO");
        l=sc.nextInt();
        
        System.out.println();
        
        System.out.println("H"+" "+"I"+" "+"J"+" "+"K"+" "+"L");
        System.out.println("M"+" "+"N"+" "+"O"+" "+"X"+" "+"Y"+" "+"Z");
        System.out.println("Type 1 for YES and 0 for NO");
        m=sc.nextInt();
        
        System.out.println();
        
        System.out.println("D"+" "+"E"+" "+"F"+" "+"G"+" "+"L");
        System.out.println("M"+" "+"N"+" "+"O"+" "+"T"+" "+"U");
        System.out.println("V"+" "+"W");
        System.out.println("Type 1 for YES and 0 for NO");
        n=sc.nextInt();
        
        System.out.println();
        
        System.out.println("B"+" "+"C"+" "+"F"+" "+"G"+" "+"J");
        System.out.println("K"+" "+"O"+" "+"R"+" "+"S"+" "+"V");
        System.out.println("W"+" "+"Z");
        System.out.println("Type 1 for YES and 0 for NO");
        o=sc.nextInt();
        
        System.out.println();
        
        System.out.println("A"+" "+"C"+" "+"E"+" "+"G"+" "+"I");
        System.out.println("K"+" "+"M"+" "+"N"+" "+"O"+" "+"S");
        System.out.println("Q"+" "+"S"+" "+"U"+" "+"W"+" "+"Y");
        System.out.println("Type 1 for YES and 0 for NO");
        p=sc.nextInt();
        
        System.out.println();
        
        String x1=Integer.toString(x);
        String l1=Integer.toString(l);
        String m1=Integer.toString(m);
        String n1=Integer.toString(n);
        String o1=Integer.toString(o);
        String p1=Integer.toString(p);
        
        sum=x1+l1+m1+n1+o1+p1;
        len=sum.length();
        
        for(int i=0;i<len;i++)
        {
            ch=sum.charAt(i);
            
            if(ch=='1')
            {
              sum1=sum1+Math.pow(2,c);  
            }
            
            
                c--;
            }
            
            char h=(char)sum1;
            word=word+h;
            int e=word.length();
            
            if(z==s)
            {
                System.out.println();
                System.out.println("YOUR CHOOSEN INITIALS ARE");
                System.out.println();
                for(int i=0;i<e;i++)
                {
                    
        
        System.out.println("\n");
            
            if (word.charAt(i) == 'A')
        {
            System.out.print("..######..\n..#....#..\n..######..\n..#....#..\n..#....#..\n");
           
        }

        else if (word.charAt(i) == 'B')
        {
            System.out.print("..######..\n..#....#..\n..#####...\n..#....#..\n..######..\n");
        }

        else if (word.charAt(i) == 'C')
        {
            System.out.print("..######..\n..#.......\n..#.......\n..#.......\n..######..\n");
        }

        else if (word.charAt(i) == 'D')
        {
            System.out.print("..#####...\n..#....#..\n..#....#..\n..#....#..\n..#####...\n");
        }

        else if (word.charAt(i) == 'E')
        {
            System.out.print("..######..\n..#.......\n..#####...\n..#.......\n..######..\n");
        }

        else if (word.charAt(i) == 'F')
        {
            System.out.print("..######..\n..#.......\n..#####...\n..#.......\n..#.......\n");
        }

        else if (word.charAt(i) == 'G')
        {
            System.out.print("..######..\n..#.......\n..#.####..\n..#....#..\n..######..\n");
        }

        else if (word.charAt(i) == 'H')
        {
            System.out.print("..#....#..\n..#....#..\n..######..\n..#....#..\n..#....#..\n");
        }

        else if (word.charAt(i) == 'I')
        {
            System.out.print("..######..\n....##....\n....##....\n....##....\n..######..\n");
        }

        else if (word.charAt(i) == 'J')
        {
            System.out.print("..######..\n....##....\n....##....\n..#.##....\n..####....\n");
        }

        else if (word.charAt(i) == 'K')
        {
            System.out.print("..#...#...\n..#..#....\n..##......\n..#..#....\n..#...#...\n");
        }

        else if (word.charAt(i) == 'L')
        {
            System.out.print("..#.......\n..#.......\n..#.......\n..#.......\n..######..\n");
        }

        else if (word.charAt(i) == 'M')
        {
            System.out.print("..#....#..\n..##..##..\n..#.##.#..\n..#....#..\n..#....#..\n");
        }

        else if (word.charAt(i) == 'N')
        {
            System.out.print("..#....#..\n..##...#..\n..#.#..#..\n..#..#.#..\n..#...##..\n");
        }

        else if (word.charAt(i) == 'O')
        {
            System.out.print("..######..\n..#....#..\n..#....#..\n..#....#..\n..######..\n");
        }

        else if (word.charAt(i) == 'P')
        {
            System.out.print("..######..\n..#....#..\n..######..\n..#.......\n..#.......\n");
        }

        else if (word.charAt(i) == 'Q')
        {
            System.out.print("..######..\n..#....#..\n..#.#..#..\n..#..#.#..\n..######..\n");
        }

        else if (word.charAt(i) == 'R')
        {
            System.out.print("..######..\n..#....#..\n..#.##...\n..#...#...\n..#....#..\n");
        }

        else if (word.charAt(i) == 'S')
        {
            System.out.print("..######..\n..#.......\n..######..\n.......#..\n..######..\n");
        }

        else if (word.charAt(i) == 'T')
        {
            System.out.print("..######..\n....##....\n....##....\n....##....\n....##....\n");
        }

        else if (word.charAt(i) == 'U')
        {
            System.out.print("..#....#..\n..#....#..\n..#....#..\n..#....#..\n..######..\n");
        }

        else if (word.charAt(i) == 'V')
        {
            System.out.print("..#....#..\n..#....#..\n..#....#..\n...#..#...\n....##....\n");
        }

        else if (word.charAt(i) == 'W')
        {
            System.out.print("..#....#..\n..#....#..\n..#.##.#..\n..##..##..\n..#....#..\n");
        }

        else if (word.charAt(i) == 'X')
        {
            System.out.print("..#....#..\n...#..#...\n....##....\n...#..#...\n..#....#..\n");
        }

        else if (word.charAt(i) == 'Y')
        {
            System.out.print("..#....#..\n...#..#...\n....##....\n....##....\n....##....\n");
        }

        else if (word.charAt(i) == 'Z')
        {
            System.out.print("..######..\n......#...\n.....#....\n....#.....\n..######..\n");
        }
    }
}
           sum=" ";c=6;sum1=0.0;
            
            
            
            
            
            
              
    
}
          break;
          
     case 2:
     
     System.out.println("THINK OF A NUMBER AND DO AS GIVEN BELOW");
     
     System.out.println("34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49");
     System.out.println("If your number is present in the list then TYPE 1 FOR YES OR 0 FOR NO");
     a1=sc.nextInt();
     System.out.println("16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,48,50");
     System.out.println("If your number is present in the list then TYPE 1 FOR YES OR 0 FOR NO");
     a2=sc.nextInt();
     System.out.println("8,9,10,11,12,13,14,15,2,25,26,27,28,29,30,31,40,41,42,43,44,45,46,47");
     System.out.println("If your number is present in the list then TYPE 1 FOR YES OR 0 FOR NO");
     a3=sc.nextInt();
     System.out.println("4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31,36,37,38,39,44,45,46,47");
     System.out.println("If your number is present in the list then TYPE 1 FOR YES OR 0 FOR NO");
     a4=sc.nextInt();
     System.out.println("2,3,6,7,10,11,14,1,18,19,22,23,26,27,30,31,34,35,,38,39,42,43,46,47,50");
     System.out.println("If your number is present in the list then TYPE 1 FOR YES OR 0 FOR NO");
     a5=sc.nextInt();
     
     System.out.println("1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49");
     System.out.println("If your number is present in the list then TYPE 1 FOR YES OR 0 FOR NO");
     a6=sc.nextInt();
     
     
     
         a11=Integer.toString(a1);
         a22=Integer.toString(a2);
        a33=Integer.toString(a3);
         a44=Integer.toString(a4);
         a55=Integer.toString(a5);
         a66=Integer.toString(a6);
     
     
        lo=a11+a22+a33+a44+a55+a66;
        
        
         for(int i=0;i<lo.length();i++)
        {
            
            
            if(lo.charAt(i)=='1')
            {
              sum3=sum3+Math.pow(2,f);  
            }
            
            
                f--;
            }
            
            int ku=(int)sum3;
            System.out.println("The number you choose was");
            System.out.println();
            System.out.println("********"+" "+ ku + " "+"*******");
            
            
            break;
            
            default:
            
            
            System.out.println("****"+"Oooopss!!! WRONG CHOICE"+"****");
        }
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      
     
     
}
}

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
                
            
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
   
    