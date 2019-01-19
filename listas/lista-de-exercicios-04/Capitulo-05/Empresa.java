class Empresa {
    String nome;
    String cnpj;
    Funcionarios [] empregados;
  
  void adiciona(Funcionarios f){
      for (int i=0; i < 10; i++){
          this.empregados[i]=f;
      }
  }
  void mostraEmpregados(){
      for (int i = 0; i < this.empregados.length; i++) {
          System.out.println("Funcionario na posição: " +i);
      }
  }
}
