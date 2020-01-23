-- https://leetcode.com/problems/project-employees-i/
select Project.project_id,
       round(avg(E.experience_years), 2) as avarage_years
from Project
         join Employee E on Project.employee_id = E.employee_id
group by Project.project_id
