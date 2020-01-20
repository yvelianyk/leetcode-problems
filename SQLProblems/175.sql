--https://leetcode.com/problems/combine-two-tables/
SELECT FirstName, LastName, City, State from Person
LEFT JOIN Address A on Person.PersonId = A.PersonId