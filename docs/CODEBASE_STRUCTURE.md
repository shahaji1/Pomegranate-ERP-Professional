# Codebase Structure Plan

## Purpose
Define a clean code organization before writing application code.

## Suggested Structure

app/

### ui/
- screens
- components
- navigation
- theme

### data/
- database
- entities
- repositories
- data sources

### domain/
- business rules
- calculations
- validation
- use cases

### features/
- dashboard
- farm
- plants
- activities
- irrigation
- fertigation
- spray
- inventory
- reports

### core/
- utilities
- constants
- common functions
- backup/export services

## Development Rule
Each feature should be independent but connected through common data models.

## First Implementation Targets
1. Database setup
2. Farm module
3. Plant module
4. Dashboard
5. Activity recording

Future modules should plug into this structure without major redesign.
