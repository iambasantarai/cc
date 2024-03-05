1. Create a common user in Container Database CDB with connect, resource and create session privilege and connect to that user in Oracle database

### SOLUTION:

- Connect to CDB

```sql
sqlplus / as sysdba
```

- Connect the user

```sql
CREATE USER basanta_rai IDENTIFIED BY uwu69;
```

- Grant Required Privileges

```sql
GRANT CONNECT, RESOURCE, CREATE SESSION TO basanta_rai;
```

- Exit SQL\*Plus

```sql
exit;
```

- Connect to user

```sql
sqlplus basanta_rai/uwu69@my_CDB
```

2. Login to CDB with common user and perform following

   - Create table student with necessary columns and also provide the constraints
   - perform insert, update, select and delete operation on student table

### SOLUTION:

- Connect to the CDB

```sql
sqlplus basanta_rai/uwu69@my_CDB
```

- reate Table Student with Constraints

```sql
CREATE TABLE student (
    student_id NUMBER PRIMARY KEY,
    student_name VARCHAR2(50),
    student_age NUMBER,
    student_grade VARCHAR2(2),
    CONSTRAINT chk_age CHECK (student_age >= 18)
);
```

- Perform `insert` operation

```sql
INSERT INTO student (student_id, student_name, student_age)
VALUES (1, 'John', 20);
```

- Perform `update` operation

```sql
UPDATE student
SET student_name = 'Alice'
WHERE student_id = 1;
```

- Perform `select` operation

```sql
SELECT * FROM student;
```

- Perform `delete` operation

```sql
DELETE FROM student WHERE student_id = 1;
```
