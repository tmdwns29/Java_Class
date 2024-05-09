import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class test extends JFrame {
	public test() { // 생성자
		setSize(400, 300);
		
		// 창 닫을 시 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane(); // 컨테이너 선언
		cp.setBackground(Color.ORANGE); // 창 배경색 지정
		//cp.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 100));
		//cp.setLayout(new BorderLayout(50, 20));
		cp.setLayout(new GridLayout(2, 5));
		//cp.setLayout(null);
		/*
		for (int i=0; i<10; i++) {
			Button btn2 = new Button(Integer.toString(i));
			btn2.setLocation(i*20, i*20);
			btn2.setSize(100, 30);
			cp.add(btn2);
		}
		*/
		/*
		Button btn = new Button("Continue");
		btn.setLocation(100, 50);
		
		btn.setSize(150, 100);
		cp.add(btn);
		*/
		
		
		for (int i=0; i<10; i++) {
			String t = Integer.toString(i);
			Button btn2 = new Button(t);
			cp.add(btn2);
		}
		
		/*
		cp.add(new Button("OK"), BorderLayout.EAST);
		cp.add(new Button("Cancel"), BorderLayout.WEST);
		cp.add(new Button("Retry"), BorderLayout.NORTH);
		cp.add(new Button("Exit"), BorderLayout.SOUTH);
		cp.add(new Button("Continue"), BorderLayout.CENTER);
		*/
		
		setVisible(true); // 프레임을 화면에 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test T = new test(); // test 클래스의 객체 T 생성
	}
	
}
