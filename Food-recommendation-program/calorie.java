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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class calorie extends JFrame implements ActionListener{

	JLabel jl, jl1,jl2,jl3,jl4,jl5,jl6; 
	JRadioButton rbtn1,rbtn2;
	JTextField jtf1,jtf2,jtf3;
	JTextArea jta;
	JButton btn1,btn2;
	JComboBox cb;
	String []subject= {"25","30","40"};// �޺��ڽ��� ���� �迭
	
	public calorie() {
	// TODO Auto-generated constructor stub
	super("����Į�θ� ���");
	setLayout(null);
	getContentPane().setBackground(new Color(153,102,255));//������ ����
	
	//�� ������Ʈ�� ��ġ,���� �� ����

	
	
	//�ؿ� ������(������Ʈ ��ġ �� ũ��, ����)
	jl=new JLabel("���� Į�θ� ���");
	jl.setBounds(150, 20,500,100);
	jl.setFont(new Font("",Font.BOLD,60));
	jl.setForeground(Color.white);

	add(jl);
	
	
	jl1=new JLabel("����  :");
	jl1.setBounds(120, 100, 100, 100);
	jl1.setFont(new Font("",Font.BOLD,20));
	jl1.setForeground(Color.white);

	add(jl1);
	
	rbtn1=new JRadioButton("��");				
	rbtn1.setBounds(230, 120, 50, 50);
	rbtn1.setBackground(new Color(153,102,255));
	rbtn1.setForeground(Color.white);
	rbtn1.setFont(new Font("",Font.BOLD,15));

	rbtn2=new JRadioButton("��");
	rbtn2.setBounds(330, 120, 50, 50);
	rbtn2.setBackground(new Color(153,102,255));
	rbtn2.setForeground(Color.white);
	rbtn2.setFont(new Font("",Font.BOLD,15));

	ButtonGroup bg=new ButtonGroup();
	
	bg.add(rbtn1);
	bg.add(rbtn2);
	add(rbtn1);
	add(rbtn2);
	
	jl2=new JLabel("Ű  :");
	jl2.setBounds(140,200,100,100);
	jl2.setFont(new Font("",Font.BOLD,20));
	jl2.setForeground(Color.white);

	add(jl2);
	
	jtf1=new JTextField(20);
	jtf1.setBounds(230, 240, 100, 30);
	

	add(jtf1);
	
	jl6=new JLabel("(m ����)");
	jl6.setBounds(340, 240, 100, 30);
	jl6.setForeground(Color.white);

	add(jl6);
	
	jl3=new JLabel("Ȱ������  :");
	jl3.setBounds(80,300,120,100);
	jl3.setFont(new Font("",Font.BOLD,20));
	jl3.setForeground(Color.white);

	add(jl3);
	
	cb=new JComboBox(subject);
	cb.setBounds(230,335, 200, 30);
	add(cb);

	btn1=new JButton("Ȯ��");
	btn1.setBounds(200, 420, 80, 30);
	btn1.setBackground(new Color(244,244,244));

	add(btn1);
	btn1.addActionListener(this);
	
	btn2=new JButton("�ڷΰ���");
	btn2.setBounds(450, 530, 100, 30);
	btn2.setBackground(new Color(244,244,244));

	add(btn2);
	btn2.addActionListener(this);
	
	
	jl4=new JLabel("�����  :");
	jl4.setBounds(80,500,120,100);
	jl4.setFont(new Font("",Font.BOLD,20));
	jl4.setForeground(Color.white);

	add(jl4);
	
	jtf3=new JTextField(10);
	jtf3.setBounds(230, 530, 100, 30);
	add(jtf3);
	
	
	setSize(800, 800);
	setVisible(true);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			String a;
			double b;
			a=jtf1.getText();
			b=Double.parseDouble(a);
									
			Object q;
			int w;
			q=cb.getSelectedItem();
			w=Integer.parseInt((String) q);//Ȱ������ int�� ����
				
			double p;
			String o = null;  
			
			if(rbtn1.isSelected()) 
			{
				
				p=b*b*22*w; //���� ǥ�� ü��=Ű*Ű*22
				
				o=String.valueOf(p);
				jtf3.setText(o);
			}
			else	
			{
				p=b*b*21*w;//���� ǥ�� ü��=Ű*Ű*21
				o=String.valueOf(p);
				jtf3.setText(o);
			}
			
		}
		if(e.getSource()==btn2)
		{
			this.setVisible(false);
			new Menu(null);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calorie();
	}

}
