# Boundary testing for TrainSensor 

## Testing absolute boundaries
### settingSpeedLimitBelowZero_AlarmsUser
tests whether the alarm happens if the speed limit is set below the absolute boundary

### settingSpeedLimitAboveFiveHundred_AlarmsUser
tests whether the alarm happens if the speed limit is set above the absolute boundary

---

## Testing relative boundary
### settingSpeedLimitBelowFiftyPercentReferenceSpeed_AlarmsUser
tests whether the alarm happens if the speed limit is set below 50% of the referenceSpeed

---

## Testing non-alarming case
### settingSpeedLimitInCorrectRange_DoesntAlarmUser
tests whether the alarm happens if the speed limit is set in a correct range
