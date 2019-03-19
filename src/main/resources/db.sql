


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


19/03/2019
================================


INSERT INTO movie (id,director,leading_actors,movie_desc,movie_name,STATUS) VALUES(2,'Abhishek Chaubey','Sushant Singh Rajput, Bhumi Pednekar, Manoj Bajpayee, Ranvir Shorey, Ashutosh Rana','jdk dkfjk dkfjdkdj kfd','Sonchiriya',1);
update movie SET movie_desc = 'The story of film is set in ravines of river Chambal valley. It tells the tale of dacoits in 1975, who termed themselves Baaghis, the rebels. Lacchu gives information to Baaghis that a dowry of tons of gold and cash will be given to the bride by her father so dacoit Man Singh (Manoj Bajpayee) alias Dadda should raid. Special Task Force (STF) headed by Inspector Virendra Singh Gujjar (Ashutosh Rana) attacks them during the loot in which Dadda gets killed. This leads to a split between gang. Lakhna (Sushant Singh Rajput) wants to surrender to police while Vakil Singh (Ranvir Shorey) wants to follow baaghis dharm (way of life) of rebellion. On run they meet Thakurs wife Indumati Tomar (Bhumi Pednekar) with a girl named Khushi whom Indumatis family head had raped. Indumati had killed him to save Khushi and ran away to rescue her and take her to hospital. Indumatis whole family is chasing her to get her killed. She pleads Baaghis to help her take Khushi to hospital. Baaghis agree. Indumatis family arrives and tries to take away Khushi with them. While Vakil Singh agrees to let her go, Lakhna revolts and disagrees. In this melee, Indumatis own child fires a bullet on Vakils brother and kills him by accident. Lakhna and team along with Indumati and Khushi escape and Vakil Singh vows to chase them and kill. It is revealed that Maan Singh looted dowry house to save Lacchus father from inspector Gujjar knowing very well that it was a trap to kill them. Gujjar had taken him hostage and promised to free only if Lacchu brings Baaghis to that village for the police to kill all Baaghis at once and get reward from the government. Midway to hospital, Lakhna tells Indumati a background story about a curse of killing innocent children inside a room by mistake led Baaghis whole group being killed turn by turn. And that they need to find Sonchiriya (a metaphor for a Saviour Girl) to get rid of the curse. Baaghis meet Phuilya dacoit and she joins Lakhna to save the bleeding girl and take them to Dholpur Hospital. They are joined again by Vakil Singh and gang in the task. Vakil says "to ward off the curse we need to save this girl from death, it is a chance to repent. This girl Khushi is "our Sonchiraiya, our saviour". Lakhna and Indumati makes to hospital. In the last scene, while the girl is being hospitalized, Lakhna who, being chased by Gujjar, was hiding behind the tree comes out to surrender as his task of saving Sonchiriya was finished. But by the curse, Lakhna is shot dead by Gujjar. In the aftermath, it is revealed that Vakil Singh has been killed by the police at the railway station, as his corpse is loaded in a tractor. Later, while traveling towards police station after killing Lakhna, Gujjar is shot and killed by one of his constable who was earlier assaulted and insulted by him' WHERE id =2;

INSERT INTO movie (id,director,leading_actors,movie_desc,movie_name,STATUS) VALUES(3,'Anurag Singh','Akshay Kumar, Parineeti Chopra','jdk dkfjk dkfjdkdj kfd','Kesari',3);
update movie SET movie_desc ='KESARI is based on the true story of one of the bravest battles that India ever fought – the Battle of Saragarhi. The year is 1897 and the British Empire having conquered most of India, is now trying to infiltrate Afghanistan. Fort Saragarhi, in the NWFP (North Western Frontier Province) is a small communication post used to relay messages between two major military forts - Gullistan and Lockhardt. To be posted at Saragarhi is no matter of pride for the newly formed Sikh regiment of the British Indian Army. Marked in color KESARI (Saffron), the Sikhs symbolize valor and pride and to die doing ones duty. Ishar Singh (Akshay Kumar), a proud warrior who prefers to live by his community rules, is often found in direct conflict with the orders of his British officers. As a punishment, Ishar is sent to Saragarhi where a bunch of 20 unruly, undisciplined Sikh soldiers await him. And it is this bunch of cheeky but lovable rouges that Ishar leads into the battle when an army of 10,000 Afghani Pathans turn up at Saragarhi on the 12th of Sept 1897. It is now 21 Sikhs vs 10,000 Afghans on the battlefield.' WHERE id =3;

INSERT INTO movie (id,director,leading_actors,movie_desc,movie_name,STATUS) VALUES(4,'Laxman Utekar','Kartik Aaryan, Kriti Sanon','jdk dkfjk dkfjdkdj kfd','Luka Chuppi',4);
update movie SET movie_desc ='Vinod "Guddu" Shukla is a television reporter in Mathura who falls in love with Rashmi Trivedi, a headstrong woman. Guddu proposes marriage but Rashmi suggests a live-in relationship. Confusion and chaos begins when both their traditional families assume them to be married and start living with them' WHERE id =4;


INSERT INTO movie (id,director,leading_actors,movie_desc,movie_name,STATUS) VALUES(5,'Sujoy Ghosh','Amitabh Bachchan, Taapsee Pannu','jdk dkfjk dkfjdkdj kfd','Badla',5);
update movie SET movie_desc ='Naina Sethi (Taapsee Pannu), is a young successful businesswoman with a perfect family. Naina s world turns topsy-turvy when she gets arrested for the murder of her secret lover Arjun Joseph (Tony Luke). Her lawyer (Manav Kaul) hires prestigious defence attorney, Badal Gupta (Amitabh Bachchan) to defend her, and over the course of one late evening, they work together to find out what actually happened that fateful day.' WHERE id =5;

INSERT INTO movie (id,director,leading_actors,movie_desc,movie_name,STATUS) VALUES(6,'Radha Krishna Jagarlamudi, Kangana Ranaut','Kangana Ranaut, Atul Kulkarni, Jisshu Sengupta, Vaibhav Tatwawaadi, Ankita Lokhand','jdk dkfjk dkfjdkdj kfd','Manikarnika',1);
update movie SET movie_desc ='The film begins with the birth of Manikarnika in the ghats of Varanasi. She is raised by the Bajirao in Bithoor and her father, Moropant. A young blossoming Manu is spotted by Jhansi’s minister, Dixit-Ji, slaying a tiger. Impressed by her feat, he proposes marriage between her and the King of Maratha ruled princely state of Jhansi, Gangadhar Rao. The marriage is celebrated and attended by the Jhansi residents among whom a loud, spunky woman named JhalkarBai makes her way to the front along with her husband Puran Singh to take a peek at their new queen. Manikarnika’s name is officially changed to Lakshmi Bai
The newly wed king and queen spend time together and develop a strong bond. Queen Lakshmi Bai learns and refutes the traditional womanly duties and takes a keen interest in learning about the political atmosphere of Jhansi and the state of the country instead. She is outraged as she discovers that her husband, the King of Jhansi, has to bow his head to a British officer, Gordon. She does not bow her head enraging Gordon.
Jhalkari Bai’s calf Nandu is abducted by some British officers prompting her to go after them only to get badly beaten up. When Lakshmi Bai learns about this cruelty, she confronts the officers speaking to them in fluent English to their surprise and announcing that all the livestock in Jhansi is the property of the king and will not be taken by the East India Company without permission. Lakshmi Bai returns Nandu and the two women develop a friendship. Amidst celebrations, Lakshmi Bai learns she is pregnant and is overjoyed. She gives birth to a boy, Damodar Rao.
Sadashiv Rao is seen plotting against the king with the British officers who have promised him a part of the estate when Jhansi is conquered by the company. Sadashiv is briefly seen side-eyeing a maid to carry holy water to the naming ceremony of the baby, implying that he is behind the poisoning that eventually kills Damodar Rao and leaves the King weak and on his deathbed. To have an heir for the succession of the Jhansi throne, the King decides to adopt a child. Much to Sadashivs dismay, his son is not adopted and instead, a civilian toddler that happens to run towards Lakshmi Bai is named the heir. His name is changed as Lakshmi Bai instinctively calls him Damodar. Sadashiv revolts and refuses to bow down to the future queen regent Lakshmi Bai and is banished from Jhansi.
A few months later, when the King Gangadhar Rao dies, the East India Company expects to apply the Doctrine of Lapse and annex the kingdom of Jhansi as it does not have a male heir. Lakshmi Bai does not relent and refuses to accept the practices of widowhood of those times. Instead she takes on the responsibility of the throne in order to fulfill her promise to her late husband. When the British force her to vacate the palace, she walks gracefully into the village and is welcomed and greeted by a massive parade of villagers led by Jhalkari Bai. This further enrages the company officers. The queen continues to live among the civilians to quietly strategize to get her kingdom back.
The company requests the British government to appoint Sir Hugh Rose[14] to salvage the situation and remove Lakshmi Bai from the throne permanently. Knowing very well that she will soon be attacked again, Lakshmi Bai begins training her own army and especially women to fight. In the meanwhile, Sadashiv conjures a mutiny resulting in the deaths of many innocent British women and children in addition to British officers and blames it on Rani Lakshmi Bai to prompt Hugh Rose to attack and demolish her. On the way to Jhansi, Rose hangs a girl simply because her name is Lakshmi.
During the siege of Jhansi, the Queen valiantly steps into the battle field to destroy the British cannons strategically placed in front of a temple. The strong castle walls keep the queen and her army safe until Sadashiv Rao divulges secrets about the castle to the British who finally break the siege and manage and attack, resulting in the death of Gaus-Baba. Jhalkari Bai, despite discovering that she is pregnant becomes a decoy pretending to be the queen. She manages to get all the British soldiers to follow her and distracts them enough for Lakshmi Bai to safely escape the castle with Damodar Rao. Jhalkari Bai sacrifices herself in a major gun powder explosion killing numerous British officers along with her.
Having lost everything but her love for the country, Lakshmi Bai escapes to Kalpi to reunite with Tantia Tope and other allies. She recaptures Gwalior and motivates the Maratha soldiers to participate in the independence war. With a heavy heart, Lakshmi Bai leaves Damodar Rao with her childhood friend and attendant, Kashi and leads an attack on the British army. Lakshmi Bai sets out to attack the huge British army but then faces a certain defeat. At the end of the film, Rani Lakshmi Bai looks at Hugh Rose and sets fire on herself to avoid being captured and killed by the British' WHERE id =6;


UPDATE movie SET  movie_desc = 'Murad Ahmed (Ranveer Singh), a final year college student, lives in the Dharavi slums of Mumbai. His abusive father Aftab (Vijay Raaz) brings home a much younger second wife, much to the chagrin of the family. Murad nurtures a fascination with rap music and writes lyrics to express himself. His longtime girlfriend Safeena (Alia Bhatt) is training to be a surgeon and routinely meets him in secret. Forced to work part-time as a chauffeur after his father is injured, Murad continues to write, with his lyrics informed by the inequalities he observes while on the job. Making the acquaintance of local rapper Shrikant alias MC Sher (Siddhant Chaturvedi), he is drawn into performing his lyrics at underground shows and eventually uploading a video on YouTube.
Berklee College student Sky (Kalki Koechlin) reaches out to Murad and Sher, offering to collaborate on a new song. The accompanying video, which is shot in Dharavi, rapidly becomes popular. Murad shares an intimate moment with Sky, later lying to Safeena about it. When Safeena eventually finds out, she reacts violently towards Sky, she then hits Sky with a beer bottle and was arrested, and a horrified Murad decides to break up with her. As Aftabs violence towards him and his mother escalates, Murad decides to leave home with his mother and work full-time for his uncle.
Murad and Sher enter a contest to open for Nas at his Mumbai concert, and Murad advances to the finals after a successful rap battle. When Sky expresses her romantic feelings for him, he decides to instead reconcile with Safeena. Murads confidence grows from interacting with rap fans appreciation of his performances, and he finally stands up to his father and uncle when they belittle his passion. The movie ends with Murads family and friends watching as Murad, the winner of the contest begins his opening performance.' WHERE id = 1




