package NDFA_GUI.model;

import NDFA_GUI.utils.StateType;

public class State {
	private String name;
	private StateType type;
	
	public State(String name, StateType type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public StateType getType() {
		return type;
	}
	
	public void setType(StateType type) {
		this.type = type;
	}
	
	
}
