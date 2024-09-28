--select all from table
SELECT * FROM table_name;

--select 2 columns from table
SELECT column1, column2 FROM table_name;

--select distinct from column
SELECT DISTINCT column1 FROM table;

--select with condition
SELECT column1, column2 FROM table_name WHERE id = '234324';

--select in order
SELECT column1, column2 FROM table_name ORDER BY column1 ASC, column2 DESC;

--select by group by
SELECT column1 COUNT(*) FROM table_name GROUP BY column1;

--nested select
SELECT column1 FROM table_name WHERE column2 IN (SELECT column2 FROM table2 WHERE condition);

--inner join
SELECT t1.column1, t2.column2 FROM table1 t1 INNER JOIN table2 t2 ON t1.common_column = t2.common_column;

--left join
SELECT t1.column1, t2.column2 FROM table1 t1 LEFT JOIN table2 t2 ON t1.common_column = t2.common_column;

--right join
SELECT t1.column1, t2.column2 FROM table1 t1 RIGHT JOIN table2 t2 ON t1.common_column = t2.common_column;


SELECT first_name, last_name
FROM employee
WHERE salary > (SELECT AVG(salary) FROM employee);