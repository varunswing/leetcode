# Write your MySQL query statement below


select u.unique_id, e.name 
from employees e
left join employeeUNI  u
ON u.id = e.id;