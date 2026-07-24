# Pomegranate ERP Database Architecture

## Design Principle
All modules are dynamic and support Create, Read, Update, Delete (CRUD) operations.

## Core Tables

### Farm
- Farm ID
- Farm name
- Location
- Area
- Soil details
- Crop details

### Plants
- Plant ID
- Variety
- Planting date
- Current stage
- Health status

### Activity Log
- Activity ID
- Date (Date picker)
- Time (Time picker)
- Activity type
- Product/material
- Quantity
- Unit
- Cost
- Notes
- Photos

### Irrigation
- Date
- Start time
- End time
- Water quantity
- Drip details
- Sensor readings

### Fertigation
- Date
- Fertilizer
- Dose
- Method
- Cost

### Spray Record
- Date
- Time
- Product
- Company
- Target disease/pest
- Dose
- Weather condition

### Master Data
Editable by user:
- Diseases
- Pests
- Products
- Companies
- Fertilizers
- Units

Every module supports:
- Add
- Edit
- Delete
- Search
- Filter
- Export
