package javaproject;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends JFrame implements ActionListener {

	JLabel jl1;
	JButton btn1,btn2,btn3,btn4;
	JPanel jp;
	Image img=new ImageIcon("C:\\Users\\USER\\Desktop\\2학년 2학기\\자바\\자료/5.png").getImage();
	
	
	
	public Main() {
		// TODO Auto-generated constructor stub
	super("음식추천 프로그램 실행");
	setLayout(null);
	
	this.getContentPane().setBackground(new Color(153,102,255));//프레임 색상
	
	//각 컴포넌트의 위치,색상 등 지정
	
	jl1=new JLabel("음식 추천 프로그램");
	jl1.setBounds(180, 50, 500, 100);
	jl1.setFont(new Font("",Font.BOLD,40));
	jl1.setForeground(Color.white);
	add(jl1);
	
	btn1=new JButton("로그인");
	btn1.setBounds(270, 300, 120, 70);
	btn1.setBackground(new Color(244,244,244));
	add(btn1);
	btn1.addActionListener(this);
	
	btn2=new JButton("회원가입");
	btn2.setBounds(270, 220, 120, 70);
	btn2.setBackground(new Color(244,244,244));

	add(btn2);
	btn2.addActionListener(this);
	
	btn3=new JButton("끝내기");
	btn3.setBounds(270, 380, 120, 70);
	btn3.setBackground(new Color(244,244,244));
	add(btn3);
	btn3.addActionListener(this);
	
	btn4=new JButton("로그인이 안될시 클릭");
	btn4.setBounds(400, 380, 160, 70);
	btn4.setBackground(new Color(244,244,244));
	add(btn4);
	btn4.addActionListener(this);
	
	setSize(700, 700);
	setVisible(true);
	setLocationRelativeTo(null);//윈도우창을 화면 가운데로 띄우는 역할
	setResizable(false);//윈도우창의 크기를 조절 못하는 역할
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btn1)//로그인 버튼을 누르면 로그인 창으로 가면서 현재창을 닫음
		{
			new login();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn2)//회원가입 버튼을 누르면 회원가입 창으로 가면서 현재창을 닫음
		{
			new SignUp();
			this.setVisible(false);
			
		}
		
		if(e.getSource()==btn3)//현재창을 닫
		{
			
			this.setVisible(false);
			
		}
		if(e.getSource()==btn4)//현재창을 닫
		{
			
			new Menu(null);
			this.setVisible(false);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
