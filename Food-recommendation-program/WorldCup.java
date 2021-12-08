package javaproject;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Random;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class WorldCup extends JFrame implements ActionListener{

	JButton btn1,btn2,btn3,btn4;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,jl1,jl2;
	ArrayList<String>food1=new ArrayList<String>();
	ArrayList<String> list1=new ArrayList<String>();//16강전에서 사용할 배열
	ArrayList<String> list2=new ArrayList<String>();//8강전에서 사용할 배열
	ArrayList<String> list3=new ArrayList<String>();//4전에서 사용할 배열,결승전
	ArrayList<String> list4=new ArrayList<String>();//결승전에서 사용할 배열,결승전
	
	public void cup_16()//16강전
	{
			Random rand=new Random();
		
			int randNum=rand.nextInt(food1.size()); //food1의 크기만큼 랜덤으로 돌린다
			String randnum=food1.get(randNum);		
			jl1.setText(randnum);
		
			int randNum1=rand.nextInt(food1.size());
			if(randNum1==randNum)					//중복 방지
			{
			randNum1=rand.nextInt(food1.size());
			}
		
			String randnum1=food1.get(randNum1);	
			jl2.setText(randnum1);
			
	}
	
	public void cup_8()//8강 위한 함수
	{
		Random rand=new Random();
		
		int randNum=rand.nextInt(list1.size()); //list1의 크기만큼 랜덤으로 돌린다
		
		String randnum=list1.get(randNum);		
		jl1.setText(randnum);
	
		int randNum1=rand.nextInt(list1.size());
		if(randNum1==randNum)					//중복 방지
		{
		randNum1=rand.nextInt(list1.size());
		}
	
		String randnum1=list1.get(randNum1);	
		jl2.setText(randnum1);
		
		
	}
	public void cup_4()//4강 위한 함수
	{
		Random rand=new Random();
		
		int randNum=rand.nextInt(list2.size()); //list2의 크기만큼 랜덤으로 돌린다
		
		String randnum=list2.get(randNum);		
		jl1.setText(randnum);
	
		int randNum1=rand.nextInt(list2.size());
		if(randNum1==randNum)					//중복 방지
		{
		randNum1=rand.nextInt(list2.size());
		}
	
		String randnum1=list2.get(randNum1);	
		jl2.setText(randnum1);
		
		
	}
	public void cup_2()//준결승 위한 함수
	{
		Random rand=new Random();
		
		int randNum=rand.nextInt(list3.size()); //list3의 크기만큼 랜덤으로 돌린다
		
		String randnum=list3.get(randNum);		
		jl1.setText(randnum);
	
		int randNum1=rand.nextInt(list3.size());
		if(randNum1==randNum)					//중복 방지
		{
		randNum1=rand.nextInt(list3.size());
		}
	
		String randnum1=list3.get(randNum1);	
		jl2.setText(randnum1);
		
		
	}
	public void cup_1()//결승 위한 함수
	{
		
		String randnum=list4.get(0);		
		jl1.setText(randnum);
	
		
		String randnum1=list4.get(1);	
		jl2.setText(randnum1);
		
		
	}
	
	public void fun1()//버튼1 클릭시 음식을 list1배열에 넣음 해당 음식을 삭제한다 
	{
		
		
		String name1=null;
		name1=jl1.getText();
		list1.add(name1);
		food1.remove(name1);
		
	}
	
	public void fun2()//버튼2 클릭시 음식을 list2배열에 넣음 해당 음식을 삭제한다 
	{
		String name1=null;
		name1=jl2.getText();
		list1.add(name1);
		food1.remove(name1);
		
	}
	public void fun3()//버튼1 클릭시 음식을 list2배열에 넣음 해당 음식을 삭제한다 
	{
		String name1=null;
		name1=jl2.getText();
		list2.add(name1);
		list1.remove(name1);
		
	}
	public void fun4()//버튼2 클릭시 음식을 list2배열에 넣음 해당 음식을 삭제한다 
	{
		String name1=null;
		name1=jl2.getText();
		list2.add(name1);
		list1.remove(name1);
		
	}
	public void fun5()//버튼1 클릭시 음식을 list3배열에 넣음 해당 음식을 삭제한다 
	{ 
		String name1=null;
		name1=jl2.getText();
		list3.add(name1);
		list2.remove(name1);
		
	}
	public void fun6()//버튼2 클릭시 음식을 list3배열에 넣음 해당 음식을 삭제한다 
	{
		String name1=null;
		name1=jl2.getText();
		list3.add(name1);
		list2.remove(name1);
		
	}
	public void fun7()//버튼1 클릭시 음식을 list4배열에 넣음 해당 음식을 삭제한다 
	{
		String name1=null;
		name1=jl2.getText();
		list4.add(name1);
		list3.remove(name1);
		
	}
	public void fun8()//버튼2 클릭시 음식을 list4배열에 넣음 해당 음식을 삭제한다 
	{
		String name1=null;
		name1=jl2.getText();
		list4.add(name1);
		list3.remove(name1);
		
	}
	
	
	
	WorldCup() {
		// TODO Auto-generated constructor stub
		super("음식 월드컵");
		setLayout(null);
		this.getContentPane().setBackground(new Color(153,102,255)); //프레임 색상
		
		//컴포넌트의 위치,색상 등 지정

	
	lbl1=new JLabel("음식 월드컵");
	lbl1.setBounds(260, 50, 200, 100);
	lbl1.setFont(new Font("",Font.BOLD,30));
	lbl1.setForeground(Color.white);

	add(lbl1);
	
	jl1=new JLabel("");
	jl1.setBounds(70, 170, 250, 100);
	jl1.setFont(new Font("",Font.BOLD,40));
	jl1.setForeground(Color.white);

    add(jl1);
    
    btn1=new JButton("확인");
    btn1.setBounds(100,320,70,30);
	btn1.setBackground(new Color(244,244,244));

    add(btn1);
    
    
    jl2=new JLabel("");
    jl2.setBounds(450, 170, 250, 100);
	jl2.setFont(new Font("",Font.BOLD,40));
	jl2.setForeground(Color.white);

	add(jl2);
	
	btn2=new JButton("확인");
    btn2.setBounds(500,320,70,30);
	btn2.setBackground(new Color(244,244,244));

    add(btn2);
	
	lbl2=new JLabel("시작하려면 OK버튼을 누르세요=>");
	lbl2.setBounds(290, 520, 270, 50);
	lbl2.setFont(new Font("",Font.BOLD,15));
	lbl2.setForeground(Color.white);

	add(lbl2);
	
	
	
	lbl3=new JLabel("VS");
	lbl3.setBounds(320, 270, 50, 50);
	lbl3.setFont(new Font("",Font.BOLD,30));
	lbl3.setForeground(Color.white);

	add(lbl3);
	
	lbl4=new JLabel();
	lbl4.setBounds(100, 520, 100, 50);
	lbl4.setFont(new Font("",Font.BOLD,30));
	lbl4.setForeground(Color.white);


	add(lbl4);
	
	lbl5=new JLabel("강");
	lbl5.setBounds(150, 520, 100, 50);
	lbl5.setFont(new Font("",Font.BOLD,30));
	lbl5.setForeground(Color.white);


	add(lbl5);
	
	btn3=new JButton("OK");
	btn3.setBounds(550, 520, 100, 50);
	btn3.setBackground(new Color(244,244,244));

    add(btn3);
	
    btn4=new JButton("뒤로가기");
	btn4.setBounds(550, 600, 100, 50);
	btn4.setBackground(new Color(244,244,244));

    add(btn4);
	
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);
	btn4.addActionListener(this);
	
	//food1 arratlist에 넣는다
	food1.add("불고기");
	food1.add("치킨");
	food1.add("피자");
	food1.add("삼겹살");
	food1.add("제육볶음");
	food1.add("라면");
	food1.add("칼국수");
	food1.add("돈까스");
	food1.add("닭고기덮밥");
	food1.add("햄버거");
	food1.add("김치찌개");
	food1.add("떡볶이");
	food1.add("돼지고기");
	food1.add("짬뽕");
	food1.add("족발");
	food1.add("초밥");
	food1.add("갈치조림");
	food1.add("샐러드");
	food1.add("쌀국수");
	food1.add("된장찌개");
	food1.add("토스트");
	food1.add("감자탕");
	food1.add("비빔밥");
	food1.add("어묵탕");
	food1.add("스테이크");
	food1.add("스파게티");
	food1.add("주먹밥");
	food1.add("갈비탕");
	food1.add("김치볶음밥");
	
	setSize(700, 700);
	setVisible(true);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
		
	int sum=16;//16,8,4 강을 위한 변수
	static int count=0;//확인버튼을 클릭한 수를 알기 위한 변수
	int time=0;//ok버튼을 클릭한 수를 알기 위한 변수
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1)
		{
			count++;
			if(count>0&&count<=16)//count가 1이상 16이하이면 fun1()실행
			{
				fun1();
			}
			else if(count>16&&count<=24)//count가 17이상 24이하이면 fun3()실행
			{		
				fun3();
								
			}
			else if(count>24&&count<=28)//count가 25이상 28이하이면 fun5()실행
			{
				fun5();
			}
			else if(count>28&&count<=30)//count가 29이상 30이하이면 fun7()실행
			{
				fun7();
			}
			else if(count>30)//count가 31이상 마지막으로 고른 음식 메시지로 알려줌
			{
				JOptionPane.showMessageDialog(btn1,"축하합니다!!!\n당신이 먹고 싶은 음식은 바로"+jl1.getText());

			}
			
			
		}
		
		if(e.getSource()==btn2)
		{
			count++;
			if(count>0&&count<=16)
			{
				fun2();
			}
			else if(count>16&&count<=24)
			{		
				fun4();
								
			}
			else if(count>24&&count<=28)
			{
				fun6();
			}
			else if(count>28&&count<=30)
			{
				fun8();
			}
			else if(count>30)
			{
				JOptionPane.showMessageDialog(btn2,"축하합니다!!!\n당신이 먹고 싶은 음식은 바로 "+ jl2.getText());
			}
		}
		
		
		if(e.getSource()==btn3) 
		{
			lbl2.setText("");
			time++;
			if(time>0&&time<=16)
			{
				sum=16;
				cup_16();
			}
			
			else if(time>16&&time<=24)
			{		
				sum=8;
				
				cup_8();
								
			}
			else if(time>24&&time<=28)
			{
				sum=4;
				cup_4();
			}
			else if(time>28&&time<=30)
			{
				sum=2;
				cup_2();
			}
			else if(time>30)
			{
				cup_1();
			}
			
			String num=Integer.toString(time);
			String sum1=Integer.toString(sum);
			
			
			lbl4.setText(sum1);
			
			
		}
		if(e.getSource()==btn4)
		{
			this.setVisible(false);
			new Menu(null);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WorldCup();
	}

}
