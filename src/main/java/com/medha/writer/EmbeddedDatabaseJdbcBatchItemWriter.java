package com.medha.writer;



import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.database.JdbcBatchItemWriter;

import com.medha.model.Record;

public class EmbeddedDatabaseJdbcBatchItemWriter   extends JdbcBatchItemWriter<Record> {
	
	private static final Logger log = LogManager.getLogger(EmbeddedDatabaseJdbcBatchItemWriter.class);
	
	public void write(List<? extends Record> listOfReport)
	{
		try {
			super.write(listOfReport);
			log.info(listOfReport.size()+" items written");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
