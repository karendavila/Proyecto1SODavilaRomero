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
    //Workers
    private int maxWorkerQty;
    private int chasisWorkers;
    private int bodyWorkers;
    private int motorWorkers;
    private int wheelWorkers;
    private int accessoryWorkers;
    private int assemblers;
    private Developer[] workers;
    private int totalCosts;
    
    private long dayDurationInMs;
    public Drive warehouse;
    public Semaphore mutex;

    public MainUI userInterface;
    
    private Config config;
            
    
    public VideoGameStudio (String name, MainUI userInterface, Config config) {

        this.config = config;
        this.name = name;
        this.dayDurationInMs = config.getDayDuration();
 
        this.warehouse = new Drive(name,25, 20, 55, 35, 10, userInterface);
        this.mutex = new Semaphore(1);
        this.userInterface = userInterface;

        
        if (getName().equals("Lamborghini")) {
            this.maxWorkerQty = 11;
            
        }
        else {
            this.maxWorkerQty = 10;

        }
        
        this.workers = new Developer[maxWorkerQty];
        
        if (this.name.equals("Lamborghini")) {
            this.chasisWorkers = config.getInitialChasis();
            this.bodyWorkers = config.getInitialBodys();
            this.motorWorkers = config.getInitialMotors();
            this.wheelWorkers = config.getInitialWheels();
            this.accessoryWorkers = config.getInitialAccesorys();
            this.assemblers = config.getInitialAssemblers();
        } else {
            this.chasisWorkers = config.getInitialChasisM();
            this.bodyWorkers = config.getInitialBodysM();
            this.motorWorkers = config.getInitialMotorsM();
            this.wheelWorkers = config.getInitialWheelsM();
            this.accessoryWorkers = config.getInitialAccesorysM();
            this.assemblers = config.getInitialAssemblersM();
        }
        

        
        
        initializeWorkers();
          
    }
    
   
    
    public void initializeWorkers(){
        
        int arrayIndex = 0;
        
        if(this.name.equals("Lamborghini")){
            ProjectManager lamborghiniManager = new ProjectManager(20, config.getDeliveryDays(), this, this.userInterface, config.getDayDuration(), this.name, this.config);
            lamborghiniManager.start();
           
            
            Director director = new Director(30,config.getDayDuration(),this,this.userInterface,lamborghiniManager,this.warehouse,this.name);
       
            director.start();
            
            
            
        }else {
            ProjectManager maseratiManager = new ProjectManager(20, config.getDeliveryDays(), this, this.userInterface, config.getDayDuration(), this.name,this.config);
            maseratiManager.start();
            
            Director director = new Director(30,config.getDayDuration(),this,this.userInterface, maseratiManager,this.warehouse,this.name);
       
            director.start();
            
            
        }
        
       
        
        
        
        //Chasis workers
        for (int i = 0; i < getChasisWorkers(); i++) {
            if (getName().equals("Lamborghini")) {
                Developer worker = new Developer(0.5f, 10, getDayDurationInMs(), "chasis",this);
                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            } else {
                Developer worker = new Developer(0.5f, 10, getDayDurationInMs(), "chasis",this);
                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            }
        }
       
        //Car Body Workers
        for (int i = 0; i < getBodyWorkers(); i++) {
            if (getName().equals("Lamborghini")) {
                Developer worker = new Developer(0.5f, 13, getDayDurationInMs(), "carBody",this);

                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            } else {
                Developer worker = new Developer(0.5f, 13, getDayDurationInMs(), "carBody",this);

                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            }
  
        }
        
        
        //Motor Workers
        for (int i = 0; i < getMotorWorkers(); i++) {

            if (getName().equals("Lamborghini")) {
                Developer worker = new Developer(3f, 20, getDayDurationInMs(), "motors",this);

                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            } else {

                Developer worker = new Developer(3f, 20, getDayDurationInMs(), "motors",this);

                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            }

        }
        

        //Wheel Workers
        for (int i = 0; i < getWheelWorkers(); i++) {
            if (getName().equals("Lamborghini")) {

                Developer worker = new Developer(3f, 8, getDayDurationInMs(), "wheel",this);

                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            } else {

                Developer worker = new Developer(3f, 8, getDayDurationInMs(), "wheel",this);

                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            }
            
            //Operations Manager
            
            
        }
        
        //Accesory Workers
        for (int i = 0; i < getAccessoryWorkers(); i++) {
            if (getName().equals("Lamborghini")) {

                Developer worker = new Developer(0.34f, 17, getDayDurationInMs(), "accesory",this);

                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            } else {

                Developer worker = new Developer(0.34f, 17, getDayDurationInMs(), "accesory",this);

                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            }  
        }
        
        for (int i = 0; i < getAssemblers() ; i++) {
            if (getName().equals("Lamborghini")) {
                Developer worker = new Developer(0.5f, 25, getDayDurationInMs(), "assembler",this);
                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            } else {
                Developer worker = new Developer(0.5f, 25, getDayDurationInMs(), "assembler",this);
                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            }
        }
        
        if ((arrayIndex + 1) < maxWorkerQty) {
            
            for (int i = arrayIndex; i < maxWorkerQty; i++) {
                Developer worker = new Developer(0, 0, getDayDurationInMs(), "waiting", this);
                worker.start();
                workers[arrayIndex] = worker;
                arrayIndex++;
            }
        }

    }
    
   
    
    public int sumWorkers() {
        int sum = getChasisWorkers() + getBodyWorkers() + getMotorWorkers() + getWheelWorkers() + getAccessoryWorkers() + getAssemblers();
        
        return sum;
    }
    
    public void plusChasisWorkers() {
        setChasisWorkers(getChasisWorkers() + 1);
    }
    
    public void reduceChasisWorkers() {
        setChasisWorkers(getChasisWorkers() - 1);
    }
    
    public void plusBodyWorkers() {
        setBodyWorkers(getBodyWorkers() + 1);
    }
    
    public void reduceBodyWorkers() {
        setBodyWorkers(getBodyWorkers() - 1);
    }
    
    public void plusMotorWorkers() {
        setMotorWorkers(getMotorWorkers() + 1);
    }
    
    public void reduceMotorWorkers() {
        setMotorWorkers(getMotorWorkers() - 1);
    }
    
    public void plusWheelWorkers() {
        setWheelWorkers(getWheelWorkers() + 1);
    }
    
    public void reduceWheelWorkers() {
        setWheelWorkers(getWheelWorkers() - 1);
    }
    
    public void plusAccessoryWorkers() {
        setAccessoryWorkers(getAccessoryWorkers() + 1);
    }
    
    public void reduceAccessoryWorkers() {
        setAccessoryWorkers(getAccessoryWorkers() - 1);
    }
    
    public void plusAssemblers() {
        setAssemblers(getAssemblers() + 1);
    }
    
    public void reduceAssemblers() {
        setAssemblers(getAssemblers() - 1);
    }
 
    public void changeWorkers(String check, String change) {
        for (int i = 0; i < getWorkers().length; i++) {
                
                if (getWorkers()[i].getType().equals(check)) {
                    getWorkers()[i].setType(change);  
                }        
            }
    }
    
    public void ResumeWorker(){
       
       for (int i = 0; i < workers.length; i++) {
            Developer worker = workers[i];
            worker.reanudar();
        }
   
    }
    
     public void StopWorker(){
       
       for (int i = 0; i < workers.length; i++) {
            Developer worker = workers[i];
            worker.stop();
        }
   
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxWorkerQty() {
        return maxWorkerQty;
    }

    public void setMaxWorkerQty(int maxWorkerQty) {
        this.maxWorkerQty = maxWorkerQty;
    }

    public Developer[] getWorkers() {
        return workers;
    }

    public void setWorkers(Developer[] workers) {
        this.workers = workers;
    }

    public long getDayDurationInMs() {
        return dayDurationInMs;
    }

    public void setDayDurationInMs(long dayDurationInMs) {
        this.dayDurationInMs = dayDurationInMs;
    }

    public int getChasisWorkers() {
        return chasisWorkers;
    }

    public void setChasisWorkers(int chasisWorkers) {
        this.chasisWorkers = chasisWorkers;
    }

    public int getBodyWorkers() {
        return bodyWorkers;
    }

    public void setBodyWorkers(int bodyWorkers) {
        this.bodyWorkers = bodyWorkers;
    }

    public int getMotorWorkers() {
        return motorWorkers;
    }

    public void setMotorWorkers(int motorWorkers) {
        this.motorWorkers = motorWorkers;
    }

    public int getWheelWorkers() {
        return wheelWorkers;
    }

    public void setWheelWorkers(int wheelWorkers) {
        this.wheelWorkers = wheelWorkers;
    }

    public int getAccessoryWorkers() {
        return accessoryWorkers;
    }

    public void setAccessoryWorkers(int accessoryWorkers) {
        this.accessoryWorkers = accessoryWorkers;
    }

    public int getAssemblers() {
        return assemblers;
    }

    public void setAssemblers(int assemblers) {
        this.assemblers = assemblers;
    }

//    public long calculateCosts() {
//        
//        long totalCosts = 0;
//        
//        for (Developer worker : workers) {
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
        
        for (int i = 0; i < workers.length; i++) {
            
            if (!(workers[i].getType().equals("waiting"))){
                
                this.totalCosts += workers[i].getAccSalary();
            
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
