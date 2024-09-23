/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package my.gui;

import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class JNotepad extends JFrame {
    public JNotepad() {
    }
    private JMenuBar menubar;
    private JMenuBar menuzoom;
    private JMenu mfile, medit, mformat, mview, mhelp;
    private JMenuItem itemnew, itemopen, itemsave, itemsaveas, itempagesetup, itemprint, itemexit;
    private JMenuItem itemfont;
    private JMenuItem itemzoomin, itemzoomout,itemrestoredefaultzoom;
    private JCheckBoxMenuItem itemwrap;

    public JNotepad(String title) {
        super(title);
        createmenu();
       createGUI();
       processevent();
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    private void processevent() {
    }
    private void createmenu() {
        //tao doi tuong menu
        menubar = new JMenuBar();
        //tao doi tuong cho menu
        menubar.add(mfile = new JMenu("file"));
        menubar.add(medit = new JMenu("Edit"));
        menubar.add(mformat = new JMenu("Format"));
        menubar.add(mview = new JMenu("View"));
        menubar.add(mhelp = new JMenu("Help"));
        //tao cac item cho munu file
        mfile.add(itemnew = new JMenuItem("New"));
        mfile.add(itemopen = new JMenuItem("Open..."));
        mfile.add(itemsave = new JMenuItem("Save"));
        mfile.add(itemsaveas = new JMenuItem("Save as..."));
        mfile.add(new JSeparator());
        mfile.add(itempagesetup= new JMenuItem("Page setup..."));
        mfile.addSeparator() ;
        mfile.add(itemexit = new JMenuItem("Exit"));
        mfile.add(itemnew = new JMenuItem("New"));
        
        //tao phim nong cho cac item
        itemnew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
        itemopen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        itemsave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        itemsaveas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK +KeyEvent.SHIFT_DOWN_MASK));
        itemprint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        
        
        //gan doi tuong vao cua so
        setJMenuBar(menubar);
        
        
        //tao doi tuong menu zoom
        menuzoom = new JMenuBar();
        //tao doi tuong con cho menu zoom
         menuzoom.add(itemzoomin = new JMenuItem("Zoom In"));
         menuzoom.add(itemzoomout = new JMenuItem("Zoom Out"));
         menuzoom.add(itemrestoredefaultzoom = new JMenuItem("Restore Default Zoom"));
         //gan doi tuong vao cua so
        setJMenuBar(menuzoom);
    }

    private void createGUI() {
    }
}
