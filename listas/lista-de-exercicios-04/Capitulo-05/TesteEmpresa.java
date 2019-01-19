public class TesteEmpresa{
    public static void main (String[]args){
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionarios[10];
        
        Funcionarios f1 = new Funcionarios();
        empresa.adiciona(f1);
        Funcionarios f2 = new Funcionarios();
        empresa.adiciona(f2);
        
        empresa.mostraEmpregados();

       }
 }
