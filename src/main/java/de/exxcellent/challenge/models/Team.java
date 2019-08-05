package de.exxcellent.challenge.models;

import com.opencsv.bean.CsvBindByName;

public class Team {
	
	@CsvBindByName(column = "Team")
	private String name;
	@CsvBindByName(column = "Goals")
	private Integer goals;
	@CsvBindByName(column = "Goals Allowed")
	private Integer goalsAllowed;
	
	public Team(String name, Integer goals, Integer allowedGoals) {
		super();
		this.name = name;
		this.goals = goals;
		this.goalsAllowed = allowedGoals;
	}
	public Team() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGoals() {
		return goals;
	}
	public void setGoals(Integer goals) {
		this.goals = goals;
	}
	public Integer getGoalsAllowed() {
		return goalsAllowed;
	}
	public void setGoalsAllowed(Integer allowedGoals) {
		this.goalsAllowed = allowedGoals;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
        		Team anotherTeam = (Team) obj;
        		return name.equals(anotherTeam.getName()) && goals.equals(anotherTeam.getGoals()) && goalsAllowed.equals(anotherTeam.getGoalsAllowed());
        }
	}
	
	

}
