public class TesteCasa {
  public static void main (String[]args){
    Casa c1 = new Casa();
  c1.porta1.cor="verde";
  c1.porta2.cor="amarelo";
  c1.porta3.cor="laranja";  
  c1.porta1.aberta=true;
  c1.porta2.aberta=false;
  c1.porta3.aberta=true;
  c1.quantasPortasEstaoAbertas();

  }
} 
