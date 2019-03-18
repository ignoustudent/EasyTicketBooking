


SELECT * FROM cinema_details

SELECT * FROM show_details


SELECT STR_TO_DATE('21,5,2013,11','%d,%m,%Y,%h');

SELECT * FROM movie

SELECT   DISTINCT(cinema_id)  FROM show_details WHERE movie_id = 1;



INSERT INTO movie (id,director,leading_actors,movie_desc,movie_name,STATUS) VALUES(1,'mahesh','tom cfjf dkf','jdk dkfjk dkfjdkdj kfd','Mangal Pandey',1);
INSERT INTO cinema_details (id,about, address,name, city_id) VALUES(10,'ABC Cines provides good facilities,dfk','web mall 3rd Floor Lucknow','Jhankar Cinema',2)

SELECT * FROM show_details

INSERT INTO show_details (id,availability,club_rate,show_date,show_day,show_time,silver_rate,cinema_id,movie_id) VALUES (2,'available',220,'17-06-2019','Monday','12:30 PM',190,2,1);
INSERT INTO show_details (id,availability,club_rate,show_date,show_day,show_time,silver_rate,cinema_id,movie_id) VALUES (3,'available',220,'17-06-2019','Monday','12:30 PM',190,3,1);
INSERT INTO show_details (id,availability,club_rate,show_date,show_day,show_time,silver_rate,cinema_id,movie_id) VALUES (4,'available',220,'17-06-2019','Monday','12:30 PM',190,4,1);
INSERT INTO show_details (id,availability,club_rate,show_date,show_day,show_time,silver_rate,cinema_id,movie_id) VALUES (5,'available',220,'17-06-2019','Monday','12:30 PM',190,5,1);
INSERT INTO show_details (id,availability,club_rate,show_date,show_day,show_time,silver_rate,cinema_id,movie_id) VALUES (6,'available',220,'17-06-2019','Monday','12:30 PM',190,6,1);
INSERT INTO show_details (id,availability,club_rate,show_date,show_day,show_time,silver_rate,cinema_id,movie_id) VALUES (7,'available',220,'17-06-2019','Monday','12:30 PM',190,7,1);



SELECT * FROM seat_details

INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('A','Silver','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('B','Silver','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('C','Silver','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('D','Silver','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('E','Silver','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('F','Club','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('G','Club','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('H','Club','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('I','Club','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('J','Club','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);
INSERT INTO seat_details (row_no,seat_category, seat_no,cinema_id) VALUES('K','Club','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15',1);


DELETE FROM seat_details where row_no = 'K';





