package com.gmail.annasierova;


public class Main {

    public static void main(String[] args){
    	
    	    	
        Student st1 = new Student("Hksdxn", "Sefrf", false, 2, 1180, 5.0, 22, 175, 70); 
        Student st2 = new Student("Ahdfdnis", "Hslkfmcs", true, 2, 1121, 4.5, 20, 172, 77); 
        Student st3 = new Student("Newdusga", "Suhfiuh", false, 2, 1172, 4.0, 17, 181, 81); 
        Student st4 = new Student("Fkkjrdds", "Jiidsnc", true, 2, 1133, 3.5, 21, 164, 90); 
        Student st5 = new Student("Tkefksuhc", "Kyrgvyhb", true, 2, 1144, 3.5, 23, 190, 120); 
        Student st6 = new Student("Bjefyfs", "Siuerfhfu", false, 2, 1655, 5.0, 20, 167, 55);
        Student st7 = new Student("Klkmwuh", "Guewfgw", false, 2, 1196, 4.7, 16, 151, 45);
        Student st8 = new Student("Ckerfuh", "Dygvewc", true, 2, 1137, 4.6, 23, 183, 90);
        Student st9 = new Student("Dkjsygyrs", "Lohefcru", false,2, 1128, 4.0, 25, 169, 60);
        
        System.out.println();

        Group group = new Group("Bunny");
        group.addStudent(st1);
        group.addStudent(st2);
        group.addStudent(st3);
        group.addStudent(st4);
        group.addStudent(st5);
        group.addStudent(st6);
        group.addStudent(st7);
        group.addStudent(st8);
        group.addStudent(st9);
        
        System.out.println();
        
        sendInviteToArmy(group);
        
     
       
    }
    
    public static void sendInviteToArmy(Voenkom soldierGroup){ 
        Soldier[] soldierArr = soldierGroup.getStudentForArmy(); 
        for(Soldier soldier : soldierArr){
            soldier.messageFromVoenkom();
          
        }
    }

	
	
    
}
        
