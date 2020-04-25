import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;  
import java.util.*;
import java.io.*;
import javax.sound.sampled.*;
 

class Obj
{
	int x,y,x2,y2,sx,sy,sp;
	JLabel img;
	String adrs=new String();
	
	Obj(String adrs,int x,int y,int sx,int sy)
	{
		this.x=x;
		this.y=y;
		this.sx=sx;
		this.sy=sy;
		this.adrs=adrs;
		x2=x+sx;
		y2=y+sy;
		img=new JLabel(new ImageIcon(adrs));
	}

    Obj(int x,int y,int sx,int sy)
	{
		this.x=x;
		this.y=y;
		this.sx=sx;
		this.sy=sy;
		x2=x+sx;
		y2=y+sy;
	}

	int getX()
	{
		return(x);
	}
	int getSX()
	{
		return(sx);
	}
	int getSY()
	{
		return(sy);
	}
	int getY()
	{
		return(y);
	}
	void setX(int x)
	{
		this.x=x;		
		x2=x+sx;	
	}
	void setY(int y)
	{
		this.y=y;
		y2=y+sy;
	}
	void setSX(int sx)
	{
		this.sx=sx;	
		x2=x+sx;
	}
	void setSY(int y)
	{
		this.sy=sy;	
		y2=y+sy;
	}
	boolean tuch(Obj a,char type)
	{		
	if(type=='h')
	{
		
		if(((a.x<=this.x && this.x<=a.x2) || (a.x<=this.x2 && this.x2<=a.x2)) && (a.y==this.y2 || a.y==this.y2 +1 || this.y==a.y2 || this.y-1==a.y2))
		{
			return(true);
		}
		
	}

	if(type=='v')
	{
	  	  
		if(((a.x==this.x2 || a.x==this.x2+1) || (this.x==a.x2 || this.x==a.x2-1  )) &&((a.y<=this.y && this.y<=a.y2)|| (a.y<=this.y2 && this.y2<=a.y2)))
		{
			return(true);			
		}
	  
	}
	
	  return(false);
	}
	
	JLabel image()
	{
		
		img.setBounds(x,y,sx,sy);
		return(img);
	}
	JLabel image(String adrs2)
	{
		img.setIcon(new ImageIcon(adrs2));
		img.setBounds(x,y,sx,sy);
		return(img);
	}
	void update()
	{
		img.setBounds(x,y,sx,sy);
	}
	
}
class Brick
{
		
Obj b1;
	Obj b2;
	Obj b3;
	Obj b4;
	Obj b5;
	Obj b6;
	Obj b7;
	Obj b8;
	Obj b9;
	Obj b10;
	Obj b11;
	Obj b12;
	Obj b13;
	Obj b14;
	Obj b15;
	Obj b16;
	Obj b17;
	Obj b18;
	Obj b19;
	Obj b20;
    Obj b21;
	Obj b22;
	Obj b23;
	Obj b24;
	Obj b25;
	Obj b26;
	Obj b27;
	Obj b28;
	Obj b29;
Obj b30;	
	Brick(String adrs,int bsx,int bsy)
	{
		b1=new Obj(adrs,0,0,bsx,bsy);
	b2=new Obj(adrs,0,0,bsx,bsy);
	b3=new Obj(adrs,0,0,bsx,bsy);
	b4=new Obj(adrs,0,0,bsx,bsy);
	b5=new Obj(adrs,0,0,bsx,bsy);
	b6=new Obj(adrs,0,0,bsx,bsy);
	b7=new Obj(adrs,0,0,bsx,bsy);
	b8=new Obj(adrs,0,0,bsx,bsy);
	b9=new Obj(adrs,0,0,bsx,bsy);
	b10=new Obj(adrs,0,0,bsx,bsy);
	b11=new Obj(adrs,0,0,bsx,bsy);
	b12=new Obj(adrs,0,0,bsx,bsy);
	b13=new Obj(adrs,0,0,bsx,bsy);
	b14=new Obj(adrs,0,0,bsx,bsy);
	b15=new Obj(adrs,0,0,bsx,bsy);
	b16=new Obj(adrs,0,0,bsx,bsy);
	b17=new Obj(adrs,0,0,bsx,bsy);
	b18=new Obj(adrs,0,0,bsx,bsy);
	b19=new Obj(adrs,0,0,bsx,bsy);
	b20=new Obj(adrs,0,0,bsx,bsy);
	b21=new Obj(adrs,0,0,bsx,bsy);
	b22=new Obj(adrs,0,0,bsx,bsy);
	b23=new Obj(adrs,0,0,bsx,bsy);
	b24=new Obj(adrs,0,0,bsx,bsy);
	b25=new Obj(adrs,0,0,bsx,bsy);
	b26=new Obj(adrs,0,0,bsx,bsy);
	b27=new Obj(adrs,0,0,bsx,bsy);
	b28=new Obj(adrs,0,0,bsx,bsy);
	b29=new Obj(adrs,0,0,bsx,bsy);
	b30=new Obj(adrs,0,0,bsx,bsy);
	}
	Obj no(int n)
	{
		switch(n)
		{
			case 1:
			{
				return(b1);
				
			}
			case 2:
			{
				return(b2);
				
			}
			case 3:
			{
				return(b3);
				
			}
			case 4:
			{
				return(b4);
				
			}
			case 5:
			{
				return(b5);
				
			}
			case 6:
			{
				return(b6);
				
			}
			case 7:
			{
				return(b7);
				
			}
			case 8:
			{
				return(b8);
				
			}
			case 9:
			{
				return(b9);
				
			}
			case 10:
			{
				return(b10);
				
			}
			case 11:
			{
				return(b11);
				
			}
			case 12:
			{
				return(b12);
				
			}
			case 13:
			{
				return(b13);
				
			}
			case 14:
			{
				return(b14);
				
			}
			case 15:
			{
				return(b15);
				
			}
			case 16:
			{
				return(b16);
				
			}
			case 17:
			{
				return(b17);
				
			}
			case 18:
			{
				return(b18);
				
			}
			case 19:
			{
				return(b19);
				
			}
			case 20:
			{
				return(b20);
				
			}
			case 21:
			{
				return(b22);
				
			}
			case 22:
			{
				return(b22);
				
			}
			case 23:
			{
				return(b23);
				
			}
			case 24:
			{
				return(b24);
				
			}
			case 25:
			{
				return(b25);
				
			}
			case 26:
			{
				return(b26);
				
			}
			case 27:
			{
				return(b27);
				
			}
			case 28:
			{
				return(b28);
				
			}
			case 29:
			{
				return(b29);
				
			}
			case 30:
			{
				return(b30);
				
			}
			default:
			{
				System.out.println("default");
				return(new Obj(0,0,0,0));
			}
		}
	
	}
	
}




public class Bounce_and_Break extends JFrame implements MouseMotionListener
{
	Obj board,ball,boarderL,boarderU,boarderR,boarderD,back;
	Brick brick,brick2,brick3;
	int back_sx=1200,back_sy=715,time=5,brick_nx=4,brick_ny=3,fs
	,pos_x=-1,pos_y=-1,tempx1,tempy1,tempx,tempy,nbrick,tempj=1,maxL=3,f=0,rx=1,ry=1,
	 postpage,start_page=1,game_page=2,win_page=3,lose_page=4,end_page=5,page=1,level=1;	 
	 Random rand;	
	 char H='h',V='v';
	 boolean count=true;
	char x='x',y='y';
	JLabel back1,back2,back3,back4,back5,levelL,gif,bnb,bno;
	JButton start,again,next,home;
	JPanel Start,Game,Win,Lose,End;
	Sound intro,finish;
	ImageIcon down,hold,up,coll,coll2,coll3,load,str,str2,nxt,agn,cd,rtr,hm;
	 File bounceS1,bounceS2,breakS,breakS2,pressS,loseS,countS,goS,winS,introS,buttonS,finishS;
	
	Bounce_and_Break()
	{
		bnb=new JLabel(new ImageIcon(".//Data//bnb.gif"));
		gif=new JLabel();
		add(gif);
		down=new ImageIcon(".//Data//shut.gif");	
		coll=new ImageIcon(".//Data//coll.gif");
		coll2=new ImageIcon(".//Data//coll2.gif");
		coll3=new ImageIcon(".//Data//coll3.gif");
		
	str=new ImageIcon(".//Data//start.png");
	nxt=new ImageIcon(".//Data//next.png");
	agn=new ImageIcon(".//Data//again.png");
	cd=new ImageIcon(".//Data//321.gif");
	rtr=new ImageIcon(".//Data//retry.png");
	hm=new ImageIcon(".//Data//home.png");
	
	introS=new File(".//sounds//Happy Life - AShamaluevMusic.wav");
	bounceS1=new File(".//sounds//Arkanoid SFX (2).wav");
	bounceS2=new File(".//sounds//nes-12-08.wav");
	pressS=new File(".//sounds//button.wav") ;
	breakS=new File(".//sounds//1bounce (1) (1).wav") ;
	breakS2=new File(".//sounds//Arkanoid SFX (3).wav") ;
	loseS=new File(".//sounds//Arkanoid SFX (10).wav") ;
	countS=new File(".//sounds//Blip 1.wav") ;
	goS=new File(".//sounds//smb_coin.wav") ; 
	winS=new File(".//sounds//zelda-item.wav") ;
	buttonS=new File(".//sounds//break.wav") ;
	finishS=new File(".//sounds//Quirky - AShamaluevMusic.wav") ;
	 try{
    fs=new FileReader(".//FrameSkip.txt").read();
	fs-=47;
System.out.println(fs);	
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
		brick=new Brick(".//Data//brick.png",80,45);
		brick2=new Brick(".//Data//brick2.png",80,45);
		brick3=new Brick(".//Data//brick3.png",80,45);
		board=new Obj(".//Data//board.png",495,560,130,47);
		ball=new Obj(".//Data//ball.png",535,530,40,40);
		boarderL=new Obj(".//Data//L.png",0,0,130,720);
		boarderU=new Obj(".//Data//U.png",0,0,1150,15);
		boarderR=new Obj(".//Data//R.png",1070,0,130,720);
		boarderD=new Obj(".//Data//D.png",0,680,1150,40);
		bno=new JLabel();
		bno.setBounds(1110,120,225,40);
		levelL=new JLabel();
					levelL.setBounds(40,90,225,40);
  bno.setFont(new Font("Comic Sans MS",Font.BOLD,36));
 levelL.setFont(new Font("Comic Sans MS",Font.BOLD,36));

	back1=new JLabel(new ImageIcon(".//Data//back1.png"));
			back2=new JLabel(new ImageIcon(".//Data//back2.png"));
				back3=new JLabel(new ImageIcon(".//Data//back3.png"));
					back4=new JLabel(new ImageIcon(".//Data//back4.png"));
					back5=new JLabel(new ImageIcon(".//Data//back5.png"));
					
					back1.setBounds(0,0,1200,720);
					back2.setBounds(0,0,1200,690);
					back3.setBounds(0,0,1200,720);
					back4.setBounds(0,0,1200,720);
					back5.setBounds(0,0,1200,720);
					
		tempx1=ball.getX();
		tempy1=ball.getY();
		page=start_page;
		
		Game=new JPanel();
		Start=new JPanel();
		Win=new JPanel();
		Lose=new JPanel();
		End=new JPanel();
		
		start=new JButton(str);
		again=new JButton(agn);
		next=new JButton(nxt);
		home=new JButton(hm);
		
		 Start.setLayout(null);
	  Start.setVisible(true);
Start.setBounds(0,0,1200,720);

		 Game.setLayout(null);
	  Game.setVisible(true);
Game.setBounds(0,0,1200,720);

 Win.setLayout(null);
	  Win.setVisible(true);
Win.setBounds(0,0,1200,720);
	 
 Lose.setLayout(null);
	  Lose.setVisible(true);
Lose.setBounds(0,0,1200,720);	
 
 End.setLayout(null);
	  End.setVisible(true);
End.setBounds(0,0,1200,720);	
		
	  rand=new Random();
	  setTitle("Bounce & Break");
	  setLayout(null);
	  setVisible(true);	 
	  setSize(back_sx,back_sy);
	  setResizable(false);
	  addMouseMotionListener(this);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     while(true)
	 {
		 if(page==start_page)
		 {
			  if(postpage==end_page)
			 {
				 remove(End);
			 }
			 if(postpage==win_page)
			 {
				 remove(Win);
			 }
	         if(postpage==lose_page)
			 {
				 remove(Lose);
			 }
			 add(Start);
			time=5;
			 start();
		 }
		 if(page==game_page)
		 {
			
			 if(postpage==start_page)
			 {
			 remove(Start);
			 }
			 if(postpage==win_page)
			 {
				 remove(Win);
			 }
	         if(postpage==lose_page)
			 {
				 remove(Lose);
			 }
			 count=true;
		
			
			 add(Game);
	game();
		 }
		 if(page==lose_page)
		 {
			 remove(Game);
			 add(Lose);
			
			 lose();
		 }
		 if(page==win_page)
		 {
			time-=1;
			 remove(Game);
			 add(Win);
			 postpage=win_page;			
			 win();
		 }
		 if(page==end_page )
		 {
			  remove(Win);
			 add(End);
			 postpage=end_page;
			
			 end();
		 }
	 }
	}
	
	void delay(int t)
	{
		try
		{
			Thread.sleep(t);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	
	
	void start()
	{
		level=1;
		if(postpage==end_page)
		{
		finish.clip.stop();
		}
		 postpage=start_page;
		intro=new Sound(introS);
		intro.start();
		Start.add(bnb);
		Start.add(start);
		Start.add(back1);
		
		bnb.setBounds(160,80,707,289);
		start.setBounds(464,453,241,80);
		
		start.addActionListener(new Page(game_page));
		repaint();
		page=0;
	}
	
    void end()
	{
		finish=new Sound(finishS);
		finish.start();
		End.add(home);
		End.add(back5);
		repaint();
		 home.setBounds(490,390,151,67);
	  repaint();
	  home.addActionListener(new Page(start_page,false));
	   	 page=0; 
	}
	
	
	
	void game()
	{
	intro.clip.stop();
	postpage=game_page;
		int bx,by,n=0,brick_disx=100,brick_disy=60;		

ball.setX(tempx1);
ball.setY(tempy1-50);
	
if(random()<random())
{	
pos_x=-1;
}
else{
	pos_x=1;
}
pos_y=-1;
int k=1,l=1;
Game.add(bno);
Game.add(levelL);
Game.add(boarderL.image());
Game.add(boarderR.image());
Game.add(boarderU.image());
Game.add(boarderD.image());
levelL.setText(level+"");
switch(level)
{
	case 1:
	{
		brick_disx=100;
		brick_disy=60;
		tempx=340;
		tempy=95;
		bx=tempx;
by=tempy;
brick_nx=4;
brick_ny=3;
		
	for(int i=0;i<=brick_nx;i++)
	{
		for(int j=0;j<=brick_ny;j++)
		{
			brick.no(k).setX(bx);
			brick.no(k).setY(by);
			Game.add(brick.no(k).image());
			by+=brick_disy;		
			k++;
		}
		bx+=brick_disx;
		
			by=tempy;
		nbrick=k-1;
		
	 }
	 break;
	}
	case 2:
	{
		
		int nx=0,ny=0;
		brick_disx=100;
		brick_disy=60;
		tempx=240;
		tempy=100;
		bx=tempx;
by=tempy;
		for(int h=1;h<=3;h++)
		{
			if(h==2)
			{
				nx=2;
				ny=2;
				bx=tempx=470;
				by=tempy=175;
			}
			if(h==3)
			{
				nx=2;
			ny=4;
			 bx=tempx=730;
				by=tempy=110;
			}
			if(h==1)
			{
			nx=2;
			ny=4;
			}
		for(int i=1;i<=nx;i++)
	{
		for(int j=1;j<=ny;j++)
		{
			if(by==tempy || by==tempy+3*brick_disy)
			{
				brick2.no(k).setX(bx);
			brick2.no(k).setY(by);
			Game.add(brick2.no(k).image());
		
			
			brick.no(k).setX(0);
			brick.no(k).setY(0);
			Game.add(brick.no(k).image());
			k++;
			}
			else{
			brick.no(k).setX(bx);
			brick.no(k).setY(by);
			Game.add(brick.no(k).image());
			k++;
			}
			by+=brick_disy;		
		}
		bx+=brick_disx;
		
			by=tempy;
		
		
	 }

		}
		
		nbrick=k-1;
		
		break;
	}
	
	case 3:
	{
		
		int nx=4,ny=4;
		tempx=400;
		tempy=75;
		bx=tempx;
by=tempy;
brick_disx=480-390;
brick_disy=105;

			
		for(int i=1;i<=nx;i++)
	{
		for(int j=1;j<=ny;j++)
		{
			if(j%2!=0)
			{
				brick3.no(k).setX(bx);
			brick3.no(k).setY(by);
			Game.add(brick3.no(k).image());
			brick2.no(k).setX(0);
			brick2.no(k).setY(0);
			Game.add(brick2.no(k).image());
			by+=brick_disy;
			}
			else{
			brick2.no(k).setX(bx);
			brick2.no(k).setY(by);
			Game.add(brick2.no(k).image());
			by+=brick_disy;
			}
			brick.no(k).setX(0);
brick.no(k).setY(0);
Game.add(brick.no(k).image());
k++;			
		}
		bx+=brick_disx;
		
			by=tempy;
		
	}	
	
		
		nbrick=k-1;
		
		break;
	}
	


}
	
	Game.add(board.image());
	
		Game.add(ball.image());
		
		Game.add(back2);
		
		bno.setText(nbrick+"");
	  repaint();
	  
      // ballcode
	 
	  while(true)
	  {
		  
		  delay(time);
		  
		 if(ball.tuch(boarderU,H))
		 {
			 invert(y);
			 
          new Sound(bounceS2).start();	
           ball.sp=2;
		 }
		 
		 
		 
		 
		 if( ball.tuch(board,H))
		 {
	
			pos_y=-1;
             ry=random();
       ball.setY(board.getY()-ball.getSY());
				 
		 
			
			 
			 
			 
			
		new Sound(bounceS1).start();	
			 ball.sp=2;
		 }
	 
		if(ball.tuch(board,V))
		{
		if(ball.getX()<board.getX()+(board.getSX()/2))
		{
		   pos_x=-1;
		   ry=1;
		   rx=2;
		}			
		 if(ball.getX()>=board.getX()+(board.getSX()/2))
		{
		   pos_x=1;
		   ry=1;
		   rx=2;
		} 
			new Sound(bounceS1).start();	
			
			 ball.sp=2;
		}
		
         		   
		 if(ball.tuch(boarderL,V))
		 {
			 invert(x);
			 	 
				new Sound(bounceS2).start();	
 ball.sp=2;			
		 }
		  if( ball.tuch(boarderR,V))
		  {
			  invert(x);	 
				new Sound(bounceS2).start();
 ball.sp=2;				
		  }
		
		  
		 if(ball.tuch(boarderD,H))
		 {
			 	 new Sound(loseS).start();	
					
			        
			  
			 page=lose_page;
			   ball.sp=2;
			break;
		 }
				
		
		
		 
		
		// brick tuch 
		
		int j=1;
		while(j<=k)
		{
			
					if(ball.tuch(brick.no(j),H) || ball.tuch(brick.no(j),V) )
					{
						if(ball.tuch(brick.no(j),H)  )
				{
					invert(y);
					 ry=random();
					
				}
			
						if(ball.tuch(brick.no(j),V))
				{
						invert(x);
						 rx=random();
	             }
				
				
							gif.setIcon(coll);
					new Animation(brick.no(j).getX(),brick.no(j).getY(),80,40,100).start();
					
                    brick.no(j).setX(0);
					brick.no(j).setY(0);
					Game.remove(brick.no(j).image());
						 		
					
			        
			          
			          
					 new Sound(breakS).start();	
					nbrick--;
					bno.setText(nbrick+"");
					 ball.sp=2;
					break;
					
					}
				
				if(ball.tuch(brick2.no(j),H) || ball.tuch(brick2.no(j),V) )
				{
					if(ball.tuch(brick2.no(j),H) )
				{
					invert(y);
					 ry=random();
					
				}	
				
	
				if(ball.tuch(brick2.no(j),V)  )
				{
				
						invert(x);
					
					rx=random();
				
				}
					 gif.setIcon(coll2);
					new Animation(brick2.no(j).getX(),brick2.no(j).getY(),80,45,300).start();
					 
					brick.no(j).setX(brick2.no(j).getX());
					brick.no(j).setY(brick2.no(j).getY());
					
					brick2.no(j).setX(0);
					brick2.no(j).setY(0);
					Game.remove(brick2.no(j).image());
					 new Sound(breakS2).start();	
					
					brick.no(j).update();
 
					
			        
			          
			           ball.sp=2;
		break;			
					
	
				}
			
				
	
				

			
				
				
				
				if(ball.tuch(brick3.no(j),H) || ball.tuch(brick3.no(j),V))
				{
					if(ball.tuch(brick3.no(j),H))
				{
						invert(y);
						
					ry=random();
				}
					if(ball.tuch(brick3.no(j),V))
				{
					
					
						invert(x);
						
					rx=random();
					
				
				}
					gif.setIcon(coll3);
					new Animation(brick3.no(j).getX(),brick3.no(j).getY(),80,40,300).start();
					
					
					brick2.no(j).setX(brick3.no(j).getX());
					brick2.no(j).setY(brick3.no(j).getY());
					
					brick3.no(j).setX(0);
					brick3.no(j).setY(0);
					Game.remove(brick3.no(j).image());
					 new Sound(breakS2).start();	
					
					brick2.no(j).update();
 
					
			        
			          
			          ball.sp=2;
					 break;
				}
		
				j++;
			
		}
		
		
		if(rx==ry && rx==1)
		{
			rx=2;
			ry=2;
		}
		
		
		if(nbrick==0)
		{
			new Sound(winS).start();
			delay(50); 
			page=win_page;
			break;
		}
			  if(pos_x==-1)
			  {
				  ball.setX(ball.getX()-rx-ball.sp);
			  }
			  if(pos_x==1)
			  {
				  ball.setX(ball.getX()+rx+ball.sp);
			  }
			   if(pos_y==-1)
			  {
				  ball.setY(ball.getY()-ry-ball.sp);
			  }
			   if(pos_y==1)
			  {
				  ball.setY(ball.getY()+ry+ball.sp);
			  }
			  ball.sp=0;
			  if(f==fs)
			  {
			 ball.update();
			 f=0;
			  }
			  f++;
			 if(count==true)
			 {
				 delay(500);
				int i=1;
				 gif.setIcon(cd);
new Animation(525,205,100,100,4*500).start();
while(i<=4)
{	
if(i==4)
{
	new Sound(goS).start();		
}
else{
 new Sound(countS).start();	
} 
				 delay(500);
				 i++;
}
				 count=false;
			 }
			   }

	}
 void lose()
 {
	 again.setIcon(rtr);
	 Lose.add(again);
	  Lose.add(home);
	 Lose.add(back4);
	 again.setBounds(652,350,151,67);
     home.setBounds(336,350,151,67);
	  repaint();
	 again.addActionListener(new Page(game_page,false));
	  home.addActionListener(new Page(start_page,false));
	   postpage=lose_page;
	   	 page=0; 
 }

 void win()
 {
	 again.setIcon(agn);
	 Win.add(again);
	 Win.add(next);
	 Win.add(back3);
	 again.setBounds(336,350,151,67); 
	 next.setBounds(652,350,151,67); 
	
	 again.addActionListener(new Page(game_page)); 
	  next.addActionListener(new Page(game_page,true)); 
	    repaint();
		 postpage=win_page;
	  page=0;
 }
 class Page implements ActionListener
 {
	 int p;
	 boolean nextL;
	 Page(int p,boolean nextL)
	 {
	     this.nextL=nextL;	 
		 this.p=p;
	 }
	  Page(int p)
	 {	 
		 this.p=p;
		 nextL=false;
	 }
	 
	 
public void actionPerformed(ActionEvent ae)
{
	new Sound(buttonS).start();
	if(nextL==true)
	{
	 level+=1;
	}		
	if(level==maxL+1)
	{
		page=end_page;
		level=1;
	}
	else{
    page=p;
	}
	nextL=false;
}
 }
	public void mouseMoved(MouseEvent e)
	   {
		  
         board.setX(e.getX());
		 if(board.getX()<boarderL.getX()+boarderL.getSX())
		 {
			 board.setX(boarderL.getX()+boarderL.getSX());			
		 }
		 if(board.getX()+board.getSX()>boarderR.getX())
		 {
			 board.setX(boarderR.getX()-board.getSX());
		 }
		 board.update();
		 
		 
       }
	    public void mouseDragged(MouseEvent e) 
		 {
        board.setX(e.getX());
		 if(board.getX()<boarderL.getX()+boarderL.getSX())
		 {
			 board.setX(boarderL.getX()+boarderL.getSX());
		 }
		 if(board.getX()+board.getSX()>boarderR.getX())
		 {
			 board.setX(boarderR.getX()-board.getSX());
		 }
		 board.update();
		   
       }
	
	
	void invert(char c)
	{
       if(c=='x')
	   {
		if(pos_x==-1)
		{
			pos_x=1;
			
				
		}
		else
		{
			pos_x=-1;
		}
		rx=random();
	   }
	   if(c=='y')
	   {
		 if(pos_y==-1)
		{
			pos_y=1;
		}
		else
		{
			pos_y=-1;
		} 
ry=random();		
	   }
	}
	
	
	
	int random()
	{
		int r=0;
		while(r==0)
		{
		r=rand.nextInt(3);
		}
		
		return(r);
	}
	
	public static void main(String args[])
	{
		new Bounce_and_Break();
	}

	
class Sound extends Thread
{
	File file;
	boolean block;
	AudioInputStream audio;
	Clip clip; 	
	boolean stp=false;
	
	public Sound(File f,boolean b)
	{ 
	block=b;
		file=f;
	} 
	
	public Sound(File f)
	{ 
		file=f;
	} 
	
	
	
	public void run()
	{
		try
		{
		audio =AudioSystem.getAudioInputStream(file); 
        clip = AudioSystem.getClip(); 	   
		 clip.open(audio); 		 
		clip.start();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	
	class Animation extends Thread
	{
		int duration,x,y,sx,sy;
		
		Animation(int x,int y,int sx,int sy,int duration)
		{
			this.duration=duration;
			this.x=x;
			this.y=y;
			this.sx=sx;
			this.sy=sy;
		}
		
		public void run()
		{
			gif.setBounds(x,y,sx,sy);
			repaint();
			delay(duration);
			gif.setBounds(0,0,0,0);
			repaint();
		}
	}
	
	
	

}
















