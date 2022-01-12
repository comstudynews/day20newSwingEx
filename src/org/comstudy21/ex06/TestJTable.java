package org.comstudy21.ex06;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.guiex.myframe.MyJFrame;

import static org.comstudy21.ex06.R.*;

// 도그마(dogma)에 빠지지 말라.
public class TestJTable extends MyJFrame {
	public TestJTable() {
		super("JTable 연습", 640, 480);
	}
	
	private void mkTableData() {
		columnNames = new Object[] {"IDX","USER","EMAIL","PHONE"};
		data = new Object[][] {
			{1, "hong","hong@naver.com","010-1234-5678"},
			{2, "kim","kim@naver.com","010-2222-2222"},
			{3, "lee","lee@naver.com","010-3333-3333"},
		};
	}
	
	protected void displayLayer() {
		mkTableData();
		contentPan = getContentPane();
		
		contentPan.add(BorderLayout.WEST, new LeftPane());
		contentPan.add(BorderLayout.SOUTH, new BottomPane());
		
		tbModel = new DefaultTableModel(data, columnNames);
		table = new JTable(tbModel);
		scrollPane = new JScrollPane(table);
		contentPan.add(scrollPane);
	}
	
	private void addRowDataTest() {
		tbModel.setDataVector(null, columnNames);
		tbModel.addRow(new Object[] {4, "aaa", "aaa@naver.com", "010-4444-4444"});
		tbModel.addRow(new Object[] {5, "bbb", "bbb@naver.com", "010-5555-5555"});
	}

	protected void actionEvent() {
		// 버튼 이벤트 핸들러 추가
		allBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> allBtn 클릭!");
			}
		});
		inputBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> inputBtn 클릭!");
			}
		});
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> searchBtn 클릭!");
			}
		});
		modifyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> modifyBtn 클릭!");
			}
		});
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> deleteBtn 클릭!");
			}
		});
		finishBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(TestJTable.this, "굿바이~");
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new TestJTable().setVisible(true);;
	}

}
