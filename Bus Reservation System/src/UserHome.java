
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserHome extends javax.swing.JFrame {

    String username;
    String bus_iddd;
    String seat;
    int Number_of_people;
    
    public UserHome(String userName) throws Exception {
        initComponents();

        username = userName;

        fillRequest((DefaultTableModel) jTable1.getModel());
        fillHistory((DefaultTableModel) jTable3.getModel(), username);
        seat = seatNo.getText();

    }
    
    public UserHome()
    {
        
    }
    public int numberofpeople()
    {
        return Number_of_people;
    }

    public static void fillRequest(DefaultTableModel m) {
        Object[] row = new Object[6];

        try {

            String link = "C:\\Users\\sameh\\Desktop\\BusTTReservation\\Bus Reservation\\Buses.txt";

            FileReader fr = new FileReader(link);
            BufferedReader br = new BufferedReader(fr);

            String id, line, dest, model, time;

            while ((line = br.readLine()) != null) {
                id = line.split(", ")[0];
                model = line.split(", ")[1];
                dest = line.split(", ")[2];
                time = line.split(", ")[3];
                row[0] = id;
                row[1] = model;
                row[2] = dest;
                row[3] = time;
                m.addRow(row);
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
     public static void fillHistory(DefaultTableModel m, String username) {
        Object[] row = new Object[6];

        try {

            String link = "C:\\Users\\sameh\\Desktop\\BusTTReservation\\Bus Reservation\\History.txt";

            FileReader fr = new FileReader(link);
            BufferedReader br = new BufferedReader(fr);

            String user, id, line, dest, model, time;



             while ((line = br.readLine()) != null) 
                    {    
                        user = line.substring(0).split(", ")[0];
                                                
                        if (username.equals(user)) 
                        {                                                      
                            id = line.split(", ")[1];                                        
                            model = line.split(", ")[2];                                        
                            dest = line.split(", ")[3];                                                                
                            time = line.split(", ")[4];                                        
                            row[0] = id;                                       
                            row[1] = model;                                      
                            row[2] = dest;                                        
                            row[3] = time;                                                        
                            m.addRow(row);                        
                                            
                        }
                    }
            
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
     
     public static void fillBusDetails(DefaultTableModel m,String username, String seat) {
        Object[] row = new Object[6];

        try {

            String link = "C:\\Users\\sameh\\Desktop\\BusTTReservation\\Bus Reservation\\History.txt";

            FileReader fr = new FileReader(link);
            BufferedReader br = new BufferedReader(fr);

            String user, id, line, dest, model, time;

            


             while ((line = br.readLine()) != null) 
                    {    
                        user = line.substring(0).split(", ")[0];
                                                
                        if (username.equals(user)) 
                        {                                                      
                            id = line.split(", ")[1];                                        
                            model = line.split(", ")[2];                                        
                            dest = line.split(", ")[3];                                                                
                            time = line.split(", ")[4];                                        
                            row[0] = id;                                       
                            row[1] = model;                                      
                            row[2] = dest;                                        
                            row[3] = time; 
                            row[4] = seat;
                            m.addRow(row);                        
                                            
                        }
                    }
            
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
     
       
    private boolean addHistory(String userName, String id, String model, String dest, String time) 
    {
        File file = new File("History.txt");
        try
        {
            FileWriter Output = new FileWriter(file,true);
            
            BufferedWriter br = new BufferedWriter(Output);
            
            PrintWriter pr = new PrintWriter(br);
            
            pr.print(userName);
            pr.print(", " + id);
            pr.print(", " + model);
            pr.print(", " + dest);
            pr.print(", " + time + "\n");
            pr.close();
            br.close();
            Output.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        return true;
    }
        private boolean addOrderInfo(String username, String streetnumber, String streetname,String area,String zipcode,String usernote) 
    {
        File file = new File("OrderInfo.txt");
        try
        {
            FileWriter Output = new FileWriter(file,true);
            
            BufferedWriter br = new BufferedWriter(Output);
            
            PrintWriter pr = new PrintWriter(br);
            
            pr.print(username);
            pr.print(", " + streetnumber);
            pr.print(", " + streetname);
            pr.print(", " + area);
            pr.print(", " + zipcode);
            pr.print(", " + usernote + "\n");
            pr.close();
            br.close();
            Output.close();
            Number_of_people++;
        }       
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        select_bus_id = new javax.swing.JTextField();
        Select = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        seatNo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StreetNumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        StreetName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Area = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ZipCode = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        userNote = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        userNF = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FName = new javax.swing.JLabel();
        MailF = new javax.swing.JLabel();
        LName = new javax.swing.JLabel();
        phoneNo = new javax.swing.JLabel();
        NationalIDF = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AddressF = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setName("jPanel1"); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\s-l300.jpg")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jButton1.setText("Bus Details");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Select Seat & Book");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Passenger Details");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Bus Routes");
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Log out");
        jButton6.setName("jButton6"); // NOI18N

        jButton4.setText("Finalization");
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton6))
        );

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N
        jTabbedPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTabbedPane1ComponentHidden(evt);
            }
        });

        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus_ID", "Bus_Model", "Bus_Destination", "Leaving_Time "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 819, 145));

        jLabel1.setText("Select Bus ID");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 242, 85, 26));

        select_bus_id.setName("select_bus_id"); // NOI18N
        jPanel3.add(select_bus_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 243, 97, -1));

        Select.setText("Select");
        Select.setName("Select"); // NOI18N
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });
        jPanel3.add(Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, 40));

        jTabbedPane1.addTab("Bus Route", jPanel3);

        jPanel5.setName("jPanel5"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus_ID", "Bus_Model", "Bus_Destination", "Leaving_Time ", "Seat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setName("jTable2"); // NOI18N
        jScrollPane2.setViewportView(jTable2);

        jButton9.setText("Confirm");
        jButton9.setName("jButton9"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(789, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bus Details", jPanel5);

        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Slide1 (2).jpg")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jLabel19.setText("Insert the seat number from below");
        jLabel19.setName("jLabel19"); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        seatNo.setName("seatNo"); // NOI18N
        jPanel2.add(seatNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 140, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setText("Selecting seat & booking");
        jLabel20.setName("jLabel20"); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jButton8.setText("Book");
        jButton8.setName("jButton8"); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, 40));

        jTabbedPane1.addTab("Seat & Book", jPanel2);

        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("Order Finalization");
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel11.setText("Address:");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 87, 85, 26));

        jLabel2.setText("Street Number");
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 131, 85, 26));

        StreetNumber.setName("StreetNumber"); // NOI18N
        StreetNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StreetNumberKeyPressed(evt);
            }
        });
        jPanel4.add(StreetNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 132, 133, -1));

        jLabel12.setText("Street Name");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 200, 85, 26));

        StreetName.setName("StreetName"); // NOI18N
        StreetName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StreetNameKeyPressed(evt);
            }
        });
        jPanel4.add(StreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 201, 133, -1));

        jLabel15.setText("Area");
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 257, 85, 26));

        Area.setName("Area"); // NOI18N
        Area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AreaKeyPressed(evt);
            }
        });
        jPanel4.add(Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 258, 133, -1));

        jLabel16.setText("Zip Code");
        jLabel16.setName("jLabel16"); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 324, 85, 26));

        ZipCode.setName("ZipCode"); // NOI18N
        ZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ZipCodeKeyPressed(evt);
            }
        });
        jPanel4.add(ZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 325, 133, -1));

        jLabel17.setText("Note");
        jLabel17.setName("jLabel17"); // NOI18N
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 396, -1, -1));

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        userNote.setColumns(20);
        userNote.setRows(5);
        userNote.setName("userNote"); // NOI18N
        jScrollPane4.setViewportView(userNote);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 396, -1, -1));

        jButton7.setText("Submit");
        jButton7.setName("jButton7"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 492, -1, 40));

        jTabbedPane1.addTab("Finalization", jPanel4);

        jPanel6.setName("jPanel6"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Passenger Details");
        jLabel5.setName("jLabel5"); // NOI18N

        userNF.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        userNF.setName("userNF"); // NOI18N

        jLabel6.setText("First Name");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText("Last Name");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setText("Mail");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setText("Phone Number");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setText("National ID");
        jLabel10.setName("jLabel10"); // NOI18N

        FName.setName("FName"); // NOI18N

        MailF.setName("MailF"); // NOI18N

        LName.setName("LName"); // NOI18N

        phoneNo.setName("phoneNo"); // NOI18N

        NationalIDF.setName("NationalIDF"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("History");
        jLabel13.setName("jLabel13"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus_ID", "Bus_Model", "Bus_Destination", "Leaving_Time "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setName("jTable3"); // NOI18N
        jScrollPane3.setViewportView(jTable3);

        jLabel18.setText("Address");
        jLabel18.setName("jLabel18"); // NOI18N

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        AddressF.setEditable(false);
        AddressF.setColumns(20);
        AddressF.setRows(5);
        AddressF.setName("AddressF"); // NOI18N
        jScrollPane5.setViewportView(AddressF);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(129, 129, 129)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NationalIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(319, 319, 319))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MailF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(442, 442, 442))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(64, 64, 64)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(44, 44, 44)
                                .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(MailF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NationalIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel9)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10)))
                .addGap(93, 93, 93)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Passenger Details", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        
        fillBusDetails((DefaultTableModel) jTable2.getModel(), username,seat);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            String link = "C:\\Users\\sameh\\Desktop\\BusTTReservation\\Bus Reservation\\Register.txt";
            
            FileReader fr = new FileReader(link);
            BufferedReader br = new BufferedReader(fr);
            
            String link1 = "C:\\Users\\sameh\\Desktop\\BusTTReservation\\Bus Reservation\\Buses.txt";
            
            FileReader fr1 = new FileReader(link1);
            BufferedReader br1 = new BufferedReader(fr1);
            
            String link2 = "C:\\Users\\sameh\\Desktop\\BusTTReservation\\Bus Reservation\\OrderInfo.txt";
            
            FileReader fr2 = new FileReader(link2);
            BufferedReader br2 = new BufferedReader(fr2);

            String line, F_name, L_name, mail, phone_No, national_ID, user;
            
            while ((line = br.readLine()) != null) {
               
                user = line.split(", ")[6];

                if (username.equals(user)) {
                    F_name = line.split(", ")[1];
                    L_name = line.split(", ")[2];
                    mail = line.split(", ")[3];
                    phone_No = line.split(", ")[4];
                    national_ID = line.split(", ")[5];

                    FName.setText(F_name);
                    LName.setText(L_name);
                    MailF.setText(mail);
                    phoneNo.setText(phone_No);
                    NationalIDF.setText(national_ID);
                }
            }
                    
            String id, line1, dest, model, time;
                                
          while ((line1 = br1.readLine()) != null) 
            {
               id = line1.substring(0).split(", ")[0];
                              
                if(select_bus_id.getText().equals(id))
                {
                id      = line1.split(", ")[0];
                model   = line1.split(", ")[1];
                dest    = line1.split(", ")[2];
                time    = line1.split(", ")[3];
                
                addHistory(username,id,model,dest,time); 
                
                }
            }
          
          String Address,line2,user2,street_number,street_name,aarea,zip_code;
          
          while ((line2 = br2.readLine()) != null) 
            {
               user2 = line2.substring(0).split(", ")[0];
                              
                if(username.equals(user2))
                {
                street_number  = line2.split(", ")[1];
                street_name    = line2.split(", ")[2];
                aarea          = line2.split(", ")[3];
                zip_code       = line2.split(", ")[4];
                
                Address = line2.substring(0);
                
                AddressF.setText(Address);
                                
                }
            }
  
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        jTabbedPane1.setSelectedIndex(4);   
                        
           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTabbedPane1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1ComponentHidden

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        
        if (row >= 0 && col == 0) 
        {
            
            Object valueAt = model.getValueAt(row, col).toString();

            select_bus_id.setText(valueAt.toString());
            
            bus_iddd = select_bus_id.getText();
        }


    }//GEN-LAST:event_SelectActionPerformed

    private void StreetNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StreetNumberKeyPressed
       
    }//GEN-LAST:event_StreetNumberKeyPressed

    private void StreetNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StreetNameKeyPressed
       
        
    }//GEN-LAST:event_StreetNameKeyPressed

    private void AreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AreaKeyPressed
        
    }//GEN-LAST:event_AreaKeyPressed

    private void ZipCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ZipCodeKeyPressed

    }//GEN-LAST:event_ZipCodeKeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(StreetNumber.getText() == null || StreetNumber.getText().isEmpty() || StreetName.getText() == null || StreetName.getText().isEmpty() || Area.getText() == null || Area.getText().isEmpty() || ZipCode.getText() == null ||  ZipCode.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Must Enter values in all fields !!!");
            }          
        addOrderInfo(username,StreetNumber.getText(),StreetName.getText(),Area.getText(),ZipCode.getText(),userNote.getText());
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Seat booked");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserHome().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(UserHome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AddressF;
    private javax.swing.JTextField Area;
    private javax.swing.JLabel FName;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel MailF;
    private javax.swing.JLabel NationalIDF;
    private javax.swing.JButton Select;
    private javax.swing.JTextField StreetName;
    private javax.swing.JTextField StreetNumber;
    private javax.swing.JTextField ZipCode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel phoneNo;
    private javax.swing.JTextField seatNo;
    private javax.swing.JTextField select_bus_id;
    private javax.swing.JLabel userNF;
    private javax.swing.JTextArea userNote;
    // End of variables declaration//GEN-END:variables


}
