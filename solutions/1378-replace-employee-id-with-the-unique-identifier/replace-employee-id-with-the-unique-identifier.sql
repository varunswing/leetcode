# Write your MySQL query statement below
SELECT unique_id, name from EmployeeUNI as eu
right join Employees as e
On e.id = eu.id;