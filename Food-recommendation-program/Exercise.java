package javaproject;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercise extends JFrame implements ActionListener{
	JLabel jl, jl1,jl2,jl3,jl4; 
	JTextField jtf1,jtf2,jtf3,jtf4;
	JTextArea jta;
	JButton btn1,btn2;
	JComboBox cb;
	String []subject= {"수영","뛰기","걷기","자전거","농구","야구"};// 콤보박스에 넣을 운동들
	
	public Exercise() {
		// TODO Auto-generated constructor stub
		super("운동별 칼로리 계산");
		setLayout(null);
		this.getContentPane().setBackground(new Color(153,102,255));//프레임 색상
		
		//각 컴포넌트의 위치,색상 등 지정

		jl=new JLabel("운동별 칼로리 계산");
		jl.setBounds(130, 20,800,100);
		jl.setFont(new Font("",Font.BOLD,60));
		jl.setForeground(Color.white);

		add(jl);
		
		
		jl1=new JLabel("몸무게를 입력하세요  :");
		jl1.setBounds(100, 150, 300, 100);
		jl1.setFont(new Font("",Font.BOLD,20));
		jl1.setForeground(Color.white);

		add(jl1);
		

		jtf1=new JTextField(20);//사용자의 몸무게 입력하는 텍스트필드
		jtf1.setBounds(335, 185, 100, 30);

		add(jtf1);
		
		jl2=new JLabel("운동을 선택하세요  :");
		jl2.setBounds(100,250,300,100);
		jl2.setFont(new Font("",Font.BOLD,20));
		jl2.setForeground(Color.white);

		add(jl2);
		
		cb=new JComboBox(subject);//운동을 선택하는 콤보박스
		cb.setBounds(300,285, 200, 30);
		add(cb);
		
		jl4=new JLabel("운동시간을 입력하세요(분)  :");
		jl4.setBounds(100,350,300,100);
		jl4.setFont(new Font("",Font.BOLD,20));
		jl4.setForeground(Color.white);

		add(jl4);
		
		jtf2=new JTextField(20);//사용자가 운동한 시간을 입력하는 텍스트필드
		jtf2.setBounds(355, 387, 100, 30);
		
		add(jtf2);

		btn1=new JButton("확인");
		btn1.setBounds(500, 387, 80, 30);
		btn1.setBackground(new Color(244,244,244));

		add(btn1);
		btn1.addActionListener(this);
		
		jl3=new JLabel("칼로리 계산값  :");
		jl3.setBounds(100,450,300,100);
		jl3.setFont(new Font("",Font.BOLD,20));
		jl3.setForeground(Color.white);

		add(jl3);
		
		jtf3=new JTextField(20);//사용자가 입력한 정보들을 받아 계산된 칼로리값을 출력하는 텍스트필드
		jtf3.setBounds(270, 485, 100, 30);
		add(jtf3);
		
		btn2=new JButton("뒤로가기");
		btn2.setBounds(500, 480, 100, 30);
		btn2.setBackground(new Color(244,244,244));

		add(btn2);
		btn2.addActionListener(this);
		
	setSize(800, 800);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setResizable(false);
	
	}
	@Override
 
 	public void actionPerformed(ActionEvent e) {
 		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			String a;;//사용자가 입력한 몸무게를 받아올 변수
			double b;//위에서 받아온 문자열을 계산하기위해 더블형으로 표현하기에 필요한 변수
			a=jtf1.getText();;//입력한 텍스트필드값을 문자열로 변환
			b=Double.parseDouble(a);//받아온문자열을 더블형으로 변환
	         
			
			String c;
			double d;
			c=jtf2.getText();
			d=Double.parseDouble(c);
			
			double g;//사용자가 입력한 정보들을받아 계산된 값을 저장하려는 변수
			String f=null;//계산된변수를 텍스트필드로 넣기위해 문자열로 변환하는데 필요한 변수
			
			Object h;//콤보박스에서 선택한 값
			h=cb.getSelectedItem();
			double i=0;//운동들의 힘든정도를 나타낸값을 저장하는데 필요한 변수
			if(h=="수영") {
				i= 4;
				
			}
			else if  (h=="뛰기") {
				i=8 ;
		
			}
			else if(h=="걷기"){
				i=2;
			
			}
			else if(h=="야구"){
				i=5;
			
			}
			else if(h=="자전거"){
				i=4;
			
			}
			else if(h=="농구"){
				i=6;
			
			}
			
			
			
			g= (b*i*3.5)/200*d;//최종값계산식
			f=String.valueOf(g);//최종값을 문자열로변환
			jtf3.setText(f);}//최종값을 텍스트필드에 입력
			
		if(e.getSource()==btn2)
		{
			this.setVisible(false);
			new Menu(null);
		}
			
 	}
 	
 	
 	
 	
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise();
}
}
