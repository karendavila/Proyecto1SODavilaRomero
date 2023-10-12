/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Classes.Config;
import Classes.ReadFile;
import Classes.VideoGameStudio;
import javax.swing.JOptionPane;

public class MainUI extends javax.swing.JFrame {
    
    
    public static VideoGameStudio SquareEnixStudio;
    public static VideoGameStudio BethesdaStudio;
    public static Config config;
    public int counterB = 0;
    public int counterSE = 0;
    
    public static boolean runningB;
    public static boolean runningSE;

    /**
     * @param args the command line arguments
     */
    
    
    //Bethesda Interface
    public void BethesdaLogic(String text){
        BethesdaLogic.setText(text);
    }
    public void BethesdaNarrative(String text){
        BethesdaNarrative.setText(text);
    }
    public void BethesdaSprite(String text){
        BethesdaSprite.setText(text);
    }
    public void BethesdaDlc(String text){
        BethesdaDlc.setText(text);
    }
    public void BethesdaLevel(String text){
        BethesdaLevel.setText(text);
    }
    
    public void BethesdaSC(String text) {
        standarVideoGamesB.setText(text);
    }
    
    public void BethesdaAC(String text) {
        dlcVideoGamesB.setText(text);
    }
    
    public void BethesdaQtys(String initialNarrative, String initialLevel, String initialSprite, String initialLogic, String initialDlc, String initialIntegrator) {
        
        narrativeDevelopersB.setText(initialNarrative);
        levelDesignersB.setText(initialLevel);
        spriteArtistsB.setText(initialSprite);
        logicProgrammersB.setText(initialLogic);
        dlcDevelopersB.setText(initialDlc);
        integratorsB.setText(initialIntegrator);
    
    }
    
    public void bethesdaEarnings(String totalEarnings) {
        earningsB.setText(totalEarnings);
    }
    
    public void bethesdaCosts(String totalCosts) {
        costsB.setText(totalCosts);
    }
    
    //SQUARE ENIX Interface
    public void SquareEnixQtys(String initialinitialNarrative, String initialLevel, String initialSprite, String initialLogic, String initialDlc, String initialIntegrator) {
   
        narrativeDevelopersSE.setText(initialinitialNarrative);
        levelDesignersSE.setText(initialLevel);
        spriteArtistsSE.setText(initialSprite);
        logicProgrammersSE.setText(initialLogic);
        dlcDevelopersSE.setText(initialDlc);
        integratorsSE.setText(initialIntegrator);
   
    }
    
    public void SquareEnixEarnings(String totalEarnings) {
        earningsSE.setText(totalEarnings);
    }
    
    public void SquareEnixCosts(String totalCosts) {
        costsSE.setText(totalCosts);
    }
    
    public void SquareEnixLogica(String text){
        logicaPartsSE.setText(text);
    }
    public void SquareEnixNarrativa(String text){
        narrativaPartsSE.setText(text);
    }
    public void SquareEnixSprite(String text){
        spritePartsSE.setText(text);
    }
    public void SquareEnixDlc(String text){
        dlcPartsSE.setText(text);
    }
    public void SquareEnixNiveles(String text){
        nivelesPartsSE.setText(text);
    }
    
    public void SquareEnixSC(String text) {
        standarvgSE.setText(text);
    }
    
    public void SquareEnixAC(String text) {
        dlcvdSE.setText(text);
    }
    
   
    
    public void daysLeftBethesda(String text){
      daysLeftBethesda.setText(text);
    }
    
    public void DaysLeftSquareEnix(String text){
        DaysLeftSquareEnix.setText(text);
    }
    
    public void managerStatusB(String text){
        managerStatusB.setText(text);
    }
    
    
            
    public void managerStatusSE(String text){
        managerStatusSE.setText(text);
    }     
    
    public void faultsQtyM1SE(String text){
        faultsQtyM1SE.setText(text);
    }
    
    public void managerSalaryDiscountSE(String text){
        managerSalaryDiscountSE.setText(text);
    }
    
    public void managerSalaryDiscountB(String text){
        managerSalaryDiscountB.setText(text);
    }
    
    public void faultsQtyB(String text){
        faultsQtyB.setText(text);
    }
    
    public void directorStatusB(String text){
        directorStatusB.setText(text);
    }
    
    public void directorStatusSE(String text){
        directorStatusSE.setText(text);
    }
    
    public void costsB(String Text){
        costsB.setText(Text);
    }
    
    public void costsSE(String Text){
        costsSE.setText(Text);
    }
    
    public void UtilityB(String Text){
        utilityB.setText(Text);
    }
    
    public void UtilitySE(String Text){
        utilitySE.setText(Text);
    }
            
    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        config = new Config();
        
        try {
            ReadFile nfile = new ReadFile();
            String txt = nfile.readTxt();
            nfile.readConfig(txt, config);
            JOptionPane.showMessageDialog(null, "Config loaded succesfully!");
        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
        
        runningB = false;
        runningSE = false;
        
        disableButtonsB();
        disableButtonsSE();
        
        
        

    }
    
    public void disableButtonsB() {
        if (runningB) {
            narrativaPlusB.setEnabled(true);
            nivelesPlusB.setEnabled(true);
            spritePlusB.setEnabled(true);
            logicaPlusB.setEnabled(true);
            dlcPlusB.setEnabled(true);
            integradorPlusB.setEnabled(true);

            narrativaMinB.setEnabled(true);
            nivelesMinB.setEnabled(true);
            spriteMinB.setEnabled(true);
            logicaMinB.setEnabled(true);
            dlcMinB.setEnabled(true);
            integradorMinB.setEnabled(true);
        } else {
            narrativaPlusB.setEnabled(false);
            nivelesPlusB.setEnabled(false);
            spritePlusB.setEnabled(false);
            logicaPlusB.setEnabled(false);
            dlcPlusB.setEnabled(false);
            integradorPlusB.setEnabled(false);

            narrativaMinB.setEnabled(false);
            nivelesMinB.setEnabled(false);
            spriteMinB.setEnabled(false);
            logicaMinB.setEnabled(false);
            dlcMinB.setEnabled(false);
            integradorMinB.setEnabled(false); 
        }
        
        
    }
    
    public void disableButtonsSE() {
        if (runningSE) {
            narrativaPlus.setEnabled(true);
            nivelesPlus.setEnabled(true);
            spritePlus.setEnabled(true);
            logicaPlus.setEnabled(true);
            dclPlus.setEnabled(true);
            integradorPlus.setEnabled(true);

            narrativaMin.setEnabled(true);
            nivelesMin.setEnabled(true);
            spriteMin.setEnabled(true);
            logicaMin.setEnabled(true);
            dclMin.setEnabled(true);
            integradorMin.setEnabled(true);
        } else {
            narrativaPlus.setEnabled(false);
            nivelesPlus.setEnabled(false);
            spritePlus.setEnabled(false);
            logicaPlus.setEnabled(false);
            dclPlus.setEnabled(false);
            integradorPlus.setEnabled(false);

            narrativaMin.setEnabled(false);
            nivelesMin.setEnabled(false);
            spriteMin.setEnabled(false);
            logicaMin.setEnabled(false);
            dclMin.setEnabled(false);
            integradorMin.setEnabled(false);
        }
        
        
    }
    
    public void disableStarts(String studioName) {
        switch (studioName) {
            
            case "B":
                startB.setEnabled(false);
                break;
                
            case "SE":
                startSE.setEnabled(false);
        }
    }
    
    //Change Developer if Plus button
    public void changeWorkerPlus(VideoGameStudio studio, String workerType) {
 
        switch(workerType) {
            
            case "narrative":
                
                for (int i = 0; i < studio.getDevelopers().length; i++) {
                    

                    if (studio.getDevelopers()[i].getType().equals("waiting")) {

                        studio.getDevelopers()[i].setType("narrative");
                        
                        if (studio.getName().equals("Bethesda")) {
                            studio.getDevelopers()[i].changeParams(0.5f, 10);
                            break;
                            
                        } else {
                            studio.getDevelopers()[i].changeParams(0.5f, 10);
                            break;
                        }   
                    }
                }
                break;

                
            case "level":
                
                 for (int i = 0; i < studio.getDevelopers().length; i++) {
            
                    if (studio.getDevelopers()[i].getType().equals("waiting")) {
                        
                        studio.getDevelopers()[i].setType("level");
                        
                        if (studio.getName().equals("Bethesda")) {
                            studio.getDevelopers()[i].changeParams(0.5f, 10);
                            break;
                            
                        } else {
                            studio.getDevelopers()[i].changeParams(0.5f, 10);
                            break;
                        }   
                    }
                }
                break;
                
            case "sprite":
                
                 for (int i = 0; i < studio.getDevelopers().length; i++) {
            
                    if (studio.getDevelopers()[i].getType().equals("waiting")) {
                        
                        studio.getDevelopers()[i].setType("sprite");
                        
                        if (studio.getName().equals("Bethesda")) {
                            studio.getDevelopers()[i].changeParams(3f, 10);
                            break;
                            
                        } else {
                            studio.getDevelopers()[i].changeParams(3f, 10);
                            break;
                        }   
                    }
                }
                 break;
                
            case "logic":
                
                 for (int i = 0; i < studio.getDevelopers().length; i++) {
            
                    if (studio.getDevelopers()[i].getType().equals("waiting")) {
                        
                        studio.getDevelopers()[i].setType("logic");
                        
                        if (studio.getName().equals("Bethesda")) {
                            studio.getDevelopers()[i].changeParams(3f, 10);
                            break;
                            
                        } else {
                            studio.getDevelopers()[i].changeParams(3f, 10);
                            break;
                        }   
                    }
                }
                break;
                
            case "dlc":
                
                 for (int i = 0; i < studio.getDevelopers().length; i++) {
            
                    if (studio.getDevelopers()[i].getType().equals("waiting")) {
                        
                        studio.getDevelopers()[i].setType("dlc");
                        
                        if (studio.getName().equals("Bethesda")) {
                            studio.getDevelopers()[i].changeParams(0.34f, 10);
                            break;
                            
                        } else {
                            studio.getDevelopers()[i].changeParams(0.34f, 10);
                            break;
                        }   
                    }
                }
                break;
                
            case "integrator":
                
                 for (int i = 0; i < studio.getDevelopers().length; i++) {
            
                    if (studio.getDevelopers()[i].getType().equals("waiting")) {
                        
                        studio.getDevelopers()[i].setType("integrator");
                        
                        if (studio.getName().equals("Bethesda")) {
                            studio.getDevelopers()[i].changeParams(0.34f, 10);
                            break;
                            
                        } else {
                            studio.getDevelopers()[i].changeParams(0.34f, 10);
                            break;
                        }   
                    }
                }
                break;
        }
               
    }
    
    //Change Developer if Minus button
    public void changeWorkerMinus(VideoGameStudio plant, String workerType) {
        
        switch(workerType) {
            
            case "narrative":
                
                for (int i = 0; i < plant.getDevelopers().length; i++) {
            
                    if (plant.getDevelopers()[i].getType().equals("narrative")) {
                        
                        plant.getDevelopers()[i].setType("waiting");
                        plant.getDevelopers()[i].changeParams(0, 0);
                        break;

                    }
                    
                }
                break;
                
            case "level":
                
                for (int i = 0; i < plant.getDevelopers().length; i++) {
            
                    if (plant.getDevelopers()[i].getType().equals("level")) {
                        
                        plant.getDevelopers()[i].setType("waiting");
                        plant.getDevelopers()[i].changeParams(0, 0);
                        break;
                    }
                   
                }
                break;
                
            case "sprite":
                
                for (int i = 0; i < plant.getDevelopers().length; i++) {
            
                    if (plant.getDevelopers()[i].getType().equals("sprite")) {
                        
                        plant.getDevelopers()[i].setType("waiting");
                        plant.getDevelopers()[i].changeParams(0, 0);
                        break;
                    }
                    
                }
                break;
                
            case "logic":
                
                for (int i = 0; i < plant.getDevelopers().length; i++) {
            
                    if (plant.getDevelopers()[i].getType().equals("logic")) {
                        
                        plant.getDevelopers()[i].setType("waiting");
                        plant.getDevelopers()[i].changeParams(0, 0);
                        break;
                    }
                    
                }
                break;
                
            case "dlc":
                
                for (int i = 0; i < plant.getDevelopers().length; i++) {
            
                    if (plant.getDevelopers()[i].getType().equals("dlc")) {
                        
                        plant.getDevelopers()[i].setType("waiting");
                        plant.getDevelopers()[i].changeParams(0, 0);
                        break;
                    }
                    
                }
                break;
                
            case "integrator":
                
                for (int i = 0; i < plant.getDevelopers().length; i++) {
            
                    if (plant.getDevelopers()[i].getType().equals("integrator")) {
                        
                        plant.getDevelopers()[i].setType("waiting");
                        plant.getDevelopers()[i].changeParams(0, 0);
                        break;
                    }
                    
                }
                break;
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ConfigTab = new javax.swing.JPanel();
        SquareEnix_label = new javax.swing.JLabel();
        Config_label = new javax.swing.JLabel();
        accessory_label = new javax.swing.JLabel();
        Bethesda_label = new javax.swing.JLabel();
        General_label = new javax.swing.JLabel();
        chasis_label = new javax.swing.JLabel();
        body_label = new javax.swing.JLabel();
        motor_label = new javax.swing.JLabel();
        wheel_label = new javax.swing.JLabel();
        dlcDevelopersBethesda = new javax.swing.JSpinner();
        narrativeDevelopersBethesda = new javax.swing.JSpinner();
        levelDesignersBethesda = new javax.swing.JSpinner();
        spriteArtistsBethesda = new javax.swing.JSpinner();
        logicProgrammersBethesda = new javax.swing.JSpinner();
        accessory_label1 = new javax.swing.JLabel();
        chasis_label1 = new javax.swing.JLabel();
        body_label1 = new javax.swing.JLabel();
        motor_label1 = new javax.swing.JLabel();
        wheel_label1 = new javax.swing.JLabel();
        dlcDevelopersSquareEnix = new javax.swing.JSpinner();
        narrativeDevelopersSquareEnix = new javax.swing.JSpinner();
        levelDesignersSquareEnix = new javax.swing.JSpinner();
        spriteArtistsSquareEnix = new javax.swing.JSpinner();
        logicProgrammersSquareEnix = new javax.swing.JSpinner();
        setConfiguration = new javax.swing.JButton();
        dayDuration_label = new javax.swing.JLabel();
        chasis_label3 = new javax.swing.JLabel();
        chasis_label4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dayDurationInput = new javax.swing.JTextPane();
        chasis_label5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deliveryDaysInput = new javax.swing.JTextPane();
        dayDuration_label1 = new javax.swing.JLabel();
        assemblers_label = new javax.swing.JLabel();
        integratorsBethesda = new javax.swing.JSpinner();
        assemblers_label2 = new javax.swing.JLabel();
        integratorsSquareEnix = new javax.swing.JSpinner();
        LamborghiniTab = new javax.swing.JPanel();
        startB = new javax.swing.JButton();
        B_label = new javax.swing.JLabel();
        levelDesignersB = new javax.swing.JLabel();
        wm_label3 = new javax.swing.JLabel();
        chas13 = new javax.swing.JLabel();
        chas14 = new javax.swing.JLabel();
        logicProgrammersB = new javax.swing.JLabel();
        chas15 = new javax.swing.JLabel();
        dlcDevelopersB = new javax.swing.JLabel();
        narrativeDevelopersB = new javax.swing.JLabel();
        chas16 = new javax.swing.JLabel();
        integratorsB = new javax.swing.JLabel();
        wm_label5 = new javax.swing.JLabel();
        chas17 = new javax.swing.JLabel();
        chas18 = new javax.swing.JLabel();
        managerStatus_label1 = new javax.swing.JLabel();
        managerSalaryDiscountB = new javax.swing.JLabel();
        spriteArtistsB = new javax.swing.JLabel();
        directorStatusB = new javax.swing.JLabel();
        directorStatus_label1 = new javax.swing.JLabel();
        managerStatus_label4 = new javax.swing.JLabel();
        faultsQtyB = new javax.swing.JLabel();
        managerStatus_label5 = new javax.swing.JLabel();
        managerStatusB = new javax.swing.JLabel();
        wm_label7 = new javax.swing.JLabel();
        DayLeftLamborghini1 = new javax.swing.JLabel();
        chas19 = new javax.swing.JLabel();
        chas20 = new javax.swing.JLabel();
        dlcVideoGamesB = new javax.swing.JLabel();
        standarVideoGamesB = new javax.swing.JLabel();
        assembled_labelM4 = new javax.swing.JLabel();
        daysLeftBethesda = new javax.swing.JLabel();
        chas21 = new javax.swing.JLabel();
        BethesdaSprite = new javax.swing.JLabel();
        chas22 = new javax.swing.JLabel();
        chas23 = new javax.swing.JLabel();
        chas24 = new javax.swing.JLabel();
        BethesdaLevel = new javax.swing.JLabel();
        BethesdaLogic = new javax.swing.JLabel();
        maxAcceM1 = new javax.swing.JLabel();
        BethesdaNarrative = new javax.swing.JLabel();
        maxChaM1 = new javax.swing.JLabel();
        maxBoM1 = new javax.swing.JLabel();
        maxMotM1 = new javax.swing.JLabel();
        MaxWheeM1 = new javax.swing.JLabel();
        wm_label9 = new javax.swing.JLabel();
        chas25 = new javax.swing.JLabel();
        BethesdaDlc = new javax.swing.JLabel();
        earningsB = new javax.swing.JLabel();
        assembled_labelM5 = new javax.swing.JLabel();
        assembled_labelM6 = new javax.swing.JLabel();
        costsB = new javax.swing.JLabel();
        utilityB = new javax.swing.JLabel();
        narrativaPlusB = new javax.swing.JButton();
        nivelesPlusB = new javax.swing.JButton();
        spritePlusB = new javax.swing.JButton();
        narrativaMinB = new javax.swing.JButton();
        nivelesMinB = new javax.swing.JButton();
        spriteMinB = new javax.swing.JButton();
        logicaPlusB = new javax.swing.JButton();
        logicaMinB = new javax.swing.JButton();
        dlcMinB = new javax.swing.JButton();
        dlcPlusB = new javax.swing.JButton();
        integradorMinB = new javax.swing.JButton();
        integradorPlusB = new javax.swing.JButton();
        utility_label = new javax.swing.JFormattedTextField();
        MaseratiTab = new javax.swing.JPanel();
        startSE = new javax.swing.JButton();
        narrativaMin = new javax.swing.JButton();
        levelDesignersSE = new javax.swing.JLabel();
        SE_label = new javax.swing.JLabel();
        wm_label = new javax.swing.JLabel();
        chas = new javax.swing.JLabel();
        chas1 = new javax.swing.JLabel();
        spritePartsSE = new javax.swing.JLabel();
        chas2 = new javax.swing.JLabel();
        logicProgrammersSE = new javax.swing.JLabel();
        chas3 = new javax.swing.JLabel();
        dlcDevelopersSE = new javax.swing.JLabel();
        chas4 = new javax.swing.JLabel();
        narrativeDevelopersSE = new javax.swing.JLabel();
        chas5 = new javax.swing.JLabel();
        integratorsSE = new javax.swing.JLabel();
        wm_label1 = new javax.swing.JLabel();
        chas6 = new javax.swing.JLabel();
        chas7 = new javax.swing.JLabel();
        chas8 = new javax.swing.JLabel();
        chas9 = new javax.swing.JLabel();
        managerStatus_label = new javax.swing.JLabel();
        nivelesPartsSE = new javax.swing.JLabel();
        logicaPartsSE = new javax.swing.JLabel();
        managerSalaryDiscountSE = new javax.swing.JLabel();
        spriteArtistsSE = new javax.swing.JLabel();
        maxAcceM = new javax.swing.JLabel();
        narrativaPartsSE = new javax.swing.JLabel();
        maxChaM = new javax.swing.JLabel();
        maxBoM = new javax.swing.JLabel();
        maxMotM = new javax.swing.JLabel();
        MaxWheeM = new javax.swing.JLabel();
        wm_label2 = new javax.swing.JLabel();
        directorStatusSE = new javax.swing.JLabel();
        chas12 = new javax.swing.JLabel();
        directorStatus_label = new javax.swing.JLabel();
        managerStatus_label2 = new javax.swing.JLabel();
        dlcPartsSE = new javax.swing.JLabel();
        faultsQtyM1SE = new javax.swing.JLabel();
        earningsSE = new javax.swing.JLabel();
        managerStatus_label3 = new javax.swing.JLabel();
        managerStatusSE = new javax.swing.JLabel();
        wm_label4 = new javax.swing.JLabel();
        assembled_labelM = new javax.swing.JLabel();
        chas10 = new javax.swing.JLabel();
        chas11 = new javax.swing.JLabel();
        dlcvdSE = new javax.swing.JLabel();
        standarvgSE = new javax.swing.JLabel();
        assembled_labelM1 = new javax.swing.JLabel();
        DaysLeftSquareEnix = new javax.swing.JLabel();
        assembled_labelM2 = new javax.swing.JLabel();
        costsSE = new javax.swing.JLabel();
        utilitySE = new javax.swing.JLabel();
        narrativaPlus = new javax.swing.JButton();
        nivelesPlus = new javax.swing.JButton();
        nivelesMin = new javax.swing.JButton();
        spritePlus = new javax.swing.JButton();
        spriteMin = new javax.swing.JButton();
        logicaPlus = new javax.swing.JButton();
        logicaMin = new javax.swing.JButton();
        dclMin = new javax.swing.JButton();
        dclPlus = new javax.swing.JButton();
        integradorMin = new javax.swing.JButton();
        integradorPlus = new javax.swing.JButton();
        utility_label1 = new javax.swing.JFormattedTextField();
        DayLeftLamborghini2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 51, 255));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N

        ConfigTab.setBackground(new java.awt.Color(153, 153, 255));
        ConfigTab.setForeground(new java.awt.Color(255, 255, 255));
        ConfigTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SquareEnix_label.setBackground(new java.awt.Color(102, 102, 102));
        SquareEnix_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        SquareEnix_label.setForeground(new java.awt.Color(255, 255, 255));
        SquareEnix_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SquareEnix_label.setText("SQUARE ENIX");
        ConfigTab.add(SquareEnix_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 200, 60));

        Config_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        Config_label.setForeground(new java.awt.Color(255, 255, 153));
        Config_label.setText("CONFIGURATION");
        ConfigTab.add(Config_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 330, 60));

        accessory_label.setBackground(new java.awt.Color(102, 102, 102));
        accessory_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        accessory_label.setForeground(new java.awt.Color(255, 255, 255));
        accessory_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accessory_label.setText("DLC Developers");
        ConfigTab.add(accessory_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 130, 30));

        Bethesda_label.setBackground(new java.awt.Color(102, 102, 102));
        Bethesda_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        Bethesda_label.setForeground(new java.awt.Color(255, 255, 255));
        Bethesda_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bethesda_label.setText("BETHESDA");
        ConfigTab.add(Bethesda_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 210, 60));

        General_label.setBackground(new java.awt.Color(102, 102, 102));
        General_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        General_label.setForeground(new java.awt.Color(255, 255, 255));
        General_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        General_label.setText("GENERAL");
        ConfigTab.add(General_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, 40));

        chasis_label.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasis_label.setForeground(new java.awt.Color(255, 255, 153));
        chasis_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chasis_label.setText("MAXIMUM 10 WORKERS");
        ConfigTab.add(chasis_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 170, 30));

        body_label.setBackground(new java.awt.Color(102, 102, 102));
        body_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        body_label.setForeground(new java.awt.Color(255, 255, 255));
        body_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        body_label.setText("Level Designers");
        ConfigTab.add(body_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 120, 30));

        motor_label.setBackground(new java.awt.Color(102, 102, 102));
        motor_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        motor_label.setForeground(new java.awt.Color(255, 255, 255));
        motor_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motor_label.setText("Sprite Artists");
        ConfigTab.add(motor_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 110, 30));

        wheel_label.setBackground(new java.awt.Color(102, 102, 102));
        wheel_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        wheel_label.setForeground(new java.awt.Color(255, 255, 255));
        wheel_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wheel_label.setText("Logic Programmers");
        ConfigTab.add(wheel_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 120, 30));

        dlcDevelopersBethesda.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        dlcDevelopersBethesda.setModel(new javax.swing.SpinnerNumberModel(1, 1, 13, 1));
        ConfigTab.add(dlcDevelopersBethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, 30));

        narrativeDevelopersBethesda.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        narrativeDevelopersBethesda.setModel(new javax.swing.SpinnerNumberModel(1, 1, 13, 1));
        ConfigTab.add(narrativeDevelopersBethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 30));

        levelDesignersBethesda.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        levelDesignersBethesda.setModel(new javax.swing.SpinnerNumberModel(1, 1, 13, 1));
        ConfigTab.add(levelDesignersBethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 30));

        spriteArtistsBethesda.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        spriteArtistsBethesda.setModel(new javax.swing.SpinnerNumberModel(1, 1, 13, 1));
        ConfigTab.add(spriteArtistsBethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, 30));

        logicProgrammersBethesda.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        logicProgrammersBethesda.setModel(new javax.swing.SpinnerNumberModel(1, 1, 13, 1));
        ConfigTab.add(logicProgrammersBethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, 30));

        accessory_label1.setBackground(new java.awt.Color(102, 102, 102));
        accessory_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        accessory_label1.setForeground(new java.awt.Color(255, 255, 255));
        accessory_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accessory_label1.setText("DLC Developers");
        ConfigTab.add(accessory_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 130, 30));

        chasis_label1.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasis_label1.setForeground(new java.awt.Color(255, 255, 255));
        chasis_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chasis_label1.setText("Narrative Designers");
        ConfigTab.add(chasis_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 140, 30));

        body_label1.setBackground(new java.awt.Color(102, 102, 102));
        body_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        body_label1.setForeground(new java.awt.Color(255, 255, 255));
        body_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        body_label1.setText("Level Designers");
        ConfigTab.add(body_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 120, 30));

        motor_label1.setBackground(new java.awt.Color(102, 102, 102));
        motor_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        motor_label1.setForeground(new java.awt.Color(255, 255, 255));
        motor_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motor_label1.setText("Sprite Artists");
        ConfigTab.add(motor_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 110, 30));

        wheel_label1.setBackground(new java.awt.Color(102, 102, 102));
        wheel_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        wheel_label1.setForeground(new java.awt.Color(255, 255, 255));
        wheel_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wheel_label1.setText("Logic Programmers");
        ConfigTab.add(wheel_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 120, 30));

        dlcDevelopersSquareEnix.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        dlcDevelopersSquareEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        ConfigTab.add(dlcDevelopersSquareEnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, 30));

        narrativeDevelopersSquareEnix.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        narrativeDevelopersSquareEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        ConfigTab.add(narrativeDevelopersSquareEnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, 30));

        levelDesignersSquareEnix.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        levelDesignersSquareEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        ConfigTab.add(levelDesignersSquareEnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, 30));

        spriteArtistsSquareEnix.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        spriteArtistsSquareEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        ConfigTab.add(spriteArtistsSquareEnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, 30));

        logicProgrammersSquareEnix.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        logicProgrammersSquareEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        ConfigTab.add(logicProgrammersSquareEnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, 30));

        setConfiguration.setBackground(new java.awt.Color(255, 255, 153));
        setConfiguration.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        setConfiguration.setForeground(new java.awt.Color(51, 51, 51));
        setConfiguration.setText("SET CONFIGURATION");
        setConfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setConfigurationActionPerformed(evt);
            }
        });
        ConfigTab.add(setConfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 50));

        dayDuration_label.setBackground(new java.awt.Color(102, 102, 102));
        dayDuration_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        dayDuration_label.setForeground(new java.awt.Color(255, 255, 255));
        dayDuration_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayDuration_label.setText("Day Duration (seconds)");
        ConfigTab.add(dayDuration_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, 30));

        chasis_label3.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 10)); // NOI18N
        chasis_label3.setForeground(new java.awt.Color(255, 255, 153));
        chasis_label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chasis_label3.setText("You have to press the button to set the configuration");
        ConfigTab.add(chasis_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 280, 30));

        chasis_label4.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasis_label4.setForeground(new java.awt.Color(255, 255, 153));
        chasis_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chasis_label4.setText("MAXIMUM 11 WORKERS");
        ConfigTab.add(chasis_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 180, 30));

        dayDurationInput.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        dayDurationInput.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(dayDurationInput);

        ConfigTab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 120, -1));

        chasis_label5.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasis_label5.setForeground(new java.awt.Color(255, 255, 255));
        chasis_label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chasis_label5.setText("Narrative Designers");
        ConfigTab.add(chasis_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 130, 30));

        deliveryDaysInput.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        deliveryDaysInput.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(deliveryDaysInput);

        ConfigTab.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 120, -1));

        dayDuration_label1.setBackground(new java.awt.Color(102, 102, 102));
        dayDuration_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        dayDuration_label1.setForeground(new java.awt.Color(255, 255, 255));
        dayDuration_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayDuration_label1.setText("Days to Deliver");
        ConfigTab.add(dayDuration_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, 30));

        assemblers_label.setBackground(new java.awt.Color(102, 102, 102));
        assemblers_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        assemblers_label.setForeground(new java.awt.Color(255, 255, 255));
        assemblers_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assemblers_label.setText("Integrators");
        ConfigTab.add(assemblers_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 80, 30));

        integratorsBethesda.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        integratorsBethesda.setModel(new javax.swing.SpinnerNumberModel(1, 1, 13, 1));
        ConfigTab.add(integratorsBethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, 30));

        assemblers_label2.setBackground(new java.awt.Color(102, 102, 102));
        assemblers_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        assemblers_label2.setForeground(new java.awt.Color(255, 255, 255));
        assemblers_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assemblers_label2.setText("Integrators");
        ConfigTab.add(assemblers_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 80, 30));

        integratorsSquareEnix.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        integratorsSquareEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        ConfigTab.add(integratorsSquareEnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, -1, 30));

        jTabbedPane1.addTab("Configuration", ConfigTab);

        LamborghiniTab.setBackground(new java.awt.Color(102, 102, 255));
        LamborghiniTab.setForeground(new java.awt.Color(255, 255, 255));
        LamborghiniTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startB.setBackground(new java.awt.Color(255, 255, 153));
        startB.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        startB.setForeground(new java.awt.Color(51, 51, 51));
        startB.setText("Start");
        startB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(startB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, 40));

        B_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        B_label.setForeground(new java.awt.Color(255, 255, 153));
        B_label.setText("BETHESDA");
        LamborghiniTab.add(B_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 60));

        levelDesignersB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        levelDesignersB.setForeground(new java.awt.Color(255, 255, 255));
        levelDesignersB.setText("0");
        LamborghiniTab.add(levelDesignersB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 40, 40));

        wm_label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label3.setForeground(new java.awt.Color(255, 255, 153));
        wm_label3.setText("DIRECTOR");
        LamborghiniTab.add(wm_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 140, 40));

        chas13.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas13.setForeground(new java.awt.Color(255, 255, 255));
        chas13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas13.setText("Sprite:");
        LamborghiniTab.add(chas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 70, 40));

        chas14.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas14.setForeground(new java.awt.Color(255, 255, 255));
        chas14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas14.setText("Logic:");
        LamborghiniTab.add(chas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 70, 40));

        logicProgrammersB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        logicProgrammersB.setForeground(new java.awt.Color(255, 255, 255));
        logicProgrammersB.setText("0");
        LamborghiniTab.add(logicProgrammersB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 40, 40));

        chas15.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas15.setForeground(new java.awt.Color(255, 255, 255));
        chas15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas15.setText("DLC");
        LamborghiniTab.add(chas15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 100, 40));

        dlcDevelopersB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dlcDevelopersB.setForeground(new java.awt.Color(255, 255, 255));
        dlcDevelopersB.setText("0");
        LamborghiniTab.add(dlcDevelopersB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 40, 40));

        narrativeDevelopersB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        narrativeDevelopersB.setForeground(new java.awt.Color(255, 255, 255));
        narrativeDevelopersB.setText("0");
        LamborghiniTab.add(narrativeDevelopersB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 40, 40));

        chas16.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas16.setForeground(new java.awt.Color(255, 255, 255));
        chas16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas16.setText("Integrator:");
        LamborghiniTab.add(chas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 100, 40));

        integratorsB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        integratorsB.setForeground(new java.awt.Color(255, 255, 255));
        integratorsB.setText("0");
        LamborghiniTab.add(integratorsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 40, 40));

        wm_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label5.setForeground(new java.awt.Color(255, 255, 153));
        wm_label5.setText("WORKERS");
        LamborghiniTab.add(wm_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 140, 40));

        chas17.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas17.setForeground(new java.awt.Color(255, 255, 255));
        chas17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas17.setText("Narrative:");
        LamborghiniTab.add(chas17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 100, 40));

        chas18.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas18.setForeground(new java.awt.Color(255, 255, 255));
        chas18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas18.setText("Level:");
        LamborghiniTab.add(chas18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 70, 40));

        managerStatus_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label1.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label1.setText("Discounted:");
        LamborghiniTab.add(managerStatus_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, 40));

        managerSalaryDiscountB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerSalaryDiscountB.setForeground(new java.awt.Color(255, 255, 255));
        managerSalaryDiscountB.setText("0");
        LamborghiniTab.add(managerSalaryDiscountB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 40));

        spriteArtistsB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        spriteArtistsB.setForeground(new java.awt.Color(255, 255, 255));
        spriteArtistsB.setText("0");
        LamborghiniTab.add(spriteArtistsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 40, 40));

        directorStatusB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatusB.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        directorStatusB.setText("Working");
        LamborghiniTab.add(directorStatusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 160, 40));

        directorStatus_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatus_label1.setForeground(new java.awt.Color(255, 255, 255));
        directorStatus_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        directorStatus_label1.setText("Status:");
        LamborghiniTab.add(directorStatus_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, 40));

        managerStatus_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label4.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label4.setText("Faults:");
        LamborghiniTab.add(managerStatus_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 100, 40));

        faultsQtyB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        faultsQtyB.setForeground(new java.awt.Color(255, 255, 255));
        faultsQtyB.setText("0");
        LamborghiniTab.add(faultsQtyB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 40, 40));

        managerStatus_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label5.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label5.setText("Status:");
        LamborghiniTab.add(managerStatus_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, 40));

        managerStatusB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatusB.setForeground(new java.awt.Color(255, 255, 255));
        managerStatusB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        managerStatusB.setText("Nothing");
        LamborghiniTab.add(managerStatusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 250, 40));

        wm_label7.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label7.setForeground(new java.awt.Color(255, 255, 153));
        wm_label7.setText("MANAGER");
        LamborghiniTab.add(wm_label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 150, 40));

        DayLeftLamborghini1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        DayLeftLamborghini1.setForeground(new java.awt.Color(255, 255, 153));
        DayLeftLamborghini1.setText("DAYS LEFT:");
        LamborghiniTab.add(DayLeftLamborghini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 150, 40));

        chas19.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas19.setForeground(new java.awt.Color(255, 255, 255));
        chas19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas19.setText("With DLC:");
        LamborghiniTab.add(chas19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 170, 40));

        chas20.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas20.setForeground(new java.awt.Color(255, 255, 255));
        chas20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas20.setText("Standard:");
        LamborghiniTab.add(chas20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 100, 40));

        dlcVideoGamesB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dlcVideoGamesB.setForeground(new java.awt.Color(255, 255, 255));
        dlcVideoGamesB.setText("0");
        LamborghiniTab.add(dlcVideoGamesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 40, 40));

        standarVideoGamesB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        standarVideoGamesB.setForeground(new java.awt.Color(255, 255, 255));
        standarVideoGamesB.setText("0");
        LamborghiniTab.add(standarVideoGamesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 40, 40));

        assembled_labelM4.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM4.setForeground(new java.awt.Color(255, 255, 153));
        assembled_labelM4.setText("CARS ASSEMBLED");
        LamborghiniTab.add(assembled_labelM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 240, 40));

        daysLeftBethesda.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        daysLeftBethesda.setForeground(new java.awt.Color(255, 255, 153));
        daysLeftBethesda.setText("0");
        LamborghiniTab.add(daysLeftBethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 50, 40));

        chas21.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas21.setForeground(new java.awt.Color(255, 255, 255));
        chas21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas21.setText("Level:");
        LamborghiniTab.add(chas21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 40));

        BethesdaSprite.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        BethesdaSprite.setForeground(new java.awt.Color(255, 255, 255));
        BethesdaSprite.setText("0");
        LamborghiniTab.add(BethesdaSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 40, 40));

        chas22.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas22.setForeground(new java.awt.Color(255, 255, 255));
        chas22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas22.setText("Narrative:");
        LamborghiniTab.add(chas22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 40));

        chas23.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas23.setForeground(new java.awt.Color(255, 255, 255));
        chas23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas23.setText("Sprite:");
        LamborghiniTab.add(chas23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 70, 40));

        chas24.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas24.setForeground(new java.awt.Color(255, 255, 255));
        chas24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas24.setText("Logic:");
        LamborghiniTab.add(chas24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 70, 40));

        BethesdaLevel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        BethesdaLevel.setForeground(new java.awt.Color(255, 255, 255));
        BethesdaLevel.setText("0");
        LamborghiniTab.add(BethesdaLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 40, 40));

        BethesdaLogic.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        BethesdaLogic.setForeground(new java.awt.Color(255, 255, 255));
        BethesdaLogic.setText("0");
        LamborghiniTab.add(BethesdaLogic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 40, 40));

        maxAcceM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxAcceM1.setForeground(new java.awt.Color(255, 255, 255));
        maxAcceM1.setText("/ 10");
        LamborghiniTab.add(maxAcceM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 40, 40));

        BethesdaNarrative.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        BethesdaNarrative.setForeground(new java.awt.Color(255, 255, 255));
        BethesdaNarrative.setText("0");
        LamborghiniTab.add(BethesdaNarrative, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 40, 40));

        maxChaM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxChaM1.setForeground(new java.awt.Color(255, 255, 255));
        maxChaM1.setText("/ 25");
        LamborghiniTab.add(maxChaM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 40));

        maxBoM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxBoM1.setForeground(new java.awt.Color(255, 255, 255));
        maxBoM1.setText("/ 20");
        LamborghiniTab.add(maxBoM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 40, 40));

        maxMotM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxMotM1.setForeground(new java.awt.Color(255, 255, 255));
        maxMotM1.setText("/ 55");
        LamborghiniTab.add(maxMotM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 40, 40));

        MaxWheeM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        MaxWheeM1.setForeground(new java.awt.Color(255, 255, 255));
        MaxWheeM1.setText("/ 35");
        LamborghiniTab.add(MaxWheeM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 40, 40));

        wm_label9.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label9.setForeground(new java.awt.Color(255, 255, 153));
        wm_label9.setText("CAR PARTS");
        LamborghiniTab.add(wm_label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, 40));

        chas25.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas25.setForeground(new java.awt.Color(255, 255, 255));
        chas25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas25.setText("DLC");
        LamborghiniTab.add(chas25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 40));

        BethesdaDlc.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        BethesdaDlc.setForeground(new java.awt.Color(255, 255, 255));
        BethesdaDlc.setText("0");
        LamborghiniTab.add(BethesdaDlc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 40, 40));

        earningsB.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        earningsB.setForeground(new java.awt.Color(255, 255, 153));
        earningsB.setText("0");
        LamborghiniTab.add(earningsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 210, 40));

        assembled_labelM5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM5.setForeground(new java.awt.Color(255, 255, 153));
        assembled_labelM5.setText("EARNINGS: ");
        LamborghiniTab.add(assembled_labelM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 150, 40));

        assembled_labelM6.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM6.setForeground(new java.awt.Color(255, 255, 153));
        assembled_labelM6.setText("COSTS:");
        LamborghiniTab.add(assembled_labelM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 100, 40));

        costsB.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        costsB.setForeground(new java.awt.Color(255, 255, 153));
        costsB.setText("0");
        LamborghiniTab.add(costsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 220, 40));

        utilityB.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        utilityB.setForeground(new java.awt.Color(255, 255, 153));
        utilityB.setText("0");
        LamborghiniTab.add(utilityB, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 220, 50));

        narrativaPlusB.setBackground(new java.awt.Color(255, 255, 153));
        narrativaPlusB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        narrativaPlusB.setForeground(new java.awt.Color(51, 51, 51));
        narrativaPlusB.setText("+");
        narrativaPlusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narrativaPlusBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(narrativaPlusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 50, 20));

        nivelesPlusB.setBackground(new java.awt.Color(255, 255, 153));
        nivelesPlusB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        nivelesPlusB.setForeground(new java.awt.Color(51, 51, 51));
        nivelesPlusB.setText("+");
        nivelesPlusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelesPlusBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(nivelesPlusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 50, 20));

        spritePlusB.setBackground(new java.awt.Color(255, 255, 153));
        spritePlusB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        spritePlusB.setForeground(new java.awt.Color(51, 51, 51));
        spritePlusB.setText("+");
        spritePlusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spritePlusBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(spritePlusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 50, 20));

        narrativaMinB.setBackground(new java.awt.Color(255, 255, 153));
        narrativaMinB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        narrativaMinB.setForeground(new java.awt.Color(51, 51, 51));
        narrativaMinB.setText("-");
        narrativaMinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narrativaMinBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(narrativaMinB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 50, 20));

        nivelesMinB.setBackground(new java.awt.Color(255, 255, 153));
        nivelesMinB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        nivelesMinB.setForeground(new java.awt.Color(51, 51, 51));
        nivelesMinB.setText("-");
        nivelesMinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelesMinBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(nivelesMinB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 50, 20));

        spriteMinB.setBackground(new java.awt.Color(255, 255, 153));
        spriteMinB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        spriteMinB.setForeground(new java.awt.Color(51, 51, 51));
        spriteMinB.setText("-");
        spriteMinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteMinBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(spriteMinB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 50, 20));

        logicaPlusB.setBackground(new java.awt.Color(255, 255, 153));
        logicaPlusB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        logicaPlusB.setForeground(new java.awt.Color(51, 51, 51));
        logicaPlusB.setText("+");
        logicaPlusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logicaPlusBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(logicaPlusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 20));

        logicaMinB.setBackground(new java.awt.Color(255, 255, 153));
        logicaMinB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        logicaMinB.setForeground(new java.awt.Color(51, 51, 51));
        logicaMinB.setText("-");
        logicaMinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logicaMinBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(logicaMinB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 50, 20));

        dlcMinB.setBackground(new java.awt.Color(255, 255, 153));
        dlcMinB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dlcMinB.setForeground(new java.awt.Color(51, 51, 51));
        dlcMinB.setText("-");
        dlcMinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlcMinBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(dlcMinB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 50, 20));

        dlcPlusB.setBackground(new java.awt.Color(255, 255, 153));
        dlcPlusB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dlcPlusB.setForeground(new java.awt.Color(51, 51, 51));
        dlcPlusB.setText("+");
        dlcPlusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlcPlusBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(dlcPlusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 50, 20));

        integradorMinB.setBackground(new java.awt.Color(255, 255, 153));
        integradorMinB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        integradorMinB.setForeground(new java.awt.Color(51, 51, 51));
        integradorMinB.setText("-");
        integradorMinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integradorMinBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(integradorMinB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 50, 20));

        integradorPlusB.setBackground(new java.awt.Color(255, 255, 153));
        integradorPlusB.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        integradorPlusB.setForeground(new java.awt.Color(51, 51, 51));
        integradorPlusB.setText("+");
        integradorPlusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integradorPlusBActionPerformed(evt);
            }
        });
        LamborghiniTab.add(integradorPlusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 50, 20));

        utility_label.setEditable(false);
        utility_label.setBackground(new java.awt.Color(255, 255, 153));
        utility_label.setForeground(new java.awt.Color(51, 51, 51));
        utility_label.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        utility_label.setText("TOTAL PROFIT:");
        utility_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        LamborghiniTab.add(utility_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 210, 50));

        jTabbedPane1.addTab("Bethesda", LamborghiniTab);

        MaseratiTab.setBackground(new java.awt.Color(204, 153, 255));
        MaseratiTab.setForeground(new java.awt.Color(255, 255, 255));
        MaseratiTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startSE.setBackground(new java.awt.Color(255, 255, 153));
        startSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        startSE.setForeground(new java.awt.Color(51, 51, 51));
        startSE.setText("Start");
        startSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSEActionPerformed(evt);
            }
        });
        MaseratiTab.add(startSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, 40));

        narrativaMin.setBackground(new java.awt.Color(255, 255, 153));
        narrativaMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        narrativaMin.setForeground(new java.awt.Color(51, 51, 51));
        narrativaMin.setText("-");
        narrativaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narrativaMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(narrativaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 50, 20));

        levelDesignersSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        levelDesignersSE.setForeground(new java.awt.Color(255, 255, 255));
        levelDesignersSE.setText("0");
        MaseratiTab.add(levelDesignersSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 40, 40));

        SE_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        SE_label.setForeground(new java.awt.Color(255, 255, 153));
        SE_label.setText("SQUARE ENIX");
        MaseratiTab.add(SE_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 60));

        wm_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label.setForeground(new java.awt.Color(255, 255, 153));
        wm_label.setText("DIRECTOR");
        MaseratiTab.add(wm_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 140, 40));

        chas.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas.setForeground(new java.awt.Color(255, 255, 255));
        chas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas.setText("Level:");
        MaseratiTab.add(chas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 40));

        chas1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas1.setForeground(new java.awt.Color(255, 255, 255));
        chas1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas1.setText("Sprite:");
        MaseratiTab.add(chas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 70, 40));

        spritePartsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        spritePartsSE.setForeground(new java.awt.Color(255, 255, 255));
        spritePartsSE.setText("0");
        MaseratiTab.add(spritePartsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 40, 40));

        chas2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas2.setForeground(new java.awt.Color(255, 255, 255));
        chas2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas2.setText("Logic:");
        MaseratiTab.add(chas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 70, 40));

        logicProgrammersSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        logicProgrammersSE.setForeground(new java.awt.Color(255, 255, 255));
        logicProgrammersSE.setText("0");
        MaseratiTab.add(logicProgrammersSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 40, 40));

        chas3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas3.setForeground(new java.awt.Color(255, 255, 255));
        chas3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas3.setText("DLC");
        MaseratiTab.add(chas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 100, 40));

        dlcDevelopersSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dlcDevelopersSE.setForeground(new java.awt.Color(255, 255, 255));
        dlcDevelopersSE.setText("0");
        MaseratiTab.add(dlcDevelopersSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 40, 40));

        chas4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas4.setForeground(new java.awt.Color(255, 255, 255));
        chas4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas4.setText("Narrative:");
        MaseratiTab.add(chas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 40));

        narrativeDevelopersSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        narrativeDevelopersSE.setForeground(new java.awt.Color(255, 255, 255));
        narrativeDevelopersSE.setText("0");
        MaseratiTab.add(narrativeDevelopersSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 40, 40));

        chas5.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas5.setForeground(new java.awt.Color(255, 255, 255));
        chas5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas5.setText("Integrator:");
        MaseratiTab.add(chas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 100, 40));

        integratorsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        integratorsSE.setForeground(new java.awt.Color(255, 255, 255));
        integratorsSE.setText("0");
        MaseratiTab.add(integratorsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 40, 40));

        wm_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label1.setForeground(new java.awt.Color(255, 255, 153));
        wm_label1.setText("DEVELOPERS");
        MaseratiTab.add(wm_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 160, 40));

        chas6.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas6.setForeground(new java.awt.Color(255, 255, 255));
        chas6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas6.setText("Narrative:");
        MaseratiTab.add(chas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 110, 40));

        chas7.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas7.setForeground(new java.awt.Color(255, 255, 255));
        chas7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas7.setText("Level:");
        MaseratiTab.add(chas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 70, 40));

        chas8.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas8.setForeground(new java.awt.Color(255, 255, 255));
        chas8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas8.setText("Sprite:");
        MaseratiTab.add(chas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 70, 40));

        chas9.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas9.setForeground(new java.awt.Color(255, 255, 255));
        chas9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas9.setText("Logic:");
        MaseratiTab.add(chas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 70, 40));

        managerStatus_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label.setText("Discounted:");
        MaseratiTab.add(managerStatus_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, 40));

        nivelesPartsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        nivelesPartsSE.setForeground(new java.awt.Color(255, 255, 255));
        nivelesPartsSE.setText("0");
        MaseratiTab.add(nivelesPartsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 40, 40));

        logicaPartsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        logicaPartsSE.setForeground(new java.awt.Color(255, 255, 255));
        logicaPartsSE.setText("0");
        MaseratiTab.add(logicaPartsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 40, 40));

        managerSalaryDiscountSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerSalaryDiscountSE.setForeground(new java.awt.Color(255, 255, 255));
        managerSalaryDiscountSE.setText("0");
        MaseratiTab.add(managerSalaryDiscountSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 140, 40));

        spriteArtistsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        spriteArtistsSE.setForeground(new java.awt.Color(255, 255, 255));
        spriteArtistsSE.setText("0");
        MaseratiTab.add(spriteArtistsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 40, 40));

        maxAcceM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxAcceM.setForeground(new java.awt.Color(255, 255, 255));
        maxAcceM.setText("/ 10");
        MaseratiTab.add(maxAcceM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 40, 40));

        narrativaPartsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        narrativaPartsSE.setForeground(new java.awt.Color(255, 255, 255));
        narrativaPartsSE.setText("0");
        MaseratiTab.add(narrativaPartsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 40, 40));

        maxChaM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxChaM.setForeground(new java.awt.Color(255, 255, 255));
        maxChaM.setText("/ 25");
        MaseratiTab.add(maxChaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 40));

        maxBoM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxBoM.setForeground(new java.awt.Color(255, 255, 255));
        maxBoM.setText("/ 20");
        MaseratiTab.add(maxBoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 40, 40));

        maxMotM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxMotM.setForeground(new java.awt.Color(255, 255, 255));
        maxMotM.setText("/ 55");
        MaseratiTab.add(maxMotM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 40, 40));

        MaxWheeM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        MaxWheeM.setForeground(new java.awt.Color(255, 255, 255));
        MaxWheeM.setText("/ 35");
        MaseratiTab.add(MaxWheeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 40, 40));

        wm_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label2.setForeground(new java.awt.Color(255, 255, 153));
        wm_label2.setText("CAR PARTS");
        MaseratiTab.add(wm_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, 40));

        directorStatusSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatusSE.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusSE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        directorStatusSE.setText("Working");
        MaseratiTab.add(directorStatusSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 180, 40));

        chas12.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas12.setForeground(new java.awt.Color(255, 255, 255));
        chas12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas12.setText("DLC");
        MaseratiTab.add(chas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 40));

        directorStatus_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatus_label.setForeground(new java.awt.Color(255, 255, 255));
        directorStatus_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        directorStatus_label.setText("Status:");
        MaseratiTab.add(directorStatus_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, 40));

        managerStatus_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label2.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label2.setText("Faults:");
        MaseratiTab.add(managerStatus_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 100, 40));

        dlcPartsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dlcPartsSE.setForeground(new java.awt.Color(255, 255, 255));
        dlcPartsSE.setText("0");
        MaseratiTab.add(dlcPartsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 40, 40));

        faultsQtyM1SE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        faultsQtyM1SE.setForeground(new java.awt.Color(255, 255, 255));
        faultsQtyM1SE.setText("0");
        MaseratiTab.add(faultsQtyM1SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 40, 40));

        earningsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        earningsSE.setForeground(new java.awt.Color(255, 255, 153));
        earningsSE.setText("0");
        MaseratiTab.add(earningsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 210, 40));

        managerStatus_label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label3.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label3.setText("Status:");
        MaseratiTab.add(managerStatus_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, 40));

        managerStatusSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatusSE.setForeground(new java.awt.Color(255, 255, 255));
        managerStatusSE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        managerStatusSE.setText("Nothing");
        MaseratiTab.add(managerStatusSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 250, 40));

        wm_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label4.setForeground(new java.awt.Color(255, 255, 153));
        wm_label4.setText("MANAGER");
        MaseratiTab.add(wm_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 150, 40));

        assembled_labelM.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM.setForeground(new java.awt.Color(255, 255, 153));
        assembled_labelM.setText("EARNINGS: ");
        MaseratiTab.add(assembled_labelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 150, 40));

        chas10.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas10.setForeground(new java.awt.Color(255, 255, 255));
        chas10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas10.setText("With DLC:");
        MaseratiTab.add(chas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 170, 40));

        chas11.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas11.setForeground(new java.awt.Color(255, 255, 255));
        chas11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas11.setText("Standard:");
        MaseratiTab.add(chas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 100, 40));

        dlcvdSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dlcvdSE.setForeground(new java.awt.Color(255, 255, 255));
        dlcvdSE.setText("0");
        MaseratiTab.add(dlcvdSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 40, 40));

        standarvgSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        standarvgSE.setForeground(new java.awt.Color(255, 255, 255));
        standarvgSE.setText("0");
        MaseratiTab.add(standarvgSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 40, 40));

        assembled_labelM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM1.setForeground(new java.awt.Color(255, 255, 153));
        assembled_labelM1.setText("CARS ASSEMBLED");
        MaseratiTab.add(assembled_labelM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 240, 40));

        DaysLeftSquareEnix.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        DaysLeftSquareEnix.setForeground(new java.awt.Color(255, 255, 153));
        DaysLeftSquareEnix.setText("0");
        MaseratiTab.add(DaysLeftSquareEnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 90, 40));

        assembled_labelM2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM2.setForeground(new java.awt.Color(255, 255, 153));
        assembled_labelM2.setText("COSTS:");
        MaseratiTab.add(assembled_labelM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 100, 40));

        costsSE.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        costsSE.setForeground(new java.awt.Color(255, 255, 153));
        costsSE.setText("0");
        MaseratiTab.add(costsSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 210, 40));

        utilitySE.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        utilitySE.setForeground(new java.awt.Color(255, 255, 153));
        utilitySE.setText("0");
        MaseratiTab.add(utilitySE, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 210, 50));

        narrativaPlus.setBackground(new java.awt.Color(255, 255, 153));
        narrativaPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        narrativaPlus.setForeground(new java.awt.Color(51, 51, 51));
        narrativaPlus.setText("+");
        narrativaPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narrativaPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(narrativaPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 50, 20));

        nivelesPlus.setBackground(new java.awt.Color(255, 255, 153));
        nivelesPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        nivelesPlus.setForeground(new java.awt.Color(51, 51, 51));
        nivelesPlus.setText("+");
        nivelesPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelesPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(nivelesPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 50, 20));

        nivelesMin.setBackground(new java.awt.Color(255, 255, 153));
        nivelesMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        nivelesMin.setForeground(new java.awt.Color(51, 51, 51));
        nivelesMin.setText("-");
        nivelesMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelesMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(nivelesMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 50, 20));

        spritePlus.setBackground(new java.awt.Color(255, 255, 153));
        spritePlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        spritePlus.setForeground(new java.awt.Color(51, 51, 51));
        spritePlus.setText("+");
        spritePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spritePlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(spritePlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 50, 20));

        spriteMin.setBackground(new java.awt.Color(255, 255, 153));
        spriteMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        spriteMin.setForeground(new java.awt.Color(51, 51, 51));
        spriteMin.setText("-");
        spriteMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(spriteMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 50, 20));

        logicaPlus.setBackground(new java.awt.Color(255, 255, 153));
        logicaPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        logicaPlus.setForeground(new java.awt.Color(51, 51, 51));
        logicaPlus.setText("+");
        logicaPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logicaPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(logicaPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 20));

        logicaMin.setBackground(new java.awt.Color(255, 255, 153));
        logicaMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        logicaMin.setForeground(new java.awt.Color(51, 51, 51));
        logicaMin.setText("-");
        logicaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logicaMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(logicaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 50, 20));

        dclMin.setBackground(new java.awt.Color(255, 255, 153));
        dclMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dclMin.setForeground(new java.awt.Color(51, 51, 51));
        dclMin.setText("-");
        dclMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dclMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(dclMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 50, 20));

        dclPlus.setBackground(new java.awt.Color(255, 255, 153));
        dclPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        dclPlus.setForeground(new java.awt.Color(51, 51, 51));
        dclPlus.setText("+");
        dclPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dclPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(dclPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 50, 20));

        integradorMin.setBackground(new java.awt.Color(255, 255, 153));
        integradorMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        integradorMin.setForeground(new java.awt.Color(51, 51, 51));
        integradorMin.setText("-");
        integradorMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integradorMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(integradorMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 50, 20));

        integradorPlus.setBackground(new java.awt.Color(255, 255, 153));
        integradorPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        integradorPlus.setForeground(new java.awt.Color(51, 51, 51));
        integradorPlus.setText("+");
        integradorPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integradorPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(integradorPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 50, 20));

        utility_label1.setEditable(false);
        utility_label1.setBackground(new java.awt.Color(255, 255, 153));
        utility_label1.setForeground(new java.awt.Color(51, 51, 51));
        utility_label1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        utility_label1.setText("TOTAL PROFIT:");
        utility_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        MaseratiTab.add(utility_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 210, 50));

        DayLeftLamborghini2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        DayLeftLamborghini2.setForeground(new java.awt.Color(255, 255, 153));
        DayLeftLamborghini2.setText("DAYS LEFT:");
        MaseratiTab.add(DayLeftLamborghini2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 150, 40));

        jTabbedPane1.addTab("Square Enix", MaseratiTab);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 605));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setConfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setConfigurationActionPerformed
        String configString = "General\ndayDuration\n";
        boolean pass = true;
        
        try{
            int dayDuration = Integer.parseInt(dayDurationInput.getText()) * 1000;
            int deliveryDays = Integer.parseInt(deliveryDaysInput.getText());
            
            configString += Integer.toString(dayDuration) + "\ndeliveryDays\n" + Integer.toString(deliveryDays) + "\n";
    
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "You have to enter a number");
            pass = false;
        }
        
        if (pass) {
            try {
                //Bethesda
                configString += "\nBethesda\nnarrative\n";

                Integer narrativeB = (Integer) narrativeDevelopersBethesda.getValue();
                configString += narrativeB.toString() + "\nlevel\n";

                Integer levelB = (Integer) levelDesignersBethesda.getValue();
                configString += levelB + "\nsprite\n";

                Integer spriteB = (Integer) spriteArtistsBethesda.getValue();
                configString += spriteB + "\nlogic\n";

                Integer logicB = (Integer) logicProgrammersBethesda.getValue();
                configString += logicB + "\ndlc\n";

                Integer dlcB = (Integer) dlcDevelopersBethesda.getValue();
                configString += dlcB + "\nintegrators\n";

                Integer integratorsB = (Integer) integratorsBethesda.getValue();
                configString += integratorsB + "\n";

                int sumB = narrativeB + levelB + spriteB + logicB + dlcB + integratorsB;

                //SquareEnix
                configString += "\nSquareEnix\nnarrative\n";

                Integer narrativeSE = (Integer) narrativeDevelopersSquareEnix.getValue();
                configString += narrativeSE.toString() + "\nlevel\n";

                Integer levelSE = (Integer) levelDesignersSquareEnix.getValue();
                configString += levelSE + "\nsprite\n";

                Integer spriteSE = (Integer) spriteArtistsSquareEnix.getValue();
                configString += spriteSE + "\nlogic\n";

                Integer logicSE = (Integer) logicProgrammersSquareEnix.getValue();
                configString += logicSE + "\ndlc\n";

                Integer dlcSE = (Integer) dlcDevelopersSquareEnix.getValue();
                configString += dlcSE + "\nintegrators\n";

                Integer integratorsSE = (Integer) integratorsSquareEnix.getValue();
                configString += integratorsSE;


                int sumSE = narrativeSE + levelSE + spriteSE + logicSE + dlcSE + integratorsSE;


                if ((sumB > 11) || (sumSE > 10)) {
                    throw new Exception(); 
                }
                
                ReadFile file = new ReadFile();
                file.printTxt(configString);

                String newConfig = file.readTxt();
                file.readConfig(newConfig, config);

                

            } catch(Exception e) {

                JOptionPane.showMessageDialog(null, "Enter correct amounts of workers. The maximum capacity of Bethesda is 11 workers and for Square Enix is 10 workers" + e);
            }
        }
        
        
       
        
        
    }//GEN-LAST:event_setConfigurationActionPerformed
                             

    private void startSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSEActionPerformed

            runningSE = true;
            disableButtonsSE();
            disableStarts("SE");
            
            
            DaysLeftSquareEnix(Integer.toString(config.getDeliveryDays()));
            SquareEnixStudio = new VideoGameStudio("SquareEnix", this, config);
            SquareEnixQtys(Integer.toString(SquareEnixStudio.getNarrativeDevelopers()), Integer.toString(SquareEnixStudio.getLevelDesigners()), Integer.toString(SquareEnixStudio.getSpriteArtists()), Integer.toString(SquareEnixStudio.getLogicProgrammers()), Integer.toString(SquareEnixStudio.getDlcDevelopers()), Integer.toString(SquareEnixStudio.getIntegrators()));

    }//GEN-LAST:event_startSEActionPerformed

    private void narrativaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narrativaMinActionPerformed
       if (Integer.parseInt(narrativeDevelopersSE.getText()) > 1) {
            int narrativeInt = Integer.parseInt(narrativeDevelopersSE.getText()) - 1;
            narrativeDevelopersSE.setText(Integer.toString(narrativeInt));
            changeWorkerMinus(SquareEnixStudio, "narrative");
            SquareEnixStudio.reduceNarrativeDevelopers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_narrativaMinActionPerformed

    private void startBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBActionPerformed

            runningB = true;
            disableButtonsB();
            disableStarts("B");
            
            daysLeftBethesda(Integer.toString(config.getDeliveryDays()));
            
            BethesdaStudio = new VideoGameStudio("Bathesda", this, config);
       
            BethesdaQtys(Integer.toString(BethesdaStudio.getNarrativeDevelopers()), Integer.toString(BethesdaStudio.getLevelDesigners()), Integer.toString(BethesdaStudio.getSpriteArtists()), Integer.toString(BethesdaStudio.getLogicProgrammers()), Integer.toString(BethesdaStudio.getDlcDevelopers()), Integer.toString(BethesdaStudio.getIntegrators()));

    }//GEN-LAST:event_startBActionPerformed

    private void narrativaPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narrativaPlusActionPerformed
        if ((SquareEnixStudio.sumDevelopers() < 10)) {
            int narrativeInt = Integer.parseInt(narrativeDevelopersSE.getText()) + 1;
            narrativeDevelopersSE.setText(Integer.toString(narrativeInt));

            changeWorkerPlus(SquareEnixStudio, "narrative");
            SquareEnixStudio.plusNarrativeDevelopers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_narrativaPlusActionPerformed

    private void nivelesPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelesPlusActionPerformed
        if ((SquareEnixStudio.sumDevelopers() < 10)) {
            int levelInt = Integer.parseInt(levelDesignersSE.getText()) + 1;
            levelDesignersSE.setText(Integer.toString(levelInt));

            changeWorkerPlus(SquareEnixStudio, "level");
            SquareEnixStudio.plusLevelDesigners();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
        
    }//GEN-LAST:event_nivelesPlusActionPerformed

    private void nivelesMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelesMinActionPerformed
        if ((Integer.parseInt(levelDesignersSE.getText()) > 1)) {
            int levelInt = Integer.parseInt(levelDesignersSE.getText()) - 1;
            levelDesignersSE.setText(Integer.toString(levelInt));
            changeWorkerMinus(SquareEnixStudio, "level");
            SquareEnixStudio.reduceLevelDesigners();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_nivelesMinActionPerformed

    private void spritePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spritePlusActionPerformed
        if ((SquareEnixStudio.sumDevelopers() < 10)) {
            int spriteInt = Integer.parseInt(spriteArtistsSE.getText()) + 1;
            spriteArtistsSE.setText(Integer.toString(spriteInt));

            changeWorkerPlus(SquareEnixStudio, "sprite");
            SquareEnixStudio.plusSpriteArtists();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_spritePlusActionPerformed

    private void spriteMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteMinActionPerformed
        if ((Integer.parseInt(spriteArtistsSE.getText()) > 1)) {
            int spriteInt = Integer.parseInt(spriteArtistsSE.getText()) - 1;
            spriteArtistsSE.setText(Integer.toString(spriteInt));
            changeWorkerMinus(SquareEnixStudio, "sprite");
            SquareEnixStudio.reduceSpriteArtists();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_spriteMinActionPerformed

    private void logicaPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logicaPlusActionPerformed
        if ((SquareEnixStudio.sumDevelopers() < 10)) {
            int logicInt = Integer.parseInt(logicProgrammersSE.getText()) + 1;
            logicProgrammersSE.setText(Integer.toString(logicInt));

            changeWorkerPlus(SquareEnixStudio, "logic");
            SquareEnixStudio.plusLogicProgrammers();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_logicaPlusActionPerformed

    private void logicaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logicaMinActionPerformed
        if ((Integer.parseInt(logicProgrammersSE.getText()) > 1)) {
            int logicInt = Integer.parseInt(logicProgrammersSE.getText()) - 1;
            logicProgrammersSE.setText(Integer.toString(logicInt));
            changeWorkerMinus(SquareEnixStudio, "logic");
            SquareEnixStudio.reduceLogicProgrammers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_logicaMinActionPerformed

    private void dclMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dclMinActionPerformed
        if ((Integer.parseInt(dlcDevelopersSE.getText()) > 1)) {
            int dlcInt = Integer.parseInt(dlcDevelopersSE.getText()) - 1;
            dlcDevelopersSE.setText(Integer.toString(dlcInt));
            changeWorkerMinus(SquareEnixStudio, "dlc");
            SquareEnixStudio.reduceDlcDevelopers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_dclMinActionPerformed

    private void dclPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dclPlusActionPerformed
        if ((SquareEnixStudio.sumDevelopers() < 10)) {
            int dlcInt = Integer.parseInt(dlcDevelopersSE.getText()) + 1;
            dlcDevelopersSE.setText(Integer.toString(dlcInt));

            changeWorkerPlus(SquareEnixStudio, "dlc");
            SquareEnixStudio.plusDlcDevelopers();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_dclPlusActionPerformed

    private void integradorMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integradorMinActionPerformed
        if ((Integer.parseInt(integratorsSE.getText()) > 1)) {
            int integratorInt = Integer.parseInt(integratorsSE.getText()) - 1;
            integratorsSE.setText(Integer.toString(integratorInt));
            changeWorkerMinus(SquareEnixStudio, "integrator");
            SquareEnixStudio.reduceIntegrators();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_integradorMinActionPerformed

    private void integradorPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integradorPlusActionPerformed
        if ((SquareEnixStudio.sumDevelopers() < 10)) {
            int integratorInt = Integer.parseInt(integratorsSE.getText()) + 1;
            integratorsSE.setText(Integer.toString(integratorInt));

            changeWorkerPlus(SquareEnixStudio, "integrator");
            SquareEnixStudio.plusIntegrators();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_integradorPlusActionPerformed

    private void narrativaPlusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narrativaPlusBActionPerformed
        if ((BethesdaStudio.sumDevelopers() >= 11)) {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
            
        } else {
            int narrativeInt = Integer.parseInt(narrativeDevelopersB.getText()) + 1;
            narrativeDevelopersB.setText(Integer.toString(narrativeInt));
        
            changeWorkerPlus(BethesdaStudio, "narrative");
            BethesdaStudio.plusNarrativeDevelopers();
  
        }
        
    }//GEN-LAST:event_narrativaPlusBActionPerformed

    private void nivelesPlusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelesPlusBActionPerformed
        if ((BethesdaStudio.sumDevelopers() < 11)) {
            int levelInt = Integer.parseInt(levelDesignersB.getText()) + 1;
            levelDesignersB.setText(Integer.toString(levelInt));
            changeWorkerPlus(BethesdaStudio, "level");
            BethesdaStudio.plusLevelDesigners();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
         
    }//GEN-LAST:event_nivelesPlusBActionPerformed

    private void spritePlusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spritePlusBActionPerformed
        if ((BethesdaStudio.sumDevelopers() < 11)) {
            int spriteInt = Integer.parseInt(spriteArtistsB.getText()) + 1;
            spriteArtistsB.setText(Integer.toString(spriteInt));
            changeWorkerPlus(BethesdaStudio, "motors");
            BethesdaStudio.plusSpriteArtists();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
            
        }
    }//GEN-LAST:event_spritePlusBActionPerformed

    private void narrativaMinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narrativaMinBActionPerformed
        if (Integer.parseInt(narrativeDevelopersB.getText()) > 1) {
            int narrativeInt = Integer.parseInt(narrativeDevelopersB.getText()) - 1;
            narrativeDevelopersB.setText(Integer.toString(narrativeInt));
            changeWorkerMinus(BethesdaStudio, "narrative");
            BethesdaStudio.reduceNarrativeDevelopers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_narrativaMinBActionPerformed

    private void nivelesMinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelesMinBActionPerformed
        if ((Integer.parseInt(levelDesignersB.getText()) > 1)) {
            int levelInt = Integer.parseInt(levelDesignersB.getText()) - 1;
            levelDesignersB.setText(Integer.toString(levelInt));
            changeWorkerMinus(BethesdaStudio, "body");
            BethesdaStudio.reduceLevelDesigners();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_nivelesMinBActionPerformed

    private void spriteMinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteMinBActionPerformed
        if ((Integer.parseInt(spriteArtistsB.getText()) > 1)) {
            int spriteInt = Integer.parseInt(spriteArtistsB.getText()) - 1;
            spriteArtistsB.setText(Integer.toString(spriteInt));
            changeWorkerMinus(BethesdaStudio, "motors");
            BethesdaStudio.reduceSpriteArtists();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_spriteMinBActionPerformed

    private void logicaPlusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logicaPlusBActionPerformed
        if ((BethesdaStudio.sumDevelopers() < 11)) {
            int logicInt = Integer.parseInt(logicProgrammersB.getText()) + 1;
            logicProgrammersB.setText(Integer.toString(logicInt));
            changeWorkerPlus(BethesdaStudio, "logic");
            BethesdaStudio.plusLogicProgrammers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_logicaPlusBActionPerformed

    private void logicaMinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logicaMinBActionPerformed
        if ((Integer.parseInt(logicProgrammersB.getText()) > 1)) {
            int logicInt = Integer.parseInt(logicProgrammersB.getText()) - 1;
            logicProgrammersB.setText(Integer.toString(logicInt));
            changeWorkerMinus(BethesdaStudio, "logic");
            BethesdaStudio.reduceLogicProgrammers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_logicaMinBActionPerformed

    private void dlcMinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlcMinBActionPerformed
        if ((Integer.parseInt(dlcDevelopersB.getText()) > 1)) {
            int dlcInt = Integer.parseInt(dlcDevelopersB.getText()) - 1;
            dlcDevelopersB.setText(Integer.toString(dlcInt));
            changeWorkerMinus(BethesdaStudio, "dlc");
            BethesdaStudio.reduceDlcDevelopers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_dlcMinBActionPerformed

    private void dlcPlusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlcPlusBActionPerformed
        if ((BethesdaStudio.sumDevelopers() < 11)) {
            int dlcInt = Integer.parseInt(dlcDevelopersB.getText()) + 1;
            dlcDevelopersB.setText(Integer.toString(dlcInt));
            changeWorkerPlus(BethesdaStudio, "dlc");
            BethesdaStudio.plusDlcDevelopers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_dlcPlusBActionPerformed

    private void integradorMinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integradorMinBActionPerformed

        if ((Integer.parseInt(integratorsB.getText()) > 1)) {
            int integratorsInt = Integer.parseInt(integratorsB.getText()) - 1;
            integratorsB.setText(Integer.toString(integratorsInt));
            changeWorkerMinus(BethesdaStudio, "integrators");
            BethesdaStudio.reduceIntegrators();
            
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_integradorMinBActionPerformed

    private void integradorPlusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integradorPlusBActionPerformed
        if ((BethesdaStudio.sumDevelopers() < 11)) {
            int integratorsInt = Integer.parseInt(integratorsB.getText()) + 1;
            integratorsB.setText(Integer.toString(integratorsInt));
            changeWorkerPlus(BethesdaStudio, "integrators");
            BethesdaStudio.plusIntegrators();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_integradorPlusBActionPerformed


    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_label;
    private javax.swing.JLabel BethesdaDlc;
    private javax.swing.JLabel BethesdaLevel;
    private javax.swing.JLabel BethesdaLogic;
    private javax.swing.JLabel BethesdaNarrative;
    private javax.swing.JLabel BethesdaSprite;
    private javax.swing.JLabel Bethesda_label;
    private javax.swing.JPanel ConfigTab;
    private javax.swing.JLabel Config_label;
    private javax.swing.JLabel DayLeftLamborghini1;
    private javax.swing.JLabel DayLeftLamborghini2;
    private javax.swing.JLabel DaysLeftSquareEnix;
    private javax.swing.JLabel General_label;
    private javax.swing.JPanel LamborghiniTab;
    private javax.swing.JPanel MaseratiTab;
    private javax.swing.JLabel MaxWheeM;
    private javax.swing.JLabel MaxWheeM1;
    private javax.swing.JLabel SE_label;
    private javax.swing.JLabel SquareEnix_label;
    private javax.swing.JLabel accessory_label;
    private javax.swing.JLabel accessory_label1;
    private javax.swing.JLabel assembled_labelM;
    private javax.swing.JLabel assembled_labelM1;
    private javax.swing.JLabel assembled_labelM2;
    private javax.swing.JLabel assembled_labelM4;
    private javax.swing.JLabel assembled_labelM5;
    private javax.swing.JLabel assembled_labelM6;
    private javax.swing.JLabel assemblers_label;
    private javax.swing.JLabel assemblers_label2;
    private javax.swing.JLabel body_label;
    private javax.swing.JLabel body_label1;
    private javax.swing.JLabel chas;
    private javax.swing.JLabel chas1;
    private javax.swing.JLabel chas10;
    private javax.swing.JLabel chas11;
    private javax.swing.JLabel chas12;
    private javax.swing.JLabel chas13;
    private javax.swing.JLabel chas14;
    private javax.swing.JLabel chas15;
    private javax.swing.JLabel chas16;
    private javax.swing.JLabel chas17;
    private javax.swing.JLabel chas18;
    private javax.swing.JLabel chas19;
    private javax.swing.JLabel chas2;
    private javax.swing.JLabel chas20;
    private javax.swing.JLabel chas21;
    private javax.swing.JLabel chas22;
    private javax.swing.JLabel chas23;
    private javax.swing.JLabel chas24;
    private javax.swing.JLabel chas25;
    private javax.swing.JLabel chas3;
    private javax.swing.JLabel chas4;
    private javax.swing.JLabel chas5;
    private javax.swing.JLabel chas6;
    private javax.swing.JLabel chas7;
    private javax.swing.JLabel chas8;
    private javax.swing.JLabel chas9;
    private javax.swing.JLabel chasis_label;
    private javax.swing.JLabel chasis_label1;
    private javax.swing.JLabel chasis_label3;
    private javax.swing.JLabel chasis_label4;
    private javax.swing.JLabel chasis_label5;
    private javax.swing.JLabel costsB;
    private javax.swing.JLabel costsSE;
    private javax.swing.JTextPane dayDurationInput;
    private javax.swing.JLabel dayDuration_label;
    private javax.swing.JLabel dayDuration_label1;
    private javax.swing.JLabel daysLeftBethesda;
    private javax.swing.JButton dclMin;
    private javax.swing.JButton dclPlus;
    private javax.swing.JTextPane deliveryDaysInput;
    private javax.swing.JLabel directorStatusB;
    private javax.swing.JLabel directorStatusSE;
    private javax.swing.JLabel directorStatus_label;
    private javax.swing.JLabel directorStatus_label1;
    private javax.swing.JLabel dlcDevelopersB;
    private javax.swing.JSpinner dlcDevelopersBethesda;
    private javax.swing.JLabel dlcDevelopersSE;
    private javax.swing.JSpinner dlcDevelopersSquareEnix;
    private javax.swing.JButton dlcMinB;
    private javax.swing.JLabel dlcPartsSE;
    private javax.swing.JButton dlcPlusB;
    private javax.swing.JLabel dlcVideoGamesB;
    private javax.swing.JLabel dlcvdSE;
    private javax.swing.JLabel earningsB;
    private javax.swing.JLabel earningsSE;
    private javax.swing.JLabel faultsQtyB;
    private javax.swing.JLabel faultsQtyM1SE;
    private javax.swing.JButton integradorMin;
    private javax.swing.JButton integradorMinB;
    private javax.swing.JButton integradorPlus;
    private javax.swing.JButton integradorPlusB;
    private javax.swing.JLabel integratorsB;
    private javax.swing.JSpinner integratorsBethesda;
    private javax.swing.JLabel integratorsSE;
    private javax.swing.JSpinner integratorsSquareEnix;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel levelDesignersB;
    private javax.swing.JSpinner levelDesignersBethesda;
    private javax.swing.JLabel levelDesignersSE;
    private javax.swing.JSpinner levelDesignersSquareEnix;
    private javax.swing.JLabel logicProgrammersB;
    private javax.swing.JSpinner logicProgrammersBethesda;
    private javax.swing.JLabel logicProgrammersSE;
    private javax.swing.JSpinner logicProgrammersSquareEnix;
    private javax.swing.JButton logicaMin;
    private javax.swing.JButton logicaMinB;
    private javax.swing.JLabel logicaPartsSE;
    private javax.swing.JButton logicaPlus;
    private javax.swing.JButton logicaPlusB;
    private javax.swing.JLabel managerSalaryDiscountB;
    private javax.swing.JLabel managerSalaryDiscountSE;
    private javax.swing.JLabel managerStatusB;
    private javax.swing.JLabel managerStatusSE;
    private javax.swing.JLabel managerStatus_label;
    private javax.swing.JLabel managerStatus_label1;
    private javax.swing.JLabel managerStatus_label2;
    private javax.swing.JLabel managerStatus_label3;
    private javax.swing.JLabel managerStatus_label4;
    private javax.swing.JLabel managerStatus_label5;
    private javax.swing.JLabel maxAcceM;
    private javax.swing.JLabel maxAcceM1;
    private javax.swing.JLabel maxBoM;
    private javax.swing.JLabel maxBoM1;
    private javax.swing.JLabel maxChaM;
    private javax.swing.JLabel maxChaM1;
    private javax.swing.JLabel maxMotM;
    private javax.swing.JLabel maxMotM1;
    private javax.swing.JLabel motor_label;
    private javax.swing.JLabel motor_label1;
    private javax.swing.JButton narrativaMin;
    private javax.swing.JButton narrativaMinB;
    private javax.swing.JLabel narrativaPartsSE;
    private javax.swing.JButton narrativaPlus;
    private javax.swing.JButton narrativaPlusB;
    private javax.swing.JLabel narrativeDevelopersB;
    private javax.swing.JSpinner narrativeDevelopersBethesda;
    private javax.swing.JLabel narrativeDevelopersSE;
    private javax.swing.JSpinner narrativeDevelopersSquareEnix;
    private javax.swing.JButton nivelesMin;
    private javax.swing.JButton nivelesMinB;
    private javax.swing.JLabel nivelesPartsSE;
    private javax.swing.JButton nivelesPlus;
    private javax.swing.JButton nivelesPlusB;
    private javax.swing.JButton setConfiguration;
    private javax.swing.JLabel spriteArtistsB;
    private javax.swing.JSpinner spriteArtistsBethesda;
    private javax.swing.JLabel spriteArtistsSE;
    private javax.swing.JSpinner spriteArtistsSquareEnix;
    private javax.swing.JButton spriteMin;
    private javax.swing.JButton spriteMinB;
    private javax.swing.JLabel spritePartsSE;
    private javax.swing.JButton spritePlus;
    private javax.swing.JButton spritePlusB;
    private javax.swing.JLabel standarVideoGamesB;
    private javax.swing.JLabel standarvgSE;
    private javax.swing.JButton startB;
    private javax.swing.JButton startSE;
    private javax.swing.JLabel utilityB;
    private javax.swing.JLabel utilitySE;
    private javax.swing.JFormattedTextField utility_label;
    private javax.swing.JFormattedTextField utility_label1;
    private javax.swing.JLabel wheel_label;
    private javax.swing.JLabel wheel_label1;
    private javax.swing.JLabel wm_label;
    private javax.swing.JLabel wm_label1;
    private javax.swing.JLabel wm_label2;
    private javax.swing.JLabel wm_label3;
    private javax.swing.JLabel wm_label4;
    private javax.swing.JLabel wm_label5;
    private javax.swing.JLabel wm_label7;
    private javax.swing.JLabel wm_label9;
    // End of variables declaration//GEN-END:variables

   
}
