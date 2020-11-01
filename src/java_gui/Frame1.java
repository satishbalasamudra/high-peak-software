package java_gui;

import java.awt.EventQueue;
import java.io.*;
import java.util.regex.Matcher;

import javax.swing.JFrame;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String stt="ok";
		StringBuilder sb= new StringBuilder(stt);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
					File file = new File("E:\\sss\\stat.txt"); 
					  
					  BufferedReader br = new BufferedReader(new FileReader(file)); 
					  
					  String st; 
					
					  while ((st = br.readLine()) != null) 
					  {
						 
						  
					      /*  // Copy character by character into array 
					        for (int i = 0; i < st.length(); i++) { 
					            ch[i] = st.charAt(i); 
					        } 
						  */
						  sb.append(st);
					 //   System.out.println(st); 
					
					  }
					  br.close();
					  char[] ch = new char[sb.length()]; 
					  
				        // Copy character by character into array 
				        for (int i = 0; i < sb.length(); i++) { 
				            ch[i] = sb.charAt(i); 
				        } 
					  //System.out.println(ch); 
					 String satish=new String(ch);
					 satish = satish.replaceAll("[^\\d]", " "); 
					  
				        // Remove extra spaces from the beginning 
				        // and the ending of the string 
					 satish = satish.trim(); 
				  
				        // Replace all the consecutive white 
				        // spaces with a single space 
					 satish = satish.replaceAll(" +", " "); 
					 System.out.println(satish); 
					 
					 ///////////////////////////////////////////////////
					 char[] ch2 = new char[satish.length()]; 
					 for (int i = 0; i < satish.length(); i++) { 
				            ch2[i] = satish.charAt(i); 
				        } 
				
					 char[] chc1 = new char[7]; 
					 char[] chc2 = new char[7]; 
					 char[] chc3 = new char[7]; 
					 char[] chc4 = new char[7]; 
					 char[] chc5 = new char[7]; 
					 char[] chc6 = new char[7]; 
					 char[] chc7 = new char[7]; 
					 char[] chc8 = new char[7]; 
					 char[] chc9 = new char[7]; 
					 char[] chc10 = new char[7]; 
					 char[] chc11 = new char[7]; 
					int x=0;
					
					for(int i=0;i<satish.length();i++)				
					{
						chc1[i]=ch2[i];
						x=i;
						if(ch2[i]==' ')
						
							break;	
						
					}
					int y=0;
					for(int i=2;i<satish.length();i++)				
					{
						chc2[i]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
				 
					for(int i=7;i<satish.length();i++)				
					{
						
						chc3[y]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
					x++;
					for(int i=x;i<satish.length();i++)				
					{
						
						chc4[y]=ch2[i];
						y++;
						
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
					x++;
					for(int i=x;i<satish.length();i++)				
					{
						chc5[y]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
					x++;
					for(int i=x;i<satish.length();i++)				
					{
						chc6[y]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
					x++;
					for(int i=x;i<satish.length();i++)				
					{
						chc7[y]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
					x++;
					for(int i=x;i<satish.length();i++)				
					{
						chc8[y]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
					x++;
					for(int i=x;i<satish.length();i++)				
					{
						chc9[y]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
					x++;
					for(int i=x;i<satish.length();i++)				
					{
						chc10[y]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					y=0;
					x++;
					for(int i=x;i<satish.length();i++)				
					{
						chc11[y]=ch2[i];
						y++;
						x=i;
						if(ch2[i]==' ')
							break;							
					}
					
					System.out.println(chc11); 
					
					String str1 = new String(chc1);
					String str2 = new String(chc2);
					String str3 = new String(chc3);
					String str4 = new String(chc4);
					String str5 = new String(chc5);
					String str6 = new String(chc6);
					String str7 = new String(chc7);
					String str8 = new String(chc8);
					String str9 = new String(chc9);
					String str10 = new String(chc10);
					String str11 = new String(chc11);
					/*int i=Integer.parseInt(str1);  
					/*int num2=Integer.parseInt(str2);
					int num3=Integer.parseInt(str3);
					int num4=Integer.parseInt(str4);
					int num5=Integer.parseInt(str5);
					int num6=Integer.parseInt(str6);
					int num7=Integer.parseInt(str7);
					int num8=Integer.parseInt(str8);
					int num9=Integer.parseInt(str9);
					int num10=Integer.parseInt(str10);
					int num111=Integer.parseInt(str11);*/
					
					/////////////////////////////
					//int number = Integer.parseInt(new String(chc11));
					int num=89;
					System.out.println(num); 
				} catch (Exception e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
