# Snake-Game
A multiplayer Snake Game with database (Group Project) 

Project Installation and Instructions

To Install, open Papyrus on any given workspace.
next, hit file -> Import and a Import Diaglog box should appear.
in the import menu, find general and open it, then click on "Existing Projects into Workspace"
click next, which brings up a new import window.
select "Select archinve file:" and click the Browse... button beside the open dropdown box.
Browse and find where you have placed "Source.zip", click it, and click open at the bottom.
Make sure the project in the projects box is selected. 
Finally hit Finish.

Before you run the server, you need to start your mysql and load the database.
open up a command prompt and navigate to the xampp folder.
then type mysql_start to start mysql.
now open up a second command prompt, and navigate to xampp/mysql/bin folder.
type mysql -h localhost -u student -p
then type in the password: hello
with a new database open, type use student_space;
then type source ....project.sql;
where .... is the path to the project.sql file.
now you are ready to run the server.


To run the server, go to the workspace/project in a file explorer
you should see a snakeServer.bat
you can run this in command prompt or just by double clicking this bat file.

to run the client open up a command prompt and navigate to the workspace then to the project then package
next type java -cp .;ocsf.jar;mysql-connector-java-5.1.40-bin.jar snakeGame.ClientGUI serverip port
where serverip is the server's ipv4 address, and the port is the server's designated port, in snakeServer.bat its 12345
