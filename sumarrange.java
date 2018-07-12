import java.util.*;
class repeatarrangeguvi
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
        String s="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ar[i]==ar[j]&&i!=j)
                {
                    if(!s.contains(String.valueOf(ar[i])))
                    s=s+ar[i];
                }
            }
        }
        int res[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            res[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(res);
        for(int j=0;j<res.length;j++)
        {
            System.out.print(res[j]+" ");
        }
    }
}
