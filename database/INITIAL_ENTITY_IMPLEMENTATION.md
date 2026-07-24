# Initial Entity Implementation Plan

## Purpose
Define the first database entities for application development.

## Farm Entity
Stores main farm information.

Fields:
- farmId
- farmName
- location
- area
- soilDetails
- cropDetails
- notes

## Plot Entity
Links sections of the farm.

Fields:
- plotId
- farmId
- area
- variety
- spacing
- plantCount
- plantingDate

## Plant Entity
Stores individual plant information.

Fields:
- plantId
- plotId
- plantAge
- healthStatus
- growthNotes
- photoPath

## Activity Entity
Stores daily farm operations.

Fields:
- activityId
- relatedFarmId
- relatedPlotId
- date
- time
- activityType
- material
- quantity
- cost
- notes

## Common Rules
- Unique IDs for all records
- All records editable
- Delete confirmation required
- Date/time picker support
- Ready for future module connections

## Next Database Connections
- Spray
- Irrigation
- Fertigation
- Inventory
- Reports
