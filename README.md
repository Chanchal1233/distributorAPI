# distributorAPI Documentation
Welcome to the DistributorAPI Documentation. The DistributorAPI is a tool designed specifically for CocaCola distributors on the island, offering an intuitive and efficient way to manage their information within a centralized database. This API simplifies the process of creating new distributor accounts, updating details, and even removing obsolete information, ensuring seamless communication between distributors and the manufacturers. By facilitating easy access to key information, the DistributorAPI plays a role in helping distributors and manufacturers maintain a steady connection, ultimately enabling smooth order placements and enhancing overall collaboration.
# Introduction
The DistributorAPI allows manufacturers to create new accounts for distributors with ease. By providing a user-friendly interface, manufacturers can swiftly input crucial information. Each distributor entry within the API has the essential details:

Distributor's Name: Clearly identifies the distributor.

Email Address: As a method of direct communication.

Province: Indicates the province in which the distributor is based.

Password: Securely enables distributor access.

Unique ID: Provides a distinct identifier for every distributor entry.
# API Endpoints
**<h3>Add a new distributor.</h3>**

- **Endpoint:** POST <code>/api/v1/distributor/add</code>

- **Request Body:**
```
{
"Name" : "Carl",
"Email" : "carlanothony@gmail.com",
"Province" : "Western",
"Password" : "Carlll453/"
}
```
- **Response:**
```
{
"distributorid" : 1,
"Name" : "Carl",
"Email" : "carlanothony@gmail.com",
"Province" : "Western",
"Password" : "Carlll453/"
}
```
**<h3>Add multiple new distributors at once.</h3>**

- **Endpoint:** POST <code>/api/v1/distributor/add/multiple</code>

- **Request Body:**
```
[
  {
"Name" : "Matthew",
"Email" : "matthewhugh@gmail.com",
"Province" : "Southern",
"Password" : "Matthew/7677/"
},
  {
"Name" : "Daniel",
"Email" : "danielsilva@gmail.com",
"Province" : "Southern",
"Password" : "Silva45355"
}
]
```
- **Response:**
```
[
  {
"distributorid" : 2
"Name" : "Matthew",
"Email" : "matthewhugh@gmail.com",
"Province" : "Southern",
"Password" : "Matthew/7677/"
},
  {
"distributorid" : 3
"Name" : "Daniel",
"Email" : "danielsilva@gmail.com",
"Province" : "Southern",
"Password" : "Silva45355"
}
]
```
**<h3>Update an existing entry of a distributor.</h3>**

- **Endpoint:** PUT <code>/api/v1/distributor/update</code>

- **Request Body:**
```
{
"distributorid" : 1,
"Name" : "UPDATED NAME",
"Email" : "carlanothony@gmail.com",
"Province" : "Western",
"Password" : "Carlll453/"
}
```
- **Response:**
```
{
"distributorid" : 1,
"Name" : "UPDATED NAME",
"Email" : "carlanothony@gmail.com",
"Province" : "Western",
"Password" : "Carlll453/"
}
```
**<h3>List all distributors.</h3>**

- **Endpoint:** GET <code>/api/v1/distributor/all</code>

- **Response:**
```
[
  {
"distributorid" : 1,
"Name" : "Carl",
"Email" : "carlanothony@gmail.com",
"Province" : "Western",
"Password" : "Carlll453/"
},
  {
"distributorid" : 2
"Name" : "Matthew",
"Email" : "matthewhugh@gmail.com",
"Province" : "Southern",
"Password" : "Matthew/7677/"
},
  {
"distributorid" : 3
"Name" : "Daniel",
"Email" : "danielsilva@gmail.com",
"Province" : "Southern",
"Password" : "Silva45355"
}
]
```
**<h3>Find distributor by ID</h3>**

- **Endpoint:** GET <code>/api/v1/distributor/find/id/{id}</code>

- **Request:** <code>/api/v1/distributor/find/id/1</code>
- **Response:**
```
{
"distributorid" : 1,
"Name" : "Carl",
"Email" : "carlanothony@gmail.com",
"Province" : "Western",
"Password" : "Carlll453/"
}
```
**<h3>Find distributors by email</h3>**

- **Endpoint:** GET <code>/api/v1/distributor/find/email/{email}</code>

- **Request:** <code>/api/v1/distributor/find/email/matthewhugh@gmail.com</code>
- **Response:**
```
{
"distributorid" : 2
"Name" : "Matthew",
"Email" : "matthewhugh@gmail.com",
"Province" : "Southern",
"Password" : "Matthew/7677/"
}
```
**<h3>Find distributors by name</h3>**

- **Endpoint:** GET <code>/api/v1/distributor/find/name/{name}</code>

- **Request:** <code>/api/v1/distributor/find/name/Daniel</code>
- **Response:**
```
{
"distributorid" : 3
"Name" : "Daniel",
"Email" : "danielsilva@gmail.com",
"Province" : "Southern",
"Password" : "Silva45355"
}
```
**<h3>Find distributors by province</h3>**

- **Endpoint:** GET <code>/api/v1/distributor/find/province/{province}</code>

- **Request:** <code>/api/v1/distributor/find/province/Southern</code>
- **Response:**
```
[
  {
"distributorid" : 2
"Name" : "Matthew",
"Email" : "matthewhugh@gmail.com",
"Province" : "Southern",
"Password" : "Matthew/7677/"
},
  {
"distributorid" : 3
"Name" : "Daniel",
"Email" : "danielsilva@gmail.com",
"Province" : "Eastern",
"Password" : "Silva45355"
}
]
```
**<h3>Delete a distributor entry by id</h3>**

- **Endpoint:** DELETE <code>/api/v1/distributor/delete/{id}</code>

- **Request:** <code>/api/v1/distributor/delete/1</code>
- **Response:** Distributor information is deleted from database.






