# Dashboard Data Flow Specification

## Purpose
Define how the main dashboard collects and displays farm information.

## Dashboard Cards

### Farm Summary
Shows:
- Total farms
- Total plots
- Total plants
- Crop age

### Plant Health
Shows:
- Healthy plants
- Observation alerts
- Disease records
- Pest records

### Operations Summary
Shows recent:
- Sprays
- Irrigation
- Fertigation
- Activities

### Financial Summary
Shows:
- Total expenses
- Input cost
- Harvest income
- Profit estimate

### Reminder System
Shows:
- Upcoming activities
- Spray reminders
- Irrigation tasks
- Inventory alerts

## Data Flow
Database records -> Repository layer -> Dashboard calculations -> UI cards/charts

## Rules
- Dashboard updates automatically when records change
- No duplicate data entry
- All modules share the same database source
- Ready for future weather and sensor widgets

## Future Additions
- Weather risk indicator
- Disease risk score
- AI recommendations
- Sensor dashboard
