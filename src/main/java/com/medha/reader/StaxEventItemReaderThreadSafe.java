/**
 * 
 */
package com.medha.reader;

import org.apache.commons.io.IOUtils;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.oxm.Unmarshaller;

import com.medha.model.Record;

/**
 * @author medha.pundir
 *
 */
public class StaxEventItemReaderThreadSafe implements ItemReader<Record>,ItemStream,InitializingBean,ResourceAwareItemReaderItemStream<Record>  {


    private StaxEventItemReader<Record> reader = new StaxEventItemReader<Record>();
	public void setResource(Resource resource) {
		// TODO Auto-generated method stub
		
		if(resource==null)
		{
			reader.setResource(new InputStreamResource(IOUtils.toInputStream("")));
		}
		else
		{
			reader.setResource(resource);
		}
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		reader.afterPropertiesSet();
		
	}

	public void close() throws ItemStreamException {
		// TODO Auto-generated method stub
		reader.close();
		
	}

	public void open(ExecutionContext execContext) throws ItemStreamException {
		// TODO Auto-generated method stub
		
		reader.open(execContext);
		
	}

	public void update(ExecutionContext execContext) throws ItemStreamException {
		// TODO Auto-generated method stub
		
		reader.update(execContext);
		
	}

	public Record read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return reader.read();
	}
	
	@Override
	public boolean equals(Object obj) {
        return reader.equals(obj);
    }
	
	@Override
	public int hashCode() {
        return reader.hashCode();
    }
	
	public boolean isSaveState() {
        return reader.isSaveState();
    }
	
	public void setStrict(boolean strict) {
        reader.setStrict(strict);
    }
	
	public void setCurrentItemCount(int count) {
        reader.setCurrentItemCount(count);
    }
	
	public void setFragmentRootElementName(String fragmentRootElementName) {
        reader.setFragmentRootElementName(fragmentRootElementName);
    }
	
	public void setMaxItemCount(int count) {
        reader.setMaxItemCount(count);
    }
	
	public void setUnmarshaller(Unmarshaller unmarshaller) {
        reader.setUnmarshaller(unmarshaller);
    }
	
	public void setName(String name) {
        reader.setName(name);
    }
	
	
	public void setSaveState(boolean saveState) {
        reader.setSaveState(saveState);
    }

	@Override
	public String toString() {
        return reader.toString();
    }
	

}
