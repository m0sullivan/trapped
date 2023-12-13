drop database if exists TrappedGame;
create database TrappedGame;
use TrappedGame;

create table rooms (id int not null auto_increment, roomName varChar(200), chanceOfCreating double, primary key (id));
create table furniture (id int not null auto_increment, furnitureItem varChar(200), canSpawnInsideClues varChar(200), 
canSpawnInsideEnemies varChar(200), primary key (id));

create table clues (id int not null auto_increment, item varchar(200), content varchar(2000), primary key(id));
create table combinationLock (id int not null auto_increment, item varchar(200), password varchar(200), primary key(id));

create table questions (id int not null auto_increment, conteudo varchar(2000), primary key(id));
create table answer (id int not null auto_increment, conteudo varchar(200), primary key(id));

create table enemies (id int not null auto_increment, name varchar(200), enemyType varchar(200), timer double, 
	whereCanSpawn varchar(200), chanceOfSpawning double, primary key (id));

insert into rooms (roomName, chanceOfCreating) values ("Main Room", 100), ("Office Rooms", 75), ("Bedrooms", 90), 
("Library", 50), ("Mazes", 45), ("Lobby", 70), ("Playground", 50), ("Basement", 55), ("Labs", 35), ("Computer Room", 50), 
("Dining Room", 60), ("Kitchen", 60), ("Backyard", 70), ("Balcony", 85), ("Bathroom", 65), ("Attic", 70);




insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Ghost", "Normal", 5, "Office Rooms", 20);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Giant Rat", "Fast", 4, "Kitchen", 15);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Zombies", "Very Slow", 8, "Library", 70);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Vampire", "Fast", 3, "Bedrooms", 5);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Mummy", "Very Slow", 10, "Dining Room", 75);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Giant Bat", "Very Fast", 2, "Backyard", 5);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Skeleton", "Fast", 3, "Lobby", 5);
insert into enemies (name, enemyType, timer, whereCanSpawn, chanceOfSpawning) values ("Witch", "Slow", 6, "Labs", 55);

insert into clues (item, content) values("Letter", "Dear Maya                                6th July, 2013
													
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
insert into clues (item, content) values("Brocken Clock", "3:28am");
insert into clues (item, content) values("Morse Code", ".--- ..- .-.. -.--");
insert into clues (item, content) values("Foreign Language", "목표는 상대의 플레이를 이기는 플레이 모자를 선택하는 것입니다.
																바위가 가위를 부수다: 바위가 승리합니다
                                                                가위로 종이를 자르다: 가위가 승리한다
                                                                종이가 바위를 감싸다: 종이가 승리한다
                                                                동일 플레이: 다시 플레이하여 승리하세요.");
insert into clues (item, content) values("Wrong Order", "het leuc si notapsuenos");
insert into clues (item, content) values("Grocery List ", "Milk
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


