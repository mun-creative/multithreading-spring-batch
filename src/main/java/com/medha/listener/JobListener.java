/**
 * 
 */
package com.medha.listener;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * @author medha.pundir
 *
 */
public class JobListener implements JobExecutionListener{
	
	private Connection connection;
	private DataSource dataSource;
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void afterJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		
	}
	public void beforeJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
