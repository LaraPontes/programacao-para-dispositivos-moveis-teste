/* Este projeto foi realizado pela aluna Lara Pontes como requisito parcial para a aprovação da disciplina de programacao para dispositivos moveis */


import java.util.Scanner; // indica que receberei algum valor do usuario
 
//public 
class Tamagochi { // criando a classe Tamagotchi
    /* declarando os atributos que a classe Tamagotchi deve ter*/
    private int fome,limpeza,energia;
    private int diamantes=0; 
    private int idade=0;
    private int energiaInicial,limpezaInicial, fomeInicial; /*Esses atributos foram  instanciados para receber os valores iniciais da fome, limpeza e energia, e tambem servirem como o valor maximo que essas variaveis podem chegar apos serem definidas*/

 /*os metodos acessores getFome, getLimpeza e getEnergia foram criados para verificar os valores que forem atribuidos a esses inteiros e retornar eles mesmos */

 /*ja os metodos acessores setFome, setLimpeza e setEnergia foram criados para que seja possivel modificar os valores desses inteiros durante a execucao do codigo*/

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
        this.fomeInicial=this.fome;
    }

    public int getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(int limpeza) {
        this.limpeza = limpeza;
        this.limpezaInicial=this.limpeza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
        this.energiaInicial=this.energia;
    }

    public int getDiamantes() {
        return diamantes;
    }

    public void setDiamantes(int diamantes) {
        this.diamantes = diamantes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEnergiaInicial() {
        return energiaInicial;
    }

    public int getLimpezaInicial() {
        return limpezaInicial;
    }

    public int getFomeInicial() {
        return fomeInicial;
    }
    
    public void mostrar(){
        System.out.println("Energia Fome Limpeza Diamantes Idade");
        System.out.println("E:"+this.energia+"/"+this.energiaInicial+", F:"+this.fome+"/"+this.fomeInicial+", L:"+this.limpeza+"/"+this.limpezaInicial+", D:"+this.diamantes+", I:"+this.idade);
        
    }
    
    
    public boolean validaComando(String comando){
 /* verificando se o usuário digitou um comando válido. O metodo equals verifica se a string digitada é a mesma que está dentro dos parenteses, enquanto o usuario digitar uma string diferente das apresentadas abaixo, o comando sera negado */

        if(!comando.equals("brincar")&&!comando.equals("dormir")&&!comando.equals("mostrar")&&
            !comando.equals("comer")&&!comando.equals("tomar banho")&&!comando.equals("fim")&&!comando.equals("mostrar")){

            return false;
        }
        
        /* verifica se o usuario digitou o comando brincar, caso sim verifica se a energia, limpeza e fome estao abaixo de zero, se todos as condicoes anteriores forem falsas, o comando brincar sera executado. Quando o comando brincar for executado, consequentemente diminuira 2 na energia, 1 na fome, 3 na limpeza, e incrementara 1 na idade e 1 na quantidade de diamantes */


        if(comando.equals("brincar")){
            if(this.energia<=0){
                this.energia=0;
                System.out.println("Falhou: O bichinho morreu de cansaco");
            }else if(this.limpeza<=0){
                limpeza=0; 
                System.out.println("Falhou: O bichinho morreu de sujeira");
            }else if(this.fome<=0){
                this.fome=0;
                System.out.println("Falhou: O bichinho morreu de fome");
            }else{
                this.energia-=2;
                this.fome-=1;
                this.limpeza-=3;
                this.diamantes++;
                this.idade++;
            }

        }
        
 	/* verifica se o usuario digitou o comando “mostrar”, se sim, o metodo mostrar sera executado */
        if(comando.equals("mostrar")){
            mostrar();
        }
        /*  verifica se o usuario digitou o comando “comer”, caso sim verifica se algum dos outros atributos esta abaixo de 0, se todos as condicoes anteriores forem falsas, o comando comer sera executado. Quando o comando comer for executado, consequentemente diminuira 1 na energia, 2 na limpeza, aumenta 4 na fome, e incrementara 1 na idade e 1 na quantidade de diamantes. Sera utilizado uma condicao para verificar se a fome esta maior que a fomeinicial, se sim, esta sera igualada a fomeinicial.*/

        if(comando.equals("comer")){
            if(this.energia<=0){
                this.energia=0;
                System.out.println("Falhou: O bichinho morreu de cansaco");
            }else if(this.limpeza<=0){
                limpeza=0;
                System.out.println("Falhou: O bichinho morreu de sujeira");
            }else if(this.fome<=0){
                this.fome=0;
                System.out.println("Falhou: O bichinho morreu de fome");
            }else{
                this.energia--;
                this.limpeza-=2;
                this.fome+=4;
                this.idade++;

                if(this.fome>fomeInicial){
                        this.fome=fomeInicial;
                }
            }

        }
       /*  verifica se o usuario digitou o comando “dormir”, caso sim verifica se algum dos outros atributos esta abaixo de 0, se todos as condicoes anteriores forem falsas e o bichinho ja tiver perdido pelo menos 5 unidades de energia, o comando dormir sera executado. Quando o comando dormir for executado, consequentemente diminuira 1 na fome, a energia sera igualada a energia maxima (energiainicial) e a idade aumentara de acordo com a quantidade de energia que ele vai recuperar com este comando. */

        if(comando.equals("dormir")){
            if(this.energia<=0){
                this.energia=0;
                System.out.println("Falhou: O bichinho morreu");
            }else if(this.limpeza<=0){
                this.limpeza=0;
                System.out.println("Falhou: O bichinho morreu de sujeira");
            }else if(fome<=0){
                this.fome=0;
                System.out.println("Falhou: O bichinho morreu de fome");
            }else if(this.energiaInicial-this.energia<5){
                System.out.println("Falhou: O bichinho nao esta cansado");
            }else{
                this.fome-=1;
                this.idade+=(this.energiaInicial-this.energia);
                this.energia=this.energiaInicial;      
            }

        }
        
 /*  verifica se o usuario digitou o comando “tomar banho”, caso sim verifica se algum dos outros atributos esta abaixo de 0, se todos as condicoes anteriores forem falsas, o comando tomar banho sera executado. Quando o comando tomar banho for executado, consequentemente diminuira 1 na fome, 3 na energia, incrementara 2 na idade e a limpeza sera igualada ao maximo (limpezainicial). */

        
        if(comando.equals("tomar banho")){
            if(this.energia<=0){
                this.energia=0;
                System.out.println("Falhou: O bichinho morreu");
            }else if(this.limpeza<=0){
                this.limpeza=0;
                System.out.println("Falhou: O bichinho morreu de sujeira");
            }else if(this.fome<=0){
                this.fome=0;
                System.out.println("Falhou: O bichinho morreu de fome");
            }else{
                this.fome-=1;
                this.energia-=3;
                this.idade+=2;
                this.limpeza=limpezaInicial;
            }
        }

        return true;
        
    }
    


    public static void main(String[] args) {

        int fome,limpeza,energia;
        int diamantes=0;
        int idade=0;
        int energiaInicial,limpezaInicial, fomeInicial;
        
        Tamagochi bichinho = new Tamagochi(); //Instanciando a classe Tamagotchi
        Scanner sc =  new Scanner(System.in); //ler dados de entrada
        String comando; // essa string recebera os comandos que o usuario digitar
        System.out.println("Digite os valores de energia, fome e limpeza respectivamente");
        
        /*Os codigos abaixo so identificam quais sao os proximos valores que serao recebidos pelo usuario e onde eles vao ser armazenados*/
        energia=sc.nextInt();
        fome= sc.nextInt();
        limpeza=sc.nextInt();
        
/**/

        energiaInicial=energia;
        limpezaInicial=limpeza;
        fomeInicial=fome;
        
        bichinho.setEnergia(energia);
        bichinho.setFome(fome);
        bichinho.setIdade(idade);
        bichinho.setDiamantes(diamantes);
        bichinho.setLimpeza(limpeza);
        
                
   
        System.out.println("Energia Fome Limpeza Diamantes Idade");
        System.out.println("E:"+bichinho.getEnergia()+"/"+bichinho.getEnergiaInicial()+", F:"+bichinho.getFome()+"/"+bichinho.getFomeInicial()+", L:"+bichinho.getLimpeza()+"/"+bichinho.getLimpezaInicial()+", D:"+bichinho.getDiamantes()+", I:"+bichinho.getIdade());

        System.out.println("O que vc deseja fazer agora? Comandos(brincar, dormir, comer, tomar banho, dormir, mostrar, fim) ");
        System.out.print("COMANDO: ");
        
        //Limpando o buffer do teclado
        sc.nextLine();
        do{
            //recebendo o comando do usuario atraves de uma string
            comando=sc.nextLine();
            bichinho.validaComando(comando); // chamando o metodo validaComando        
                      
        }while(!comando.equals("fim"));
        // o loop continuara executando enquanto o usuario nao digitar fim       
    }
    
}