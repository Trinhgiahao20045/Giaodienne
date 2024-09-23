/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package my.gui;

import java.awt.BorderLayout;
import java.awt.Font;
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
    private JMenu mfile, medit, mformat, mview, mhelp,mzoom;
    private JMenuItem itemnew, itemopen, itemsave, itemsaveas, itempagesetup, itemprint, itemexit;
    private JMenuItem itemUndo, itemCut, itemCopy, itemPaste, itemDelete, itemFind, itemSelectAll;
     private JMenuItem itemzoomIn, itemzoomOut, itemrdzoom;
    private JMenuItem itemfont;
    private JTextArea txtEditor;
    private JToolBar toolBar;
    private JFontDialog fontDlg;
    private JButton btnNew,btnOpen,btnSave;
    private JMenuItem itemzoomin, itemzoomout, itemrestoredefaultzoom;
    private JCheckBoxMenuItem itemwrap;

    public JNotepad(String title) {
        super(title);
        createmenu();
        createGUI();
        createTooBar();
        processevent();
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    private void processevent() {
//        //xu ly khi nhan nut itemfont
//        itemfont.addActionListenter((e) ->
//        {
//                openFile();
//        });
    }

    private void createmenu() {
         //tao doi tuong thanh thuc don
        menubar = new JMenuBar();
        //tao cac thuc don va them vao thanh thuc don
        menubar.add(mfile = new JMenu("File"));
        menubar.add(medit = new JMenu("Edit"));
        menubar.add(mformat = new JMenu("Format"));
        menubar.add(mview = new JMenu("View"));
        menubar.add(mhelp = new JMenu("Help"));

        //tao cac item cho menu File
        mfile.add(itemnew = new JMenuItem("New"));
        mfile.add(itemopen = new JMenuItem("Open..."));
        mfile.add(itemsave = new JMenuItem("Save"));
        mfile.add(itemsaveas = new JMenuItem("Save As..."));
        mfile.add(new JSeparator());
        mfile.add(itempagesetup = new JMenuItem("Page Setup..."));
        mfile.add(itemprint = new JMenuItem("Print..."));
        mfile.addSeparator();
        mfile.add(itemexit = new JMenuItem("Exit"));

        //tao cac item cho menu edit
        medit.add(itemUndo = new JMenuItem("Undo"));
        medit.addSeparator();
        medit.add(itemCut = new JMenuItem("Cut"));
        medit.add(itemCopy = new JMenuItem("Copy"));
        medit.add(itemPaste = new JMenuItem("Paste"));
        medit.add(itemDelete = new JMenuItem("Delete"));
        medit.addSeparator();
        medit.add(itemFind = new JMenuItem("Find"));
        medit.add(itemSelectAll = new JMenuItem("Select All"));

        //tao cac item cho menu view
        mview.add(mzoom = new JMenu("Zoom"));
        mzoom.add(itemzoomIn = new JMenuItem("Zoom In"));
        mzoom.add(itemzoomOut = new JMenuItem("Zoom Out"));
        mzoom.add(itemrdzoom = new JMenuItem("Restore default zoom"));

        //tao cac item cho menu Format
        mformat.add(itemwrap = new JCheckBoxMenuItem("Word Wrap", true));
        mformat.add(itemfont = new JMenuItem("Font..."));

        //tao phim nong cho cac item file
        itemnew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        itemopen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        itemsave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        itemsaveas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK));
        itemprint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
        itemexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
        //tao phim nong cho cac item edit
        itemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
        itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
        //itemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE));
        itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
        itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));

        //tao phim nong cho cac item view
        itemzoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
        itemzoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, KeyEvent.CTRL_DOWN_MASK));
        itemrdzoom.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, KeyEvent.CTRL_DOWN_MASK));
       
        //gan thanh thuc don vao cua so
        setJMenuBar(menubar);
    }

    private void createGUI() {
        txtEditor = new JTextArea();
        JScrollPane ScrollPane = new JScrollPane(txtEditor);
        add(ScrollPane);
        txtEditor.setLineWrap(true);
        txtEditor.setFont(new Font("Arial", Font.PLAIN, 20));
    }

    private void createTooBar() {
        toolBar = new JToolBar();
        toolBar.add(btnNew= new JButton("New"));
        toolBar.add(btnOpen= new JButton("Open"));
        toolBar.add(btnSave= new JButton("Save"));
        
        add(toolBar,BorderLayout.NORTH);
        
    }
}
