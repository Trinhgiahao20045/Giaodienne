/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package my.gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class DemoJTable extends JFrame{

    /**
     * @param args the command line arguments
     */
    private JTable tblsanpham;
    private JButton btthem;
     
    public DemoJTable(String title) {
        super (title);
        createGUI();
        processevent();
        
        setSize(800,500);
        setLocationRelativeTo(null);   
    }

    public static void main(String[] args) {
        DemoJTable frm= new DemoJTable("Demo JTable");
        frm.setVisible(true);
    }

    private void createGUI() {
        Object[][] data={
            {"Kim anh","140000000"},
            {"Kim ngân","20000000"},
        };
        
        String[] columnNames = {"Tên tài khoản","Số tiền"};
        //tạo jtable
        tblsanpham = new JTable (data,columnNames);
        //tạo thành phần quản lý cuộn cho Jtable
//        JScrollPane scrolltable = new JScrollPane(tblsanpham);
        //add jtable ra cua so
//        add(scrolltable,BorderLayout.CENTER);

        //cach 2
        DefaultTableModel model = new DefaultTableModel (data,columnNames);
        tblsanpham = new JTable (model);
        //tạo thanh phan quan ly cuon cho Jtable
        JScrollPane scrolltable = new JScrollPane(tblsanpham);
        
        JPanel p = new JPanel();
        p.add(btthem = new JButton("THÊM"));
        
        
        //add jtable ra cua so
        add(scrolltable,BorderLayout.CENTER);
        add(p,BorderLayout.NORTH);
    }

    private void processevent() {
        btthem.addActionListener((e) -> {
            
        });
    }
    
    
    
}
