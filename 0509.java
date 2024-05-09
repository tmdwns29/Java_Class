import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class test ______ JFrame {
	public ______() { // 생성자
		setSize(400, 300);
		
		// 창 닫을 시 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane(); // 컨테이너 선언
		______.setBackground(______.ORANGE); // 창 배경색 지정
		//cp.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 100));
		cp.setLayout(______ BorderLayout(50, 20));
		
		cp.add(new Button("OK"), BorderLayout.EAST);
		cp.add(new Button("Cancel"), BorderLayout.WEST);
		cp.add(new Button("Retry"), BorderLayout.NORTH);
		cp.add(new Button("Exit"), BorderLayout.SOUTH);
		cp.add(new Button("Continue"), BorderLayout.CENTER);
		
		setVisible(true); // 프레임을 화면에 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test T = new test(); // test 클래스의 객체 T 생성
	}
	
}
