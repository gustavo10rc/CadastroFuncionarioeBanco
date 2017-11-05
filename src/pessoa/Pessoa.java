
package pessoa;

public class Pessoa    
{    
    public static void main(String[] args) 
    {
        
        //funcionario
        ClasseFuncionario Joao = new ClasseFuncionario();
        
        Joao.setNome("Joao");
        Joao.setSexo("Masculino");
        Joao.setCpf("32145687");
        Joao.setDepartamento("Vendas");
        Joao.setIdFuncionario(1);
        Joao.setSalario(3200);
        
        ClasseFuncionario Jose = new ClasseFuncionario();
        
        Jose.setNome("Jose");
        Jose.setSexo("Masculino");
        Jose.setCpf("32145687");
        Jose.setDepartamento("Vendas");
        Jose.setIdFuncionario(2);
        Jose.setSalario(5000);
        
        ClasseFuncionario Joaquim = new ClasseFuncionario();
        
        Joaquim.setNome("Joaquim");
        Joaquim.setSexo("Masculino");
        Joaquim.setCpf("32145687");
        Joaquim.setDepartamento("Marketing");
        Joaquim.setIdFuncionario(3);
        Joaquim.setSalario(4100);
        
        ClasseFuncionario Gilmar = new ClasseFuncionario();
        
        Gilmar.setNome("Gilmar");
        Gilmar.setSexo("Masculino");
        Gilmar.setCpf("62145687");
        Gilmar.setIdFuncionario(3);
        Gilmar.setDepartamento("Marketing");
        Gilmar.setSalario(6100);
        
        FolhaPagamento newFolha = new FolhaPagamento();
        newFolha.addFuncionario(Joao);
        newFolha.addFuncionario(Joaquim);
        newFolha.addFuncionario(Jose);
        newFolha.addFuncionario(Gilmar);
        newFolha.aumentoSalario();
        newFolha.imprimeCadastro();
        newFolha.VerDepartamento();
        
         //cliente
        ClasseCliente jose = new ClasseCliente();
        jose.setNome("Jose");
        jose.setSexo("Masculino");
        jose.setIdCliente(12);
        jose.setContaBancaria("123465");
        jose.setSaldo(1000000);
        
        //cliente
        ClasseCliente josefa = new ClasseCliente();
        josefa.setNome("Josefa");
        josefa.setSexo("Feminina");
        josefa.setIdCliente(13);
        josefa.setContaBancaria("987654465");
        josefa.setSaldo(1000000);
        
        //criando o objeto banco
        ClasseBanco BancoItau = new ClasseBanco();
        
        //add cliente
        BancoItau.addCliente(jose);
        BancoItau.addCliente(josefa);
        
        //imprimindo
        BancoItau.imprimeCliente();
        BancoItau.imprimeSaldoCliente();
    }      
}
    

