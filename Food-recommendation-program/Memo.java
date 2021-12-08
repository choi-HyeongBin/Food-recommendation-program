package javaproject;

import javax.swing.*;


import javaproject.Main;

import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class Memo extends JFrame implements ActionListener{     
    
	
	public Memo() {
		// TODO Auto-generated constructor stub
		
		//�� ������Ʈ�� ��ġ,���� �� ����
		 JFrame f = new JFrame("�޸���");  
	            
	        
	        JTextArea t = new JTextArea(); //�޸��ϴ� ��     
	        f.add(t);
	        
	        f.setVisible(true);
	        
	        JMenuBar m = new JMenuBar();//�޴���
	        f.setJMenuBar( m );
	         
	        JMenu m_file = new JMenu("����");//�޴��� ���
	        m.add( m_file);
	        
	        JButton  btn=new JButton("�ڷΰ���");
	        
	        m.add(btn);
	       
	        
	        JMenuItem i_save = new JMenuItem("����");//���� ��� (����)
	        JMenuItem i_load = new JMenuItem("�ε�");//���� ��� (�ε�)     
	        m_file.add( i_save);
	        m_file.add( i_load);
		
	        i_save.addActionListener(new ActionListener() {
	             
	            public void actionPerformed(ActionEvent e) {
	                //���� �����ϱ�
	                FileDialog dialog = new FileDialog(f, "����", FileDialog.SAVE);           
	                //���� ���� �����ϱ�
	                dialog.setVisible(true);    
	                String path = dialog.getDirectory() + dialog.getFile();
	                
	                try {
	                   
	                   FileWriter w = new FileWriter( path );
	                   String s = t.getText();
	                   s = s.replace("\n","\r\n");
	                   w.write( s  ); 
	                   w.close();
	           
	                } catch (Exception e2) {
	                
	                    System.out.println("�������"+e2);
	                }  
	            }            
	        }); 
	        
	        i_load.addActionListener(new ActionListener() {
	             
	            public void actionPerformed(ActionEvent e) {
	                            //���� ��������
	                   FileDialog dialog = new FileDialog(f, "�ε�", FileDialog.LOAD);
	                   dialog.setFile("*.txt;");
	                   dialog.setVisible(true);       //������ ���� ���� 
	                   
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
	                   
	                       System.out.println("����"+e);
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

 