# Product and Company Master Database Specification

## Purpose
Create a reusable product database connected with spray, fertigation, inventory and expense modules.

## Product Master Record
Fields:
- Product ID
- Product name
- Category
- Company ID
- Active ingredient
- Formulation
- Recommended use
- Dose information
- Unit
- Product cost
- Purchase price history
- Selling/reference price (optional)
- Notes
- Product image

## Company Master Record
Fields:
- Company ID
- Company name
- Contact details
- Product list
- Notes

## Product Categories
Supports:
- Fungicides
- Bactericides
- Insecticides
- Biological products
- Fertilizers
- Micronutrients
- Growth promoters
- Soil amendments

## Module Connections

Spray:
- Select product
- Auto fill company, dose and cost details
- Save application history

Inventory:
- Purchase adds stock
- Usage reduces stock
- Expiry tracking

Expense:
- Product cost linked automatically
- Calculate application cost based on quantity used

Reports:
- Product usage analysis
- Company-wise consumption
- Cost analysis

## CRUD Support
All products and companies support:
- Add
- Edit
- Update
- Archive/Delete
- Search
- Filter

## Future Ready
Supports adding new products and companies without changing the app structure.
