package javaproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

public class SignUp extends JFrame implements ActionListener{

	JRadioButton rb1,rb2;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
	JTextField tf1,tf2,tf3,tf4;
	JButton btn1,btn2,btn3;
	
	
	
	public SignUp() {
		// TODO Auto-generated constructor stub

		
		
	super("회원가입");
	setLayout(null);
	this.getContentPane().setBackground(new Color(153,102,255));

	lbl1=new JLabel("<회원가입>");
	lbl1.setBounds(150, 40, 170, 80);
	lbl1.setFont(new Font("",Font.BOLD,30));
	lbl1.setForeground(Color.white);

	add(lbl1);

	
	lbl5=new JLabel("I D :");
	lbl5.setBounds(110, 150, 100, 80);
	lbl5.setForeground(Color.white);

	add(lbl5);
	
	lbl6=new JLabel("P W :");
	lbl6.setBounds(105, 180, 100, 80);
	lbl6.setForeground(Color.white);

	add(lbl6);
	
	tf2=new JTextField();
	tf2.setBounds(150, 180, 100, 20);
	add(tf2);
	
	tf3=new JTextField();
	tf3.setBounds(150, 210, 100, 20);
	add(tf3);
		
	
	btn1=new JButton("확인");
	btn1.setBounds(100, 400, 100, 30);
	btn1.setBackground(new Color(244,244,244));

	add(btn1);
	btn1.addActionListener(this);
	
	btn2=new JButton("취소");
	btn2.setBounds(220, 400, 100, 30);
	btn2.setBackground(new Color(244,244,244));

	add(btn2);
	btn2.addActionListener(this);
	

	btn3=new JButton("중복체크");
	btn3.setBounds(255, 178, 86, 20);
	btn3.setBackground(new Color(244,244,244));

	add(btn3);
	btn3.addActionListener(this);
	
	setSize(500, 500);
	setVisible(true);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	java.sql.PreparedStatement stmt=null;
	Connection conn=null;
	ResultSet rs=null;
	String jdbc_url="jdbc:mysql://220.67.115.32:3306/stdt077"+"?serverTimezone=UTC";
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1) //확인 버튼
		{
			//DB연동
			
			 String sqlInsert = "insert SIGNUP(ID, PASSWORD) values(?, ?);";

			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(jdbc_url, "stdt077", "chb1010");
				System.out.println("데이터베이스에 접속했습니다.");
				
				stmt=conn.prepareStatement(sqlInsert);
								
				String ID=tf2.getText().trim();
				String PASS=tf3.getText().trim();
								
				stmt.setString(1, ID);
				stmt.setString(2, PASS);
					
				int num = stmt.executeUpdate();	
										
				System.out.println("회원가입");
				System.out.println("이름\t"+"아이디\t"+"비밀번호\t");				
				System.out.println(ID+PASS);
		
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
			
			
			JOptionPane.showMessageDialog(this, "가입이 완료되었습니다.");
			
			new Main();
			this.setVisible(false);
			
			
			
		}
		
		if(e.getSource()==btn2)//취소버튼
		{
			new Main();
			this.setVisible(false);
		}
		
		if(e.getSource()==btn3)//아이디 중복 확인
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(jdbc_url, "stdt077", "chb1010");
				System.out.println("데이터베이스에 접속했습니다.");
				
				String sql="select ID from SIGNUP where ID=?";
				
				stmt=conn.prepareStatement(sql);
				
				
				String ID=tf2.getText().trim();
				
				
				
				stmt.setString(1, ID);
				
	
				rs=stmt.executeQuery();
				
				
				
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null, "아이디가 이미 있습니다.");
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "아이디를 사용할 수 있습니다.");
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
		}
		
		
		}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp();
	}

}
