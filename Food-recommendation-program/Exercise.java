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
	String []subject= {"����","�ٱ�","�ȱ�","������","��","�߱�"};// �޺��ڽ��� ���� ���
	
	public Exercise() {
		// TODO Auto-generated constructor stub
		super("��� Į�θ� ���");
		setLayout(null);
		this.getContentPane().setBackground(new Color(153,102,255));//������ ����
		
		//�� ������Ʈ�� ��ġ,���� �� ����

		jl=new JLabel("��� Į�θ� ���");
		jl.setBounds(130, 20,800,100);
		jl.setFont(new Font("",Font.BOLD,60));
		jl.setForeground(Color.white);

		add(jl);
		
		
		jl1=new JLabel("�����Ը� �Է��ϼ���  :");
		jl1.setBounds(100, 150, 300, 100);
		jl1.setFont(new Font("",Font.BOLD,20));
		jl1.setForeground(Color.white);

		add(jl1);
		

		jtf1=new JTextField(20);//������� ������ �Է��ϴ� �ؽ�Ʈ�ʵ�
		jtf1.setBounds(335, 185, 100, 30);

		add(jtf1);
		
		jl2=new JLabel("��� �����ϼ���  :");
		jl2.setBounds(100,250,300,100);
		jl2.setFont(new Font("",Font.BOLD,20));
		jl2.setForeground(Color.white);

		add(jl2);
		
		cb=new JComboBox(subject);//��� �����ϴ� �޺��ڽ�
		cb.setBounds(300,285, 200, 30);
		add(cb);
		
		jl4=new JLabel("��ð��� �Է��ϼ���(��)  :");
		jl4.setBounds(100,350,300,100);
		jl4.setFont(new Font("",Font.BOLD,20));
		jl4.setForeground(Color.white);

		add(jl4);
		
		jtf2=new JTextField(20);//����ڰ� ��� �ð��� �Է��ϴ� �ؽ�Ʈ�ʵ�
		jtf2.setBounds(355, 387, 100, 30);
		
		add(jtf2);

		btn1=new JButton("Ȯ��");
		btn1.setBounds(500, 387, 80, 30);
		btn1.setBackground(new Color(244,244,244));

		add(btn1);
		btn1.addActionListener(this);
		
		jl3=new JLabel("Į�θ� ��갪  :");
		jl3.setBounds(100,450,300,100);
		jl3.setFont(new Font("",Font.BOLD,20));
		jl3.setForeground(Color.white);

		add(jl3);
		
		jtf3=new JTextField(20);//����ڰ� �Է��� �������� �޾� ���� Į�θ����� ����ϴ� �ؽ�Ʈ�ʵ�
		jtf3.setBounds(270, 485, 100, 30);
		add(jtf3);
		
		btn2=new JButton("�ڷΰ���");
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
			String a;;//����ڰ� �Է��� �����Ը� �޾ƿ� ����
			double b;//������ �޾ƿ� ���ڿ��� ����ϱ����� ���������� ǥ���ϱ⿡ �ʿ��� ����
			a=jtf1.getText();;//�Է��� �ؽ�Ʈ�ʵ尪�� ���ڿ��� ��ȯ
			b=Double.parseDouble(a);//�޾ƿ¹��ڿ��� ���������� ��ȯ
	         
			
			String c;
			double d;
			c=jtf2.getText();
			d=Double.parseDouble(c);
			
			double g;//����ڰ� �Է��� ���������޾� ���� ���� �����Ϸ��� ����
			String f=null;//���Ⱥ����� �ؽ�Ʈ�ʵ�� �ֱ����� ���ڿ��� ��ȯ�ϴµ� �ʿ��� ����
			
			Object h;//�޺��ڽ����� ������ ��
			h=cb.getSelectedItem();
			double i=0;//����� ���������� ��Ÿ������ �����ϴµ� �ʿ��� ����
			if(h=="����") {
				i= 4;
				
			}
			else if  (h=="�ٱ�") {
				i=8 ;
		
			}
			else if(h=="�ȱ�"){
				i=2;
			
			}
			else if(h=="�߱�"){
				i=5;
			
			}
			else if(h=="������"){
				i=4;
			
			}
			else if(h=="��"){
				i=6;
			
			}
			
			
			
			g= (b*i*3.5)/200*d;//����������
			f=String.valueOf(g);//�������� ���ڿ��κ�ȯ
			jtf3.setText(f);}//�������� �ؽ�Ʈ�ʵ忡 �Է�
			
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
