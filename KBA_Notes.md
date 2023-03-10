

***SQL KBA REVIEW*** 25 questions, 90 minutes
# all tables must contain at least 1 foreign key
 > false

# how would you prevent large query results, from large dataset return
> LIMIT keyword

# a primary key must be which of the following (mandatory properties)
> unique, not-null

# query can use keywords IN, and NOT IN to return results
> when returning a list of results, or filtering with a list of things

# when adding a foreign key constraint
> adding it to the table that is not the primary key
> the foreign key is pointing to the table with the primary key

# when creating a primary key to automatically generate a primary key is called
> auto-increment

# it is possible for a prim key to be mult fields
> true

# mult typs of joins can be used in the same query
> true

# what is best practice for primary key
> int(numeric), not null, auto-increment, unique

# what is the default order by ordering(sorting)
> ascending
> understand double negatives to answer this question properly

# understand the joins we've been doing from the beginning is 
> inner join

# why do we use database constraints
> to normalize our data
> maintain data integrity

>>>here is the order for SQL queries syntax
# select
# from
# where
# group by
# having
# order by
# limit

# why is a primary key important
> its a unique identifier 
> used in foreign key relationships (referential integrity)
> to provide fast lookup of data "access database records faster"

# what does the where clause do
> filter the results of rows returned

# sub-query using NOT IN
> pick the right results

# Know the difference between IS NULL, and = NULL
> X IS NULL >>This is proper and will return correct results
> *X = NULL* > will *never* return any results

# what does distinct do in "select distinct"
> it only returns unique values, no duplicates are returned

# can you use a sub-query in an aggregate function
> yes you can use a sub-query while using an aggregate function

# why do we used normalized tables
> reduces redundancy
> simplify data maintainance

# know basic form of an update statement

# ambiguous columns... pick out the ambiguous column from the query

# transactions... mysql has auto-commit turned on, like the save button
> you can ROLLBACK, this means undo all the changes you made using INSERT, UPDATE, or DELETE
> IN a transaction you can do mult. inserts, updates, or deletes and then ROLLBACK >>> delete all those changes or
> COMMIT>> commit all the changes to the database


*JDBC*
# what does JDBC stand for
> Java Database Connectivity
> allows us to connect to the database with java

*Applying OOP to JDBC*
# DAO - Data Access Object Interfaces 
  - This interface defines the standard operations to be performed on model object(s). The interfaces provide a flexible design.
# DAO - Data Access Object classes(Business/Controller layer) 
  - This class implements the above interface. This class is responsible for getting data from a data source, which can be database / xml or any other storage mechanism. The interface implementation is a concrete implementation of the persistence logic.
# DAL - Data-Access Layer 
  - This is a layer in an application that provides easy and simplified access to data stored in persistent storage, such as an entity-relational database or any database. This layer exists between the Business/Controller Logic Layer (BLL) and the storage layer. 
# Models Class / DTO 
  - This object is simple POJO class containing getter and setter methods to store data retrieved using DAO class. 
# DataSource 
  - A data source could be a database such as an RDBMS, File,, XML repository, flat file system, or any other data source. A data source can also be another system service or some kind of repository.




  *JPA* Java Persistence API
  - JPA is the specification
  - Hibernate is the implementation of that specification
  *KBA Question*

  **JUNIT KBA**
  @BeforeAll - has to be a *static method*, public static method, or it wont run

# Reasons to use JUNIT/ unit testing
> Find bugs and errors
> Test another portion of code, ensure operating correctly
> Unit Testing Framework

# Benefits of puttings tests in same source package
> allows us to have protected access to the java classes in the package for testing

# equals() method compares the
> the hash of the object

# differences in given, when, then testing annotations

# in the DAO class, what does the query.setParameter method do
> replaces the parameter with the input variable for the query

# 3-4 chunks of code
> in your test case, if you don't have static on the @BeforeAll
> it won't run

# JDBC stands for
> Java DataBase Connectivity

# JDBC what does it do
> Establish connection between DataBase and JVM
> Send Querys, and get back Results

# What is a JDBC Driver
> 

# What is a JDBC statement
> an inteface used to execute a query

# What is a resultset
> what you get back from a query

# What is a connection
> a unique connection to the database

connection, 
conneciton uses the driver,
used to execute a statement, 
resultset is what you get back

# some benefits of using hibernate over JDBC
> 1) reduces boilerplate code (repeated code)
> 2) automatic mapping of data
> 3) allows you to use different databases
> use annotations

# what is the difference between ORM, JPA, and hibernate
> ORM is the theory(a set of techniques used to map an object to the database)
> JPA is the specification 
> hibernate is the implementation

# which of the following steps are required in order to use JDBC to issue SQL statements?
> obtain and establish a connection to the database
> provide a url to the preexisting database to be accessed by your application
> import the jdbc library to your application
> include the jdbc driver in your applications class path

# what is the diff btwen execute query and execute update
> query > trying to read data from DB, get results back from database
> update > trying to change the database
 - returns an integer value of number of rows changed

# what does sessionfactory do?
> an interface that is usually created during application started and kept for later use

# > proposed answer for above
> uses the hibernate config file to establish a connection and create hibernate sessions

# what happens if we don't close our connections
> 1) we get memory leaks
> 2) eventually the database will run out of connections
> 3) the connection may remain active even after the user logs out
> the server could eventually crash
> very hard to troubleshoot

# session.createQuery
> we are using our session to perform our operations on the database

# @Column
> is used to map an instance field of the class, to a column in the database

# which of the folloing option is not a state of an object instance in hibernate
> attached
> other *wrong* answers (transient, persistent, detached)

# the difference between a prepared statement and a statement
> statement - 
> prepared statement - allows you to use variables as parameters
  this is more performant on the database than a regular statement

# what annotation do we use to specify a primary key
@id

# what annotation do we use to specify a table and entity that it belongs to
@entity
@table

# 2 functions we use to save records in hibernate
save - is for doing an insert
merge - is for doing an update

# what annoation for a column
@column

# what annotation is used when one record in an entity refers to multiple records in another entity
@OneToMany 