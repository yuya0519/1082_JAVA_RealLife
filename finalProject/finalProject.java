import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


public class finalProject  extends JFrame implements ActionListener{
	JFrame frm = new JFrame();
	ImageIcon upimg = new ImageIcon("up.jpg");
	ImageIcon downimg = new ImageIcon("down.jpg");
	ImageIcon rightimg = new ImageIcon("right.jpg");
	ImageIcon leftimg = new ImageIcon("left.jpg");
	ImageIcon fight = new ImageIcon("battle.jpg");
	ImageIcon bossimg = new ImageIcon("scissor_left.png");
	ImageIcon paper = new ImageIcon("paper_right.png");
	ImageIcon scissor = new ImageIcon("scissor_right.png");
	ImageIcon rock = new ImageIcon("rock_right.png");
	ImageIcon playimg = new ImageIcon("play.jpg");
	ImageIcon nextimg = new ImageIcon("next.jpg");
	ImageIcon eye = new ImageIcon("eye.jpg");
	ImageIcon eye_le = new ImageIcon("eye_left.jpg");
	ImageIcon eye_ri = new ImageIcon("eye_right.jpg");
	ImageIcon eye_lc = new ImageIcon("eye_lc.jpg");
	ImageIcon eye_rc = new ImageIcon("eye_rc.jpg");
	ImageIcon girl_before = new ImageIcon("girl1.jpg");
	ImageIcon girl_after = new ImageIcon("girl2.jpg");
	ImageIcon beautyimp1 = new ImageIcon("beauty1.jpg");
	ImageIcon beautyimp2 = new ImageIcon("beauty2.jpg");
	ImageIcon nonimg = new ImageIcon("non.jpg");
	ImageIcon mouth = new ImageIcon("mouth.jpg");
	ImageIcon bow = new ImageIcon("over3_2.jpg");
	ImageIcon computerimg = new ImageIcon("computer.jpg");
	ImageIcon mirror1 = new ImageIcon("mirror1.jpg");
	ImageIcon mirror2 = new ImageIcon("mirror2.jpg");
	ImageIcon mirror3 = new ImageIcon("mirror3.jpg");
	ImageIcon mirror4 = new ImageIcon("mirror4.jpg");
	ImageIcon mirror1img = new ImageIcon("mirror1but.jpg");
	ImageIcon mirror2img = new ImageIcon("mirror2but.jpg");
	ImageIcon mirror3img = new ImageIcon("mirror3but.jpg");
	ImageIcon mirror4img = new ImageIcon("mirror4but.jpg");
	ImageIcon overimg = new ImageIcon("over2.jpg");
	ImageIcon endding = new ImageIcon("end.jpg");
	ImageIcon badend = new ImageIcon("badend.jpg");
	ImageIcon badbut = new ImageIcon("badendbut.jpg");
	
	private static JButton startBtn,initialBtn;
	JButton up = new JButton(upimg);
	JButton down = new JButton(downimg);
	JButton right = new JButton(rightimg);
	JButton left = new JButton(leftimg); 
	JButton next = new JButton(nextimg);
	JButton back = new JButton(nextimg);
	JButton beauty1 = new JButton(beautyimp1);
	JButton beauty2 = new JButton(beautyimp2);
	JButton non = new JButton(nonimg);
	JButton mirror1btn = new JButton(mirror1img);
	JButton mirror2btn = new JButton(mirror2img);
	JButton mirror3btn = new JButton(mirror3img);
	JButton mirror4btn = new JButton(mirror4img);
	JButton badendbut = new JButton(badbut);
	TextField txf = new TextField();
	private JPanel jpn;
	int x = 0 , y = 0 , dir = 0, number = 3 ,open_eye = 0;
	boolean[]pass = new boolean[4];
	public static void main(String[]args)
	{
		new finalProject().setVisible(false); ;		
	}
	
	
	public finalProject(){
		frm.setTitle("Real Life");
		frm.setSize(1020,1070);
		frm.setResizable(false);		
		ImageIcon bg = new ImageIcon("back.jpg");
		ImageIcon start = new ImageIcon("start2.jpg");
		JLabel bglab = new JLabel(bg);
		jpn = new JPanel();	
		startBtn = new JButton(start);
		startBtn.setSize(447,143);
		startBtn.setLocation(760,700);
		startBtn.setActionCommand("startBtn");
		startBtn.addActionListener(this);
		startBtn.setBorderPainted(false);	
		startBtn.addActionListener(this);				
		bglab.add(startBtn);			
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void initial(){
		ImageIcon bg = new ImageIcon("1.jpg");
		ImageIcon init = new ImageIcon("initial.jpg");
		for(int i = 0;i < 4; i++)
			pass[i] = false;
		JLabel bglab = new JLabel(bg);
		jpn = new JPanel();	
		initialBtn = new JButton(init);
		initialBtn.setSize(90,65);
		initialBtn.setLocation(1400,50);
		initialBtn.setActionCommand("initialBtn");
		initialBtn.addActionListener(this);

		bglab.add(initialBtn);		
		jpn.add(bglab);
		frm.add(jpn);
		
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String cmd = e.getActionCommand();
		if(cmd == "startBtn"){	
			frm.remove(jpn);		
			initial();
		}
		else if(cmd == "initialBtn"){
			frm.remove(jpn);
			game();
		}
		else if(cmd == "up"){
			dir = 0;
			//frm.remove(jpn);
			step();
		}
		else if(cmd == "down"){
			dir = 1;
			frm.remove(jpn);
			step();
		}
		else if(cmd == "left"){
			dir = 2;
			frm.remove(jpn);
			step();
		}
		else if(cmd == "right"){
			dir = 3;
			frm.remove(jpn);
			step();
		}
		else if(cmd == "play"){
			frm.remove(jpn);
			playing();
		}
		else if(cmd == "next"){
			frm.remove(jpn);
			if (number == 0)	
				end1();
			else if(number == 1)
				scissor_boss();
			else if(number == 2)
				move();
		}
		else if(cmd == "eye_left"){
			frm.remove(jpn);
			eye_lo();
		}
		else if(cmd == "eye_right"){
			frm.remove(jpn);
			eye_ro();
		}
		else if(cmd =="back"){
			frm.remove(jpn);
			move();
		}
		else if(cmd == "beauty"){
			frm.remove(jpn);
			mouth_girl_part2();
		}
		else if(cmd == "beauty2"){
			frm.remove(jpn);
			over3_1();
		}
		
		else if(cmd == "non"){
			frm.remove(jpn);
			over3_2();
		}
		else if(cmd == "mirror1"){
			frm.remove(jpn);
			end_2();
		}
		else if(cmd == "mirror2"){
			frm.remove(jpn);
			end_3();
		}
		else if(cmd == "mirror3"){
			frm.remove(jpn);
			end_4();
		}
		else if(cmd == "mirror4"){
			frm.remove(jpn);
			end();
		}
		else if(cmd == "badendbut"){
			frm.remove(jpn);
			badend();
		}
	}
	
	ImageIcon bg = new ImageIcon("map.jpg");
	ImageIcon per = new ImageIcon("down.png");
	
	public void game()
	{		
		JLabel person =new JLabel(per);
		person.setSize(204,204);
		person.setLocation(x,y);
		JLabel bglab = new JLabel(bg);
		bglab.add(person);
		up.setLocation(900,50);
		up.setSize(50,50);
		down.setLocation(900,100);
		down.setSize(50,50);
		left.setLocation(850,100);
		left.setSize(50,50);
		right.setLocation(950,100);
		right.setSize(50,50);
		up.setActionCommand("up");
		up.addActionListener(this);
		down.setActionCommand("down");
		down.addActionListener(this);
		left.setActionCommand("left");
		left.addActionListener(this);
		right.setActionCommand("right");
		right.addActionListener(this);
		bglab.add(up);
		bglab.add(down);
		bglab.add(left);
		bglab.add(right);
		jpn = new JPanel();			
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void step(){
		if(dir == 0){
			if(pass[3]==true)
				per = new ImageIcon("white.png");
			else if(pass[2]==true)
				per = new ImageIcon("smile.png");
			else if(pass[0]==true)
				per = new ImageIcon("IMG_5993.png");
			if(((x == 204 && y > 0) || (x == 408 && y > 408) || (x == 612 && y > 612)))
				y -= 204;
		}

		else if(dir == 1){
			if(pass[3]==true)
				per = new ImageIcon("white.png");
			else if(pass[2]==true)
				per = new ImageIcon("smile.png");
			else if(pass[0]==true)
				per = new ImageIcon("IMG_5993.png");
			if(((x == 204 && y < 408) || (x == 408 && y < 612) || (x == 612 && y < 816)))
				y += 204;
		}
		else if(dir == 2){
			if(pass[3]==true)
				per = new ImageIcon("white.png");
			else if(pass[2]==true)
				per = new ImageIcon("smile_l.png");
			else if(pass[1]==true)
				per = new ImageIcon("nnose_l.png");
			else if(pass[0]==true)
				per = new ImageIcon("neye_l.png");
			else
				per = new ImageIcon("left.png");
				
			if((y == 0&& x > 0) || (y == 408 && x > 204) || (y == 612 && x > 408) ||(y == 816 && x > 612))
				x -= 204;
		}

		else if(dir == 3){
			if(pass[3]==true)
				per = new ImageIcon("white.png");
			else if(pass[2]==true)
				per = new ImageIcon("smile_r.png");
			else if(pass[1]==true)
				per = new ImageIcon("nnose_r.png");
			else if(pass[0]==true)
				per = new ImageIcon("neye_r.png");
			else
				per = new ImageIcon("right.png");
				
			if((y == 0&& x < 204) || (y == 408 && x <408) || (y == 612 && x < 612) ||(y == 816 && x < 816))
				x += 204;
		}
		move();
	}
	
	public void move()
	{
		JLabel person =new JLabel(per);
		person.setSize(204,204);
		person.setLocation(x,y);
		JLabel bglab = new JLabel(bg);
		bglab.add(person);
		bglab.add(up);
		bglab.add(down);
		bglab.add(left);
		bglab.add(right);
		jpn = new JPanel();			
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
		if(x == 204 && y == 0 && pass[0] == false){
			per = new ImageIcon("IMG_5993.png");
			frm.remove(jpn);
			eye_boss();
		}
		else if(x == 204 && y == 408 && pass[1] == false){
			frm.remove(jpn);
			scissor_boss();
		}
		else if(x == 612 && y == 612 && pass[2] == false){
			per = new ImageIcon("smile.png");
			frm.remove(jpn);
			mouth_girl();
		}
		else if(x == 612 && y == 816 && pass[3] == false){
			per = new ImageIcon("white.png");
			frm.remove(jpn);
			pass[3]=true;
			move();
			//computer();
		}
		
		else if(x == 816 && y == 816)
			end_1();
	}
	
	
	public void scissor_boss()
	{
		pass[1] = true;
		JLabel bglab = new JLabel(fight);
		JLabel boss = new JLabel(bossimg);
		boss.setLocation(0,300);
		boss.setSize(550,600);
		bglab.add(boss);
		jpn = new JPanel();			
		JButton play = new JButton(playimg);
		play.setSize(225,113);
		play.setLocation(500,700);
		play.setActionCommand("play");
		play.addActionListener(this);
		bglab.add(play);
			
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void playing()
	{	
		JLabel bglab = new JLabel(fight);
		JLabel boss = new JLabel(bossimg);
		boss.setLocation(0,300);
		boss.setSize(550,600);
		bglab.add(boss);
		jpn = new JPanel();			
		//number = 2;
		number = (int) ((Math.random() * 10 )% 3);
		JLabel player;
	
		if (number == 0){
			player = new JLabel(paper);		
			player.setLocation(500,600);
			player.setSize(550,300);
			bglab.add(player);			
		}
		
		else if(number == 1){
			player = new JLabel(scissor);
			player.setLocation(500,600);
			player.setSize(550,300);
			bglab.add(player);	
		}
		else if(number == 2){
			player = new JLabel(rock);
			player.setLocation(500,600);
			player.setSize(550,300);
			bglab.add(player);
		}
		next.setSize(225,113);
		next.setLocation(200,750);
		next.setActionCommand("next");
		next.addActionListener(this);
		bglab.add(next);
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void eye_boss()
	{		
		JLabel bglab = new JLabel(eye);
		JButton eye_left = new JButton(eye_le);
		eye_left.setSize(100,50);
		eye_left.setLocation(360,440);
		eye_left.setBorderPainted(false);
		eye_left.setActionCommand("eye_left");
		eye_left.addActionListener(this);
		JButton eye_right = new JButton(eye_ri);
		eye_right.setSize(100,50);
		eye_right.setLocation(560,540);
		eye_right.setActionCommand("eye_right");
		eye_right.addActionListener(this);
		eye_right.setBorderPainted(false);
		jpn = new JPanel();	
		bglab.add(eye_left);
		bglab.add(eye_right);
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void eye_lo()
	{
		if(open_eye == 0){
			JLabel bglab = new JLabel(eye_rc);
			JButton eye_right = new JButton(eye_ri);
			eye_right.setSize(100,50);
			eye_right.setLocation(560,520);
			eye_right.setActionCommand("eye_right");
			eye_right.addActionListener(this);
			eye_right.setBorderPainted(false);
			jpn = new JPanel();	
			bglab.add(eye_right);
			jpn.add(bglab);
			frm.add(jpn);
			frm.setVisible(true);
			open_eye = 1;
		}
		else{
			frm.remove(jpn);
			end2();
		}
	}
	
	public void eye_ro()
	{
		if(open_eye == 0){
			JLabel bglab = new JLabel(eye_lc);
			JButton eye_left = new JButton(eye_le);
			eye_left.setSize(100,50);
			eye_left.setLocation(355,430);
			eye_left.setBorderPainted(false);
			eye_left.setActionCommand("eye_left");
			eye_left.addActionListener(this);
			jpn = new JPanel();	
			bglab.add(eye_left);
			jpn.add(bglab);
			frm.add(jpn);
			frm.setVisible(true);
			open_eye = 1;
		}
		else{
			frm.remove(jpn);
			end2();
		}
	}
	
	public void mouth_girl()
	{
		pass[2] = true;
		JLabel bglab = new JLabel(girl_before);
		jpn = new JPanel();			
		beauty1.setSize(200,100);
		beauty1.setLocation(420,700);
		beauty1.setActionCommand("beauty");
		beauty1.addActionListener(this);
		bglab.add(beauty1);
		
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void mouth_girl_part2()
	{
		JLabel bglab = new JLabel(girl_after);
		jpn = new JPanel();			
		beauty2.setSize(200,100);
		non.setSize(200,100);
		beauty2.setLocation(250,700);
		non.setLocation(550,700);
		beauty2.setActionCommand("beauty2");
		non.setActionCommand("non");
		beauty2.addActionListener(this);
		non.addActionListener(this);
		bglab.add(beauty2);
		bglab.add(non);
		
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	public void end1()
	{
		ImageIcon overimg = new ImageIcon("over1.jpg");
		JLabel bglab = new JLabel(overimg);
		bglab.setSize(1020,1020);
		jpn = new JPanel();
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void end2()
	{
		pass[0] = true;		
		JLabel bglab = new JLabel(overimg);
		bglab.setSize(1020,1020);
		jpn = new JPanel();
		back.setSize(225,113);
		back.setLocation(400,800);
		back.setActionCommand("back");
		back.addActionListener(this);
		bglab.add(back);
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void over3_1()
	{
		JLabel bglab = new JLabel(mouth);
		jpn = new JPanel();
		jpn.add(bglab);	
		bglab.add(back);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void over3_2()
	{
		JLabel bglab = new JLabel(bow);
		jpn = new JPanel();			
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
	
	public void end_1()
	{
		frm.remove(jpn);
		JLabel bglab = new JLabel(mirror1);
		jpn = new JPanel();
		mirror1btn.setSize(500,650);
		mirror1btn.setLocation(280,170);
		mirror1btn.setActionCommand("mirror1");
		mirror1btn.addActionListener(this);
		mirror1btn.setBorderPainted(false);
		badendbut.setSize(300,120);
		badendbut.setLocation(375,830);
		badendbut.setActionCommand("badendbut");
		badendbut.addActionListener(this);
		bglab.add(mirror1btn);
		bglab.add(badendbut);
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}	
	public void end_2()
	{
		frm.remove(jpn);
		JLabel bglab = new JLabel(mirror2);
		jpn = new JPanel();
		mirror2btn.setSize(500,650);
		mirror2btn.setLocation(280,180);
		mirror2btn.setBorderPainted(false);
		mirror2btn.setActionCommand("mirror2");
		mirror2btn.addActionListener(this);
		bglab.add(mirror2btn);
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}	
	public void end_3()
	{
		frm.remove(jpn);
		JLabel bglab = new JLabel(mirror3);
		jpn = new JPanel();
		mirror3btn.setSize(500,650);
		mirror3btn.setLocation(280,180);
		mirror3btn.setActionCommand("mirror3");
		mirror3btn.addActionListener(this);
		mirror3btn.setBorderPainted(false);
		bglab.add(mirror3btn);
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}	
	public void end_4()
	{
		frm.remove(jpn);
		JLabel bglab = new JLabel(mirror4);
		jpn = new JPanel();
		mirror4btn.setSize(500,650);
		mirror4btn.setLocation(270,200);
		mirror4btn.setActionCommand("mirror4");
		mirror4btn.addActionListener(this);
		mirror4btn.setBorderPainted(false);
		bglab.add(mirror4btn);
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}	
	public void end()
	{
		jpn.removeAll();
		JLabel bglab = new JLabel(endding);
		jpn = new JPanel();
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}	

	public void badend()
	{
		JLabel bglab = new JLabel(badend);
		jpn = new JPanel();			
		jpn.add(bglab);
		frm.add(jpn);
		frm.setVisible(true);
	}
}
