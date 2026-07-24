# Pomegranate ERP Data Models

## Purpose
Define the core data entities before application coding. All models should support future expansion and CRUD operations.

## Farm Model
- Farm ID
- Name
- Location
- Area
- Soil details
- Crop details

## Plot Model
- Plot ID
- Farm ID
- Area
- Variety
- Planting date

## Plant Model
- Plant ID
- Plot ID
- Plant age
- Health status
- Growth notes
- Photos

## Activity Model
- Activity ID
- Date
- Time
- Activity type
- Notes
- Cost

## Spray Model
- Date
- Product
- Company
- Dose
- Target disease/pest
- Weather
- Result observation

## Irrigation Model
- Date
- Start time
- End time
- Water quantity
- Drip details
- Sensor data

## Fertigation Model
- Fertilizer
- Dose
- Method
- Cost
- Date

## Inventory Model
- Product
- Stock
- Purchase
- Usage
- Expiry

## Knowledge Models
- Disease
- Pest
- Product
- Company
- Biological inputs

## Financial Models
- Expense
- Income
- Harvest
- Profit calculation

All models must remain editable and ready for future modules.
