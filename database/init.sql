CREATE USER leetcode WITH ENCRYPTED PASSWORD 'leetcode';
CREATE DATABASE leetcode;
GRANT ALL PRIVILEGES ON DATABASE leetcode TO leetcode;

\connect leetcode;
