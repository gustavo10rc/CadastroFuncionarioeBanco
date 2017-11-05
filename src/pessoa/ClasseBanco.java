package pessoa;

public class ClasseBanco 
{
     int id;
     ClasseCliente[] cliente = new ClasseCliente[5];
     int contador;
     
     public void addCliente(ClasseCliente clienteBanco)
     {
        cliente[contador] = clienteBanco;
        contador++;
     }
     
     public int getSizeCliente()
     {
     return contador;
     }
     
     public void imprimeCliente()
    {
        for(int i=0;i<getSizeCliente();i++)
        {
            cliente[i].imprimeClasseCliente();
        }
    }

     public void imprimeSaldoCliente()
    {
        double resultado=0; 
        for(int i=0;i<getSizeCliente();i++)
        {
           cliente[i].imprimeSaldoClasseCliente();
            
           double varTotal =cliente[i].getSaldo();
           resultado= resultado + varTotal;
        }
        System.out.println("Total: "+resultado);
       
           
    }
     
}
