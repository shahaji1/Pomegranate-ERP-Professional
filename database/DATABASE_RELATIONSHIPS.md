# Database Relationships

## Purpose
Define how ERP modules connect without duplicate data.

## Main Relationships

Farm
- One Farm can have many Plots
- Farm ID links all farm records

Plot
- Belongs to one Farm
- One Plot can have many Plants

Plant
- Belongs to one Plot
- Can have many observations and activity records

Activity
- Links to Farm/Plot/Plant
- Stores daily operations history

## Operation Connections

Spray Record
- Links to Product
- Links to Company
- Links to Disease/Pest target
- Updates Inventory
- Updates Expense

Irrigation Record
- Links to Plot/Plants
- Stores water history
- Can receive sensor data

Fertigation Record
- Links to Fertilizer Product
- Updates Inventory
- Updates Expense

Harvest Record
- Links to Plot
- Calculates yield and profit

## Master Data Principle
Disease, Pest, Product, Company and Fertilizer databases are reusable master records.

## Rules
- Avoid duplicate entries
- Use unique IDs
- Maintain complete history
- Allow future modules without database redesign
