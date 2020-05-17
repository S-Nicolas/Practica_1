import java.util.*;
public class problema_3 
{
    public static void main(String arg[])
    {
        ArrayList<Character>A=new ArrayList<Character>();
        ArrayList<Integer>B=new ArrayList<Integer>();
        Scanner x=new Scanner(System.in);
        String abc="abcdefghijklmnopqrstuvwxyz";
        System.out.println("Introduzca el dato");
        String letra=x.next();
        for(int i=0;i<abc.length();i++)
        {
            int cont=0;
            for(int j=0;j<letra.length();j++)
            {
                if(abc.charAt(i)==letra.charAt(j))
                    cont++;
            }
            if(cont!=0)
            {
                A.add(abc.charAt(i));
                B.add(cont);
            }
        }
        String a="",b="",res="";
        for(int i=0;i<A.size();i++)
        {
            if(B.get(i)%2!=0)
            {
                for(int k=0;k<B.get(i);k++)
                    res+=A.get(i);
            }
            else
            {
                for(int j=0;j<B.get(i);j++)
                {
                    if(j%2==0)
                        a+=A.get(i);
                    else
                        b=A.get(i)+b;
                }
            }
        }
        res=a+res+b;
        String reves="";
        for(int i=res.length()-1;i>=0;i--)
            reves+=res.charAt(i);
        
        if(res.equals(reves))
            System.out.print("verdadero");
        else
            System.out.print("falso");
    }    
}