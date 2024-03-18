package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

import static org.mockito.Mockito.*;


public class TrainSensorTest {
	TrainSensor sensor;
	
	@Before
	public void before() {
        TrainController mockController = mock(TrainController.class);
        TrainUser mockUser = mock(TrainUser.class);
		sensor = new TrainSensorImpl(mockController, mockUser);
        mockController.setSpeedLimit(10);
        mockUser.overrideJoystickPosition(10);
        mockController.followSpeed();
	}
	
	@Test
	public void settingSpeedLimitBelowZero_AlarmsUser() {

	}

    @Test
	public void settingSpeedLimitAboveFiveHundred_AlarmsUser() {

	}

    @Test
	public void settingSpeedLimitBelowFiftyPercentReferenceSpeed_AlarmsUser() {
        
	}

    @Test
	public void settingSpeedLimitInCorrectRange_DoesntAlarmUser() {

	}

}
