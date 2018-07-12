import java.util.*;
class nonrep
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(ar[i]==ar[j])
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print(ar[i]);
                break;
            }
        }
    }
}
