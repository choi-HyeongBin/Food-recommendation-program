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
	Image img=new ImageIcon("C:\\Users\\USER\\Desktop\\2�г� 2�б�\\�ڹ�\\�ڷ�/5.png").getImage();
	
	
	
	public Main() {
		// TODO Auto-generated constructor stub
	super("������õ ���α׷� ����");
	setLayout(null);
	
	this.getContentPane().setBackground(new Color(153,102,255));//������ ����
	
	//�� ������Ʈ�� ��ġ,���� �� ����
	
	jl1=new JLabel("���� ��õ ���α׷�");
	jl1.setBounds(180, 50, 500, 100);
	jl1.setFont(new Font("",Font.BOLD,40));
	jl1.setForeground(Color.white);
	add(jl1);
	
	btn1=new JButton("�α���");
	btn1.setBounds(270, 300, 120, 70);
	btn1.setBackground(new Color(244,244,244));
	add(btn1);
	btn1.addActionListener(this);
	
	btn2=new JButton("ȸ������");
	btn2.setBounds(270, 220, 120, 70);
	btn2.setBackground(new Color(244,244,244));

	add(btn2);
	btn2.addActionListener(this);
	
	btn3=new JButton("������");
	btn3.setBounds(270, 380, 120, 70);
	btn3.setBackground(new Color(244,244,244));
	add(btn3);
	btn3.addActionListener(this);
	
	btn4=new JButton("�α����� �ȵɽ� Ŭ��");
	btn4.setBounds(400, 380, 160, 70);
	btn4.setBackground(new Color(244,244,244));
	add(btn4);
	btn4.addActionListener(this);
	
	setSize(700, 700);
	setVisible(true);
	setLocationRelativeTo(null);//������â�� ȭ�� ����� ���� ����
	setResizable(false);//������â�� ũ�⸦ ���� ���ϴ� ����
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btn1)//�α��� ��ư�� ������ �α��� â���� ���鼭 ����â�� ����
		{
			new login();
			
			this.setVisible(false);

		}
		if(e.getSource()==btn2)//ȸ������ ��ư�� ������ ȸ������ â���� ���鼭 ����â�� ����
		{
			new SignUp();
			this.setVisible(false);
			
		}
		
		if(e.getSource()==btn3)//����â�� ��
		{
			
			this.setVisible(false);
			
		}
		if(e.getSource()==btn4)//����â�� ��
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
