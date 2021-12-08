package javaproject;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;



public class Random1 extends JFrame implements ActionListener{

	JLabel lbl1,lbl2,lbl7;
	JTextField tf1,tf2;
	JButton btn1,btn2;
	
	public Random1() {
		// TODO Auto-generated constructor stub
	super("음식추천");
	setLayout(null);
	this.getContentPane().setBackground(new Color(153,102,255));//프레임 색상
	
	//각 컴포넌트의 위치,색상 등 지정

	lbl1=new JLabel("칼로리에 맞는 음식 추천");
	lbl1.setBounds(50, 40, 450, 170);
	lbl1.setFont(new Font("",Font.BOLD,30));
	lbl1.setForeground(Color.white);

	add(lbl1);
	
	lbl2=new JLabel("칼로리입력 ");
	lbl2.setBounds(100, 200, 100, 80);
	lbl2.setForeground(Color.white);

	add(lbl2);
	
	
	tf1=new JTextField();//칼로리 값 입력하는 텍스트 필드
	tf1.setBounds(200, 230, 100, 20);
	add(tf1);
	
	
	btn1=new JButton("검색");
	btn1.setBounds(100, 400, 100, 30);
	btn1.setBackground(new Color(244,244,244));

	add(btn1);
	btn1.addActionListener(this);
	
	btn2=new JButton("취소");
	btn2.setBounds(220, 400, 100, 30);
	btn2.setBackground(new Color(244,244,244));

	add(btn2);
	btn2.addActionListener(this);
	
	lbl7 = new JLabel();
	lbl7.setBounds(100, 100, 500, 500);
	add(lbl7);
	
	setSize(500, 800);
	setVisible(true);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Connection con = null; 
	//	PreparedStatement pstmt = null;
//		ResultSet rs = null;
		
		if(e.getSource()==btn1)
		{
			String jdbc_url="jdbc:mysql://220.67.115.32:3306/stdt024"+"?serverTimezone=UTC";
			
			java.sql.Connection conn=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(jdbc_url, "stdt024", "jbw1219");
				System.out.println("데이터베이스에 접속했습니다.");
				Statement stmt;
				stmt=conn.createStatement();
				PreparedStatement pstmt;
				//sql문 칼로리 테이블에서 열량 0~?값안에 랜덤으로 1개 가져오기
				pstmt = conn.prepareStatement("SELECT 메뉴명,요리종류,열량 FROM 칼로리 WHERE 열량 < ? order by rand() LIMIT 1");
				//sql문 ?값 넣기
				String numStr1 = tf1.getText().trim();
				pstmt.setInt(1, Integer.parseInt(numStr1));
							
				ResultSet rs= pstmt.executeQuery();
				
				
				
	
				
				
				while(rs.next())
				{
					//lbl7에 sql문결과 메뉴명 요리종류 열량 표시
					String menu=rs.getString("메뉴명");
					String kinds=rs.getString("요리종류");
					String ka=rs.getString("열량");
				       
					System.out.println(menu+kinds+ka);
					lbl7.setText(menu+"         "+kinds+"         "+ka);

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
		if(e.getSource()==btn2)
		{
			Menu mm=new Menu("");
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Random1();
	}

}
