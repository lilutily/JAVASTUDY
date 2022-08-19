package javaapp.thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Gallery extends JFrame{
	JPanel p_controller;
	JPanel p_content;
	JButton bt_prev, bt_next, bt_auto;
	Image image;
	
	public Gallery() {
		
			/* 개발자가 컴포넌트를 그냥 사용하면, sun에서 이미 정해놓은 그림을 이용하게 된다
			 * 하지만 개발자가 이 그림을 커스터마이징도 할 수 있는데, 이때 오버라이드 해야 할 메서드가
			 * 바로 paint 메서드이다
			 * */
	
		p_controller = new JPanel();
		loadImage(); // 이미지를 먼저 로드해야 그림그릴게 있지않을까?
		p_content = new JPanel() {
			// 아래의 메서드를 재정의하는 순강부터는 개발자가 그린그림을 우선시 해준다
			// 결론 : paint 메서드의 호출시점은? 다시 그려져야 할때
			public void paint(Graphics g) {
				System.out.println("내 코드로 그림을 주도한다"); 
				
				g.drawImage(image, 0, 0, 600, 500, p_controller);
				}
			};
		bt_prev = new JButton("이전");
		bt_next = new JButton("다음");
		bt_auto = new JButton("auto");
		
		// 스타일 적용
		p_controller.setPreferredSize(new Dimension(600,50));
		p_controller.setBackground(Color.CYAN);
		p_content.setPreferredSize(new Dimension(600,500));
		p_content.setBackground(Color.YELLOW);
		
		
		// 배치관리자 적용
		setLayout(new FlowLayout());
		// 조립
		p_controller.add(bt_prev);
		p_controller.add(bt_next);
		p_controller.add(bt_auto);
		add(p_controller);
		add(p_content);
		
		
		// 윈도우 속성
		setLocationRelativeTo(null); // 화면 가운데로 윈도우창을 띄운다
		setSize(600,550);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void loadImage() {
		// json로컬 파일로 부터 이미지 정보를 얻어와 Image 객체생성하기
		// data.json이 패키지경로에 있을때 파일에 접근하는 방법을 알아보자
		// URL url = this.getClass().getResource("/javaseapp/res/data.json");
		
		File file= new File("C:/Users/user/jsp_workspace/javaapp/src/javaseapp/res/data.json");
		FileReader reader = null;
		
			try {
				JSONParser jsonParser= new JSONParser();		
				reader=new FileReader(file);
				
				JSONObject jsonObject= (JSONObject) jsonParser.parse(reader); // json 파일을 파싱시도
				JSONArray jsonArray = (JSONArray) jsonObject.get("marvel"); // key값으로 데이터 접근
				
				JSONObject movieJson= (JSONObject) jsonArray.get(1); // 배열의 0번째 요소 접근
				System.out.println(movieJson.get("url"));
				
				URL url = new URL((String)movieJson.get("url"));
				image = ImageIO.read(url);
				
		
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(reader!=null) {
					try {
						reader.close();
					} catch (IOException e) {
						// TODO: handle exception
					}
				}
			}
			
			//
		

		
	/*	try {
			url = new URL("https://images-na.ssl-images-amazon.com/images/I/91qvAndeVYL._RI_.jpg");
			image = ImageIO.read(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
	}
	public static void main(String[] args) {
		new Gallery();
	}
}
