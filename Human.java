package com.gmail.annasierova;

import java.io.Serializable;

public class Human implements Serializable{
	 private String surname = "?";
	    private String name = "?";
	    private boolean sex;
	    private int age;
	    private int height;
	    private int weight;

	    public Human() {
	    }

	   

	    public Human(String surname, String name, boolean sex) {
			super();
			this.surname = surname;
			this.name = name;
			this.sex = sex;
		}
  
   	    public Human(String surname, String name, boolean sex, int age, int height, int weight) {
			super();
			this.surname = surname;
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.height = height;
			this.weight = weight;
		}



		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
            this.name = name;
	    }

	    public String getSurname() {
	        return surname;
	    }

	    public void setSurname(String surname) {
	        this.surname = surname;
  	    }

	    public boolean isSex() {
	        return sex;
	    }

	    public void setSex(boolean sex) {
	        this.sex = sex;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	       this.age = age;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public int getWeight() {
	        return weight;
	    }

	    public void setWeight(int weight) {
	       this.weight = weight;
	    }

	    public final void info() {
	        System.out.println(this);
	    }

		@Override
		public String toString() {
			return "Human [surname=" + surname + ", name=" + name + ", sex=" + sex + ", age=" + age + ", height="
					+ height + ", weight=" + weight + "]";
		}

	    
}
