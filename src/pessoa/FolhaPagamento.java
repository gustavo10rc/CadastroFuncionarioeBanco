package pessoa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class FolhaPagamento 
{
    ClasseFuncionario[] imprime = new ClasseFuncionario[5];
    int contador;
    Calendar hoje;
    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    

public void addFuncionario(ClasseFuncionario funcionarios)
    {
        imprime[contador] = funcionarios;
        contador++;
    }

public int getSizeFuncionario()
    {
    return contador; //RETORNAR TAMANHO ATUAL DA LISTA.
    }

 public void imprimeCadastro()
    {
        for(int i=0;i<getSizeFuncionario();i++)
        {
            imprime[i].imprimeFuncionario();
            
        }
          
    }
 
 public void aumentoSalario()
    {
         for(int i=0;i<getSizeFuncionario();i++)
        {
          double varAumento =imprime[i].getSalario();
          
           varAumento =varAumento+(varAumento*0.1); 
           imprime[i].setSalario(varAumento);
          
        }
         System.out.println("Data:"+formatador.format( data )); 
        
    }       

public void VerDepartamento()
    {
         for(int i=0;i<getSizeFuncionario();i++)
        {
         System.out.println("Departamento: "+ imprime[i].getDepartamento() + " Funcionario: "+
           imprime[i].getNome());
            
        }
    }         
}