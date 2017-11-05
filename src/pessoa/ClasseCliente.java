package pessoa;
public class ClasseCliente  extends ClassePessoa
{
    private int idCliente;
    private String contaBancaria;
    private int saldo;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
     public void imprimeClasseCliente()
    {
        System.out.println("ID: "+idCliente);
        System.out.println("Nome: "+nome);
        System.out.println("endereco: "+sexo);
        System.out.println("telefone: "+cpf);
        System.out.println("Saldo: "+saldo);
        System.out.println("Conta: "+contaBancaria);
        System.out.println("-----------------------------------------");
        
    }
     
     public void imprimeSaldoClasseCliente()
    {
        System.out.println("Nome: "+nome);
        System.out.println("Saldo: "+saldo);
        System.out.println("--|--------------------|--");
        
    }
}
