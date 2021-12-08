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
	ArrayList<String> list1=new ArrayList<String>();//16�������� ����� �迭
	ArrayList<String> list2=new ArrayList<String>();//8�������� ����� �迭
	ArrayList<String> list3=new ArrayList<String>();//4������ ����� �迭,�����
	ArrayList<String> list4=new ArrayList<String>();//��������� ����� �迭,�����
	
	public void cup_16()//16����
	{
			Random rand=new Random();
		
			int randNum=rand.nextInt(food1.size()); //food1�� ũ�⸸ŭ �������� ������
			String randnum=food1.get(randNum);		
			jl1.setText(randnum);
		
			int randNum1=rand.nextInt(food1.size());
			if(randNum1==randNum)					//�ߺ� ����
			{
			randNum1=rand.nextInt(food1.size());
			}
		
			String randnum1=food1.get(randNum1);	
			jl2.setText(randnum1);
			
	}
	
	public void cup_8()//8�� ���� �Լ�
	{
		Random rand=new Random();
		
		int randNum=rand.nextInt(list1.size()); //list1�� ũ�⸸ŭ �������� ������
		
		String randnum=list1.get(randNum);		
		jl1.setText(randnum);
	
		int randNum1=rand.nextInt(list1.size());
		if(randNum1==randNum)					//�ߺ� ����
		{
		randNum1=rand.nextInt(list1.size());
		}
	
		String randnum1=list1.get(randNum1);	
		jl2.setText(randnum1);
		
		
	}
	public void cup_4()//4�� ���� �Լ�
	{
		Random rand=new Random();
		
		int randNum=rand.nextInt(list2.size()); //list2�� ũ�⸸ŭ �������� ������
		
		String randnum=list2.get(randNum);		
		jl1.setText(randnum);
	
		int randNum1=rand.nextInt(list2.size());
		if(randNum1==randNum)					//�ߺ� ����
		{
		randNum1=rand.nextInt(list2.size());
		}
	
		String randnum1=list2.get(randNum1);	
		jl2.setText(randnum1);
		
		
	}
	public void cup_2()//�ذ�� ���� �Լ�
	{
		Random rand=new Random();
		
		int randNum=rand.nextInt(list3.size()); //list3�� ũ�⸸ŭ �������� ������
		
		String randnum=list3.get(randNum);		
		jl1.setText(randnum);
	
		int randNum1=rand.nextInt(list3.size());
		if(randNum1==randNum)					//�ߺ� ����
		{
		randNum1=rand.nextInt(list3.size());
		}
	
		String randnum1=list3.get(randNum1);	
		jl2.setText(randnum1);
		
		
	}
	public void cup_1()//��� ���� �Լ�
	{
		
		String randnum=list4.get(0);		
		jl1.setText(randnum);
	
		
		String randnum1=list4.get(1);	
		jl2.setText(randnum1);
		
		
	}
	
	public void fun1()//��ư1 Ŭ���� ������ list1�迭�� ���� �ش� ������ �����Ѵ� 
	{
		
		
		String name1=null;
		name1=jl1.getText();
		list1.add(name1);
		food1.remove(name1);
		
	}
	
	public void fun2()//��ư2 Ŭ���� ������ list2�迭�� ���� �ش� ������ �����Ѵ� 
	{
		String name1=null;
		name1=jl2.getText();
		list1.add(name1);
		food1.remove(name1);
		
	}
	public void fun3()//��ư1 Ŭ���� ������ list2�迭�� ���� �ش� ������ �����Ѵ� 
	{
		String name1=null;
		name1=jl2.getText();
		list2.add(name1);
		list1.remove(name1);
		
	}
	public void fun4()//��ư2 Ŭ���� ������ list2�迭�� ���� �ش� ������ �����Ѵ� 
	{
		String name1=null;
		name1=jl2.getText();
		list2.add(name1);
		list1.remove(name1);
		
	}
	public void fun5()//��ư1 Ŭ���� ������ list3�迭�� ���� �ش� ������ �����Ѵ� 
	{ 
		String name1=null;
		name1=jl2.getText();
		list3.add(name1);
		list2.remove(name1);
		
	}
	public void fun6()//��ư2 Ŭ���� ������ list3�迭�� ���� �ش� ������ �����Ѵ� 
	{
		String name1=null;
		name1=jl2.getText();
		list3.add(name1);
		list2.remove(name1);
		
	}
	public void fun7()//��ư1 Ŭ���� ������ list4�迭�� ���� �ش� ������ �����Ѵ� 
	{
		String name1=null;
		name1=jl2.getText();
		list4.add(name1);
		list3.remove(name1);
		
	}
	public void fun8()//��ư2 Ŭ���� ������ list4�迭�� ���� �ش� ������ �����Ѵ� 
	{
		String name1=null;
		name1=jl2.getText();
		list4.add(name1);
		list3.remove(name1);
		
	}
	
	
	
	WorldCup() {
		// TODO Auto-generated constructor stub
		super("���� ������");
		setLayout(null);
		this.getContentPane().setBackground(new Color(153,102,255)); //������ ����
		
		//������Ʈ�� ��ġ,���� �� ����

	
	lbl1=new JLabel("���� ������");
	lbl1.setBounds(260, 50, 200, 100);
	lbl1.setFont(new Font("",Font.BOLD,30));
	lbl1.setForeground(Color.white);

	add(lbl1);
	
	jl1=new JLabel("");
	jl1.setBounds(70, 170, 250, 100);
	jl1.setFont(new Font("",Font.BOLD,40));
	jl1.setForeground(Color.white);

    add(jl1);
    
    btn1=new JButton("Ȯ��");
    btn1.setBounds(100,320,70,30);
	btn1.setBackground(new Color(244,244,244));

    add(btn1);
    
    
    jl2=new JLabel("");
    jl2.setBounds(450, 170, 250, 100);
	jl2.setFont(new Font("",Font.BOLD,40));
	jl2.setForeground(Color.white);

	add(jl2);
	
	btn2=new JButton("Ȯ��");
    btn2.setBounds(500,320,70,30);
	btn2.setBackground(new Color(244,244,244));

    add(btn2);
	
	lbl2=new JLabel("�����Ϸ��� OK��ư�� ��������=>");
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
	
	lbl5=new JLabel("��");
	lbl5.setBounds(150, 520, 100, 50);
	lbl5.setFont(new Font("",Font.BOLD,30));
	lbl5.setForeground(Color.white);


	add(lbl5);
	
	btn3=new JButton("OK");
	btn3.setBounds(550, 520, 100, 50);
	btn3.setBackground(new Color(244,244,244));

    add(btn3);
	
    btn4=new JButton("�ڷΰ���");
	btn4.setBounds(550, 600, 100, 50);
	btn4.setBackground(new Color(244,244,244));

    add(btn4);
	
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);
	btn4.addActionListener(this);
	
	//food1 arratlist�� �ִ´�
	food1.add("�Ұ��");
	food1.add("ġŲ");
	food1.add("����");
	food1.add("����");
	food1.add("��������");
	food1.add("���");
	food1.add("Į����");
	food1.add("���");
	food1.add("�߰�ⵤ��");
	food1.add("�ܹ���");
	food1.add("��ġ�");
	food1.add("������");
	food1.add("�������");
	food1.add("«��");
	food1.add("����");
	food1.add("�ʹ�");
	food1.add("��ġ����");
	food1.add("������");
	food1.add("�ұ���");
	food1.add("�����");
	food1.add("�佺Ʈ");
	food1.add("������");
	food1.add("�����");
	food1.add("���");
	food1.add("������ũ");
	food1.add("���İ�Ƽ");
	food1.add("�ָԹ�");
	food1.add("������");
	food1.add("��ġ������");
	
	setSize(700, 700);
	setVisible(true);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
		
	int sum=16;//16,8,4 ���� ���� ����
	static int count=0;//Ȯ�ι�ư�� Ŭ���� ���� �˱� ���� ����
	int time=0;//ok��ư�� Ŭ���� ���� �˱� ���� ����
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1)
		{
			count++;
			if(count>0&&count<=16)//count�� 1�̻� 16�����̸� fun1()����
			{
				fun1();
			}
			else if(count>16&&count<=24)//count�� 17�̻� 24�����̸� fun3()����
			{		
				fun3();
								
			}
			else if(count>24&&count<=28)//count�� 25�̻� 28�����̸� fun5()����
			{
				fun5();
			}
			else if(count>28&&count<=30)//count�� 29�̻� 30�����̸� fun7()����
			{
				fun7();
			}
			else if(count>30)//count�� 31�̻� ���������� �� ���� �޽����� �˷���
			{
				JOptionPane.showMessageDialog(btn1,"�����մϴ�!!!\n����� �԰� ���� ������ �ٷ�"+jl1.getText());

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
				JOptionPane.showMessageDialog(btn2,"�����մϴ�!!!\n����� �԰� ���� ������ �ٷ� "+ jl2.getText());
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
