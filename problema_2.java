import java.util.Scanner;
public class problema_2
{
    public static void main(String arg[])
    {
        Scanner x=new Scanner(System.in);
        System.out.print("Introduzca el dato...");
        String letra=x.next(),aux="";
        int num=0;
        for(int i=0;i<letra.length();i++)
        {
            if(letra.charAt(i)=='(')
            {
                num++;
                aux=aux+String.valueOf(num);
                continue;
            }
            if(letra.charAt(i)==')')
            {
                aux=aux+String.valueOf(num);
                num--;
                continue;
            }
            aux=aux+letra.charAt(i);
        }
        for(int i=0;i<aux.length();i++)
        {
            for(int j=0;j<aux.length();j++)
            {
                if(String.valueOf(aux.charAt(j)).equals(String.valueOf(i)))
                    num=i;
            }
        }
        //foo1bar2baz21blim
        String res="",aux1="",a="";
    
        for(int i=num;i>0;i--)
        {
            int j=0;
            res="";
            while(j<aux.length())
            {
                if(String.valueOf(aux.charAt(j)).equals(String.valueOf(i)))
                {
                    aux1="";
                    a="";
                    j++;
                    
                    while(j<aux.length() && !String.valueOf(aux.charAt(j)).equals(String.valueOf(i)))
                    {
                        aux1=aux1+aux.charAt(j);
                        j++;
                    }
                    for(int k=aux1.length()-1;k>=0;k--)
                    {
                        a=a+aux1.charAt(k);
                    }
                    res=res+a;
                }
                else
                    res=res+aux.charAt(j);
                j++;
            }
            aux=res;
        }
        System.out.print(aux);
    }
}