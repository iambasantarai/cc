1. Create a user named `student_pdb` in PDB with all privileges and connect to that user.

### SOLUTION:

- Connect to PDB

```sql
sqlplus sys as sysdba
ALTER SESSION SET CONTAINER = my_PDB;
```

- Create the user

```sql
CREATE USER student_pdb IDENTIFIED BY uwu69;
GRANT CONNECT, RESOURCE, CREATE SESSION TO my_PDB;
```

- Connect to the user

```sql
sqlplus student_pdb/uwu69@my_PDB
```

2. Login to PDB user and perform following:

   - Create table employee with necessary columns and provide the constraints
   - Create a synonym for employee table and use it to display information

### SOLUTION:

- Connect to PDB user

```sql
sqlplus student_pdb/uwu69@my_PDB
```

- Create a table employee with constraints

```sql
CREATE TABLE employee (
    employee_id NUMBER PRIMARY KEY,
    employee_name VARCHAR2(50),
    employee_salary NUMBER,
    employee_department VARCHAR2(50),
    CONSTRAINT chk_salary CHECK (employee_salary >= 0)
);
```

- Create synonym for example table

```sql
CREATE SYNONYM emp FOR employee;
```

- Use the synonym to display information

```sql
SELECT * FROM empl;
```
