package pessoa;
public class ClasseFuncionario extends ClassePessoa
{
    private int idFuncionario;
    private double salario;
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
     public void imprimeFuncionario()
    {
        System.out.println("-----------------------------------------");
        System.out.println("ID: "+idFuncionario);
        System.out.println("Nome: "+nome);
        System.out.println("endereco: "+sexo);
        System.out.println("telefone: "+cpf);
        System.out.println("Salario: "+salario);
        System.out.println("Departamento: "+departamento);
        System.out.println("-----------------------------------------");
        
    }
}
