package javaproject;



import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.util.*;

public class random extends JFrame implements ActionListener{

	JLabel jl, jl1,jl2,jl3,jl4,jl5,jl6; 
	JRadioButton rbtn1,rbtn2;
	JTextField jtf1,jtf2,jtf3;
	JTextArea jta;
	JButton btn,btn1,btn2,btn3;
	
	
	
	public random() {
	// TODO Auto-generated constructor stub
	super("랜덤 음식 추천");
	setLayout(null);
	this.getContentPane().setBackground(new Color(153,102,255));//프레임 색상
	
	//각 컴포넌트의 위치,색상 등 지정

	//밑에 디자인(컴포넌트 위치 및 크기, 색깔)
	jl=new JLabel("랜덤음식 추천");
	jl.setBounds(50, 20,500,100);
	jl.setFont(new Font("",Font.BOLD,60));
	jl.setForeground(Color.white);

	add(jl);
	
	jl1=new JLabel("추천받을 음식을 입력하세요  :");
	jl1.setBounds(120, 100, 600, 100);
	jl1.setFont(new Font("",Font.BOLD,20));
	jl1.setForeground(Color.white);

	add(jl1);

	jtf1=new JTextField(20);
	jtf1.setBounds(430, 135, 100, 30);
	add(jtf1);
	
	jl2=new JLabel("입력된  음식들 ");
	jl2.setBounds(120, 150, 600, 100);
	jl2.setFont(new Font("",Font.BOLD,20));
	jl2.setForeground(Color.white);

	add(jl2);
	
	
	
	
	jl3=new JLabel("추천받은 음식 ");
	jl3.setBounds(120, 315, 200, 100);
	jl3.setFont(new Font("",Font.BOLD,20));
	jl3.setForeground(Color.white);

	add(jl3);
	
	jtf3=new JTextField(20);
	jtf3.setBounds(280, 350, 200, 30);
	add(jtf3);

	btn=new JButton("추천받기");
	btn.setBounds(600, 350, 150, 30);
	btn.setBackground(new Color(244,244,244));

	add(btn);
	btn.addActionListener(this);
	
	btn1=new JButton("확인");
	btn1.setBounds(600,130, 120, 30);
	btn1.setBackground(new Color(244,244,244));

	add(btn1);
	btn1.addActionListener(this);
	
	btn2=new JButton("입력한 음식들 보기");
	btn2.setBounds(600,180, 150, 30);
	btn2.setBackground(new Color(244,244,244));

	add(btn2);
	btn2.addActionListener(this);
	
	btn3=new JButton("뒤로가기");
	btn3.setBounds(800,350, 100, 30);
	btn3.setBackground(new Color(244,244,244));

	add(btn3);
	btn3.addActionListener(this);
	
	
	jta=new JTextArea();
	jta.setBounds(120, 220, 600, 100);
	add(jta);
	
	setSize(1000, 500);
	setVisible(true);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}
	ArrayList<String> food = new ArrayList<>();
	String name="";
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn) {
			Collections.shuffle(food);
			String get_food=food.get(0);
			jtf3.setText(get_food);
		}
		if(e.getSource()==btn1) {
			
			String a=null;
			a=jtf1.getText();
			food.add(a);
			JOptionPane.showMessageDialog(null, a+"입력하였습니다");
			
			
		}
		
		if(e.getSource()==btn2)
		{
			for(int i=0;i<food.size();i++)
			{
				
				name+=" "+food.get(i);
				jta.setText(name);
			}
		}
		if(e.getSource()==btn3)
		{
			new Menu(null);
			this.setVisible(false);
		}
		
	

		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new random();
	}

}
