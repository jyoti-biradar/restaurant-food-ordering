package newproject;


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.print.PrinterJob;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.awt.print.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix-ITs
 */
public class MenuInRestaurant extends javax.swing.JFrame {

    /**
     * Creates new form MenuInRestaurant
     */
   
    public MenuInRestaurant() {
      initComponents();
      //  DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
       }
    public void getprice()
    {
        int sum=0;
        for(int i=0;i<jTable2.getRowCount();i++){
            sum=sum+Integer.parseInt(jTable2.getValueAt(i, 3).toString());
        }
        txtprice.setText(Integer.toString(sum));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnbecon = new javax.swing.JButton();
        btncheese = new javax.swing.JButton();
        btnsmash = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnrice = new javax.swing.JButton();
        btnveggie = new javax.swing.JButton();
        btnsteak = new javax.swing.JButton();
        btnchinese = new javax.swing.JButton();
        btnveg = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        angelcakebtn = new javax.swing.JButton();
        applecakebtn = new javax.swing.JButton();
        bananacakebtn = new javax.swing.JButton();
        batterncakenbtn = new javax.swing.JButton();
        blackcakebtn = new javax.swing.JButton();
        BrowniesCakebtn = new javax.swing.JButton();
        carrotcakebtn = new javax.swing.JButton();
        charlottCakebtn = new javax.swing.JButton();
        chocolateCakebtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        farmpizzabtn = new javax.swing.JButton();
        peppypizzabtn = new javax.swing.JButton();
        mexicpizzabtn = new javax.swing.JButton();
        cheesepizzabtn = new javax.swing.JButton();
        panepizzabtn = new javax.swing.JButton();
        veggipizzabtn = new javax.swing.JButton();
        freshpizzabtn = new javax.swing.JButton();
        nonvegpizzabtn = new javax.swing.JButton();
        checpizzabtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        tamarindbtn = new javax.swing.JButton();
        tomatobtn = new javax.swing.JButton();
        lemonbtn = new javax.swing.JButton();
        jeeraricebtn = new javax.swing.JButton();
        ricekheerbtn = new javax.swing.JButton();
        plainricebtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        eggbtn = new javax.swing.JButton();
        chowmeinbtn = new javax.swing.JButton();
        oatsbtn = new javax.swing.JButton();
        chickenbtn = new javax.swing.JButton();
        panbtn = new javax.swing.JButton();
        vegbtn = new javax.swing.JButton();
        singaporebtn = new javax.swing.JButton();
        pannerbtn = new javax.swing.JButton();
        chickkenbtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        barbebtn = new javax.swing.JButton();
        lolipopopbtn = new javax.swing.JButton();
        friedbtn = new javax.swing.JButton();
        tandoooribtn = new javax.swing.JButton();
        currybtn = new javax.swing.JButton();
        lemongrassbtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        masalafishbtn = new javax.swing.JButton();
        cutletsbtn = new javax.swing.JButton();
        fishfrybtn = new javax.swing.JButton();
        salmonbtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        chisaladbtn = new javax.swing.JButton();
        chinesesaladbtn = new javax.swing.JButton();
        cookiesladbtn = new javax.swing.JButton();
        eggsaladbtn = new javax.swing.JButton();
        fruitsaladbtn = new javax.swing.JButton();
        gardensaladbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        spanichbtn = new javax.swing.JButton();
        gobibtn = new javax.swing.JButton();
        hydrabadibtn = new javax.swing.JButton();
        pavbhajibtn = new javax.swing.JButton();
        spicybhedibtn = new javax.swing.JButton();
        puranpolibtn = new javax.swing.JButton();
        fenugreekbtn = new javax.swing.JButton();
        kajuvadibtn = new javax.swing.JButton();
        batatavada = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        waterbtn = new javax.swing.JButton();
        cocabtn = new javax.swing.JButton();
        pepsibtn = new javax.swing.JButton();
        spritebtn = new javax.swing.JButton();
        thumsbtn = new javax.swing.JButton();
        maazabtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtprice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttablenum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Select Menu Items");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 255, 51));
        jPanel3.setLayout(new java.awt.GridLayout(3, 3));

        btnbecon.setBackground(new java.awt.Color(204, 0, 204));
        btnbecon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbecon.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\becon3.png")); // NOI18N
        btnbecon.setText("Becon");
        btnbecon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeconActionPerformed(evt);
            }
        });
        jPanel3.add(btnbecon);

        btncheese.setBackground(new java.awt.Color(153, 255, 51));
        btncheese.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncheese.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cheese.jpg")); // NOI18N
        btncheese.setText("Cheese");
        btncheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheeseActionPerformed(evt);
            }
        });
        jPanel3.add(btncheese);

        btnsmash.setBackground(new java.awt.Color(0, 51, 204));
        btnsmash.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsmash.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\smash.jpg")); // NOI18N
        btnsmash.setText("Smash");
        btnsmash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsmashActionPerformed(evt);
            }
        });
        jPanel3.add(btnsmash);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\chiili.jpg")); // NOI18N
        jButton4.setText("Chilli");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        btnrice.setBackground(new java.awt.Color(51, 255, 204));
        btnrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrice.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\riceburger.JPG")); // NOI18N
        btnrice.setText("Rice");
        btnrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriceActionPerformed(evt);
            }
        });
        jPanel3.add(btnrice);

        btnveggie.setBackground(new java.awt.Color(51, 255, 51));
        btnveggie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnveggie.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegii.jpg")); // NOI18N
        btnveggie.setText("veggie");
        btnveggie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnveggieActionPerformed(evt);
            }
        });
        jPanel3.add(btnveggie);

        btnsteak.setBackground(new java.awt.Color(0, 204, 102));
        btnsteak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsteak.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\steak.jpg")); // NOI18N
        btnsteak.setText("steak");
        btnsteak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsteakActionPerformed(evt);
            }
        });
        jPanel3.add(btnsteak);

        btnchinese.setBackground(new java.awt.Color(0, 153, 153));
        btnchinese.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnchinese.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\chinese.jpg")); // NOI18N
        btnchinese.setText("chinese szechuan");
        btnchinese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchineseActionPerformed(evt);
            }
        });
        jPanel3.add(btnchinese);

        btnveg.setBackground(new java.awt.Color(255, 0, 153));
        btnveg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnveg.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegburger.jpg")); // NOI18N
        btnveg.setText("VegBurger");
        btnveg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvegActionPerformed(evt);
            }
        });
        jPanel3.add(btnveg);

        jTabbedPane2.addTab("Burgers", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));
        jPanel4.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        angelcakebtn.setBackground(new java.awt.Color(255, 0, 204));
        angelcakebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        angelcakebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\anglecake.jpg")); // NOI18N
        angelcakebtn.setText("AngelFoodCake");
        angelcakebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angelcakebtnActionPerformed(evt);
            }
        });
        jPanel4.add(angelcakebtn);

        applecakebtn.setBackground(new java.awt.Color(0, 255, 153));
        applecakebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        applecakebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\applecake.jpg")); // NOI18N
        applecakebtn.setText("AppleCake");
        applecakebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applecakebtnActionPerformed(evt);
            }
        });
        jPanel4.add(applecakebtn);

        bananacakebtn.setBackground(new java.awt.Color(51, 255, 51));
        bananacakebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bananacakebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\bananaCake.jpg")); // NOI18N
        bananacakebtn.setText("BananaCake");
        bananacakebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananacakebtnActionPerformed(evt);
            }
        });
        jPanel4.add(bananacakebtn);

        batterncakenbtn.setBackground(new java.awt.Color(204, 255, 0));
        batterncakenbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batterncakenbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\batternBergCake.jpg")); // NOI18N
        batterncakenbtn.setText("BatternBergCake");
        batterncakenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batterncakenbtnActionPerformed(evt);
            }
        });
        jPanel4.add(batterncakenbtn);

        blackcakebtn.setBackground(new java.awt.Color(255, 51, 102));
        blackcakebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blackcakebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\BlackforestCake.jpg")); // NOI18N
        blackcakebtn.setText("BlackForestCake");
        blackcakebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackcakebtnActionPerformed(evt);
            }
        });
        jPanel4.add(blackcakebtn);

        BrowniesCakebtn.setBackground(new java.awt.Color(0, 255, 0));
        BrowniesCakebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BrowniesCakebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\Brownies.jpg")); // NOI18N
        BrowniesCakebtn.setText("Brownies");
        BrowniesCakebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowniesCakebtnActionPerformed(evt);
            }
        });
        jPanel4.add(BrowniesCakebtn);

        carrotcakebtn.setBackground(new java.awt.Color(255, 0, 255));
        carrotcakebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        carrotcakebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\Carrot Cake.jpg")); // NOI18N
        carrotcakebtn.setText("CarrotCake ");
        carrotcakebtn.setToolTipText("");
        carrotcakebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrotcakebtnActionPerformed(evt);
            }
        });
        jPanel4.add(carrotcakebtn);

        charlottCakebtn.setBackground(new java.awt.Color(204, 0, 204));
        charlottCakebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        charlottCakebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\Charlotte Cake.jpg")); // NOI18N
        charlottCakebtn.setText("CharlotteCake ");
        charlottCakebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charlottCakebtnActionPerformed(evt);
            }
        });
        jPanel4.add(charlottCakebtn);

        chocolateCakebtn.setBackground(new java.awt.Color(0, 255, 255));
        chocolateCakebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chocolateCakebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\cake imges\\Chocolate Cake.jpg")); // NOI18N
        chocolateCakebtn.setText("Chocolate Cake ");
        chocolateCakebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolateCakebtnActionPerformed(evt);
            }
        });
        jPanel4.add(chocolateCakebtn);

        jTabbedPane2.addTab("Cake", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        farmpizzabtn.setBackground(new java.awt.Color(255, 51, 51));
        farmpizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        farmpizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\Farmhouse.jpg")); // NOI18N
        farmpizzabtn.setText("FarmHousePizza ");
        farmpizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmpizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(farmpizzabtn);

        peppypizzabtn.setBackground(new java.awt.Color(0, 255, 51));
        peppypizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        peppypizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\Peppy_Paneer.jpg")); // NOI18N
        peppypizzabtn.setText("PeppyPaneerpizza");
        peppypizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peppypizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(peppypizzabtn);

        mexicpizzabtn.setBackground(new java.awt.Color(255, 102, 204));
        mexicpizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mexicpizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\Mexican_Green_Wave.jpg")); // NOI18N
        mexicpizzabtn.setText("MexicanGreenWave");
        mexicpizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexicpizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(mexicpizzabtn);

        cheesepizzabtn.setBackground(new java.awt.Color(255, 255, 51));
        cheesepizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheesepizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\Corn_&_Cheese.jpg")); // NOI18N
        cheesepizzabtn.setText("CHEESECORN");
        cheesepizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheesepizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(cheesepizzabtn);

        panepizzabtn.setBackground(new java.awt.Color(102, 255, 102));
        panepizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panepizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\Paneer_Makhni.jpg")); // NOI18N
        panepizzabtn.setText("PANEER MAKHANI ");
        panepizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panepizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(panepizzabtn);

        veggipizzabtn.setBackground(new java.awt.Color(255, 153, 153));
        veggipizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        veggipizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\Veggie_Paradise.jpg")); // NOI18N
        veggipizzabtn.setText("VEGGIE PARADISE");
        veggipizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggipizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(veggipizzabtn);

        freshpizzabtn.setBackground(new java.awt.Color(255, 204, 51));
        freshpizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        freshpizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\Fresh_Veggie.jpg")); // NOI18N
        freshpizzabtn.setText("FRESH VEGGIE");
        freshpizzabtn.setToolTipText("");
        freshpizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freshpizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(freshpizzabtn);

        nonvegpizzabtn.setBackground(new java.awt.Color(102, 255, 0));
        nonvegpizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nonvegpizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\Non-Veg_Supreme.jpg")); // NOI18N
        nonvegpizzabtn.setText("Non Veg Supreme");
        nonvegpizzabtn.setToolTipText("");
        nonvegpizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonvegpizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(nonvegpizzabtn);

        checpizzabtn.setBackground(new java.awt.Color(102, 255, 102));
        checpizzabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checpizzabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\pizza images\\chunky-chicken.png")); // NOI18N
        checpizzabtn.setText("CHICKEN FIESTA ");
        checpizzabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checpizzabtnActionPerformed(evt);
            }
        });
        jPanel5.add(checpizzabtn);

        jTabbedPane2.addTab("Pizza", jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 0, 153));
        jPanel6.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        tamarindbtn.setBackground(new java.awt.Color(255, 51, 51));
        tamarindbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tamarindbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\rice images\\TamarindRice.jpg")); // NOI18N
        tamarindbtn.setText("TamarindRice");
        tamarindbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamarindbtnActionPerformed(evt);
            }
        });
        jPanel6.add(tamarindbtn);

        tomatobtn.setBackground(new java.awt.Color(0, 255, 0));
        tomatobtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tomatobtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\rice images\\TomatoRice.jpg")); // NOI18N
        tomatobtn.setText("TomatoRice");
        tomatobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatobtnActionPerformed(evt);
            }
        });
        jPanel6.add(tomatobtn);

        lemonbtn.setBackground(new java.awt.Color(153, 0, 153));
        lemonbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lemonbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\rice images\\LemonRice.jpg")); // NOI18N
        lemonbtn.setText("LemonRice");
        lemonbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonbtnActionPerformed(evt);
            }
        });
        jPanel6.add(lemonbtn);

        jeeraricebtn.setBackground(new java.awt.Color(102, 255, 255));
        jeeraricebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jeeraricebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\rice images\\jeeraRice.jpg")); // NOI18N
        jeeraricebtn.setText("jeeraRice");
        jeeraricebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeeraricebtnActionPerformed(evt);
            }
        });
        jPanel6.add(jeeraricebtn);

        ricekheerbtn.setBackground(new java.awt.Color(102, 255, 204));
        ricekheerbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ricekheerbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\rice images\\ricekheer.jpg")); // NOI18N
        ricekheerbtn.setText("RiceKheer");
        ricekheerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricekheerbtnActionPerformed(evt);
            }
        });
        jPanel6.add(ricekheerbtn);

        plainricebtn.setBackground(new java.awt.Color(255, 204, 204));
        plainricebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        plainricebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\rice images\\PlainBasmatiRice.jpg")); // NOI18N
        plainricebtn.setText("PlainBasmatiWhiteRice");
        plainricebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainricebtnActionPerformed(evt);
            }
        });
        jPanel6.add(plainricebtn);

        jTabbedPane2.addTab("Rice", jPanel6);

        jPanel7.setBackground(new java.awt.Color(102, 255, 51));
        jPanel7.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        eggbtn.setBackground(new java.awt.Color(255, 204, 102));
        eggbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eggbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\EGGnoodles.jpg")); // NOI18N
        eggbtn.setText("EggNoodles");
        eggbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggbtnActionPerformed(evt);
            }
        });
        jPanel7.add(eggbtn);

        chowmeinbtn.setBackground(new java.awt.Color(51, 255, 51));
        chowmeinbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chowmeinbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\chowmeijn.jpg")); // NOI18N
        chowmeinbtn.setText("chowmein");
        chowmeinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chowmeinbtnActionPerformed(evt);
            }
        });
        jPanel7.add(chowmeinbtn);

        oatsbtn.setBackground(new java.awt.Color(0, 255, 102));
        oatsbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oatsbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\oatsnoodle.jpg")); // NOI18N
        oatsbtn.setText("oatsnoodle");
        oatsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oatsbtnActionPerformed(evt);
            }
        });
        jPanel7.add(oatsbtn);

        chickenbtn.setBackground(new java.awt.Color(204, 255, 51));
        chickenbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chickenbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\chickenchowmein.jpg")); // NOI18N
        chickenbtn.setText("chickenchowmein");
        chickenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenbtnActionPerformed(evt);
            }
        });
        jPanel7.add(chickenbtn);

        panbtn.setBackground(new java.awt.Color(0, 255, 102));
        panbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\panfriedNoddles.png")); // NOI18N
        panbtn.setText("panfriedNoddles");
        panbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panbtnActionPerformed(evt);
            }
        });
        jPanel7.add(panbtn);

        vegbtn.setBackground(new java.awt.Color(255, 102, 102));
        vegbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vegbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\veg-chowmein.jpg")); // NOI18N
        vegbtn.setText("vegchowmein");
        vegbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegbtnActionPerformed(evt);
            }
        });
        jPanel7.add(vegbtn);

        singaporebtn.setBackground(new java.awt.Color(153, 153, 0));
        singaporebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        singaporebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\singapore-noodles.jpg")); // NOI18N
        singaporebtn.setText("singapore-noodles");
        singaporebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singaporebtnActionPerformed(evt);
            }
        });
        jPanel7.add(singaporebtn);

        pannerbtn.setBackground(new java.awt.Color(51, 153, 255));
        pannerbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pannerbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\paneernoodles.jpg")); // NOI18N
        pannerbtn.setText("paneernoodles");
        pannerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannerbtnActionPerformed(evt);
            }
        });
        jPanel7.add(pannerbtn);

        chickkenbtn.setBackground(new java.awt.Color(255, 204, 204));
        chickkenbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chickkenbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\noodlesimages\\chickenschewannoodles.jpg")); // NOI18N
        chickkenbtn.setText("chickenschewannoodles");
        chickkenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickkenbtnActionPerformed(evt);
            }
        });
        jPanel7.add(chickkenbtn);

        jTabbedPane2.addTab("Noodles", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 153, 255));
        jPanel8.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        barbebtn.setBackground(new java.awt.Color(102, 255, 102));
        barbebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        barbebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\chickenimages\\barbecue-1836053__340.jpg")); // NOI18N
        barbebtn.setText("barbecueChicken");
        barbebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barbebtnActionPerformed(evt);
            }
        });
        jPanel8.add(barbebtn);

        lolipopopbtn.setBackground(new java.awt.Color(153, 255, 0));
        lolipopopbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lolipopopbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\chickenimages\\chicken.lollipops.jpg")); // NOI18N
        lolipopopbtn.setText("Chickenlollipop");
        lolipopopbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lolipopopbtnActionPerformed(evt);
            }
        });
        jPanel8.add(lolipopopbtn);

        friedbtn.setBackground(new java.awt.Color(204, 255, 0));
        friedbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        friedbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\chickenimages\\fried-chicken.jpg")); // NOI18N
        friedbtn.setText("fried-chicken");
        friedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friedbtnActionPerformed(evt);
            }
        });
        jPanel8.add(friedbtn);

        tandoooribtn.setBackground(new java.awt.Color(102, 102, 255));
        tandoooribtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tandoooribtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\chickenimages\\tandoori-chicken.jpg")); // NOI18N
        tandoooribtn.setText("TandooriChicken");
        tandoooribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tandoooribtnActionPerformed(evt);
            }
        });
        jPanel8.add(tandoooribtn);

        currybtn.setBackground(new java.awt.Color(255, 102, 102));
        currybtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        currybtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\chickenimages\\chicken-curry-625_625x350_51450203303.jpg")); // NOI18N
        currybtn.setText("Chickencurry");
        currybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currybtnActionPerformed(evt);
            }
        });
        jPanel8.add(currybtn);

        lemongrassbtn.setBackground(new java.awt.Color(255, 153, 255));
        lemongrassbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lemongrassbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\chickenimages\\chicken-625_625x350_41450203259.jpg")); // NOI18N
        lemongrassbtn.setText("LemongrassChicken");
        lemongrassbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemongrassbtnActionPerformed(evt);
            }
        });
        jPanel8.add(lemongrassbtn);

        jTabbedPane2.addTab("Ckickens", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 51, 51));
        jPanel9.setLayout(new java.awt.GridLayout(2, 2, 2, 2));

        masalafishbtn.setBackground(new java.awt.Color(0, 255, 0));
        masalafishbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        masalafishbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\masala-pomfret.jpg")); // NOI18N
        masalafishbtn.setText("Masala Fried Pomfret");
        masalafishbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masalafishbtnActionPerformed(evt);
            }
        });
        jPanel9.add(masalafishbtn);

        cutletsbtn.setBackground(new java.awt.Color(255, 51, 51));
        cutletsbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cutletsbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\fish-cutlets_625x350_71469696011.jpg")); // NOI18N
        cutletsbtn.setText("Fish Cutlets");
        cutletsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutletsbtnActionPerformed(evt);
            }
        });
        jPanel9.add(cutletsbtn);

        fishfrybtn.setBackground(new java.awt.Color(153, 0, 153));
        fishfrybtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fishfrybtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\fishfry.jpg")); // NOI18N
        fishfrybtn.setText("Fishfry");
        fishfrybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishfrybtnActionPerformed(evt);
            }
        });
        jPanel9.add(fishfrybtn);

        salmonbtn.setBackground(new java.awt.Color(51, 153, 255));
        salmonbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salmonbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\salmon-1485014__340.jpg")); // NOI18N
        salmonbtn.setText("salmon fish");
        salmonbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salmonbtnActionPerformed(evt);
            }
        });
        jPanel9.add(salmonbtn);

        jTabbedPane2.addTab("Fish", jPanel9);

        jPanel10.setBackground(new java.awt.Color(240, 101, 184));
        jPanel10.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        chisaladbtn.setBackground(new java.awt.Color(204, 255, 102));
        chisaladbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chisaladbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\Chicken_salad.jpg")); // NOI18N
        chisaladbtn.setText("ckicken salad");
        chisaladbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chisaladbtnActionPerformed(evt);
            }
        });
        jPanel10.add(chisaladbtn);

        chinesesaladbtn.setBackground(new java.awt.Color(0, 204, 204));
        chinesesaladbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chinesesaladbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\Chinesechickensalad.jpg")); // NOI18N
        chinesesaladbtn.setText("Chinesechickensalad");
        chinesesaladbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chinesesaladbtnActionPerformed(evt);
            }
        });
        jPanel10.add(chinesesaladbtn);

        cookiesladbtn.setBackground(new java.awt.Color(255, 153, 153));
        cookiesladbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cookiesladbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\Cookie_salad.jpg")); // NOI18N
        cookiesladbtn.setText("Cookie_salad");
        cookiesladbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookiesladbtnActionPerformed(evt);
            }
        });
        jPanel10.add(cookiesladbtn);

        eggsaladbtn.setBackground(new java.awt.Color(255, 153, 153));
        eggsaladbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eggsaladbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\EggSalad.jpg")); // NOI18N
        eggsaladbtn.setText("EggSalad");
        eggsaladbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggsaladbtnActionPerformed(evt);
            }
        });
        jPanel10.add(eggsaladbtn);

        fruitsaladbtn.setBackground(new java.awt.Color(51, 255, 51));
        fruitsaladbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fruitsaladbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\Fruit_salad.JPG")); // NOI18N
        fruitsaladbtn.setText("Fruit_salad");
        fruitsaladbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitsaladbtnActionPerformed(evt);
            }
        });
        jPanel10.add(fruitsaladbtn);

        gardensaladbtn.setBackground(new java.awt.Color(204, 204, 0));
        gardensaladbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gardensaladbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\fishimages\\gardenSalad.jpg")); // NOI18N
        gardensaladbtn.setText("gardenSalad");
        gardensaladbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gardensaladbtnActionPerformed(evt);
            }
        });
        jPanel10.add(gardensaladbtn);

        jTabbedPane2.addTab("Salad", jPanel10);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        spanichbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spanichbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\spinach_500x300_81454679921.jpg")); // NOI18N
        spanichbtn.setText("Spanich");
        spanichbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spanichbtnActionPerformed(evt);
            }
        });
        jPanel2.add(spanichbtn);

        gobibtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gobibtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\gobhi.masaledaar.jpg")); // NOI18N
        gobibtn.setText("gobi");
        gobibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobibtnActionPerformed(evt);
            }
        });
        jPanel2.add(gobibtn);

        hydrabadibtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hydrabadibtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\Bagara-Baingan-1.jpg")); // NOI18N
        hydrabadibtn.setText("Hyderabadi Baingan");
        hydrabadibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hydrabadibtnActionPerformed(evt);
            }
        });
        jPanel2.add(hydrabadibtn);

        pavbhajibtn.setBackground(new java.awt.Color(255, 153, 153));
        pavbhajibtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pavbhajibtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\pav-bhaji_625x350_81449563929.jpg")); // NOI18N
        pavbhajibtn.setText("PavBhaji");
        pavbhajibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pavbhajibtnActionPerformed(evt);
            }
        });
        jPanel2.add(pavbhajibtn);

        spicybhedibtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spicybhedibtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\Spicy_Bhindi_Andhra_Style.jpg")); // NOI18N
        spicybhedibtn.setText("Spicy_Bhindi");
        spicybhedibtn.setToolTipText("");
        spicybhedibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spicybhedibtnActionPerformed(evt);
            }
        });
        jPanel2.add(spicybhedibtn);

        puranpolibtn.setBackground(new java.awt.Color(51, 255, 51));
        puranpolibtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        puranpolibtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\v0s43mj_puran-poli_625x300_13_September_18.jpg")); // NOI18N
        puranpolibtn.setText("Puran_Poli");
        puranpolibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puranpolibtnActionPerformed(evt);
            }
        });
        jPanel2.add(puranpolibtn);

        fenugreekbtn.setBackground(new java.awt.Color(153, 153, 0));
        fenugreekbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fenugreekbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\Fenugreek.jpg")); // NOI18N
        fenugreekbtn.setText("Fenugreek");
        fenugreekbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fenugreekbtnActionPerformed(evt);
            }
        });
        jPanel2.add(fenugreekbtn);

        kajuvadibtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kajuvadibtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\kajuvadi-625_625x350_81465887037.jpg")); // NOI18N
        kajuvadibtn.setText("KajuVadi ");
        kajuvadibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kajuvadibtnActionPerformed(evt);
            }
        });
        jPanel2.add(kajuvadibtn);

        batatavada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batatavada.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\batata_625x350_41466058999.jpg")); // NOI18N
        batatavada.setText("BatataVada");
        batatavada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batatavadaActionPerformed(evt);
            }
        });
        jPanel2.add(batatavada);

        jTabbedPane2.addTab("Vegetables", jPanel2);

        jPanel11.setLayout(new java.awt.GridLayout(2, 2, 2, 2));

        waterbtn.setBackground(new java.awt.Color(102, 255, 102));
        waterbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        waterbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\water.jpg")); // NOI18N
        waterbtn.setText("Water");
        waterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterbtnActionPerformed(evt);
            }
        });
        jPanel11.add(waterbtn);

        cocabtn.setBackground(new java.awt.Color(153, 153, 255));
        cocabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cocabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\cococola.jpg")); // NOI18N
        cocabtn.setText("Coca Cola");
        cocabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocabtnActionPerformed(evt);
            }
        });
        jPanel11.add(cocabtn);

        pepsibtn.setBackground(new java.awt.Color(0, 255, 0));
        pepsibtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pepsibtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\pepsi.jpg")); // NOI18N
        pepsibtn.setText("Pepsi");
        pepsibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsibtnActionPerformed(evt);
            }
        });
        jPanel11.add(pepsibtn);

        spritebtn.setBackground(new java.awt.Color(255, 153, 153));
        spritebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spritebtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\Sprite.jpg")); // NOI18N
        spritebtn.setText(" Sprite");
        spritebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spritebtnActionPerformed(evt);
            }
        });
        jPanel11.add(spritebtn);

        thumsbtn.setBackground(new java.awt.Color(204, 255, 0));
        thumsbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thumsbtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\Thums Up.jpg")); // NOI18N
        thumsbtn.setText("Thums Up");
        thumsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thumsbtnActionPerformed(evt);
            }
        });
        jPanel11.add(thumsbtn);

        maazabtn.setBackground(new java.awt.Color(0, 255, 153));
        maazabtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        maazabtn.setIcon(new javax.swing.ImageIcon("C:\\jyoti biradar\\java program in netbean\\RestaurentApplication\\vegetablesimages\\Maaza.jpg")); // NOI18N
        maazabtn.setText("Maaza");
        maazabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maazabtnActionPerformed(evt);
            }
        });
        jPanel11.add(maazabtn);

        jTabbedPane2.addTab("Drinks", jPanel11);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "menus", "available", "Rate", "total price", "Quantity"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 0, 0));
        jButton10.setText("Clear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Total price:  ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Delete items");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Enter the table number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Enter the username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Enter userId");

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Submit order or confirm order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Printbill");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txttablenum)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttablenum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        txtprice.setText("");
        txttablenum.setText("");
        txtuserid.setText("");
        txtusername.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{  
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
            int index=jTable2.getSelectedRow();
            model.removeRow(index);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please select one item you wnat to delete");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lemongrassbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemongrassbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=48";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            lemongrassbtn.setEnabled(false);
        }
    }//GEN-LAST:event_lemongrassbtnActionPerformed

    private void currybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currybtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=47";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            currybtn.setEnabled(false);
        }
    }//GEN-LAST:event_currybtnActionPerformed

    private void tandoooribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tandoooribtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=46";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            tandoooribtn.setEnabled(false);
        }
    }//GEN-LAST:event_tandoooribtnActionPerformed

    private void friedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friedbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=45";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            friedbtn.setEnabled(false);
        }
    }//GEN-LAST:event_friedbtnActionPerformed

    private void lolipopopbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lolipopopbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=44";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            lolipopopbtn.setEnabled(false);
        }
    }//GEN-LAST:event_lolipopopbtnActionPerformed

    private void barbebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barbebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=43";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            barbebtn.setEnabled(false);
        }
    }//GEN-LAST:event_barbebtnActionPerformed

    private void chickkenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickkenbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=42";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            chickkenbtn.setEnabled(false);
        }
    }//GEN-LAST:event_chickkenbtnActionPerformed

    private void pannerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pannerbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=41";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            pannerbtn.setEnabled(false);
        }
    }//GEN-LAST:event_pannerbtnActionPerformed

    private void singaporebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singaporebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=40";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            singaporebtn.setEnabled(false);
        }
    }//GEN-LAST:event_singaporebtnActionPerformed

    private void vegbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=39";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            vegbtn.setEnabled(false);
        }
    }//GEN-LAST:event_vegbtnActionPerformed

    private void panbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=38";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            panbtn.setEnabled(false);
        }
    }//GEN-LAST:event_panbtnActionPerformed

    private void chickenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=37";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            chickenbtn.setEnabled(false);
        }
    }//GEN-LAST:event_chickenbtnActionPerformed

    private void oatsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oatsbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=36";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            oatsbtn.setEnabled(false);
        }
    }//GEN-LAST:event_oatsbtnActionPerformed

    private void chowmeinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chowmeinbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=35";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            chowmeinbtn.setEnabled(false);
        }
    }//GEN-LAST:event_chowmeinbtnActionPerformed

    private void eggbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eggbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=34";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            eggbtn.setEnabled(false);
        }
    }//GEN-LAST:event_eggbtnActionPerformed

    private void plainricebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainricebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=33";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            plainricebtn.setEnabled(false);
        }
    }//GEN-LAST:event_plainricebtnActionPerformed

    private void ricekheerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricekheerbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=32";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            ricekheerbtn.setEnabled(false);
        }
    }//GEN-LAST:event_ricekheerbtnActionPerformed

    private void jeeraricebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeeraricebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=31";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            jeeraricebtn.setEnabled(false);
        }
    }//GEN-LAST:event_jeeraricebtnActionPerformed

    private void lemonbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=30";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            lemonbtn.setEnabled(false);
        }
    }//GEN-LAST:event_lemonbtnActionPerformed

    private void tomatobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatobtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=29";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            tomatobtn.setEnabled(false);
        }
    }//GEN-LAST:event_tomatobtnActionPerformed

    private void tamarindbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamarindbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=28";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            tamarindbtn.setEnabled(false);
        }
    }//GEN-LAST:event_tamarindbtnActionPerformed

    private void checpizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checpizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=27";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            checpizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_checpizzabtnActionPerformed

    private void nonvegpizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonvegpizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=26";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            nonvegpizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_nonvegpizzabtnActionPerformed

    private void freshpizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freshpizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=25";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            freshpizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_freshpizzabtnActionPerformed

    private void veggipizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggipizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=24";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            veggipizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_veggipizzabtnActionPerformed

    private void panepizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panepizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=23";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            panepizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_panepizzabtnActionPerformed

    private void cheesepizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheesepizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=22";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            cheesepizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_cheesepizzabtnActionPerformed

    private void mexicpizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexicpizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=21";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            mexicpizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_mexicpizzabtnActionPerformed

    private void peppypizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peppypizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=20";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            peppypizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_peppypizzabtnActionPerformed

    private void farmpizzabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmpizzabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=19";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            farmpizzabtn.setEnabled(false);
        }
    }//GEN-LAST:event_farmpizzabtnActionPerformed

    private void chocolateCakebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolateCakebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=18";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            chocolateCakebtn.setEnabled(false);
        }
    }//GEN-LAST:event_chocolateCakebtnActionPerformed

    private void charlottCakebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charlottCakebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=17";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            charlottCakebtn.setEnabled(false);
        }
    }//GEN-LAST:event_charlottCakebtnActionPerformed

    private void carrotcakebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrotcakebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=16";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            carrotcakebtn.setEnabled(false);
        }
    }//GEN-LAST:event_carrotcakebtnActionPerformed

    private void BrowniesCakebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowniesCakebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=15";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            BrowniesCakebtn.setEnabled(false);
        }
    }//GEN-LAST:event_BrowniesCakebtnActionPerformed

    private void blackcakebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackcakebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=14";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            blackcakebtn.setEnabled(false);
        }
    }//GEN-LAST:event_blackcakebtnActionPerformed

    private void batterncakenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batterncakenbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=13";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            batterncakenbtn.setEnabled(false);
        }
    }//GEN-LAST:event_batterncakenbtnActionPerformed

    private void bananacakebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananacakebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=12";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            bananacakebtn.setEnabled(false);
        }
    }//GEN-LAST:event_bananacakebtnActionPerformed

    private void applecakebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applecakebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=11";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            applecakebtn.setEnabled(false);
        }
    }//GEN-LAST:event_applecakebtnActionPerformed

    private void angelcakebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angelcakebtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=10";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            angelcakebtn.setEnabled(false);
        }
    }//GEN-LAST:event_angelcakebtnActionPerformed

    private void btnvegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvegActionPerformed
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=9";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            // dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            btnveg.setEnabled(false);
        }
    }//GEN-LAST:event_btnvegActionPerformed

    private void btnchineseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchineseActionPerformed
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=8";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            // dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            btnchinese.setEnabled(false);
        }
    }//GEN-LAST:event_btnchineseActionPerformed

    private void btnsteakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsteakActionPerformed
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=7";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            // dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            btnsteak.setEnabled(false);
        }
    }//GEN-LAST:event_btnsteakActionPerformed

    private void btnveggieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnveggieActionPerformed
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=6";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            // dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            btnveggie.setEnabled(false);
        }
    }//GEN-LAST:event_btnveggieActionPerformed

    private void btnriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriceActionPerformed
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=5";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            // dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            btnrice.setEnabled(false);
        }
    }//GEN-LAST:event_btnriceActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=4";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            // dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            jButton4.setEnabled(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnsmashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsmashActionPerformed
        // TODO add your handling code here:
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=3";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            // dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            btnsmash.setEnabled(false);
        }
    }//GEN-LAST:event_btnsmashActionPerformed

    private void btncheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheeseActionPerformed
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=2";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //  dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            btncheese.setEnabled(false);
        }
    }//GEN-LAST:event_btncheeseActionPerformed

    private void btnbeconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeconActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=1";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                   dt.addRow(o);
                   
            } 
        } catch (Exception e) {
            System.out.println("database error");
        }finally{
            btnbecon.setEnabled(false);
        }
    }//GEN-LAST:event_btnbeconActionPerformed

    private void masalafishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masalafishbtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=49";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            masalafishbtn.setEnabled(false);
        }
    }//GEN-LAST:event_masalafishbtnActionPerformed

    private void cutletsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutletsbtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=50";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            cutletsbtn.setEnabled(false);
        }
    }//GEN-LAST:event_cutletsbtnActionPerformed

    private void fishfrybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishfrybtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=51";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            fishfrybtn.setEnabled(false);
        }
    }//GEN-LAST:event_fishfrybtnActionPerformed

    private void salmonbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salmonbtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=52";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            salmonbtn.setEnabled(false);
        }
    }//GEN-LAST:event_salmonbtnActionPerformed

    private void fruitsaladbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitsaladbtnActionPerformed
      DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=57";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            fruitsaladbtn.setEnabled(false);
        }
    }//GEN-LAST:event_fruitsaladbtnActionPerformed

    private void eggsaladbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eggsaladbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=56";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            eggsaladbtn.setEnabled(false);
        }
    }//GEN-LAST:event_eggsaladbtnActionPerformed

    private void chisaladbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chisaladbtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=53";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            chisaladbtn.setEnabled(false);
        }
    }//GEN-LAST:event_chisaladbtnActionPerformed

    private void chinesesaladbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chinesesaladbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=54";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            chinesesaladbtn.setEnabled(false);
        }
    }//GEN-LAST:event_chinesesaladbtnActionPerformed

    private void cookiesladbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiesladbtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=55";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            cookiesladbtn.setEnabled(false);
        }
    }//GEN-LAST:event_cookiesladbtnActionPerformed

    private void gardensaladbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gardensaladbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=58";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            gardensaladbtn.setEnabled(false);
        }
    }//GEN-LAST:event_gardensaladbtnActionPerformed

    private void spanichbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spanichbtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=59";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            spanichbtn.setEnabled(false);
        }
    }//GEN-LAST:event_spanichbtnActionPerformed

    private void gobibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobibtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=60";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            gobibtn.setEnabled(false);
        }
    }//GEN-LAST:event_gobibtnActionPerformed

    private void hydrabadibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hydrabadibtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=61";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            hydrabadibtn.setEnabled(false);
        }
    }//GEN-LAST:event_hydrabadibtnActionPerformed

    private void pavbhajibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pavbhajibtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=62";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            pavbhajibtn.setEnabled(false);
        }
    }//GEN-LAST:event_pavbhajibtnActionPerformed

    private void spicybhedibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spicybhedibtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=63";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            spicybhedibtn.setEnabled(false);
        }
    }//GEN-LAST:event_spicybhedibtnActionPerformed

    private void puranpolibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puranpolibtnActionPerformed
      DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=64";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            puranpolibtn.setEnabled(false);
        }
    }//GEN-LAST:event_puranpolibtnActionPerformed

    private void fenugreekbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fenugreekbtnActionPerformed
     DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=65";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            fenugreekbtn.setEnabled(false);
        }
    }//GEN-LAST:event_fenugreekbtnActionPerformed

    private void kajuvadibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kajuvadibtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=66";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            kajuvadibtn.setEnabled(false);
        }
    }//GEN-LAST:event_kajuvadibtnActionPerformed

    private void batatavadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batatavadaActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=67";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            batatavada.setEnabled(false);
        }
    }//GEN-LAST:event_batatavadaActionPerformed

    private void waterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterbtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=68";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            waterbtn.setEnabled(false);
        }
    }//GEN-LAST:event_waterbtnActionPerformed

    private void cocabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocabtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=69";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            cocabtn.setEnabled(false);
        }
    }//GEN-LAST:event_cocabtnActionPerformed

    private void pepsibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsibtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=70";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            pepsibtn.setEnabled(false);
        }
    }//GEN-LAST:event_pepsibtnActionPerformed

    private void spritebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spritebtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=71";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            spritebtn.setEnabled(false);
        }
    }//GEN-LAST:event_spritebtnActionPerformed

    private void thumsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thumsbtnActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=72";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            thumsbtn.setEnabled(false);
        }
    }//GEN-LAST:event_thumsbtnActionPerformed

    private void maazabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maazabtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        JTextField txt=new JTextField();
        jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(txt));
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
                int index=jTable2.getSelectedRow();
                int value = Integer.parseInt(txt.getText());
                int price=Integer.parseInt(model.getValueAt(index,3).toString());
                int result=value*price;
                model.setValueAt(result,index, 4);
            }
        });
        model.addRow(new Object[]{});
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="select * from menus where id=73";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();

            //dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("id"),rs.getString("subitems"),rs.getString("available/or_not"),rs.getInt("price")};
                dt.addRow(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            maazabtn.setEnabled(false);
        }
    }//GEN-LAST:event_maazabtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        int sum=0;
        int count=jTable2.getRowCount();
        for(int i=0;i<count;i++){
            try{
                sum=sum+Integer.parseInt(model.getValueAt(i, 4).toString());
            }catch(Exception e){
                
            }
        }
        txtprice.setText(Integer.toString(sum));
        }catch(Exception e){
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        if(txttablenum.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please enter table number!");
         }else if(txtuserid.getText().equals("")){
             JOptionPane.showMessageDialog(null,"please enter userid!");
          }else if(txtusername.getText().equals("")){
               JOptionPane.showMessageDialog(null,"please enter username!");
          }else if(txtprice.getText().equals("")){
               JOptionPane.showMessageDialog(null,"please select price!");
          }
         
         
         else{
            DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
            int count=jTable2.getRowCount();
            int id,rate,quantity;
            String menus;
            for(int i=0;i<count;i++){
                try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="insert into orderitemtosafe(id,menus,rate,quantity,tablenum,userid,username)values(?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            id=Integer.parseInt(model.getValueAt(i,0).toString());
            menus=(model.getValueAt(i,1).toString());
            rate=Integer.parseInt(model.getValueAt(i,3).toString());
            quantity=Integer.parseInt(model.getValueAt(i,5).toString());
            ps.setInt(1,id);
            ps.setString(2,menus);
            ps.setInt(3,rate);
            ps.setInt(4,quantity);
            ps.setInt(5,Integer.parseInt(txttablenum.getText()));
            ps.setInt(6, Integer.parseInt(txtuserid.getText()));
            ps.setString(7, txtusername.getText());
            ps.execute();
          //  ps.setInt(4,Integer.parseInt( txtprice.getText()));
            ps.execute();
            //JOptionPane.showMessageDialog(null,);
            }catch(Exception e){
                      
                    }
            }
          }
          JOptionPane.showMessageDialog(null,"order has been completed");
            
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     if(txtusername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please enter username number!");
         }else if(txtprice.getText().equals("")){
             JOptionPane.showMessageDialog(null,"please Select price!");
        }else{
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
        
           String username2=txtusername.getText();
           String price=txtprice.getText().toString();
           Statement stmt = con.createStatement();
           ResultSet rs=stmt.executeQuery("select * from orderitemtosafe where username='"+username2+"'");
           //stmt.setString(username2);
           //System.out.println("id menus rate  quantity  tablenum userid username");
           while (rs.next()) {
            int id = rs.getInt("id");
            String menus = rs.getString("menus");
            int rate = rs.getInt("rate");
            int quantity=rs.getInt("quantity");
            int tablenum=rs.getInt("tablenum");
            int userid=rs.getInt("userid");
            String username1=rs.getString("username");
           System.out.println("id              "+id);//+"   "+menus+"    "+rate+"    "+quantity+"    "+tablenum+"    "+userid+"    "+username1);
            System.out.println("menus          "+menus);
             System.out.println("rate          "+rate);
              System.out.println("quantity     "+quantity);
               System.out.println("tablenum    "+tablenum);
                System.out.println("userid     "+userid);
                 System.out.println("username  "+username1);
                 System.out.println("total price is   "+price);
         }
            JOptionPane.showMessageDialog(null,"bill is printed");
            this.setVisible(false);
            Login login=new Login();
            login.setVisible(true);
      }catch(Exception e){
         
      }
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
 
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInRestaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowniesCakebtn;
    private javax.swing.JButton angelcakebtn;
    private javax.swing.JButton applecakebtn;
    private javax.swing.JButton bananacakebtn;
    private javax.swing.JButton barbebtn;
    private javax.swing.JButton batatavada;
    private javax.swing.JButton batterncakenbtn;
    private javax.swing.JButton blackcakebtn;
    private javax.swing.JButton btnbecon;
    private javax.swing.JButton btncheese;
    private javax.swing.JButton btnchinese;
    private javax.swing.JButton btnrice;
    private javax.swing.JButton btnsmash;
    private javax.swing.JButton btnsteak;
    private javax.swing.JButton btnveg;
    private javax.swing.JButton btnveggie;
    private javax.swing.JButton carrotcakebtn;
    private javax.swing.JButton charlottCakebtn;
    private javax.swing.JButton checpizzabtn;
    private javax.swing.JButton cheesepizzabtn;
    private javax.swing.JButton chickenbtn;
    private javax.swing.JButton chickkenbtn;
    private javax.swing.JButton chinesesaladbtn;
    private javax.swing.JButton chisaladbtn;
    private javax.swing.JButton chocolateCakebtn;
    private javax.swing.JButton chowmeinbtn;
    private javax.swing.JButton cocabtn;
    private javax.swing.JButton cookiesladbtn;
    private javax.swing.JButton currybtn;
    private javax.swing.JButton cutletsbtn;
    private javax.swing.JButton eggbtn;
    private javax.swing.JButton eggsaladbtn;
    private javax.swing.JButton farmpizzabtn;
    private javax.swing.JButton fenugreekbtn;
    private javax.swing.JButton fishfrybtn;
    private javax.swing.JButton freshpizzabtn;
    private javax.swing.JButton friedbtn;
    private javax.swing.JButton fruitsaladbtn;
    private javax.swing.JButton gardensaladbtn;
    private javax.swing.JButton gobibtn;
    private javax.swing.JButton hydrabadibtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jeeraricebtn;
    private javax.swing.JButton kajuvadibtn;
    private javax.swing.JButton lemonbtn;
    private javax.swing.JButton lemongrassbtn;
    private javax.swing.JButton lolipopopbtn;
    private javax.swing.JButton maazabtn;
    private javax.swing.JButton masalafishbtn;
    private javax.swing.JButton mexicpizzabtn;
    private javax.swing.JButton nonvegpizzabtn;
    private javax.swing.JButton oatsbtn;
    private javax.swing.JButton panbtn;
    private javax.swing.JButton panepizzabtn;
    private javax.swing.JButton pannerbtn;
    private javax.swing.JButton pavbhajibtn;
    private javax.swing.JButton peppypizzabtn;
    private javax.swing.JButton pepsibtn;
    private javax.swing.JButton plainricebtn;
    private javax.swing.JButton puranpolibtn;
    private javax.swing.JButton ricekheerbtn;
    private javax.swing.JButton salmonbtn;
    private javax.swing.JButton singaporebtn;
    private javax.swing.JButton spanichbtn;
    private javax.swing.JButton spicybhedibtn;
    private javax.swing.JButton spritebtn;
    private javax.swing.JButton tamarindbtn;
    private javax.swing.JButton tandoooribtn;
    private javax.swing.JButton thumsbtn;
    private javax.swing.JButton tomatobtn;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txttablenum;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtusername;
    private javax.swing.JButton vegbtn;
    private javax.swing.JButton veggipizzabtn;
    private javax.swing.JButton waterbtn;
    // End of variables declaration//GEN-END:variables
}
