package com.tka.entity;

public class Player {
	private int pid;
    private int jno;
    private String name;
    private int runs;
    private int wickets;
    private String tname;
	public Player() {

	}
	public Player(int pid, int jno, String name, int runs, int wickets, String tname) {
		super();
		this.pid = pid;
		this.jno = jno;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", tname=" + tname + "]";
	}


}
