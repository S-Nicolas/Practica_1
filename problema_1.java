import java.util.*;
class problema_1
{
    public static void main(String arg[])
    {
        Scanner x=new Scanner(System.in);
        System.out.print("Digite tamanio de la cadena... ");
        int n=x.nextInt();
        int may=0,aux=0;
        System.out.println("Introduzca los valores");
        String A[] = new String[n];
        for(int i=0;i<n;i++)
        {
            String letra=x.next();
            A[i]=letra;
            if(letra.length()>may)
            {
                aux=letra.length();
                may=aux;
            }
                
        }
        ArrayList<String>res=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            if(A[i].length()>=aux)
                res.add(A[i]);
        }
        System.out.print(res);
    }
}