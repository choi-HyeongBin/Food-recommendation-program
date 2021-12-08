package javaproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

public class login extends JFrame implements ActionListener{

	JLabel lbl1,lbl2,lbl3;
	JTextField id;
	JButton btn1,btn2;
	JPasswordField pw;
	
	static String ID,PW;

	
	public login() {
		// TODO Auto-generated constructor stub
	super("�α���");
	setLayout(null);
	this.getContentPane().setBackground(new Color(153,102,255));//������ ����
	
	//�� ������Ʈ�� ��ġ,���� �� ����
	
	lbl1=new JLabel("<�α���>");
	lbl1.setBounds(130, 50, 150, 100);
	lbl1.setFont(new Font("",Font.BOLD,30));
	lbl1.setForeground(Color.white);

	add(lbl1);
	
	lbl2=new JLabel("ID: ");
	lbl2.setBounds(80, 150, 100, 50);
	lbl2.setForeground(Color.white);

	add(lbl2);
	
	lbl3=new JLabel("PW: ");
	lbl3.setBounds(80, 200, 100, 50);
	lbl3.setForeground(Color.white);

	add(lbl3);
	
	id=new JTextField();
	id.setBounds(130, 165, 100, 20);
	add(id);
	
	pw=new JPasswordField();
	pw.setBounds(130, 215, 100, 20);
	add(pw);
	
	btn1=new JButton("Ȯ��");
	btn1.setBounds(100, 260, 80, 30);
	btn1.setBackground(new Color(244,244,244));

	add(btn1);
	btn1.addActionListener(this);
	
	btn2=new JButton("���");
	btn2.setBounds(185, 260, 80, 30);
	btn2.setBackground(new Color(244,244,244));

	add(btn2);
	btn2.addActionListener(this);
	
	setSize(400, 400);
	setVisible(true);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	java.sql.PreparedStatement stmt=null;
	Connection conn=null;
	ResultSet rs=null;
    String sql= "select * from SIGNUP where (ID=? and PASSWORD=?);";//ȸ���������̺��� �Է� ���� ID�� PASSWORD�� �˻��Ѵ�

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btn1)
		{
			
           
           
			
          //DB����
			String jdbc_url="jdbc:mysql://220.67.115.32:3306/stdt077"+"?serverTimezone=UTC";
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(jdbc_url, "stdt077", "chb1010");
				System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
				
				stmt=conn.prepareStatement(sql);
				
				
				ID=id.getText().trim();
				PW=pw.getText().trim();
				
				
				stmt.setString(1, ID);
				stmt.setString(2, PW);
	
				rs=stmt.executeQuery();
				
				
				
				
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null, "����");//ID�� PASSWORD�� ������ ���� �޽����� ���� ����â�� �ݰ� �޴� â���� �Ѿ��
					new javaproject.Menu(ID);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "����");//�����ϸ� ���и޽����� ����  ����â���� ���ƿ´�
					this.setVisible(true);
					
				}
				
				
				rs.close();	
				stmt.close();
				conn.close();
			} catch (ClassNotFoundException i) {
				// TODO Auto-generated catch block
				i.printStackTrace();
				System.out.println("ClassNotFoundException:"+i.getMessage());
			} catch (SQLException se) {
				// TODO Auto-generated catch block
				se.printStackTrace();
				System.out.println(se.getMessage());
			}
			
			new Menu();
           this.setVisible(false);
		}
		
		
		
		if(e.getSource()==btn2)//��� ��ư�� ������ ����â�� �ݰ� ����ȭ������ �Ѿ��
		{
			new Main(); 
			this.setVisible(false);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new login();
	}

}
