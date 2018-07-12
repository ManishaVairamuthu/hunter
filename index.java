import java.util.*;
class index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        String s="";
        for(int i=0;i<n;i++)
        {
            if(ar[i]==i)
            {
                s=s+i;
            }
        }
        int res[]=new int[s.length()];
        for(int j=0;j<s.length();j++)
        res[j]=Integer.parseInt(String.valueOf(s.charAt(j)));
        Arrays.sort(res);
        for(int i=0;i<res.length;i++)
        System.out.print(res[i]+" ");
    }
}
