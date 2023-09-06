## Lab12

In this lab, we made significant enhancements to the AlbumController and other related classes to establish a connection between our server and a database.
The primary objective was to enable users to interact with our web application by adding album information, which would then be securely stored inside a
database table. Here's a more detailed description of the steps and changes made during this lab:

-  We created an entity class that represents an album. This class typically mirrors the structure of the database table. 
It includes attributes such as title, artist, songCount, length, and imageUrl. Annotations like @Entity and @Table were used to map this class to
the corresponding database table.
- In the AlbumController, we updated the endpoints to handle HTTP requests related to album management. For instance,
we created an endpoint to display a form for users to input album information and another to handle form submissions. When a user submits the form,
the controller uses the repository to save the album information in the database.
