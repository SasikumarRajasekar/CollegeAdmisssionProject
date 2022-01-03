
create table user_details(User_Id int generated always as identity start with 1 Primary key, 
User_Name varchar2(50) not null, 
Email varchar2(50) not null Unique, 
Mobile_Number int not null, 
User_Password varchar2(50) not null);

select * from user_details;
drop table user_details;
insert into user_details (user_name,email,mobile_number,user_password) values('Sasi', 'sasi@gmail.com', 9150587671, 'sasi1992');
insert into user_details (user_name,email,mobile_number,user_password) values('Karthi', 'karthi@gmail.com', 9597825963, 'karthi1998');
insert into user_details (user_name,email,mobile_number,user_password) values('Darshan', 'darshan@gmail.com', 9876543210, 'darshan2003');

create table admin_details(Admin_Id int Primary key, 
Admin_Name varchar2(50) not null, 
Email varchar2(50) not null Unique,
Admin_Password varchar2(50) not null);

drop table admin_details;
insert into admin_details values(6385, 'Sekar', 'sekar@admin.com', 'sekar1961');
select* from admin_details;

create table application_details
(application_id int generated always as identity start with 1000 primary key,
user_id int,
foreign key(User_Id) references user_details(User_Id),
Student_Name varchar2(50) not null, 
Father_Name varchar2(50) not null, 
Date_of_Birth date not null,
Aadhar_Number long not null,
SSLC_Mark int not null, 
HSC_Mark int not null, 
First_Graduate varchar2(10),
Address varchar2(100) not null, 
City varchar2(50) not null,
Pincode int not null,
User_State varchar2(40) not null, 
Nationality varchar2(40) not null);

select * from application_details;
drop table application_details;
update application_details set student_name='bala' where user_id = 1; 

create table courses_details(Course_Id int primary key,
Course_Type varchar2(10) constraint course_type_cons check (Course_Type IN ('UG','PG')),
Course_Name varchar2(50),
Admission_Fees int,
Tuition_Fees int);

select * from courses_details;



desc application_details;

insert into application_details(user_id,Student_Name,Father_Name,Date_of_Birth,Aadhar_Number,Sslc_Mark,Hsc_Mark,First_Graduate,Address,City,Pincode,User_State,Nationality) values (24,'Darshan','Prabakar','27-04-2003',5432109,444,888,'No','Anna Nagar','Madurai',625002,'Tamilnadu','Indian');


select * from application_details;
drop table courses_details;
select (admission_fees+tuition_fees+exam_fees)*.75 from fees_list where course_id=100;
select * from application_details;
select * from user_details;
commit;