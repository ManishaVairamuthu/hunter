import java.util.*;
class firstrep
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        String res="";
        for(int i=0;i<n;i++)
        {  
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(ar[i]==ar[j])
                    {
                    res=res+""+ar[i];
                    }
                }
            }
        }
        if(res.length()==0)
        System.out.print("unique");
        else
        System.out.print(res.charAt(0));
    }
}
