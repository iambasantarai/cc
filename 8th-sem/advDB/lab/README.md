# Active Database

## STEP 1

### Create main table

```sql
CREATE TABLE main_table ( id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), active BOOLEAN DEFAULT TRUE );

```

### Create active table

```sql
CREATE TABLE active_table ( id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), active BOOLEAN DEFAULT TRUE );
```

## STEP 2

### Create a trigger

```sql
DELIMITER //
CREATE TRIGGER update_active_flag AFTER UPDATE ON main_table
FOR EACH ROW
    BEGIN
        IF OLD.active<>NEW.active THEN
            UPDATE active_table
            SET active = NEW.active
            WHERE id = NEW.id;
        END IF;
    END//
DELIMITER;
```

#### single line

```sql
DELIMITER // CREATE TRIGGER update_active_flag AFTER UPDATE ON main_table FOR EACH ROW BEGIN IF OLD.active<>NEW.active THEN UPDATE active_table SET active = NEW.active WHERE id = NEW.id; END IF; END// DELIMITER;
```

## STEP 3

### Insert data into tables

```sql
-- insert some data into the main_table
INSERT INTO main_table (name) VALUES ('item1'), ('item2);

-- insert corresponding data into the active_table
INSERT INTO active_table (name) VALUES ('item1'), ('item2');

-- update the active falg in main_table
UPDATE main_table SET active = FALSE WHERE id = 1;
```

## STEP 4

### View data

```sql
SELECT * FROM active_table;
```

## STEP 5

### Drop tables

```sql
--- drop the tables
DROP TABLE IF EXISTS main_table;
DROP TABLE IF EXISTS active_table;
```
