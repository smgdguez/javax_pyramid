import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;

public class guindows extends JFrame{
    public guindows(){
        super("olv");  
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(30, 30,450, 400);
        getContentPane().setBackground(new Color(34,40,81));
        getContentPane().add(new MyCanvas());
        setVisible(true);
    }
}

class MyCanvas extends JComponent {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(102,51,0));
        int y=350,lim=350;
        for(int x=10;x<=190;x+=60,y-=20){
          int temp=x; //almacena el <= lim
          while(temp<=lim){ // al limite le bajo 100
            g.drawRect(temp,y,50,15); // punto inicial, ancho, alto
            g.fillRect(temp,y,50,15);
            temp+=60;
          } lim-=60;
        }
        g.drawRect(160,290,50,15);
        g.fillRect(160,290,50,15);
        g.setColor(Color.GREEN);
        g.drawRect(0,365,450,5);
        g.fillRect(0,365,450,5);
        y=0;
        g.setColor(Color.WHITE);
        while(y<50){
          Random nm = new Random();
          int p=nm.nextInt(400)+1;
          int q=nm.nextInt(400)+1;
          g.drawLine(p,q,p,q);
            y++;
        }
        g.drawOval(20, 20, 100, 100);
        g.fillOval(20, 20, 100, 100);

    }
  }