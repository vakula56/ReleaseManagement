package org.RDMS.springbootstarter.releaseDataseSystem;

import java.time.LocalDateTime;

public class RDSModel {
	private double releaseNo;
	private String appName;
	private String stack;
	private String tool;
	private LocalDateTime dateComp;
	private String Status;
	private String environment;
	private LocalDateTime datePlanned;
	
	public RDSModel(double releaseNo, String appName) {
		super();
		this.releaseNo = releaseNo;
		this.appName = appName;
	}
	public double getReleaseNo() {
		return releaseNo;
	}
	
	public void setReleaseNo(double releaseNo) {
		this.releaseNo = releaseNo;
	}

	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public LocalDateTime getDateComp() {
		return dateComp;
	}
	public void setDateComp(LocalDateTime dateComp) {
		this.dateComp = dateComp;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public LocalDateTime getDatePlanned() {
		return datePlanned;
	}
	public void setDatePlanned(LocalDateTime datePlanned) {
		this.datePlanned = datePlanned;
	}
	
	

}
