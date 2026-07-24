# CRUD Operation Flow Specification

## Purpose
Define standard behavior for all ERP modules.

## Create (Add)
User can add new records using guided forms.

Features:
- Date picker
- Time picker
- Dropdown selection
- Auto suggestions
- Photo attachment
- Notes
- Save validation

## Read (View)
Records can be viewed through:
- List view
- Detail view
- Calendar view
- History timeline
- Reports

## Update (Edit)
Users can modify existing records.

Rules:
- Keep previous history
- Show last updated time
- Validate changes before saving

## Delete
Deletion requires confirmation.

Rules:
- Avoid accidental deletion
- Maintain data integrity
- Important records may use archive instead of permanent delete

## Search and Filter
Available across modules:
- Date filter
- Product filter
- Disease filter
- Plot filter
- Status filter

## Applied To
- Farm
- Plot
- Plant
- Activity
- Spray
- Irrigation
- Fertigation
- Inventory
- Expenses
- Harvest
- Disease/Pest library

## Standardization Rule
Every future module must follow the same CRUD pattern.
