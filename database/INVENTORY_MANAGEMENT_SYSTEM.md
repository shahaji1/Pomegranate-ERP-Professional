# Inventory Management System Specification

## Purpose
Manage all farm inputs with automatic stock tracking.

## Inventory Item Fields
- Inventory ID
- Product ID
- Product name
- Company
- Category
- Current stock
- Unit
- Purchase price
- Purchase date
- Expiry date
- Storage notes

## Stock Operations

### Purchase Entry
- Add new stock
- Update quantity
- Record cost
- Link supplier/company

### Usage Entry
Automatically reduce stock from:
- Spray
- Fertigation
- Soil application

## Alerts
System supports:
- Low stock alert
- Expiry reminder
- Unused product reminder

## Connections

Product Database:
- Provides product details

Spray Module:
- Reduces pesticide/fungicide stock

Fertigation Module:
- Reduces fertilizer stock

Expense Module:
- Tracks input cost

Reports:
- Usage analysis
- Stock value
- Purchase history

## CRUD Support
- Add
- View
- Edit
- Delete/Archive
- Search
- Filter

## Future Ready
Supports barcode scanning, supplier management and cloud inventory sync.
