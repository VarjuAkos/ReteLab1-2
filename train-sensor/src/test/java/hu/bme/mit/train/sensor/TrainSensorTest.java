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
    TrainController mockController;
    TrainUser mockUser;
	
	@Before
	public void before() {
        mockController = mock(TrainController.class);
        mockUser = mock(TrainUser.class);
		sensor = new TrainSensorImpl(mockController, mockUser);

        when(mockController.getReferenceSpeed()).thenReturn(10);
        sensor.overrideSpeedLimit(10);
	}
	
	@Test
	public void settingSpeedLimitBelowZero_AlarmsUser() {

	}

    @Test
	public void settingSpeedLimitAboveFiveHundred_AlarmsUser() {

	}

    @Test
	public void settingSpeedLimitBelowFiftyPercentReferenceSpeed_AlarmsUser() {
        sensor.overrideSpeedLimit(4);
        verify(mockUser, times(1)).setAlarmState(true);
	}

    @Test
	public void settingSpeedLimitInCorrectRange_DoesntAlarmUser() {
        sensor.overrideSpeedLimit(12);
        verify(mockUser, times(0)).setAlarmState(true);
	}

}
