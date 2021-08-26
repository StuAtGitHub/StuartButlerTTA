select * from books;
alter table books
drop column BookImage;

select 
issues.IssuedID,
books.BookID,
books.BookTitle,members.MemberID,
members.MemberFName,members.MemberSName
from books
join issues
on books.BookID=issues.BookIssued
join members
on members.MemberID=issues.IssuedTo
order by IssuedID asc;

update books
set BookCopiesOut=1 where BookID=3;
select * from books;
Delete from books
where BookID=10;
ALTER TABLE `issues` AUTO_INCREMENT = 1;