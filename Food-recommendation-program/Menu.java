package javaproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Menu extends JFrame implements ActionListener{

	
	
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9; 
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;	
	static String id;								
	public Menu(String id) {
		// TODO Auto-generated constructor stub
		super("음식추천프로그램");
		setLayout(null);
		
		this.getContentPane().setBackground(new Color(153,102,255));//프레임 색상
		
		//각 컴포넌트의 위치,색상 등 지정
		
		jl8=new JLabel("사용자 ID:");
		jl8.setBounds(20, 20, 100, 100);
		jl8.setFont(new Font("",Font.PLAIN,20));
		jl8.setForeground(Color.white);

		add(jl8);
		
		jl9=new JLabel(login.ID);
		jl9.setBounds(150, 20, 100, 100);
		jl9.setFont(new Font("",Font.PLAIN,20));
		jl9.setForeground(Color.white);

		add(jl9);
		
		jl1=new JLabel("MENU");
		jl1.setBounds(280,60,700,100);
		jl1.setFont(new Font("",Font.BOLD,65));
		jl1.setForeground(Color.white);

		
		add(jl1);
		
		jl2=new JLabel("권장 칼로리 계산");
		jl2.setBounds(100,200,250,100);
		jl2.setFont(new Font("",Font.BOLD,30));
		jl2.setForeground(Color.white);

		
		add(jl2);
		
		jl3=new JLabel("칼로리에 맞는 음식 추천 ");
		jl3.setBounds(100,300,450,100);
		jl3.setFont(new Font("",Font.BOLD,30));
		jl3.setForeground(Color.white);

		add(jl3);
		
		jl4=new JLabel("입력받은 음식 추천");
		jl4.setBounds(100,400,300,100);
		jl4.setFont(new Font("",Font.BOLD,30));
		jl4.setForeground(Color.white);

		add(jl4);
		
		jl5=new JLabel("운동별 칼로리 계산");
		jl5.setBounds(100,500,300,100);
		jl5.setFont(new Font("",Font.BOLD,30));
		jl5.setForeground(Color.white);

		add(jl5);
		
		jl6=new JLabel("음식 월드컵");
		jl6.setBounds(100,600,200,100);
		jl6.setFont(new Font("",Font.BOLD,30));
		jl6.setForeground(Color.white);

		add(jl6);
		
		jl7=new JLabel("달력");
		jl7.setBounds(100,700,200,100);
		jl7.setFont(new Font("",Font.BOLD,30));
		jl7.setForeground(Color.white);

		add(jl7);
		
		
		
		btn1=new JButton("☞");
		btn1.setBounds(470, 200, 100, 80);
		btn1.setFont(new Font("",Font.BOLD,30));
		btn1.setBackground(new Color(244,244,244));
		add(btn1);
		btn1.addActionListener(this);
		
		btn2=new JButton("☞");
		btn2.setBounds(470, 300, 100, 80);
		btn2.setFont(new Font("",Font.BOLD,30));
		btn2.setBackground(new Color(244,244,244));
		add(btn2);
		btn2.addActionListener(this);
		
		btn3=new JButton("☞");
		btn3.setBounds(470, 400, 100, 80);
		btn3.setFont(new Font("",Font.BOLD,30));
		btn3.setBackground(new Color(244,244,244));
		add(btn3);
		btn3.addActionListener(this);
		
		btn4=new JButton("☞");
		btn4.setBounds(470, 500, 100, 80);
		btn4.setFont(new Font("",Font.BOLD,30));
		btn4.setBackground(new Color(244,244,244));
		add(btn4);
		btn4.addActionListener(this);
		
		btn5=new JButton("☞");
		btn5.setBounds(470, 600, 100, 80);
		btn5.setFont(new Font("",Font.BOLD,30));
		btn5.setBackground(new Color(244,244,244));
		add(btn5);
		btn5.addActionListener(this);
		
		btn6=new JButton("☞");
		btn6.setBounds(470, 700, 100, 80);
		btn6.setFont(new Font("",Font.BOLD,30));
		btn6.setBackground(new Color(244,244,244));
		add(btn6);
		btn6.addActionListener(this);
		
		btn7=new JButton("종료");
		btn7.setBounds(630, 800, 120, 50);
		btn7.setFont(new Font("",Font.BOLD,30));
		btn7.setBackground(new Color(244,244,244));
		add(btn7);
		btn7.addActionListener(this);
		
		setSize(800, 900);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)//권장 칼로리 계산 버튼을 누르면 권장 칼로리 계산 창으로 가면서 현재창을 닫음
		{
			new calorie();
			
			this.setVisible(false);
		}
		if(e.getSource()==btn2)//칼로리에 맞는음식 추천 버튼을 누르면 칼로리에 맞는음식 추천 창으로 가면서 현재창을 닫음
		{
			new Random1();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn3)//입력받은 음식 추천 버튼을 누르면 입력받은 음식 추천 창으로 가면서 현재창을 닫음
		{
			new random();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn4)//운동별 칼로리 계산 버튼을 누르면 운동별 칼로리 계산 창으로 가면서 현재창을 닫음
		{
			new Exercise();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn5)//음식 월드컵 버튼을 누르면 음식 월드컵 창으로 가면서 현재창을 닫음
		{
			new WorldCup();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn6)//달력 버튼을 누르면 달력 창으로 가면서 현재창을 닫음
		{
			
			new SwingCalendar();
			this.setVisible(false);

		}
		if(e.getSource()==btn7)//종료 버튼을 누르면 현재창을 닫음
		{
			
			this.setVisible(false);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menu(id);
	}

}
