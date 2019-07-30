package com.gmail.annasierova;

import java.io.Serializable;

public class Student extends Human implements Comparable, Soldier,Serializable{
	 private Group group;
	 private int course;
	 private int studBook;
	 private double averageRating;

	    public Student() {
	    	super();
	      }

	    public Student(String surname, String name, boolean sex, int course, int studBook, double averageRating) {
	        super(surname,name, sex);
	        if(course > 0 && course <=6){
	            this.course = course;
	        }
	        else{
	            System.out.println("Invalid course number of student: " + getName() + " " + getSurname());
	        }
	   	     this.studBook = studBook;
	       	 this.averageRating = averageRating;
	         info();
	    }

	    public Student(String surname, String name, boolean sex, int course, int studBook, double averageRating,
	                    int age, int height, int weight) {
	        super(surname, name, sex, age, height, weight);
	        if(course > 0 && course <=6){
	            this.course = course;
	        }
	        else{
	            System.out.println("Invalid course number of student: " + getName() + " " + getSurname());
	        }
	   	     this.studBook = studBook;
	       	 this.averageRating = averageRating;
	       	 info();
	      
	    }

	    public Group getGroup() {
	        return group;
	    }

	    public void setGroup(Group group) {
	        this.group = group;
	    }

	    public int getCourse() {
	        return course;
	    }

	    public void setCourse(int course) {
	        this.course = course;
	       
	    }

	    public int getStudBook() {
	        return studBook;
	    }

	    public void setStudBook(int studBook) {
	         this.studBook = studBook;
	    }

	    public double getAverageRating() {
	        return averageRating;
	    }

	    public void setAverageRating(double averageRating) {
	         this.averageRating = averageRating;
	    }

		@Override
		public String toString() {
			return "Student [group=" + group + ", course=" + course + ", studBook=" + studBook + ", averageRating="
					+ averageRating + "]";
		}
		
		@Override
	    public int compareTo(Object o) {
	        if (o == null) {
	            return -1;
	        }
	        Human anotherHuman = (Human) o;
	        return this.getSurname().compareToIgnoreCase(anotherHuman.getSurname());
	    }

	    @Override
	    public void messageFromVoenkom() {
	        System.out.println("new message from Voencom:");
	        System.out.println("Soldier " + this.getSurname() + " Go to the army!!! ");
	    }

	    public String printStudentToFile(){
	        return getSurname()+";"+getName()+";"+isSex()+";"+getAge()+";"+getHeight()+";"+getWeight()+";"+course+";"+studBook+";"+averageRating;
	    }

	   


	  

}
