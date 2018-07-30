import java.util.*;
class procost
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=0,temp=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    int t=ar[i]+ar[j];
                    if(t==0)
                    {
                        System.out.print(ar[i]+" "+ar[j]);
                        count=1;
                        break; 
                    }
                }
            }
           if(count==1)
           break;
        }
    }
}


