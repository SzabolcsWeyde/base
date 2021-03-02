package hu.bme.mit.train.tachograph;

import com.google.common.collect.*;
import java.time.LocalDateTime;

public class Tachograph{
	
	private Table <LocalDateTime, Integer, Integer> tachographtable;
	
	public Tachograph() {
		tachographtable = HashBasedTable.create();
		
	}
	
	public void addRow(Integer joyStick, Integer refSpeed) {
		tachographtable.put(LocalDateTime.now(), joyStick, refSpeed);
	}
	public boolean hasEntry() {
		return !tachographtable.isEmpty();
	}
	
	
}