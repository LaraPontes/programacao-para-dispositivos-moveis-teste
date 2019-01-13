//Questao 03

public class Casa{
String cor;
Porta porta1 = new Porta();
Porta porta2 = new Porta();
Porta porta3 = new Porta();
boolean aberta;
  
  void pinta(String s){
    this.cor=s;
    System.out.println(this.cor);
  }
  boolean abre(){
    if (this.aberta==false){
      this.aberta=true;
    }
    return true;
  }
  boolean fecha(){
    if (this.aberta==true){
      this.aberta=false;
    }
    return false;
  }
  int quantasPortasEstaoAbertas(){
  	int contador=0;
    if (this.porta1.aberta==true){
      contador+=1;
    }
    if (this.porta2.aberta==true){
      contador+=1;
    } 
    if (this.porta3.aberta==true){
      contador+=1;
    } 
    System.out.println("Quantidade de portas abertas: " +contador);
    return contador;
  }
}