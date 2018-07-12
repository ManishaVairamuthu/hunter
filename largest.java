import java.util.*;
class largest
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
            if(!res.contains(String.valueOf(ar[i])) || ar[i]==0)
             {
                 res=res+ar[i];
             }
        }
        int n1[]=new int[res.length()];
        for(int j=0;j<res.length();j++)
        n1[j]=Integer.parseInt(String.valueOf(res.charAt(j)));
        Arrays.sort(n1);
        String result="";
        for(int j=res.length()-1;j>=0;j--)
        result=result+n1[j];
        if(Integer.parseInt(result)>0)
        System.out.print(result);
        else
        System.out.print("0");
    }
}
