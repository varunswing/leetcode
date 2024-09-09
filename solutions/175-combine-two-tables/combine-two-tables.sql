# Write your MySQL query statement below

select P.firstName, P.lastName, A.city, A.state from Person as p LEFT JOIN Address as a on a.personId = p.personId;