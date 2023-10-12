/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import UserInterface.MainUI;
import java.util.concurrent.Semaphore;



import UserInterface.MainUI;

/**
 *
 * @author Rolando
 */
public class VideoGameStudio {
    private String name;
    //Developers
    private int maxDeveloperQty;
    private int narrativeDevelopers;
    private int levelDesigners;
    private int spriteArtists;
    private int logicProgrammers;
    private int dlcDevelopers;
    private int integrators;
    private Developer[] developers;
    private int totalCosts;
    
    private long dayDurationInMs;
    public Drive drive;
    public Semaphore mutex;

    public MainUI userInterface;
    
    private Config config;
            
    
    public VideoGameStudio (String name, MainUI userInterface, Config config) {

        this.config = config;
        this.name = name;
        this.dayDurationInMs = config.getDayDuration();
 
        this.drive = new Drive(name,25, 20, 55, 35, 10, userInterface);
        this.mutex = new Semaphore(1);
        this.userInterface = userInterface;

        
        if (getName().equals("Bethesda")) {
            this.maxDeveloperQty = 11;
            
        }
        else {
            this.maxDeveloperQty = 10;

        }
        
        this.developers = new Developer[maxDeveloperQty];
        
        if (this.name.equals("Bethesda")) {
            this.narrativeDevelopers = config.getInitialNarrativa();
            this.levelDesigners = config.getInitialNiveles();
            this.spriteArtists = config.getInitialSprites();
            this.logicProgrammers = config.getInitialLogica();
            this.dlcDevelopers = config.getInitialDLC();
            this.integrators = config.getInitialIntegradores();
        } else {
            this.narrativeDevelopers = config.getInitialNarrativaSE();
            this.levelDesigners = config.getInitialNivelesSE();
            this.spriteArtists = config.getInitialSpritesSE();
            this.logicProgrammers = config.getInitialLogicaSE();
            this.dlcDevelopers = config.getInitialDLCSE();
            this.integrators = config.getInitialIntegradoresSE();
        }
        

        
        
        initializeDevelopers();
          
    }
    
   
    
    public void initializeDevelopers(){
        
        int arrayIndex = 0;
        
        if(this.name.equals("Bethesda")){
            OperationsManager bethesdaManager = new OperationsManager(20, config.getDeliveryDays(), this, this.userInterface, config.getDayDuration(), this.name, this.config);
            bethesdaManager.start();
           
            
            StudioDirector director = new StudioDirector(30,config.getDayDuration(),this,this.userInterface,bethesdaManager,this.drive,this.name);
       
            director.start();
            
            
            
        }else {
            OperationsManager squareEnixManager = new OperationsManager(20, config.getDeliveryDays(), this, this.userInterface, config.getDayDuration(), this.name,this.config);
            squareEnixManager.start();
            
            StudioDirector director = new StudioDirector(30,config.getDayDuration(),this,this.userInterface, squareEnixManager,this.drive,this.name);
       
            director.start();
            
            
        }
        
       
        
        
        
        //Narrative developers
        for (int i = 0; i < getNarrativeDevelopers(); i++) {
            if (getName().equals("Bethesda")) {
                Developer developer = new Developer(0.5f, 10, getDayDurationInMs(), "narrative",this);
                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            } else {
                Developer developer = new Developer(0.5f, 10, getDayDurationInMs(), "narrative",this);
                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            }
        }
       
        //Level Designers
        for (int i = 0; i < getLevelDesigners(); i++) {
            if (getName().equals("Bethesda")) {
                Developer developer = new Developer(0.5f, 13, getDayDurationInMs(), "level",this);

                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            } else {
                Developer developer = new Developer(0.5f, 13, getDayDurationInMs(), "level",this);

                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            }
  
        }
        
        
        //Sprite Artists
        for (int i = 0; i < getSpriteArtists(); i++) {

            if (getName().equals("Bethesda")) {
                Developer developer = new Developer(3f, 20, getDayDurationInMs(), "sprite",this);

                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            } else {

                Developer developer = new Developer(3f, 20, getDayDurationInMs(), "sprite",this);

                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            }

        }
        

        //Logic Programmers
        for (int i = 0; i < getLogicProgrammers(); i++) {
            if (getName().equals("Bethesda")) {

                Developer developer = new Developer(3f, 8, getDayDurationInMs(), "logic",this);

                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            } else {

                Developer developer = new Developer(3f, 8, getDayDurationInMs(), "logic",this);

                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            }
            
            //Operations Manager
            
            
        }
        
        //DLC Developers
        for (int i = 0; i < getDlcDevelopers(); i++) {
            if (getName().equals("Bethesda")) {

                Developer developer = new Developer(0.34f, 17, getDayDurationInMs(), "dlc",this);

                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            } else {

                Developer developer = new Developer(0.34f, 17, getDayDurationInMs(), "dlc",this);

                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            }  
        }
        
        for (int i = 0; i < getIntegrators() ; i++) {
            if (getName().equals("Bethesda")) {
                Developer developer = new Developer(0.5f, 25, getDayDurationInMs(), "integrator",this);
                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            } else {
                Developer developer = new Developer(0.5f, 25, getDayDurationInMs(), "integrator",this);
                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            }
        }
        
        if ((arrayIndex + 1) < maxDeveloperQty) {
            
            for (int i = arrayIndex; i < maxDeveloperQty; i++) {
                Developer developer = new Developer(0, 0, getDayDurationInMs(), "waiting", this);
                developer.start();
                developers[arrayIndex] = developer;
                arrayIndex++;
            }
        }

    }
    
   
    
    public int sumDevelopers() {
        int sum = getNarrativeDevelopers() + getLevelDesigners() + getSpriteArtists() + getLogicProgrammers() + getDlcDevelopers() + getIntegrators();
        
        return sum;
    }
    
    public void plusNarrativeDevelopers() {
        setNarrativeDevelopers(getNarrativeDevelopers() + 1);
    }
    
    public void reduceNarrativeDevelopers() {
        setNarrativeDevelopers(getNarrativeDevelopers() - 1);
    }
    
    public void plusLevelDesigners() {
        setLevelDesigners(getLevelDesigners() + 1);
    }
    
    public void reduceLevelDesigners() {
        setLevelDesigners(getLevelDesigners() - 1);
    }
    
    public void plusSpriteArtists() {
        setSpriteArtists(getSpriteArtists() + 1);
    }
    
    public void reduceSpriteArtists() {
        setSpriteArtists(getSpriteArtists() - 1);
    }
    
    public void plusLogicProgrammers() {
        setLogicProgrammers(getLogicProgrammers() + 1);
    }
    
    public void reduceLogicProgrammers() {
        setLogicProgrammers(getLogicProgrammers() - 1);
    }
    
    public void plusDlcDevelopers() {
        setDlcDevelopers(getDlcDevelopers() + 1);
    }
    
    public void reduceDlcDevelopers() {
        setDlcDevelopers(getDlcDevelopers() - 1);
    }
    
    public void plusIntegrators() {
        setIntegrators(getIntegrators() + 1);
    }
    
    public void reduceIntegrators() {
        setIntegrators(getIntegrators() - 1);
    }
 
    public void changeDevelopers(String check, String change) {
        for (int i = 0; i < getDevelopers().length; i++) {
                
                if (getDevelopers()[i].getType().equals(check)) {
                    getDevelopers()[i].setType(change);  
                }        
            }
    }
    
    public void ResumeDeveloper(){
       
       for (int i = 0; i < developers.length; i++) {
            Developer developer = developers[i];
            developer.reanudar();
        }
   
    }
    
     public void StopDeveloper(){
       
       for (int i = 0; i < developers.length; i++) {
            Developer developer = developers[i];
            developer.stop();
        }
   
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDeveloperQty() {
        return maxDeveloperQty;
    }

    public void setMaxDeveloperQty(int maxDeveloperQty) {
        this.maxDeveloperQty = maxDeveloperQty;
    }

    public Developer[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Developer[] developers) {
        this.developers = developers;
    }

    public long getDayDurationInMs() {
        return dayDurationInMs;
    }

    public void setDayDurationInMs(long dayDurationInMs) {
        this.dayDurationInMs = dayDurationInMs;
    }

    public int getNarrativeDevelopers() {
        return narrativeDevelopers;
    }

    public void setNarrativeDevelopers(int narrativeDevelopers) {
        this.narrativeDevelopers = narrativeDevelopers;
    }

    public int getLevelDesigners() {
        return levelDesigners;
    }

    public void setLevelDesigners(int levelDesigners) {
        this.levelDesigners = levelDesigners;
    }

    public int getSpriteArtists() {
        return spriteArtists;
    }

    public void setSpriteArtists(int spriteArtists) {
        this.spriteArtists = spriteArtists;
    }

    public int getLogicProgrammers() {
        return logicProgrammers;
    }

    public void setLogicProgrammers(int logicProgrammers) {
        this.logicProgrammers = logicProgrammers;
    }

    public int getDlcDevelopers() {
        return dlcDevelopers;
    }

    public void setDlcDevelopers(int dlcDevelopers) {
        this.dlcDevelopers = dlcDevelopers;
    }

    public int getIntegrators() {
        return integrators;
    }

    public void setIntegrators(int integrators) {
        this.integrators = integrators;
    }

//    public long calculateCosts() {
//        
//        long totalCosts = 0;
//        
//        for (Developer worker : developers) {
//            totalCosts+= worker.getAccSalary();
//}
//        return totalCosts;
//    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
    
    public void calculateCosts() {
        
        for (int i = 0; i < developers.length; i++) {
            
            if (!(developers[i].getType().equals("waiting"))){
                
                this.totalCosts += developers[i].getAccSalary();
            
            }
        }
    }

    public int getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(int totalCosts) {
        this.totalCosts = totalCosts;
    }
    
    
}
