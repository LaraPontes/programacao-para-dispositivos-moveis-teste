public class Funcionarios{
    String nome;
    String departamento;
    double salario;
    String dataentrada;
    String RG;

    void recebeAumento (double aumento){
        salario+=aumento;    
    }
    double calculaGanhoAnual(){
        return this.salario * 12;
    }
    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de entrada: " + this.dataentrada);
        System.out.println("RG: " + this.RG);
        System.out.println("Salario Atual:" + salario);
        System.out.println("Ganho Anual: " + this.calculaGanhoAnual());
      	
    }
}