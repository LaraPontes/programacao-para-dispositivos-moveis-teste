public class Testa_Funcionario {
    
    public static void main (String[] args){
        Funcionarios f1 = new Funcionarios();
		Funcionarios f2 = new Funcionarios();
        f1.nome="Lara";
        f1.salario=200;
        f1.recebeAumento(150);
        
        f1.mostra(); 
      	f2.mostra();
        
    }
}
