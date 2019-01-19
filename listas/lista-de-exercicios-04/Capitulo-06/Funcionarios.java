class Funcionarios {
private double salario;
private String nome;
private int RG;

public double getSalario(){
    return this.salario;
}

public void setSalario(double salario){
    this.salario = salario;
}

public double getcalculaGanhoAnual(){
    return this.salario * 12; 
}
public String Funcionario(){
return this.nome;    
}
public String Funcionario(String nome){
 this.nome=nome;  
 return this.nome;
}

}

