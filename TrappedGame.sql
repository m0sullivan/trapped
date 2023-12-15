drop database if exists TrappedGame;
create database TrappedGame;
use TrappedGame;

create table rooms (id int not null auto_increment, roomName varChar(200), roomDescription varChar(2000), primary key (id));


create table clues (id int not null auto_increment, item varchar(200), content varchar(2000), primary key(id));
create table combinationLock (id int not null auto_increment, item varchar(200), password varchar(200), primary key(id));

create table questions (id int not null auto_increment, conteudo varchar(2000), primary key(id));
create table answer (id int not null auto_increment, conteudo varchar(200), primary key(id));

create table enemies (id int not null auto_increment, name varchar(200), enemyType varchar(200), timer double, 
	whereCanSpawn varchar(200), chanceOfSpawning double, primary key (id));

insert into rooms (roomName, roomDescription) values ("Main Room", "There is a Main Door which is the exit. It's locked... There is also a Door1 into another room, and a Door2 which is to another room. There is also a chest, and a small door."), 
("Office Rooms", "I see another door. There is a File Cabinet, could be something inside of it. There is also a Desk, there is something on top of it."), 
("Bedrooms", "There looks to be a comfortable Bed. There is a Closet in here too. I can maybe find something or hide in here, in case something pops by, There also seems to be a Broken Clock here. I wonder why it hasn't been fixed..."),
("Library", "There are bookshelves here full of books, except for one... There is one empty bookshelf with only one book. There is also another Door to another room."),
("Bathroom", "There is a shattered toilet here that hasn't been used in a long time. Behind me, the tiles on the bathroom wall have letters drawn on them. They seem to be in the wrong order of a sentence. The door behind me randomly locked itself?"),
("Kitchen", "It's just a Kitchen with regular cooking things. Theres a cabinet with one broken door. There seems to be a grocery list inside of it.");




insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Ghost", "Normal", 5, "Office Rooms", 20);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Giant Rat", "Fast", 4, "Kitchen", 15);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Zombies", "Very Slow", 8, "Library", 70);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Vampire", "Fast", 3, "Bedrooms", 5);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Mummy", "Very Slow", 10, "Dining Room", 75);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Giant Bat", "Very Fast", 2, "Backyard", 5);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Skeleton", "Fast", 3, "Lobby", 5);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Witch", "Slow", 6, "Labs", 55);

insert into clues (item, content) values("letter", 
"Dear Maya                                6th July, 2013
Thank you very much for your last letter. It was great to hear 
from you after so many months. You seem to be having a 
nice time in France.

Thanks also for the photographs. I absolutely loved that snap
of yours stading in front of the Eiffel Tower. France looks
stunning. Someday, I would definitelt like to go there. 

There's not much happening here. I am busy wth my work
and kids. By the way, are you coming home anytime soon?
If you are, let me know the dates and we can arrange to meep up. 

Hope to see you soon!

Lana Soares
");
insert into clues (item, content) values("broken clock", "3:28am");
insert into clues (item, content) values("morse code", ".--- ..- .-.. -.--");
insert into clues (item, content) values("wrong order", "het leuc si notapsuenos");
insert into clues (item, content) values("grocery list ", "Milk
															Apples
															Crackers
															Juice");
                                                                
insert into combinationLock (item, password) values("Letter", "DTTTHL");
insert into combinationLock (item, password) values("Broken Clock", "823");
insert into combinationLock (item, password) values("Morse Code", "July");
insert into combinationLock (item, password) values("Foreign Language", "가위 바위 보");
insert into combinationLock (item, password) values("Wrong Order", "The clue is spontaneous");
insert into combinationLock (item, password) values("Grocery List", "MACJ");

insert into questions (conteudo) values("What is the largest planet in our solar system? (Answer is all caps and only letters)");
insert into questions (conteudo) values("What is the capital city of France? (Answer is all caps and only letters)");
insert into questions (conteudo) values("In which country would you find the Great Wall? (Answer is all caps and only letters)");
insert into questions (conteudo) values("What colors mix to make green? (Answer is all caps and only letters)");
insert into questions (conteudo) values("Which animal is the tallest in the world? (Answer is all caps and only letters)");
insert into questions (conteudo) values("How many primary colors are there? (Answer is all caps and only letters)");
insert into questions (conteudo) values("How many continents are there? (Answer is all caps and only letters)");
insert into questions (conteudo) values("How many planets are in our solar system? (Answer is all caps and only letters)");
insert into questions (conteudo) values("How much is 2+2? (Answer is all caps and only letters)");
insert into questions (conteudo) values("How many colors are there in a rainbow? (Answer is all caps and only letters)");
insert into questions (conteudo) values("Are worker bees male or female? (Answer is all caps and only letters)");
insert into questions (conteudo) values("Which color is an emerald? (Answer is all caps and only letters)");
insert into questions (conteudo) values("Which US state is famous for Hollywood? (Answer is all caps and only letters)");
insert into questions (conteudo) values("Which type of fish is Nemo? (Answer is all caps and only letters)");
insert into questions (conteudo) values("What do bees consume to make honey? (Answer is all caps and only letters)");
insert into questions (conteudo) values("What serves as the base for guacamole? (Answer is all caps and only letters)");
insert into questions (conteudo) values("Who wrote Romeo Juliet? (Answer is all caps and only letters)");
insert into questions (conteudo) values("Name the largest state in America. (Answer is all caps and only letters)");
insert into questions (conteudo) values("Which is the closest star to the Earth? (Answer is all caps and only letters)");
insert into questions (conteudo) values("Which school did Harry Potter attend? (Answer is all caps and only letters)");

insert into answer (conteudo) values("JUPITER");
insert into answer (conteudo) values("PARIS");
insert into answer (conteudo) values("CHINA");
insert into answer (conteudo) values("BLUE AND YELLOW");
insert into answer (conteudo) values("GIRAFFE");
insert into answer (conteudo) values("THREE");
insert into answer (conteudo) values("SEVEN");
insert into answer (conteudo) values("EIGHT");
insert into answer (conteudo) values("FOUR");
insert into answer (conteudo) values("SEVEN");
insert into answer (conteudo) values("FEMALE");
insert into answer (conteudo) values("GREEN");
insert into answer (conteudo) values("CALIFORNIA");
insert into answer (conteudo) values("CLOWNFISH");
insert into answer (conteudo) values("NECTAR");
insert into answer (conteudo) values("AVOCADO");
insert into answer (conteudo) values("WILLIAM SHAKESPEARE");
insert into answer (conteudo) values("ALASKA");
insert into answer (conteudo) values("SUN");
insert into answer (conteudo) values("HOGWARTS");


