package hu.bme.mit.train.tachograph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;

public class TachographTest {

	TrainController controller;
	TrainSensor sensor;
	TrainUser user;
	Tachograph tacho;
	
	@Before
	public void before() {
		TrainSystem system=new TrainSystem();
		controller = system.getController();
		user = system.getUser();
		tacho=new Tachograph();

	}
	
	@Test
	public void tableEntryTest(){
		tacho.addRow(user.getJoystickPosition(), controller.getReferenceSpeed());
		Assert.assertEquals(true, tacho.hasEntry());
	}
}