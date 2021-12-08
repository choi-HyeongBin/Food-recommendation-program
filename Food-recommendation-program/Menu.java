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
		super("������õ���α׷�");
		setLayout(null);
		
		this.getContentPane().setBackground(new Color(153,102,255));//������ ����
		
		//�� ������Ʈ�� ��ġ,���� �� ����
		
		jl8=new JLabel("����� ID:");
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
		
		jl2=new JLabel("���� Į�θ� ���");
		jl2.setBounds(100,200,250,100);
		jl2.setFont(new Font("",Font.BOLD,30));
		jl2.setForeground(Color.white);

		
		add(jl2);
		
		jl3=new JLabel("Į�θ��� �´� ���� ��õ ");
		jl3.setBounds(100,300,450,100);
		jl3.setFont(new Font("",Font.BOLD,30));
		jl3.setForeground(Color.white);

		add(jl3);
		
		jl4=new JLabel("�Է¹��� ���� ��õ");
		jl4.setBounds(100,400,300,100);
		jl4.setFont(new Font("",Font.BOLD,30));
		jl4.setForeground(Color.white);

		add(jl4);
		
		jl5=new JLabel("��� Į�θ� ���");
		jl5.setBounds(100,500,300,100);
		jl5.setFont(new Font("",Font.BOLD,30));
		jl5.setForeground(Color.white);

		add(jl5);
		
		jl6=new JLabel("���� ������");
		jl6.setBounds(100,600,200,100);
		jl6.setFont(new Font("",Font.BOLD,30));
		jl6.setForeground(Color.white);

		add(jl6);
		
		jl7=new JLabel("�޷�");
		jl7.setBounds(100,700,200,100);
		jl7.setFont(new Font("",Font.BOLD,30));
		jl7.setForeground(Color.white);

		add(jl7);
		
		
		
		btn1=new JButton("��");
		btn1.setBounds(470, 200, 100, 80);
		btn1.setFont(new Font("",Font.BOLD,30));
		btn1.setBackground(new Color(244,244,244));
		add(btn1);
		btn1.addActionListener(this);
		
		btn2=new JButton("��");
		btn2.setBounds(470, 300, 100, 80);
		btn2.setFont(new Font("",Font.BOLD,30));
		btn2.setBackground(new Color(244,244,244));
		add(btn2);
		btn2.addActionListener(this);
		
		btn3=new JButton("��");
		btn3.setBounds(470, 400, 100, 80);
		btn3.setFont(new Font("",Font.BOLD,30));
		btn3.setBackground(new Color(244,244,244));
		add(btn3);
		btn3.addActionListener(this);
		
		btn4=new JButton("��");
		btn4.setBounds(470, 500, 100, 80);
		btn4.setFont(new Font("",Font.BOLD,30));
		btn4.setBackground(new Color(244,244,244));
		add(btn4);
		btn4.addActionListener(this);
		
		btn5=new JButton("��");
		btn5.setBounds(470, 600, 100, 80);
		btn5.setFont(new Font("",Font.BOLD,30));
		btn5.setBackground(new Color(244,244,244));
		add(btn5);
		btn5.addActionListener(this);
		
		btn6=new JButton("��");
		btn6.setBounds(470, 700, 100, 80);
		btn6.setFont(new Font("",Font.BOLD,30));
		btn6.setBackground(new Color(244,244,244));
		add(btn6);
		btn6.addActionListener(this);
		
		btn7=new JButton("����");
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
		if(e.getSource()==btn1)//���� Į�θ� ��� ��ư�� ������ ���� Į�θ� ��� â���� ���鼭 ����â�� ����
		{
			new calorie();
			
			this.setVisible(false);
		}
		if(e.getSource()==btn2)//Į�θ��� �´����� ��õ ��ư�� ������ Į�θ��� �´����� ��õ â���� ���鼭 ����â�� ����
		{
			new Random1();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn3)//�Է¹��� ���� ��õ ��ư�� ������ �Է¹��� ���� ��õ â���� ���鼭 ����â�� ����
		{
			new random();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn4)//��� Į�θ� ��� ��ư�� ������ ��� Į�θ� ��� â���� ���鼭 ����â�� ����
		{
			new Exercise();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn5)//���� ������ ��ư�� ������ ���� ������ â���� ���鼭 ����â�� ����
		{
			new WorldCup();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn6)//�޷� ��ư�� ������ �޷� â���� ���鼭 ����â�� ����
		{
			
			new SwingCalendar();
			this.setVisible(false);

		}
		if(e.getSource()==btn7)//���� ��ư�� ������ ����â�� ����
		{
			
			this.setVisible(false);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menu(id);
	}

}
