
//Importing all the necessary pre-made classes. 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Carmen
 */
public class HarryPotterBoardGame extends javax.swing.JFrame {
    
    int [] tiles = {0,2,0,1,0,0,2,1,0,2,0,1,0,3,2,1,0,0,1,3,0,1,0,2,0,1,0,0,1,3,0,1,0,1,0,3,0,1,0,1,0,0,2,1,0,0,3,1,4}; // create an array to hold each tile
    // 0 does nothing, 1 is trivia, 2 is move forward, 3 is move back, 4 is end
    
    int numSpaces1 = 0, numSpaces2 = 0, turn = 1, numOfPlayers, oldNumSpaces1, oldNumSpaces2; // holds the position of the user
    Boolean answerQuestion = false;
    //arraylist to hold all the trivia questions and answers
    ArrayList <TriviaQuestion> triviaList = new ArrayList<TriviaQuestion> ();
    //variables to store the total points of the players
    int points1 = 0, points2 = 0;
    int triviaQuestionNumber = 0; // stores which trivia question is being answered
    
    //import icons into file and assign them to variables
    //import spinner icons for each of the possible number of tiles moved
    ImageIcon a = new ImageIcon("1spinner.jpg");
    ImageIcon b = new ImageIcon("2spinner.jpg");
    ImageIcon c = new ImageIcon("3spinner.jpg");
    ImageIcon d = new ImageIcon("4spinner.jpg");
    ImageIcon e = new ImageIcon("defaultSpinner.jpg");
    //import start tile icons
    ImageIcon start = new ImageIcon("startTile.jpg");
    ImageIcon startH = new ImageIcon("startTileHarry.jpg");
    ImageIcon startV = new ImageIcon("startTileVoldemort.jpg");
    ImageIcon startHV = new ImageIcon("startTileHarryVoldemort.jpg");
    //import end tile icons
    ImageIcon end = new ImageIcon("endTile.jpg");
    ImageIcon endH = new ImageIcon("endTileHarry.jpg");
    ImageIcon endV = new ImageIcon("endTileVoldemort.jpg");
    ImageIcon endHV = new ImageIcon("endTileHarryVoldemort.jpg");
    //import plain tile icons
    ImageIcon plain = new ImageIcon("plainTile.png");
    ImageIcon plainH = new ImageIcon("plainTileHarry.jpg");
    ImageIcon plainV = new ImageIcon("plainTileVoldemort.jpg");
    ImageIcon plainHV = new ImageIcon("plainTileHarryVoldemort.jpg");
    //import trivia tile icons
    ImageIcon trivia = new ImageIcon("triviaTile.png");
    ImageIcon triviaH = new ImageIcon("triviaTileHarry.jpg");
    ImageIcon triviaV = new ImageIcon("triviaTileVoldemort.jpg");
    ImageIcon triviaHV = new ImageIcon("triviaTileHarryVoldemort.jpg");
    // import advance tile icons
    ImageIcon adv = new ImageIcon("advanceTile.jpg");
    ImageIcon advH = new ImageIcon("advanceTileHarry.jpg");
    ImageIcon advV = new ImageIcon("advanceTileVoldemort.jpg");
    ImageIcon advHV = new ImageIcon("advanceTileHarryVoldemort.jpg");
    // import back tile icons
    ImageIcon back = new ImageIcon("backTile.jpg");
    ImageIcon backH = new ImageIcon("backTileHarry.jpg");
    ImageIcon backV = new ImageIcon("backTileVoldemort.jpg");
    ImageIcon backHV = new ImageIcon("backTileHarryVoldemort.jpg");
    /**
     * Creates new form HarryPotterBoardGame
     */
    public HarryPotterBoardGame() {
        initComponents();
        //an ArrayList to hold the information from the file
        ArrayList<String> fileContent = new ArrayList<String> ();
        //helps to locate the file
        BufferedReader br = null;
        try {
            //opens the specific file for reading
            br = new BufferedReader(new FileReader("TriviaList.txt"));
            //will hold the information on each line of the file
            String phrase;
            //reads info from file, line-by-line until it sees "null" (end of line) 
            //adds the information to the arraylist
            while ((phrase = br.readLine()) != null ){
                fileContent.add(phrase);
            }
         //restricts program from reading past the end of file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //closes the file
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        //converts ArrayList to array so that it can be searched
        String [] file = new String[fileContent.size()];
        fileContent.toArray(file);
        
        //for-loop searches the array
        //creates new object for every question, and stores the question, answers and the correct answer information in object
        for (int i = 0; i<file.length; i+=8){
            TriviaQuestion tQ = new TriviaQuestion(file[i+1], file[i+6], Integer.parseInt(file[i]));
            tQ.answers(file[i+2], file[i+3], file[i+4], file[i+5]);
            triviaList.add(tQ);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStart = new javax.swing.JLabel();
        lblTile1 = new javax.swing.JLabel();
        lblTile2 = new javax.swing.JLabel();
        lblTile3 = new javax.swing.JLabel();
        lblTile4 = new javax.swing.JLabel();
        lblTile5 = new javax.swing.JLabel();
        lblTile6 = new javax.swing.JLabel();
        lblTile7 = new javax.swing.JLabel();
        lblTile8 = new javax.swing.JLabel();
        lblTile9 = new javax.swing.JLabel();
        lblTile10 = new javax.swing.JLabel();
        lblTile11 = new javax.swing.JLabel();
        lblTile12 = new javax.swing.JLabel();
        lblTile13 = new javax.swing.JLabel();
        lblTile14 = new javax.swing.JLabel();
        lblTile15 = new javax.swing.JLabel();
        lblTile16 = new javax.swing.JLabel();
        lblTile17 = new javax.swing.JLabel();
        lblTile18 = new javax.swing.JLabel();
        lblTile19 = new javax.swing.JLabel();
        lblTile20 = new javax.swing.JLabel();
        lblTile21 = new javax.swing.JLabel();
        lblTile22 = new javax.swing.JLabel();
        lblTile23 = new javax.swing.JLabel();
        lblTile24 = new javax.swing.JLabel();
        lblTile25 = new javax.swing.JLabel();
        lblTile26 = new javax.swing.JLabel();
        lblTile27 = new javax.swing.JLabel();
        lblTile28 = new javax.swing.JLabel();
        lblTile29 = new javax.swing.JLabel();
        lblTile30 = new javax.swing.JLabel();
        lblTile31 = new javax.swing.JLabel();
        lblTile32 = new javax.swing.JLabel();
        lblTile33 = new javax.swing.JLabel();
        lblTile34 = new javax.swing.JLabel();
        lblTile35 = new javax.swing.JLabel();
        lblTile36 = new javax.swing.JLabel();
        lblTile37 = new javax.swing.JLabel();
        lblTile38 = new javax.swing.JLabel();
        lblTile39 = new javax.swing.JLabel();
        lblTile40 = new javax.swing.JLabel();
        lblTile41 = new javax.swing.JLabel();
        lblTile42 = new javax.swing.JLabel();
        lblTile43 = new javax.swing.JLabel();
        lblTile44 = new javax.swing.JLabel();
        lblTile45 = new javax.swing.JLabel();
        lblTile46 = new javax.swing.JLabel();
        lblTile47 = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        btnPlayAlone = new javax.swing.JButton();
        btnPlayWithSomeone = new javax.swing.JButton();
        btnSpinner = new javax.swing.JButton();
        btnMove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startTile.jpg"))); // NOI18N

        lblTile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advanceTile.jpg"))); // NOI18N

        lblTile2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advanceTile.jpg"))); // NOI18N

        lblTile7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advanceTile.jpg"))); // NOI18N

        lblTile10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backTile.jpg"))); // NOI18N

        lblTile14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advanceTile.jpg"))); // NOI18N

        lblTile15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backTile.jpg"))); // NOI18N

        lblTile20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advanceTile.jpg"))); // NOI18N

        lblTile24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backTile.jpg"))); // NOI18N

        lblTile30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backTile.jpg"))); // NOI18N

        lblTile36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advanceTile.jpg"))); // NOI18N

        lblTile43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblTile44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plainTile.png"))); // NOI18N

        lblTile46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backTile.jpg"))); // NOI18N

        lblTile47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triviaTile.png"))); // NOI18N

        lblEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/endTile.jpg"))); // NOI18N

        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        Output.setColumns(20);
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Title.png"))); // NOI18N
        jLabel50.setToolTipText("");

        btnPlayAlone.setBackground(new java.awt.Color(255, 153, 0));
        btnPlayAlone.setText("Play Alone");
        btnPlayAlone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAloneActionPerformed(evt);
            }
        });

        btnPlayWithSomeone.setBackground(new java.awt.Color(255, 153, 0));
        btnPlayWithSomeone.setText("Play Against Someone");
        btnPlayWithSomeone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayWithSomeoneActionPerformed(evt);
            }
        });

        btnSpinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultSpinner.jpg"))); // NOI18N
        btnSpinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpinnerActionPerformed(evt);
            }
        });

        btnMove.setBackground(new java.awt.Color(204, 204, 204));
        btnMove.setText("Move");
        btnMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTile28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile33)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblTile42)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile43)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile44)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile45)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile46)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTile47)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblEnd)
                            .addGap(85, 85, 85)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTile14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTile15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTile13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTile12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTile16)
                                    .addComponent(lblTile11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTile17)
                                    .addComponent(lblTile10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTile18)
                                    .addComponent(lblTile9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTile8)
                                    .addComponent(lblTile19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTile7)
                                    .addComponent(lblTile20)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTile27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTile41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTile35)))
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPlayAlone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPlayWithSomeone)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMove)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMove)
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlayAlone)
                            .addComponent(btnPlayWithSomeone)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEnd)
                            .addComponent(lblTile47)
                            .addComponent(lblTile46)
                            .addComponent(lblTile45)
                            .addComponent(lblTile44)
                            .addComponent(lblTile43)
                            .addComponent(lblTile42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTile39)
                            .addComponent(lblTile41)
                            .addComponent(lblTile37)
                            .addComponent(lblTile38)
                            .addComponent(lblTile40)
                            .addComponent(lblTile36)
                            .addComponent(lblTile35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTile28)
                            .addComponent(lblTile29)
                            .addComponent(lblTile30)
                            .addComponent(lblTile31)
                            .addComponent(lblTile33)
                            .addComponent(lblTile32)
                            .addComponent(lblTile34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTile23)
                                    .addComponent(lblTile21)
                                    .addComponent(lblTile27)
                                    .addComponent(lblTile26)
                                    .addComponent(lblTile24)
                                    .addComponent(lblTile25)
                                    .addComponent(lblTile22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTile19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTile8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblTile18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblTile9))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblTile20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblTile7))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTile10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTile11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTile17, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblTile16, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblTile14, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblTile15, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTile12, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblTile13, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                    .addComponent(btnSpinner, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStart, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTile1)
                                        .addComponent(lblTile2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTile3)
                                .addComponent(lblTile4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblTile5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTile6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayAloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAloneActionPerformed
        numOfPlayers = 1; // set the number of players to 1
        lblStart.setIcon(startHV); //Display user icon on Start tile. 
        Output.append("You are Harry Potter!\n"); // display which character the user is
        Output.append("Press the spinner to start.\n");//display start message
    }//GEN-LAST:event_btnPlayAloneActionPerformed

    private void btnPlayWithSomeoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayWithSomeoneActionPerformed
        numOfPlayers = 2; // set the number of players to 2
        lblStart.setIcon(startHV);// Display user and computer icon. 
        Output.append("Player 1 is Harry Potter!\n"); // display which character the user is
        Output.append("Player 2 is Voldemort!\n"); // display which character the user is
        Output.append("Harry Potter, press the spinner to start.\n");// display start message      
        
    }//GEN-LAST:event_btnPlayWithSomeoneActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
        if (numOfPlayers == 1){ // determine if there is only one player 
            if(numSpaces1 >= 48){ // determine if user has reached the end of the board
                numSpaces1 = TileFunction(48, 1, numSpaces2);
                numSpaces1 = 48; // set the number of spaces moved to 48
                removePlayerPosition(1,numSpaces2); //This removes the icon from the previous tile.
                Output.setText("Congratulations! You have reached the end!\n"); // output a congratulations message
                if (numSpaces1 != numSpaces2){ // determine if both players have reached the end or not
                    lblEnd.setIcon(endH); // display only player one at the end
                    computerTurn();
                    points1 += 3; // adds 3 bonus points to the player (user) that reached the end of the board first
                }
                else{
                    lblEnd.setIcon(endHV); // display both players at the end
                    calcPoints(points1, points2);
                }
            }
            else{
                numSpaces1 += TileFunction(numSpaces1,1,numSpaces2);  // call tile function to perform the function of the tile landed on 
                if(numSpaces2 != 48){
                    Output.append("Computer's turn!\n"); // display a computer's turn message 
                }
                //Creating a timer to make delays 
                Timer timer = new Timer();
                //What the timer will do 
                TimerTask wait = new TimerTask(){
                    @Override
                    public void run(){
                        computerTurn();
                    }
                };
                if ((numSpaces1 != 3)&&(numSpaces1 != 7)&&(numSpaces1 != 11)&&(numSpaces1 != 15)&&(numSpaces1 != 18)&&(numSpaces1 != 21)&&(numSpaces1 != 25)&&(numSpaces1 != 28)&& (numSpaces1 != 31)&&(numSpaces1 != 33)&&(numSpaces1 != 37)&&(numSpaces1 != 39)&&(numSpaces1 != 43)&&(numSpaces1 != 47)){
                    //Schedule the timer for 3 seconds
                    timer.schedule(wait, 3000);
                }else{
                    //Schedule timer for 10 seconds (if it's a trivia tile)
                    timer.schedule(wait, 10000);
                }
                  

                
            }
            turn++; // increase the number of turns by 1     
                  
            
        }
        //2 player game
        else{
            if(turn%2 != 0){ // determine if it is the first player's turn or the second player's turn
                if(numSpaces1 >= 48){ // determine if the user has reached the end
                    numSpaces1 = 48; // set the number of spaces moved to 48
                    removePlayerPosition(1,numSpaces2); //This removes the icon from the previous tile.
                    Output.setText("Congratulations! You have reached the end!\n"); // output a congratulations message
                    if (numSpaces1 != numSpaces2){ // determine if both players have reached the end or not
                        lblEnd.setIcon(endH); // display only player one at the end
                        points1 += 3; // adds 3 bonus points to player 1's total points
                        Output.append("It is Voldemort's turn! Press the spinner.\n"); // output whose turn is next
                    }
                    else{
                        lblEnd.setIcon(endHV); // display both players at the end
                        calcPoints(points1, points2); //calls function to determine winner
                    }
                    
                }
                else{
                    numSpaces1 += TileFunction(numSpaces1,1,numSpaces2);  // call tile function to perform the function of the tile landed on 
                    if(numSpaces2 != 48){
                        Output.append("It is Voldemort's turn! Press the spinner.\n"); // output whose turn is next
                    }
                }
                turn++; // increase the number of turns by 1
            }
            else{
                if(numSpaces2 >= 48){ // determine if the user has reached the end
                    Output.setText("Congratulations! Voldemort has reached the end!\n"); // output a congratulations message
                    numSpaces2 = 48; // set the number of spaces moved to 48
                    removePlayerPosition(2,numSpaces1); //This removes the icon from the previous tile.
                    if (numSpaces1 != numSpaces2){ // determine if both players have reached the end or not
                        points2 += 3; //adds 3 points to player 2's total points                        
                        lblEnd.setIcon(endV); // display only player two at the end
                        Output.append("It is Harry Potter's turn! Press the spinner.\n"); // output whose turn is next
                    }
                    else{
                        lblEnd.setIcon(endHV); // display both players at the end
                        calcPoints(points1, points2); //calls function to determine winner
                    }
                }
                else{
                    numSpaces2 += TileFunction(numSpaces2,2,numSpaces1);  // call tile function to perform the function of the tile landed on 
                    
                    if(numSpaces2 != 48){
                        Output.append("It is Harry Potter's turn! Press the spinner.\n"); // output whose turn is next
                    }
                
                }
                turn++; // increase the number of turns by 1
            }
            
        }
         
        resetSpinner(); // reset the spinner ti default spinner by calling the resetSpinner function                                            
        
    }//GEN-LAST:event_btnMoveActionPerformed

    private void btnSpinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpinnerActionPerformed
       Output.setText(""); // clear the output screen
        if (numOfPlayers == 1){ // determine the number of players
            spinner(1); // call the spinner function for the user
        }
        else if (numOfPlayers == 2){ // determine the number of players
            if(turn%2 != 0){ // determine if it is the first player's turn or the second player's turn
                spinner(1); // call the spinner function for the first player
            }
            else{
                spinner(2); // call the spinner function for the second player
            }
        }
    }//GEN-LAST:event_btnSpinnerActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        //stores the correct answer for that question (A, B, C, D)
        String buttonValue;
        //determines if the number of players is two
        if (numOfPlayers == 2){
            //searches elements (objects) in arraylist
            for(TriviaQuestion tQ: triviaList){
                //if the question from the textbox, matches a question in an element, its correct answer button is stored in variable
                if (triviaQuestionNumber == tQ.questionNumber){
                    buttonValue = tQ.button;
                    //if the question's correct answer button matches button A, output congratulations message
                    if (buttonValue.equals("A")){                    
                        Output.setText("Correct Answer! You get 1 point!");
                        //gives one additional point to appropriate player
                        if (turn%2 != 0){
                            points1 ++; //adds point for player 1
                        }
                        else {
                            points2 ++;//adds point for player 2
                        }
                    }          
                    else{
                        //if wrong button clicked, wrong answer message displayed
                        Output.setText("Sorry, wrong answer. No additional points.");
                    }
                }
            }   
        }
        else {
            if (turn%2 != 0){
                //searches elements (objects) in arraylist
                for(TriviaQuestion tQ: triviaList){
                    //if the question from the textbox, matches a question in an element, its correct answer button is stored in variable
                    if (triviaQuestionNumber == tQ.questionNumber){
                        buttonValue = tQ.button;
                        //if the question's correct answer button matches button A, output congratulations message
                        if (buttonValue.equals("A")){                    
                            Output.setText("Correct Answer! You get 1 point!");
                            points1 ++; //add points to player 1's total points
                        }
                        else{
                            //if wrong button clicked, wrong answer message displayed
                            Output.setText("Sorry, wrong answer. No additional points.");
                        }
                    }
                }
            }
            else{
                int randomNo = (int)Math.ceil(Math.random()*4); //generates random number between 1 and 4 and stores in variable
                //1 corresponds with the answer A - correct answer, output congratulations message
                if (randomNo == 1){
                    Output.setText("Correct Answer! Computer get's 1 point!");
                    points2++; //add 1 point to computer's total points
                }
                else{
                    //if wrong button clicked, wrong answer message displayed
                    Output.setText("Sorry, wrong answer. No additional points.");
                }
            }
        }
        //Clear all the button's text.
        A.setText("");
        B.setText("");
        C.setText("");
        D.setText("");
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        //stores the correct answer for that question (A, B, C, D)
        String buttonValue;
        //determines if the number of players is two
        if (numOfPlayers == 2){
            //searches elements (objects) in arraylist
            for(TriviaQuestion tQ: triviaList){
                //if the question from the textbox, matches a question in an element, its correct answer button is stored in variable
                if (triviaQuestionNumber == tQ.questionNumber){
                    buttonValue = tQ.button;
                    //if the question's correct answer button matches button B, output congratulations message
                    if (buttonValue.equals("B")){                    
                        Output.setText("Correct Answer! You get 1 point!");
                        //gives one additional point to appropriate player
                        if (turn%2 != 0){
                            points1 ++; //adds point for player 1
                        }
                        else {
                            points2 ++;//adds point for player 2
                        }
                    }          
                    else{
                        //if wrong button clicked, wrong answer message displayed
                        Output.setText("Sorry, wrong answer. No additional points.");
                    }
                }
            }   
        }
        else {
            if (turn%2 != 0){
                //searches elements (objects) in arraylist
                for(TriviaQuestion tQ: triviaList){
                    //if the question from the textbox, matches a question in an element, its correct answer button is stored in variable
                    if (triviaQuestionNumber == tQ.questionNumber){
                        buttonValue = tQ.button;
                        //if the question's correct answer button matches button B, output congratulations message
                        if (buttonValue.equals("B")){                    
                            Output.setText("Correct Answer! You get 1 point!");
                            points1 ++; //add points to player 1's total points
                        }
                        else{
                            //if wrong button clicked, wrong answer message displayed
                            Output.setText("Sorry, wrong answer. No additional points.");
                        }
                    }
                }
            }
            else{
                int randomNo = (int)Math.ceil(Math.random()*4); //generates random number between 1 and 4 and stores in variable
                //2 corresponds with the answer B - correct answer, output congratulations message
                if (randomNo == 2){
                    Output.setText("Correct Answer! Computer get's 1 point!");
                    points2++; //add 1 point to computer's total points
                }
                else{
                    //if wrong button clicked, wrong answer message displayed
                    Output.setText("Sorry, wrong answer. No additional points.");
                }
            }
        }     
        //Clear all the button's text.
        A.setText("");
        B.setText("");
        C.setText("");
        D.setText("");
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        //stores the correct answer for that question (A, B, C, D)
        String buttonValue;
        //determines if the number of players is two
        if (numOfPlayers == 2){
            //searches elements (objects) in arraylist
            for(TriviaQuestion tQ: triviaList){
                //if the question from the textbox, matches a question in an element, its correct answer button is stored in variable
                if (triviaQuestionNumber == tQ.questionNumber){
                    buttonValue = tQ.button;
                    //if the question's correct answer button matches button C, output congratulations message
                    if (buttonValue.equals("C")){                    
                        Output.setText("Correct Answer! You get 1 point!");
                        //gives one additional point to appropriate player
                        if (turn%2 != 0){
                            points1 ++; //adds point for player 1
                        }
                        else {
                            points2 ++;//adds point for player 2
                        }
                    }          
                    else{
                        //if wrong button clicked, wrong answer message displayed
                        Output.setText("Sorry, wrong answer. No additional points.");
                    }
                }
            }   
        }
        else {
            if (turn%2 != 0){
                //searches elements (objects) in arraylist
                for(TriviaQuestion tQ: triviaList){
                    //if the question from the textbox, matches a question in an element, its correct answer button is stored in variable
                    if (triviaQuestionNumber == tQ.questionNumber){
                        buttonValue = tQ.button;
                        //if the question's correct answer button matches button C, output congratulations message
                        if (buttonValue.equals("C")){                    
                            Output.setText("Correct Answer! You get 1 point!");
                            points1 ++; //add points to player 1's total points
                        }
                        else{
                            //if wrong button clicked, wrong answer message displayed
                            Output.setText("Sorry, wrong answer. No additional points.");
                        }
                    }
                }
            }
            else{
                int randomNo = (int)Math.ceil(Math.random()*4); //generates random number between 1 and 4 and stores in variable
                //3 corresponds with the answer C - correct answer, output congratulations message
                if (randomNo == 3){
                    Output.setText("Correct Answer! Computer get's 1 point!");
                    points2++; //add 1 point to computer's total points
                }
                else{
                    //if wrong button clicked, wrong answer message displayed
                    Output.setText("Sorry, wrong answer. No additional points.");
                }
            }
        }
        
        //Clear all the button's text.
        A.setText("");
        B.setText("");
        C.setText("");
        D.setText("");
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        //stores the correct answer for that question (A, B, C, D)
        String buttonValue;
        //determines if the number of players is two
        if (numOfPlayers == 2){
            //searches elements (objects) in arraylist
            for(TriviaQuestion tQ: triviaList){
                //if the question from the textbox, matches a question in an element, its correct answer button is stored in variable
                if (triviaQuestionNumber == tQ.questionNumber){
                    buttonValue = tQ.button;
                    //if the question's correct answer button matches button D, output congratulations message
                    if (buttonValue.equals("D")){                    
                        Output.setText("Correct Answer! You get 1 point!");
                        //gives one additional point to appropriate player
                        if (turn%2 != 0){
                            points1 ++; //adds point for player 1
                        }
                        else {
                            points2 ++;//adds point for player 2
                        }
                    }          
                    else{
                        //if wrong button clicked, wrong answer message displayed
                        Output.setText("Sorry, wrong answer. No additional points.");
                    }
                }
            }   
        }
        else {
            if (turn%2 != 0){
                //searches elements (objects) in arraylist
                for(TriviaQuestion tQ: triviaList){
                    //if the question from the textbox, matches a question in an element, its correct answer button is stored in variable
                    if (triviaQuestionNumber == tQ.questionNumber){
                        buttonValue = tQ.button;
                        //if the question's correct answer button matches button D, output congratulations message
                        if (buttonValue.equals("D")){                    
                            Output.setText("Correct Answer! You get 1 point!");
                            points1 ++; //add points to player 1's total points
                        }
                        else{
                            //if wrong button clicked, wrong answer message displayed
                            Output.setText("Sorry, wrong answer. No additional points.");
                        }
                    }
                }
            }
            else{
                int randomNo = (int)Math.ceil(Math.random()*4); //generates random number between 1 and 4 and stores in variable
                //4 corresponds with the answer D - correct answer, output congratulations message
                if (randomNo == 4){
                    Output.setText("Correct Answer! Computer get's 1 point!");
                    points2++; //add 1 point to computer's total points
                }
                else{
                    //if wrong button clicked, wrong answer message displayed
                    Output.setText("Sorry, wrong answer. No additional points.");
                }
            }
        }
        
        //Clear all the button's text.
        A.setText("");
        B.setText("");
        C.setText("");
        D.setText("");
    }//GEN-LAST:event_DActionPerformed
    /*
    Name: calcPoints
    Function: to see which player's points are greater and to determine a winner
    Parameters: player 1's points and player 2's points
    Return: nothing
    */
    public void calcPoints(int p1, int p2){
        //player 1 points > player 2 points, dispose of the current screen and show that Harry won in a new screen
        if (p1 > p2){
            dispose ();
            new EndScreen2().setVisible(true);
        }
        //if player 1 points < player points, dispose of screen and show that voldemort won in a new screen 
        else if (p1<p2){
            dispose();
            new EndScreen().setVisible(true);
        }
        //if both points are the same, show that it is a ties in a new screen
        else{
            dispose();
            new EndScreen3().setVisible(true);
        }
    } 
    
    
    
    /*
    Name: computerTurn
    Function: have the computer play its turn
    Parameters: none
    Return: nothing
    */
    public void computerTurn(){
        if(numSpaces1 != 48 && numSpaces2 != 48){ // determine if both players have not yet reached the end
            // have the computer play
            spinner(2); // call the spinner function for the computer
            if (numSpaces2 >= 48){ // determine if the computer reached the end after spinning
                numSpaces2 = 48; // set numSpaces 2 to 48
                removePlayerPosition(2,numSpaces1); //This removes the icon from the previous tile.
                Output.append("The computer has reached the end!\n"); // output a congratulations message and determine the winner 
                lblEnd.setIcon(endV); // display only player two at the end
                Output.append("It's Harry Potter's turn! Press the spinner.\n"); // output whose turn is next
            }
            else{
                numSpaces2 += TileFunction(numSpaces2,2,numSpaces1);  // call tile function to perform the function of the tile landed on 
                Output.append("It's Harry Potter's turn! Press the spinner.\n"); // output whose turn is next  
            }
        }
        else if(numSpaces1 == 48 && numSpaces2 != 48){ // determine if the player has reached the end but the computer hasnt
            // have the computer play
            spinner(2); // call the spinner function for the computer
            if (numSpaces2 >= 48){ // determine if the computer has reached the end after spinning
                numSpaces2 = 48; // set numSpaces 2 to 48
                removePlayerPosition(2,numSpaces1); //This removes the icon from the previous tile.
                Output.append("The computer has reached the end!\n"); // output a congratulations message and determine the winner
                lblEnd.setIcon(endHV); // display only player two at the end
                Output.append("You have both reached the end!\n"); // output the both players have reached the end
                calcPoints(points1, points2); //calls function to calculate who won
            }
            else{
                numSpaces2 += TileFunction(numSpaces2,2,numSpaces1);  // call tile function to perform the function of the tile landed on 
                computerTurn(); // call computerTurn again as the user has already reached the end
            }
        }
        else if(numSpaces1 != 48 && numSpaces2 == 48){ // determine if the computer has reached the end before the user
            points2 += 3; //adds bonus points to computer's total score
            Output.append("It's Harry Potter's turn! Press the spinner.\n"); // output whose turn is next              
        }
    }
    /*
    Name: resetSpinner
    Function: to reset the spinner icon after each player's turn
    Parameters: none
    Returns: nothing
    */
    public void resetSpinner(){
        btnSpinner.setIcon(e); // reset spinner after a turn
    }
    
    /*
    Name: spinner
    Function: to spin the spinner for the player to determine how many spaces they move
    Parameters: an integer that determines which player is spinning
    Returns: nothing
    */
    public void spinner(int player){
        //These variables keep track of where the user used to be, used in removeUserPosition()
        oldNumSpaces1= numSpaces1;
        oldNumSpaces2= numSpaces2;
        
        int spacesMoved = (int)Math.ceil(Math.random()*4); // generate a random number between 1 and 4 for the number of spaces moved
        // set the spinner button to the number spun
        switch (spacesMoved){
            case 1: // determine if a 1 was spun
                btnSpinner.setIcon(a); // set spinner icon to show that a 1 has been spun
                break;
            case 2: // determine if a 2 was spun
                btnSpinner.setIcon(b); // set spinner icon to show that a 2 has been spun
                break;
            case 3: // determine if a 3 was spun
                btnSpinner.setIcon(c); // set spinner icon to show that a 3 has been spun
                break;
            case 4: // determine if a 4 was spun
                btnSpinner.setIcon(d); // set spinner icon to show that a 4 has been spun
        }
        Output.append("Move " + spacesMoved + " spaces.\n"); // output message
        if(player == 1){ // determine if it is player 1 or player 2
            numSpaces1 += spacesMoved; // add spaces moved to player's total spaces moved
        }
        else if(player == 2){
            numSpaces2 += spacesMoved; // add spaces moved to player's total spaces moved
        }
    }
    
    /*
    Name: Tile Function
    Function: do determine which type of tile was landed on and to perform the function of that tile
    Parameters: the player's number of spaces moved, which player it is, and the number of spaces of the other player
    Returns: any additional spaces moved during the turn
    */
    public int TileFunction(int numSpaces, int player, int numSpacesOtherPlayer){
        int function = tiles[numSpaces]; // determine the function of the tile landed on
        int spacesMoved = 0; // holds the number of additional spaces moved during the turn
        removePlayerPosition(player,numSpacesOtherPlayer); //This removes the icon from the previous tile.
        displayPlayerPosition(function,numSpaces,player, numSpacesOtherPlayer); // calls the displayPlayerPosition to display where the user is on the game board
        
        
        if(function == 1){ // determine if the tile was a trivia tile
            if(answerQuestion == false){ // determine if the user has already answered the question or not
                Trivia(); // call the Trivia function;
                //add a pause before the game continues
                
            }
        }
        else if(function == 2){ // determine if the tile was a move forward tile
             //This keeps track of the previous tile.
            if (player==1){
                oldNumSpaces1 = numSpaces;
            }else if (player==2){
                oldNumSpaces2 = numSpaces;
            }
            
            numSpaces++; // increase the number of spaces moved by one
            spacesMoved++; // increase the number of additional spaces by 1
            Output.append("Move forward one space! \n"); // output message
            TileFunction(numSpaces, player, numSpacesOtherPlayer); // call the TileFunction again
        }
        else if(function == 3){ // determine if the tile was a move backward tile
            //This keeps track of the previous tile.
            if (player==1){
                oldNumSpaces1 = numSpaces;
            }else if (player==2){
                oldNumSpaces2 = numSpaces;
            }
            
            numSpaces--; // decrease the number of spaces moved by 1
            spacesMoved--; // decrease the number of additional spaces by 1
            Output.append("Move backward one space! \n"); // output message
            TileFunction(numSpaces, player, numSpacesOtherPlayer); // call the TileFunction again
        }
        else if(function == 0){
            
        }
        return spacesMoved; // return the number of spaces moved during this turn
    }
    /**
    Name: Trivia Function
    Function: to display a random trivia question and the answer options
    Parameters: no parameters
    Returns: no returns
    */
    public void Trivia(){
        //generates random number between 1 and 14
        int randNum = (int)Math.ceil(Math.random()*14); 
        //searches ArrayList that holds the trivia question objects
        for (TriviaQuestion tQ: triviaList){
            //if the random number generated is found as an index in the arraylist,
            //the question and answer choices of that element (object) are displayed
            if (randNum == tQ.questionNumber){
                triviaQuestionNumber = randNum;
                Output.setText(tQ.question);
                A.setText(tQ.answers.get(0));
                B.setText(tQ.answers.get(1));
                C.setText(tQ.answers.get(2));
                D.setText(tQ.answers.get(3));
            }
        }
    }
    
    
    /*
    Name: displayPlayerPosition
    Function: to display where the player is on the board
    Parameters: the type of tile the player is on, the number of spaces the player has moved, which player it is, and the number of spaces the other player has moved
    Returns: nothing
    */
    public void displayPlayerPosition(int tileType, int numSpaces, int player, int otherPlayerPosition){
        
        if(tileType == 0){ //determine if it is a plainTile. 
            if ((player == 1) && (numSpaces != otherPlayerPosition)) { // determine if the other player is on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 2:
                        lblTile2.setIcon(plainH);
                        break;
                    case 4:
                        lblTile4.setIcon(plainH);
                        break;
                    case 5:
                        lblTile5.setIcon(plainH);
                        break;
                    case 8:
                        lblTile8.setIcon(plainH);
                        break;
                    case 10:
                        lblTile10.setIcon(plainH);
                        break;
                    case 12:
                        lblTile12.setIcon(plainH);
                        break;
                    case 16:
                        lblTile16.setIcon(plainH);
                        break;
                    case 17:
                        lblTile17.setIcon(plainH);
                        break;
                    case 20:
                        lblTile20.setIcon(plainH);
                        break;
                    case 22:
                        lblTile22.setIcon(plainH);
                        break;
                    case 24:
                        lblTile24.setIcon(plainH);
                        break;
                    case 26:
                        lblTile26.setIcon(plainH);
                        break;
                    case 27:
                        lblTile27.setIcon(plainH);
                        break;
                    case 30:
                        lblTile30.setIcon(plainH);
                        break;
                    case 32:
                        lblTile32.setIcon(plainH);
                        break;
                    case 34:
                        lblTile34.setIcon(plainH);
                        break;
                    case 36:
                        lblTile36.setIcon(plainH);
                        break;
                    case 38:
                        lblTile38.setIcon(plainH);
                        break;
                    case 40:
                        lblTile40.setIcon(plainH);
                        break;
                    case 41:
                        lblTile41.setIcon(plainH);
                        break;
                    case 44:
                        lblTile44.setIcon(plainH);
                        break;
                    case 45:
                        lblTile45.setIcon(plainH);
                        break;
                    
                }
            }
            else if ((player == 2) && (numSpaces != otherPlayerPosition)) { // determine which player it is and that the other player is not on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 2:
                        lblTile2.setIcon(plainV);
                        break;
                    case 4:
                        lblTile4.setIcon(plainV);
                        break;
                    case 5:
                        lblTile5.setIcon(plainV);
                        break;
                    case 8:
                        lblTile8.setIcon(plainV);
                        break;
                    case 10:
                        lblTile10.setIcon(plainV);
                        break;
                    case 12:
                        lblTile12.setIcon(plainV);
                        break;
                    case 16:
                        lblTile16.setIcon(plainV);
                        break;
                    case 17:
                        lblTile17.setIcon(plainV);
                        break;
                    case 20:
                        lblTile20.setIcon(plainV);
                        break;
                    case 22:
                        lblTile22.setIcon(plainV);
                        break;
                    case 24:
                        lblTile24.setIcon(plainV);
                        break;
                    case 26:
                        lblTile26.setIcon(plainV);
                        break;
                    case 27:
                        lblTile27.setIcon(plainV);
                        break;
                    case 30:
                        lblTile30.setIcon(plainV);
                        break;
                    case 32:
                        lblTile32.setIcon(plainV);
                        break;
                    case 34:
                        lblTile34.setIcon(plainV);
                        break;
                    case 36:
                        lblTile36.setIcon(plainV);
                        break;
                    case 38:
                        lblTile38.setIcon(plainV);
                        break;
                    case 40:
                        lblTile40.setIcon(plainV);
                        break;
                    case 41:
                        lblTile41.setIcon(plainV);
                        break;
                    case 44:
                        lblTile44.setIcon(plainV);
                        break;
                    case 45:
                        lblTile45.setIcon(plainV);
                        break;
                    
                }
            }
            else if (numSpaces == otherPlayerPosition) { // determine if both players are on the same tile
                switch(numSpaces){ // determine which tile the players are on and set the icon accordingly
                    case 2:
                        lblTile2.setIcon(plainHV);
                        break;
                    case 4:
                        lblTile4.setIcon(plainHV);
                        break;
                    case 5:
                        lblTile5.setIcon(plainHV);
                        break;
                    case 8:
                        lblTile8.setIcon(plainHV);
                        break;
                    case 10:
                        lblTile10.setIcon(plainHV);
                        break;
                    case 12:
                        lblTile12.setIcon(plainHV);
                        break;
                    case 16:
                        lblTile16.setIcon(plainHV);
                        break;
                    case 17:
                        lblTile17.setIcon(plainHV);
                        break;
                    case 20:
                        lblTile20.setIcon(plainHV);
                        break;
                    case 22:
                        lblTile22.setIcon(plainHV);
                        break;
                    case 24:
                        lblTile24.setIcon(plainHV);
                        break;
                    case 26:
                        lblTile26.setIcon(plainHV);
                        break;
                    case 27:
                        lblTile27.setIcon(plainHV);
                        break;
                    case 30:
                        lblTile30.setIcon(plainHV);
                        break;
                    case 32:
                        lblTile32.setIcon(plainHV);
                        break;
                    case 34:
                        lblTile34.setIcon(plainHV);
                        break;
                    case 36:
                        lblTile36.setIcon(plainHV);
                        break;
                    case 38:
                        lblTile38.setIcon(plainHV);
                        break;
                    case 40:
                        lblTile40.setIcon(plainHV);
                        break;
                    case 41:
                        lblTile41.setIcon(plainHV);
                        break;
                    case 44:
                        lblTile44.setIcon(plainHV);
                        break;
                    case 45:
                        lblTile45.setIcon(plainHV);
                        break;
                    
                }
            }
        } 
        else if(tileType == 1){ // determine if the player is on a trivia tile
            if ((player==1)&&(numSpaces != otherPlayerPosition)){ // determine which player it is and the other player is not on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 3:
                        lblTile3.setIcon(triviaH);
                        break;
                    case 7:
                        lblTile7.setIcon(triviaH);
                        break;
                    case 11:
                        lblTile11.setIcon(triviaH);
                        break;
                    case 15:
                        lblTile15.setIcon(triviaH);
                        break;
                    case 18:
                        lblTile18.setIcon(triviaH);
                        break;
                    case 21:
                        lblTile21.setIcon(triviaH);
                        break;
                    case 25:
                        lblTile25.setIcon(triviaH);
                        break;
                    case 28:
                        lblTile28.setIcon(triviaH);
                        break;
                    case 31:
                        lblTile31.setIcon(triviaH);
                        break;
                    case 33:
                        lblTile33.setIcon(triviaH);
                        break;
                    case 37:
                        lblTile37.setIcon(triviaH);
                        break;
                    case 39:
                        lblTile39.setIcon(triviaH);
                        break;
                    case 43:
                        lblTile43.setIcon(triviaH);
                        break;
                    case 47:
                        lblTile47.setIcon(triviaH);
                        break;
                    
                }
            }
            else if ((player==2)&&(numSpaces != otherPlayerPosition)){ // determine which player it is and that the other player is not on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 3:
                        lblTile3.setIcon(triviaV);
                        break;
                    case 7:
                        lblTile7.setIcon(triviaV);
                        break;
                    case 11:
                        lblTile11.setIcon(triviaV);
                        break;
                    case 15:
                        lblTile15.setIcon(triviaV);
                        break;
                    case 18:
                        lblTile18.setIcon(triviaV);
                        break;
                    case 21:
                        lblTile21.setIcon(triviaV);
                        break;
                    case 25:
                        lblTile25.setIcon(triviaV);
                        break;
                    case 28:
                        lblTile28.setIcon(triviaV);
                        break;
                    case 31:
                        lblTile31.setIcon(triviaV);
                        break;
                    case 33:
                        lblTile33.setIcon(triviaV);
                        break;
                    case 37:
                        lblTile37.setIcon(triviaV);
                        break;
                    case 39:
                        lblTile39.setIcon(triviaV);
                        break;
                    case 43:
                        lblTile43.setIcon(triviaV);
                        break;
                    case 47:
                        lblTile47.setIcon(triviaV);
                        break;                    
                }
            }
            else if (numSpaces == otherPlayerPosition){ // determine if the players are on the same tile
                switch(numSpaces){ // determine which tile the players are on and set the icon accordingly
                    case 3:
                        lblTile3.setIcon(triviaHV);
                        break;
                    case 7:
                        lblTile7.setIcon(triviaHV);
                        break;
                    case 11:
                        lblTile11.setIcon(triviaHV);
                        break;
                    case 15:
                        lblTile15.setIcon(triviaHV);
                        break;
                    case 18:
                        lblTile18.setIcon(triviaHV);
                        break;
                    case 21:
                        lblTile21.setIcon(triviaHV);
                        break;
                    case 25:
                        lblTile25.setIcon(triviaHV);
                        break;
                    case 28:
                        lblTile28.setIcon(triviaHV);
                        break;
                    case 31:
                        lblTile31.setIcon(triviaHV);
                        break;
                    case 33:
                        lblTile33.setIcon(triviaHV);
                        break;
                    case 37:
                        lblTile37.setIcon(triviaHV);
                        break;
                    case 39:
                        lblTile39.setIcon(triviaHV);
                        break;
                    case 43:
                        lblTile43.setIcon(triviaHV);
                        break;
                    case 47:
                        lblTile47.setIcon(triviaHV);
                        break;
                    
                }
            }
            
        }
        else if(tileType == 2){ // determine if the player is on a move forward tile
            if ((player==1) && (numSpaces != otherPlayerPosition)){ // determine which player it is and that the other player is not on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 1:
                        lblTile1.setIcon(advH);
                        break;
                    case 6:
                        lblTile6.setIcon(advH);
                        break;
                    case 9:
                        lblTile9.setIcon(advH);
                        break;
                    case 14:
                        lblTile14.setIcon(advH);
                        break;
                    case 23:
                        lblTile23.setIcon(advH);
                        break;
                    case 42:
                        lblTile42.setIcon(advH);
                        break;
                    
                }
            }
            else if ((player==2) && (numSpaces != otherPlayerPosition)){ // determine which player it is and that the other player is not on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 1:
                        lblTile1.setIcon(advV);
                        break;
                    case 6:
                        lblTile6.setIcon(advV);
                        break;
                    case 9:
                        lblTile9.setIcon(advV);
                        break;
                    case 14:
                        lblTile14.setIcon(advV);
                        break;
                    case 23:
                        lblTile23.setIcon(advV);
                        break;
                    case 42:
                        lblTile42.setIcon(advV);
                        break;
                    
                }
            }
            else if (numSpaces == otherPlayerPosition){ // determine if the players are on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 1:
                        lblTile1.setIcon(advHV);
                        break;
                    case 6:
                        lblTile6.setIcon(advHV);
                        break;
                    case 9:
                        lblTile9.setIcon(advHV);
                        break;
                    case 14:
                        lblTile14.setIcon(advHV);
                        break;
                    case 23:
                        lblTile23.setIcon(advHV);
                        break;
                    case 42:
                        lblTile42.setIcon(advHV);
                        break;
                    
                }
            }         
        }
        else if(tileType == 3){ // determine if the player landed on a move back tile 
            if ((player==1) && (numSpaces != otherPlayerPosition)){ //determine which player it is and that the other player is not on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 13:
                        lblTile13.setIcon(backH);
                        break;
                    case 19:
                        lblTile19.setIcon(backH);
                        break;
                    case 29:
                        lblTile29.setIcon(backH);
                        break;
                    case 35:
                        lblTile35.setIcon(backH);
                        break;
                    case 46:
                        lblTile46.setIcon(backH);
                        break;
                    
                }
            }
            else if ((player==2) && (numSpaces != otherPlayerPosition)){ // determine which player it is and that the other player is not on the same tile
                switch(numSpaces){ // determine which tile the player is on and set the icon accordingly
                    case 13:
                        lblTile13.setIcon(backV);
                        break;
                    case 19:
                        lblTile19.setIcon(backV);
                        break;
                    case 29:
                        lblTile29.setIcon(backV);
                        break;
                    case 35:
                        lblTile35.setIcon(backV);
                        break;
                    case 46:
                        lblTile46.setIcon(backV);
                        break;
                    
                }
            }
            else if (numSpaces == otherPlayerPosition){ // determine if the players are on the same tile
                switch(numSpaces){ // determine which tile the players are on and set the icon accordingly
                    case 13:
                        lblTile13.setIcon(backHV);
                        break;
                    case 19:
                        lblTile19.setIcon(backHV);
                        break;
                    case 29:
                        lblTile29.setIcon(backHV);
                        break;
                    case 35:
                        lblTile35.setIcon(backHV);
                        break;
                    case 46:
                        lblTile46.setIcon(backHV);
                        break;
                    
                }
            }         
        }
       
    }
    
    public void removePlayerPosition(int player, int otherPlayerPosition){
        int thisPlayerPosition; //This will be compared to otherPlayerPosition, to see if the two icons are on the same tile. 
        //Determine which player it is.
        if (player==1){
            thisPlayerPosition = oldNumSpaces1;
        }else {
            thisPlayerPosition = oldNumSpaces2;
        }
        
        if (thisPlayerPosition!=otherPlayerPosition){
            //This resets the Icon back to default. 
            switch (thisPlayerPosition){
                case 0:
                    lblStart.setIcon(start);
                    break;
                case 1:
                    lblTile1.setIcon(adv);
                    break;
                case 2:
                    lblTile2.setIcon(plain);
                    break;
                case 3:
                    lblTile3.setIcon(trivia);
                    break;
                case 4:
                    lblTile4.setIcon(plain);
                    break;
                case 5:
                    lblTile5.setIcon(plain);
                    break;
                case 6:
                    lblTile6.setIcon(adv);
                    break;
                case 7:
                    lblTile7.setIcon(trivia);
                    break;
                case 8:
                    lblTile8.setIcon(plain);
                    break;
                case 9:
                    lblTile9.setIcon(adv);
                    break;
                case 10:
                    lblTile10.setIcon(plain);
                    break;
                case 11:
                    lblTile11.setIcon(trivia);
                    break;
                case 12:
                    lblTile12.setIcon(plain);
                    break;
                case 13:
                    lblTile13.setIcon(back);
                    break;
                case 14:
                    lblTile14.setIcon(adv);
                    break;
                case 15:
                    lblTile15.setIcon(trivia);
                    break;
                case 16:
                    lblTile16.setIcon(plain);
                    break;
                case 17:
                    lblTile17.setIcon(plain);
                    break;
                case 18:
                    lblTile18.setIcon(trivia);
                    break;
                case 19:
                    lblTile19.setIcon(back);
                    break;
                case 20:
                    lblTile20.setIcon(plain);
                    break;
                case 21:
                    lblTile21.setIcon(trivia);
                    break;
                case 22:
                    lblTile22.setIcon(plain);
                    break;
                case 23:
                    lblTile23.setIcon(adv);
                    break;
                case 24:
                    lblTile24.setIcon(plain);
                    break;
                case 25:
                    lblTile25.setIcon(trivia);
                    break;
                case 26:
                    lblTile26.setIcon(plain);
                    break;
                case 27:
                    lblTile27.setIcon(plain);
                    break;
                case 28:
                    lblTile28.setIcon(trivia);
                    break;
                case 29:
                    lblTile29.setIcon(back);
                    break;
                case 30:
                    lblTile30.setIcon(plain);
                    break;
                case 31:
                    lblTile31.setIcon(trivia);
                    break;
                case 32:
                    lblTile32.setIcon(plain);
                    break;
                case 33:
                    lblTile33.setIcon(trivia);
                    break;
                case 34:
                    lblTile34.setIcon(plain);
                    break;
                case 35:
                    lblTile35.setIcon(back);
                    break;
                case 36:
                    lblTile36.setIcon(plain);
                    break;
                case 37:
                    lblTile37.setIcon(trivia);
                    break;
                case 38:
                    lblTile38.setIcon(plain);
                    break;
                case 39:
                    lblTile39.setIcon(trivia);
                    break;
                case 40:
                    lblTile40.setIcon(plain);
                    break;
                case 41:
                    lblTile41.setIcon(plain);
                    break;
                case 42:
                    lblTile42.setIcon(adv);
                    break;
                case 43:
                    lblTile43.setIcon(trivia);
                    break;
                case 44:
                    lblTile44.setIcon(plain);
                    break;
                case 45:
                    lblTile45.setIcon(plain);
                    break;
                case 46:
                    lblTile46.setIcon(back);
                    break;
                case 47:
                    lblTile47.setIcon(trivia);
                    break;
                //case 48 is the end, so we don't need to remove the display.   
            }
        }else if (player==1){
            //This sets the icon to only Voldemort on the tile (since they were both on the same space before Harry moved)
            switch (thisPlayerPosition){
                case 0:
                    lblStart.setIcon(startV);
                    break;
                case 1:
                    lblTile1.setIcon(advV);
                    break;
                case 2:
                    lblTile2.setIcon(plainV);
                    break;
                case 3:
                    lblTile3.setIcon(triviaV);
                    break;
                case 4:
                    lblTile4.setIcon(plainV);
                    break;
                case 5:
                    lblTile5.setIcon(plainV);
                    break;
                case 6:
                    lblTile6.setIcon(advV);
                    break;
                case 7:
                    lblTile7.setIcon(triviaV);
                    break;
                case 8:
                    lblTile8.setIcon(plainV);
                    break;
                case 9:
                    lblTile9.setIcon(advV);
                    break;
                case 10:
                    lblTile10.setIcon(plainV);
                    break;
                case 11:
                    lblTile11.setIcon(triviaV);
                    break;
                case 12:
                    lblTile12.setIcon(plainV);
                    break;
                case 13:
                    lblTile13.setIcon(backV);
                    break;
                case 14:
                    lblTile14.setIcon(advV);
                    break;
                case 15:
                    lblTile15.setIcon(triviaV);
                    break;
                case 16:
                    lblTile16.setIcon(plainV);
                    break;
                case 17:
                    lblTile17.setIcon(plainV);
                    break;
                case 18:
                    lblTile18.setIcon(triviaV);
                    break;
                case 19:
                    lblTile19.setIcon(backV);
                    break;
                case 20:
                    lblTile20.setIcon(plainV);
                    break;
                case 21:
                    lblTile21.setIcon(triviaV);
                    break;
                case 22:
                    lblTile22.setIcon(plainV);
                    break;
                case 23:
                    lblTile23.setIcon(advV);
                    break;
                case 24:
                    lblTile24.setIcon(plainV);
                    break;
                case 25:
                    lblTile25.setIcon(triviaV);
                    break;
                case 26:
                    lblTile26.setIcon(plainV);
                    break;
                case 27:
                    lblTile27.setIcon(plainV);
                    break;
                case 28:
                    lblTile28.setIcon(triviaV);
                    break;
                case 29:
                    lblTile29.setIcon(backV);
                    break;
                case 30:
                    lblTile30.setIcon(plainV);
                    break;
                case 31:
                    lblTile31.setIcon(triviaV);
                    break;
                case 32:
                    lblTile32.setIcon(plainV);
                    break;
                case 33:
                    lblTile33.setIcon(triviaV);
                    break;
                case 34:
                    lblTile34.setIcon(plainV);
                    break;
                case 35:
                    lblTile35.setIcon(backV);
                    break;
                case 36:
                    lblTile36.setIcon(plainV);
                    break;
                case 37:
                    lblTile37.setIcon(triviaV);
                    break;
                case 38:
                    lblTile38.setIcon(plainV);
                    break;
                case 39:
                    lblTile39.setIcon(triviaV);
                    break;
                case 40:
                    lblTile40.setIcon(plainV);
                    break;
                case 41:
                    lblTile41.setIcon(plainV);
                    break;
                case 42:
                    lblTile42.setIcon(advV);
                    break;
                case 43:
                    lblTile43.setIcon(triviaV);
                    break;
                case 44:
                    lblTile44.setIcon(plainV);
                    break;
                case 45:
                    lblTile45.setIcon(plainV);
                    break;
                case 46:
                    lblTile46.setIcon(backV);
                    break;
                case 47:
                    lblTile47.setIcon(triviaV);
                    break;
                //case 48 is the end, so we don't need to remove the display. 
            }
        }else if (player==2){
            //This sets the icon to only Harry on the tile (since they were both on the same space before Voldemort moved)
            switch (thisPlayerPosition){
                case 0:
                    lblStart.setIcon(startH);
                    break;
                case 1:
                    lblTile1.setIcon(advH);
                    break;
                case 2:
                    lblTile2.setIcon(plainH);
                    break;
                case 3:
                    lblTile3.setIcon(triviaH);
                    break;
                case 4:
                    lblTile4.setIcon(plainH);
                    break;
                case 5:
                    lblTile5.setIcon(plainH);
                    break;
                case 6:
                    lblTile6.setIcon(advH);
                    break;
                case 7:
                    lblTile7.setIcon(triviaH);
                    break;
                case 8:
                    lblTile8.setIcon(plainH);
                    break;
                case 9:
                    lblTile9.setIcon(advH);
                    break;
                case 10:
                    lblTile10.setIcon(plainH);
                    break;
                case 11:
                    lblTile11.setIcon(triviaH);
                    break;
                case 12:
                    lblTile12.setIcon(plainH);
                    break;
                case 13:
                    lblTile13.setIcon(backH);
                    break;
                case 14:
                    lblTile14.setIcon(advH);
                    break;
                case 15:
                    lblTile15.setIcon(triviaH);
                    break;
                case 16:
                    lblTile16.setIcon(plainH);
                    break;
                case 17:
                    lblTile17.setIcon(plainH);
                    break;
                case 18:
                    lblTile18.setIcon(triviaH);
                    break;
                case 19:
                    lblTile19.setIcon(backH);
                    break;
                case 20:
                    lblTile20.setIcon(plainH);
                    break;
                case 21:
                    lblTile21.setIcon(triviaH);
                    break;
                case 22:
                    lblTile22.setIcon(plainH);
                    break;
                case 23:
                    lblTile23.setIcon(advH);
                    break;
                case 24:
                    lblTile24.setIcon(plainH);
                    break;
                case 25:
                    lblTile25.setIcon(triviaH);
                    break;
                case 26:
                    lblTile26.setIcon(plainH);
                    break;
                case 27:
                    lblTile27.setIcon(plainH);
                    break;
                case 28:
                    lblTile28.setIcon(triviaH);
                    break;
                case 29:
                    lblTile29.setIcon(backH);
                    break;
                case 30:
                    lblTile30.setIcon(plainH);
                    break;
                case 31:
                    lblTile31.setIcon(triviaH);
                    break;
                case 32:
                    lblTile32.setIcon(plainH);
                    break;
                case 33:
                    lblTile33.setIcon(triviaH);
                    break;
                case 34:
                    lblTile34.setIcon(plainH);
                    break;
                case 35:
                    lblTile35.setIcon(backH);
                    break;
                case 36:
                    lblTile36.setIcon(plainH);
                    break;
                case 37:
                    lblTile37.setIcon(triviaH);
                    break;
                case 38:
                    lblTile38.setIcon(plainH);
                    break;
                case 39:
                    lblTile39.setIcon(triviaH);
                    break;
                case 40:
                    lblTile40.setIcon(plainH);
                    break;
                case 41:
                    lblTile41.setIcon(plainH);
                    break;
                case 42:
                    lblTile42.setIcon(advH);
                    break;
                case 43:
                    lblTile43.setIcon(triviaH);
                    break;
                case 44:
                    lblTile44.setIcon(plainH);
                    break;
                case 45:
                    lblTile45.setIcon(plainH);
                    break;
                case 46:
                    lblTile46.setIcon(backH);
                    break;
                case 47:
                    lblTile47.setIcon(triviaH);
                    break;
                //case 48 is the end, so we don't need to remove the display. 
            }   
        }
              
    }
        
    /**
     * @param args the command line arguments
     */
        public static void main (String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HarryPotterBoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HarryPotterBoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HarryPotterBoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HarryPotterBoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HarryPotterBoardGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JTextArea Output;
    private javax.swing.JButton btnMove;
    private javax.swing.JButton btnPlayAlone;
    private javax.swing.JButton btnPlayWithSomeone;
    private javax.swing.JButton btnSpinner;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblTile1;
    private javax.swing.JLabel lblTile10;
    private javax.swing.JLabel lblTile11;
    private javax.swing.JLabel lblTile12;
    private javax.swing.JLabel lblTile13;
    private javax.swing.JLabel lblTile14;
    private javax.swing.JLabel lblTile15;
    private javax.swing.JLabel lblTile16;
    private javax.swing.JLabel lblTile17;
    private javax.swing.JLabel lblTile18;
    private javax.swing.JLabel lblTile19;
    private javax.swing.JLabel lblTile2;
    private javax.swing.JLabel lblTile20;
    private javax.swing.JLabel lblTile21;
    private javax.swing.JLabel lblTile22;
    private javax.swing.JLabel lblTile23;
    private javax.swing.JLabel lblTile24;
    private javax.swing.JLabel lblTile25;
    private javax.swing.JLabel lblTile26;
    private javax.swing.JLabel lblTile27;
    private javax.swing.JLabel lblTile28;
    private javax.swing.JLabel lblTile29;
    private javax.swing.JLabel lblTile3;
    private javax.swing.JLabel lblTile30;
    private javax.swing.JLabel lblTile31;
    private javax.swing.JLabel lblTile32;
    private javax.swing.JLabel lblTile33;
    private javax.swing.JLabel lblTile34;
    private javax.swing.JLabel lblTile35;
    private javax.swing.JLabel lblTile36;
    private javax.swing.JLabel lblTile37;
    private javax.swing.JLabel lblTile38;
    private javax.swing.JLabel lblTile39;
    private javax.swing.JLabel lblTile4;
    private javax.swing.JLabel lblTile40;
    private javax.swing.JLabel lblTile41;
    private javax.swing.JLabel lblTile42;
    private javax.swing.JLabel lblTile43;
    private javax.swing.JLabel lblTile44;
    private javax.swing.JLabel lblTile45;
    private javax.swing.JLabel lblTile46;
    private javax.swing.JLabel lblTile47;
    private javax.swing.JLabel lblTile5;
    private javax.swing.JLabel lblTile6;
    private javax.swing.JLabel lblTile7;
    private javax.swing.JLabel lblTile8;
    private javax.swing.JLabel lblTile9;
    // End of variables declaration//GEN-END:variables
}
