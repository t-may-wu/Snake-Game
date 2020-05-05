# Snake-Game
A multiplayer Snake Game with database (Group Project) 

Project Installation and Instructions

To Install, open Papyrus on any given workspace.
Next, hit file -> Import and a Import Diaglog box should appear.
In the import menu, find general and open it, then click on "Existing Projects into Workspace".
Click next, which brings up a new import window.
Select "Select archinve file:" and click the Browse... button beside the open dropdown box.
Browse and find where you have placed "Source.zip", click it, and click open at the bottom.
Make sure the project in the projects box is selected. 
Finally hit Finish.

Before you run the server, you need to start your mysql and load the database.
Open up a command prompt and navigate to the xampp folder.
Then type mysql_start to start mysql.
Now open up a second command prompt, and navigate to xampp/mysql/bin folder.
Type mysql -h localhost -u student -p
Then type in the password: hello
With a new database open, type use student_space;
Then type source ....project.sql;
Where .... is the path to the project.sql file.
Now you are ready to run the server.


To run the server, go to the workspace/project in a file explorer.
You should see a snakeServer.bat
You can run this in command prompt or just by double clicking this bat file.

To run the client open up a command prompt and navigate to the workspace then to the project then package.
Next type java -cp .;ocsf.jar;mysql-connector-java-5.1.40-bin.jar snakeGame.ClientGUI serverip port
Where serverip is the server's ipv4 address, and the port is the server's designated port, in snakeServer.bat its 12345
