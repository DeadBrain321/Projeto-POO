import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound( "MrMalice_-_Itchy.mp3");

    
    public int scoreTotal = 0 ;

    public int vidaJogador1 = 4;
    private int vidaJogador2 = 4;

    private String nomeCarroAzul = JOptionPane.showInputDialog("Nome do Player1:"); // serve para pedir os nomes dos utilizadores
    private String nomeCarroVermelho = JOptionPane.showInputDialog("Nome do Player2:");

    private long TempoInicial =  System.currentTimeMillis(); // obter os tempo inicial em ms

    CarroAzul carrinho1 = new CarroAzul();// iniciliazação dos variaveis de instancia dos carros
    CarroVermelho carrinho2 = new CarroVermelho();

    Text text1, text2; // objectos da classe texto para fazer com que a string se torne uma imagem
    
    //*** Objetos da classe vida usados nas funções remove vidas ***
    VidaFull vidaCheia = new VidaFull();
    VidaMinus1 vidaMenos1= new VidaMinus1();
    VidaMinus2 vidaMenos2= new VidaMinus2();
    VidaMinus3 vidaMenos3= new VidaMinus3();

    Vida2Full  vida2Cheia = new Vida2Full();
    Vida2Minus1  vida2Menos1 = new Vida2Minus1();
    Vida2Minus2  vida2Menos2 = new Vida2Minus2();
    Vida2Minus3  vida2Menos3 = new Vida2Minus3();

    public Level1()
    {    

        super(1200, 650, 1); 
        level1Spawn();
        JOptionPane.showMessageDialog(null,"\t\t\t! Objetivo ! "); // Dá pop up de uma mensagem informativa com os breves objetivos do jogo

        text1 = new Text(nomeCarroAzul);
        text2 = new Text(nomeCarroVermelho);

        addObject(text1, carrinho1.getX(), carrinho1.getY());
        addObject(text2 , carrinho2.getX(),carrinho2.getY());
        scoreTotal =0;
        showText("Score Total :" + scoreTotal, 600,90);
    }
    //*** Onde todas as funções são chamdas repetidamente ***
    public  void act()
    {
        backgroundMusic.play();
        gameTimer();
        addMobs();
        addCoins(); 
        textFollowObject(carrinho1, 50, 75);
        textFollowObject2(carrinho2, 50, 75);
        
        
    }
    //*** Faz com que o nome siga o jogador ***
    public void textFollowObject(CarroAzul objecto, int offsetX, int offsetY)
    {

        text1.setLocation(objecto.getX()+offsetX, objecto.getY()+offsetY);      
    }

    public void textFollowObject2(CarroVermelho  objecto2, int offsetX, int offsetY)
    {
        text2.setLocation(objecto2.getX()+offsetX, objecto2.getY()+offsetY);

    }

    //*** Spawns dos objetos em relação ao nível 1 ***
    public void level1Spawn()
    {
        addObject(new Level1BackgroundRoad(), getWidth()/2,getHeight()/2); // duas objetos da mesma classe ? Simples enquanto um já está nos "olhos do utilizador" o outro fica a -650Y para começar a andar e dar a sensação de movimento do mapa
        addObject(new Level1BackgroundRoad(), getWidth()/2,-getHeight());
        addObject(new Level1Pavilon(),90, 500);
        addObject(new Level1Pavilon(),1110,500);
        addObject(new Level1Rock(),90, 100);
        addObject(new Level1Rock(),1110,100);
        addObject(new Level1Tree(),90, 250);
        addObject(new Level1Tree(),1110,250);
        addObject(carrinho1,472,getHeight()-75);
        carrinho1.turn(-90); // rotação do carroAzul
        addObject(carrinho2, 735,getHeight()-75);
        carrinho2.turn (-90); // rotação do carroVermelho
        addObject(new Timer(), getWidth()/2 -130,30);
        addObject(vidaCheia,472,getHeight()-40);
        addObject(vida2Cheia,735,getHeight()-40);

        setPaintOrder(CarroAzul.class,CarroVermelho.class,Vida.class,Vida2.class,Text.class,WaterPower.class,FirePower.class,Coins.class,NeonEcologico.class,
            Fumo.class,Lixo.class,Timer.class,Level1BackgroundRoad.class,Level1Pavilon.class,Level1Rock.class,Level1Tree.class);
        //*** setPaintOrder faz com que nós escolhemos a ordem da sobreposição. 
    }

    public void addMobs()
    {
        if(Greenfoot.getRandomNumber(2000)<10) // faz com que adicione inimigos com uma percentagem de 0,5% (10*100)/2000 = 0,5 *100
        {
            addObject( new Lixo(), Greenfoot.getRandomNumber(519)+343,10);//*** adiciona um objecto dentro do intervalo de ([0+343;343+519[,10)
        }
        if(Greenfoot.getRandomNumber(2000)<10)
        {
            addObject( new Fumo(), Greenfoot.getRandomNumber(519)+343,10);//*** adiciona um objecto dentro do intervalo de ([0+343;343+519[,10)
        }

    }

    public void addCoins()
    {
        if(Greenfoot.getRandomNumber(2000)<10) // adiciona coins com a mesma percentagem
        {
            addObject( new Coins(), Greenfoot.getRandomNumber(519)+343,10);//*** adiciona um objecto dentro do intervalo de ([0+343;343+519[,10)

        }
    }

    //*** Tempo de jogo ***
    
    public void gameTimer()
    {
        // long pq o System.currentTimeMillis dá o número em 1.2342433463573
        long tempoAtual = (System.currentTimeMillis() - TempoInicial) / 1000 ;
        long tempoRestante = 160-tempoAtual;

        showText(String.valueOf ("Tempo restante: "+ tempoRestante + " s") ,getWidth()/2,30);

        if(tempoAtual== 160)
        {
            Greenfoot.setWorld(new GameOverWorld());
            backgroundMusic.stop();
        }
    }

    
    
    //*** Funçoes vida ***

    public void removeVidaJogador1 ()
    {

        vidaJogador1--;

        if(vidaJogador1 ==4 )
            addObject( vidaCheia, 472,getHeight()-40);
        if(vidaJogador1 ==3 )
        {
            removeObject(vidaCheia);
            addObject(vidaMenos1, 472,getHeight()-40);
        } 
        if(vidaJogador1 ==2 )
        {
            removeObject(vidaMenos1);
            addObject( vidaMenos2, 472,getHeight()-40);
        } 
        if(vidaJogador1 ==1 )
        {
            removeObject(vidaMenos2);
            addObject( vidaMenos3, 472,getHeight()-40);

        } 
        if( vidaJogador1 == 0 )
        {
            backgroundMusic.stop();
            
            Greenfoot.setWorld(new GameOverWorld());

        }
    }

    public void removeVidaJogador2 ()
    {

        vidaJogador2--;

        if(vidaJogador2 ==4 )
            addObject( vida2Cheia,735,getHeight()-40);
        if(vidaJogador2 ==3 )
        {
            removeObject(vida2Cheia);
            addObject(vida2Menos1, 735,getHeight()-40);
        } 
        if(vidaJogador2 ==2 )
        {
            removeObject(vida2Menos1);
            addObject( vida2Menos2,735,getHeight()-40);
        } 
        if(vidaJogador2 ==1 )
        {
            removeObject(vida2Menos2);
            addObject( vida2Menos3, 735,getHeight()-40);

        } 
        if(vidaJogador2==0)
        {
            backgroundMusic.stop();
            
            Greenfoot.setWorld(new GameOverWorld());
        }
    }
    
    //*** Função para mostrar o score ***
    public void addScore(int num)
    {
        scoreTotal = scoreTotal +num;
        showText("Score Total :" + scoreTotal, 600,90);
        if( scoreTotal == 700){
            backgroundMusic.stop();
            Greenfoot.setWorld(new YouWonWorld());
        }
    }
        
}
