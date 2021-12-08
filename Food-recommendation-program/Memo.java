package javaproject;

import javax.swing.*;


import javaproject.Main;

import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class Memo extends JFrame implements ActionListener{     
    
	
	public Memo() {
		// TODO Auto-generated constructor stub
		
		//각 컴포넌트의 위치,색상 등 지정
		 JFrame f = new JFrame("메모장");  
	            
	        
	        JTextArea t = new JTextArea(); //메모하는 곳     
	        f.add(t);
	        
	        f.setVisible(true);
	        
	        JMenuBar m = new JMenuBar();//메뉴바
	        f.setJMenuBar( m );
	         
	        JMenu m_file = new JMenu("파일");//메뉴바 목록
	        m.add( m_file);
	        
	        JButton  btn=new JButton("뒤로가기");
	        
	        m.add(btn);
	       
	        
	        JMenuItem i_save = new JMenuItem("저장");//파일 목록 (저장)
	        JMenuItem i_load = new JMenuItem("로드");//파일 목록 (로드)     
	        m_file.add( i_save);
	        m_file.add( i_load);
		
	        i_save.addActionListener(new ActionListener() {
	             
	            public void actionPerformed(ActionEvent e) {
	                //파일 저장하기
	                FileDialog dialog = new FileDialog(f, "저장", FileDialog.SAVE);           
	                //현재 파일 저장하기
	                dialog.setVisible(true);    
	                String path = dialog.getDirectory() + dialog.getFile();
	                
	                try {
	                   
	                   FileWriter w = new FileWriter( path );
	                   String s = t.getText();
	                   s = s.replace("\n","\r\n");
	                   w.write( s  ); 
	                   w.close();
	           
	                } catch (Exception e2) {
	                
	                    System.out.println("저장오류"+e2);
	                }  
	            }            
	        }); 
	        
	        i_load.addActionListener(new ActionListener() {
	             
	            public void actionPerformed(ActionEvent e) {
	                            //파일 가져오기
	                   FileDialog dialog = new FileDialog(f, "로드", FileDialog.LOAD);
	                   dialog.setFile("*.txt;");
	                   dialog.setVisible(true);       //선택한 파일 열기 
	                   
	                   String path = dialog.getDirectory() + dialog.getFile();                 
	                   String s ="";
	                   
	                   if( dialog.getFile() == null ) return;
	                           
	                   try {
	                      
	                      FileReader r = new FileReader( path );
	                      
	                      int k;              
	                      
	                      for( ;  ; ) {
	                       
	                          k = r.read();
	                          if( k == -1) break;
	                          s += (char)k;               
	                      }           
	                      
	                      r.close();
	               
	                   } catch (Exception e2) {
	                   
	                       System.out.println("오류"+e);
	                   } 
	                   
	                   t.setText(s);   
	            }            
	        }); 
	        f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	        f.setSize(350,250);
	        //setVisible(true);
	        f.setLocationRelativeTo(null);
			f.setResizable(false);           
			
			 
		        btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==btn)
						{
							
							
							f.setVisible(false);
							new SwingCalendar();
						}
						
					}
				});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}   
    public static void main(String[] args) {                  
                
               
               new Memo(); 
        
        
    }
	
    
}

 