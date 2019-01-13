//Questao 02
public class Portas{
boolean aberta;
String cor;
int dimensaoX;
int dimensaoY;
int dimensaoZ;

  void abre(){ 
    if (this.aberta==false){
        this.aberta=true;
        }
}

 void fecha(){ 
    if (this.aberta==true){
        this.aberta=false;            
        }
}

boolean estaAberta(){
      if(this.aberta==true){
        System.out.println("aberta");
        return true;
    }else{
       System.out.println("fechada");
        return false;
    }
}
  
  void pinta(String cor){
    System.out.println("Cor: " +cor);
  }
  
}