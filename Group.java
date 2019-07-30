package com.gmail.annasierova;

import java.util.Arrays;
import com.gmail.anna.FullGroupException;;

public class Group implements Voenkom{
	
	 private String groupName ;
	 private Student[] groupList = new Student[10];

	    public Group() {
	    	super();
	    }

	    public Group(String groupName) {
	        this.groupName = groupName;
	    }

	    public String getGroupName() {
	        return groupName;
	    }

	    public void setGroupName(String groupName) {
	        this.groupName = groupName;
	    }

	    public void addStudent(Student newStudent){
	        if(newStudent.getGroup() == null) { 
	            boolean isAdd = false; 
	            for (int i = 0; i <= groupList.length-1; i++) {
	                if (groupList[i] == null) { 
	                    groupList[i] = newStudent; 
	                    newStudent.setGroup(this);
	                    System.out.println("Student " + newStudent.getSurname() + " is added to the group: " + groupName);
	                    isAdd = true;
	                    break;
	                }
	            }
	            try {
	                if (!isAdd){
	                    throw new FullGroupException(); 
	                }
	            } catch (FullGroupException e) {
	                System.out.println("The group is full ");
	            }
	           
	        } else System.out.println("Student " + newStudent.getSurname() + " already studying in group: " + newStudent.getGroup().getGroupName());
	    }

	    public void addStudent(){ 
	        int freePlace = -1; 
	        for (int i = 0; i <= groupList.length-1; i++) { 
	            if (groupList[i] == null) { 
	                freePlace = i;
	                System.out.println("Free place was found in group " + groupName + ". Please enter student data ");
	                break;
	            }
	        }
	        if(freePlace <= 0){ 
	            System.out.println("The group is full");
	        }
	       
	    }

	    public void deleteStudent(String surname){ 
	        int countSt = 0;
	        for(Student st : groupList){  
	            if (st!=null && st.getSurname().equals(surname)){
	                countSt++;
	            }
	        }
	        if(countSt == 0){
	            System.out.println("No student " + surname + " in "  + groupName + " group"); 
	        }
	        if(countSt == 1){ 
	            for(int i = 0; i < groupList.length; i++){
	                if(groupList[i]!=null && groupList[i].getSurname().equals(surname)) {
	                    groupList[i].setGroup(null);
	                    groupList[i] = null;
	                    System.out.println("Student " + surname + " is deleted from the group" + groupName);
	                    break;
	                }
	            }
	        }
	    }
	 
	    public void searchStudent(String surname){
	        boolean isFound = false; 
	        for(int i = 0; i <= groupList.length-1; i++){
	                if (groupList[i]!=null && groupList[i].getSurname().equals(surname)) {
	                    System.out.println("Student " + surname + " is found in group. List number is " + (i + 1) + ".");
	                    groupList[i].info();
	                    isFound = true;
	                }
	        }
	        if(!isFound){
	            System.out.println("No student " + surname + " in "  + groupName + " group"); 
	        }
	    }
	    String stListToString (Student[] arr){ 
	        StringBuilder sb = new StringBuilder();
	        sb.append("groupName=");
	        sb.append(groupName);
	        for(Student st : arr){
	            if(st==null) {
	                break;
	            }
	            sb.append(st);
	        }
	        return sb.toString();
	    }

	    public void sortSurnameAndPrint(){ 
	        Student[] sortList = arrWithoutNull(groupList);
	        Arrays.sort(sortList);
	        System.out.println("afterSurnameSort");
	        System.out.println(stListToString(sortList));
	    }

	    private Student[] arrWithoutNull(Student[] arr){ 
	        int stCounter = 0;
	        for(Student st : arr){
	            if(st==null){
	                break;
	            }
	            stCounter++;
	        }
	        Student[] sortList = new Student[stCounter];
	        System.arraycopy (arr, 0, sortList, 0, stCounter);
	        return sortList;
	    }
	    @Override
	    public Student[] getStudentForArmy() { 
	        Student[] studentForArmy = new Student[groupList.length];
	        int counterOfStudent = 0;
	        for(int i = 0; i <= groupList.length-1; i++) {
	            if (groupList[i] != null && groupList[i].isSex() && groupList[i].getAge() >= 18) {
	                studentForArmy[counterOfStudent] = groupList[i];
	                counterOfStudent++;
	            }
	        }
	        return arrWithoutNull(studentForArmy);
	    }

	    
}
