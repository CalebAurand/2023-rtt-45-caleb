

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

# subquery using not in
> 

# what is the default order by ordering(sorting)
> ascending
> understand double negatives to answer this question properly

# understand the joins we've been doing form the beginning is 
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