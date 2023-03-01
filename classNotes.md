# KBA review for JAVA 303.6 Quiz TEK Bootcamp

1. # The size of an array determined at compile time/run time - True;
  it can be at compile or run time

2. # Class variables, or member variables, are defined in the class, usually near the top.

3. # What kind of datatype would you store the name of something in?
  - String

//Interview Question**
4. # Difference between a String class and a String buffer class.
  String class is immutable, can't be changed once created.
    - adjustments to strings, always create new strings
  String buffers are mutable, they can be changed.

5. # String joiner - 
*look over again here*
  Go Over String Joiner

6. # Protected means -
  Can only be accessed or modified from within the same package, class, and children classes.

7. # What are some of the keywards used in defining a class?
  > access modifier >> public, private, protected
  > abstract (or not)
  > class
  > extends or implements

8. Try Catch
  > Throw - The keyword used to manually throw an exception
  
9. # Can you define constant variables in an interface?
  Yes, but Eric never does it.

 > "The fields and variables in an interface are implicitly defined as STATIC and FINAL."

10. # Extends implies that a child class is a parent class. 
  > Implies INHERITANCE.
  *Is A Relationship*

11. # A method Declaration has parts
  > access specifiers (public or private)
   *default access is package*
  > Return type (or void)
  > name of method
  > parentheses (with/without parameters)
    *parameters/arguments are not required*

12. # Method overloading
  *302.4 slides > slide 32-33, Thurs feb 9th 2023*
  > Means you can have the same method name, as long as it has different parameters.

13. # Which of the following best describes the meaning of static?
  > The static keyword can be applied to class members. This implies that the class members (static ones) belong to the class, not to instances of the class.

14. # If you created 10 objects with the static variable, how many objects would you have

  > 10 different objects
  > 1 instance of the static variable

15. # What is Autoboxing?
  > automatic conversion of primitive datatype to its wrapper by compiler
  >> EX: Integer wrapper class, wrapping an int

16. # Java does not support multiple inheritance

17. # what is inheritance in OOP
  >subclass gets (receives, acquires) the properties of its parent superclass

18. # Polymorphism
 > can take on multiple forms

19. # what is the extension of java source code files
  > .java

20. # the process of defining more than one method in a class differentiated by a method signature?
  > method overloading

21. # What is the return type of constructors
  > there is no return type for constructors

22. # truncation cuts off the decimal points
  > when a floating decimal number gets converted into an integer
  > truncate - to cut off

23. # what should you do when a primitive int datatype is required as its corresponding object (like wrapper class)
  > typecast  

24. # a main function has to be what (signature)
  > public static void 
  > public static *final* void (*optional*)

25. # how to make a new object
 > object_datatype variable_name = new datatype();

26. # A do while() loop
  > will always run the code at least once

27. # public, private, protected - all access modifiers

28. # ways of declaring an array
  > right vs wrong ways
  > int[] intArr = new int[10];
  > int[] intArr; intArr = new int[10];
  *a size must be passed to the array*

29. # to allocate the memory the keyword what is used?
  > new

30. # which of these statements is incorrect
  > the answer will be an incorrect statement

31. # when you use an interface, you cannot create an instance of it
  > you cannot instantiate an interface, because there is no implementation inside of it

32. # boolean x = true; boolean y = false;
  > true and false are lower case only
  *uppercase True or False is incorrect syntax*

33. # you cannot instantiate a parent class object with a child class datatype at time of creation
  > you can downcast parent object to child class datatype after creation

  Circle c = new Shape(); //this won't work, error
  Shape shapeC = new Circle(); //this will work because a circle, is a shape

34. # is the code block overloading
  > method signature ()
  > method signature (new params) 
  > method signatrue (new param, new param)

35. # what will print out
  output of exception handling try catch
  > output is B because of the catch{print "B"}

36. # trace code blocks through in your mind, or out loud
  > what will it print out
  *keep in mind some of these code samples may not compile*

37. # the final keyword for methods means
  > the method can not be overridden or changed in the sub classes
  # a final method is used in the parent classes
  > it will cause a compile time error if the child class tries to override it

38. # bunch of classes extending each other
  > what's this going to print out
  > draw it out on paper and figure out which one is extending from which one, down to the end result...

39. # difference between ++i and i++ (or ++y)
  > one will increase the value before the loop runs ++y
  > first value in the loop will be 1, instead of 0
  > i++ increments i after the loop is run


Go Over
StringBuffer
StringJoiner
Try Catch

Java does not support multiple inheritance, you can only extend from one class, not extending from multiples
You can implement many different interfaces however



  //Interview Question**
  What is polymorphism?

*Array Methods*
> Arrays.binarySearch(array, value)
returns index of value in a sorted array (< 0 if not found)
Arrays.copyOf(array, length)
returns a new copy of an array
Arrays.equals(array1, array2)
returns true if the two arrays contain same elements
Arrays.fill(array, value)
sets every element to the given value
Arrays.sort(array)
arranges the elements into sorted order
Arrays.toString(array)
returns a string for the array, such as "[10, 30, -25, 17]"

Object.clone()
System.arraycopy()


*ArrayList Methods*
# clear() 
  Removes all of the elements from an Arraylist and  does not return any value.
# size() 
  Returns the length of the Arraylist.
# get(int index) 
  Returns the value at the given index.
# set(int index, E value) 
  Sets the value at the given index.
# isEmpty()
  Checks if the Arraylist is empty.
# sort()
  Sort the Arraylist elements.
# add(E e)
  Add a single element to the list.
# indexOf()
  Find the index of an element.
  Returns -1 if not found.
# contains()
  Test if the list contains a value.
# remove(E e)
  Removes the element.
  Return true if successful.
# remove(int index)
  Remove the element at the given index.
  Returns the removed element.



# 2/15/2023 Sorting
  >can try the collections.sort(list_of_things) first of all
  >ArrayList.sort();

*when custom sorting is needed*
  > use a comparator
  > you can google how to "sort a list of strings/ints/doubles (etc) using a comparator"

# Common methods of hashsets
  add() - Inserts the specified element to the set. Returns true if the element was added to the set, and false if 
    otherwise.
  addAll() - Inserts all the elements of the specified collection to the set.
  clone(): Creates a copy of the HashSet.
  contains(): Searches the HashSet for the specified element and returns a boolean result.
  isEmpty(): Checks if the HashSet is empty.
  size(): Returns the size of the HashSet.
  clear(): Removes all of the elements from the HashSet.

# common methods of treesets
  boolean add(E e): adds the specified element to the Set if not already present.
  addAll(): inserts all the elements of the specified collection to the Set.
  Comparator comparator(): returns the comparator used to order the elements in this Set, or null if this Set uses the natural ordering of its elements.
  Object first(): eturns the first (lowest) element currently in this TreeSet.
  Object last(): returns the last (greatest) element currently in this TreeSet.
  void clear(): removes all the elements from the TreeSet.
  boolean contains(Object o): returns true if the TreeSet contains the specified element: otherwise, returns false.
  boolean isEmpty(): returns true if TreeSet contains no element; otherwise, returns false.
  int size(): returns the number of elements in the TreeSet.
  boolean remove(Object o): removes the specified element from the TreeSet if it is present and returns true; otherwise, returns false.
  Object clone(): returns a shallow copy of the TreeSet.

HashSet and TreeSet
vs
HashMap and TreeMap

# common methods of map
  clear()					Removes all mappings.
  containsKey(K key)		Tests whether the map includes the given key.
  containsValue(V v)		Tests whether the map includes the given value.
  get(K key)				Gets the value associated with the given key.
  put(K key, V value)		Associates value with the given key.
  keySet()					Returns the Set<K> of all keys in the map.
  remove(K key)			Removes the key and its associated value from the map.
  replace(K key, V value)	Replaces the entry for the given key.

# common methods of hashmap
  >void clear(): Removes all of the key and value pairs from the specified Map.
  >Object clone(): Returns a copy of all of the mappings of a Map and is used for cloning them into another Map.
  >boolean containsKey(Object key): Is a boolean function, which returns true or false based on whether the specified key is found in the Map.
  >boolean containsValue(Object Value): Similar to containsKey() method; however, it looks for the specified value instead of a key.
  >Value get(Object key): Returns the value for the specified key.
  >boolean isEmpty(): Checks whether the Map is empty. If there are no key-value mappings present in the Map, this function returns true; otherwise, it returns false.
  >Set keySet(): Returns the Set of the keys fetched from the Map.
  >value put(Key k, Value v): Inserts a key value mapping into the Map 
  >int size(): Returns the size of the Map – Number of key-value mappings.
  >Collection values(): Returns a collection of values of the Map.
  >Value remove(Object key): Removes the key-value pair for the specified key. 
  >void putAll(Map m): Copies all of the elements of a Map to the another specified Map.


# methods of the exception class 
  > public String getMessage()
    Get a detailed message about the exception that occurred.
  > public Throwable getCause()
    Get the cause of the exception represented by a throwable object.
  > public String toString()
    Concatenates the name of the class with the result of getMessage(), and returns the resultant string.
  > public void printStackTrace()
    Prints the result of toString() and the contents of stack trace to the error output stream, System.err.
  > public StackTraceElement [] getStackTrace()
    Get each element in the stack trace in the form of an array.
  > public Throwable fillInStackTrace()
    Fill the stack trace with the current stack trace.

# File I/O methods
  * public File(String pathString)
  * public File(String parent, String child)
  * public File(File parent, String child)
  * // Constructs a File instance based on the given path string.
    
  * public File(URI uri)
  * // Constructs a File instance by converting from the given file-URI   "file://...."

  * File file = new File("in.txt");     // A file relative to the current working directory
  * File file = new File("d:/myproject/java/Hello.java");  // A file with absolute path
  * File dir  = new File("c:/temp");   // A directory
  * String location = “C:\\FolderName\\Subfolders_Name\\fileName.txt”;
  * File myObj = new File("filename.txt");

  > isAbsolute() This method returns whether the abstract pathname is absolute or not.
  > getAbsolutePath(). It returns the absolute path to an instance of the file. 
  > List() Returns an array of the files in the directory
  > getParentFile() Returns a file pointing to the directory that contains the current file or directory.
  > getAbsoluteFile() Returns another instance of file with an absolute path.
  > toURI() - Returns a URI (Universal Resource Identifier) that begins with file, which is useful to network operations.
> isFile() and isDirectory()
Tells if a file points to a file or directory, respectively.
exists()
Tells if the file or directory really exists in the file system. 
canRead and canWrite
Tells if you can read or write to the file, respectively.
createNewFile()
To create a new file, we can use the createNewFile() method. It returns:
true if a new file is created.
false if the file already exists in the specified location.
delete()
Removes the file or directory (if empty).
 length()
Returns the file size in bytes.
mkdir() and mkdirs()
Creates a new directory if the file is a directory. The latter also creates parent directories if needed.
getFreeSpace()
Returns the available space in the device to where file is pointing to.
createTempFile()
Static method that returns a unique temporary file to be used by the application. The method deleteOnExit will delete the file at the termination of the program.
isHidden()
Returns true if a file or directory is hidden.
long lastModified()
Returns the date when the file was last modified (in milliseconds); this value can be converted into the  dd-MM-yyyy HH:mm:sss format using SimpleDateFormat class.
String[] list()  
Return contents of the directory in a String-array.


File[] listFiles() 
Return  contents of the directory in a File-array.

# Methods of FileReader class:
read():  This method Reads a single character, and will block until a character is available, an I/O error occurs, or the end of the stream is reached. It is used to return a character in ASCII form, and returns -1 at the end of file.
close(): This method is used used to close the FileReader class.

# Methods of FileWriter class
  Methods of FileWriter Class:
write(int c): We can send an ASCII character, which will convert into a single character and write a single character to a file.
write(String): It writes a string.
write (char [] c) throws IOException: It writes an array of characters.
fileWriter.close(): Closing a FileWriter is done by calling its close() method.
# The PrintWriter class provides various methods that allow us to print data to the output.
print() Method
print() - prints the specified data to the writer.
println() - prints the data to the writer along with a new line character at the end.


# create buffer with dynamic filesize
FileInputStream fis = new FileInputStream("C:/FolderName/testfile.txt");
ReadableByteChannel rbc = fis.getChannel();
long filesize =  FileChannelObject.size();
ByteBuffer buffersize  =  ByteBuffer.allocate((int)filesize);

# methods for reading/writing data from/into a buffer
get() >>> byte aByte = buf.get()
write() >>> int bytesWritten = inChannel.write(buf)
read()  is a  method of Filechannel class; it is used to write data from channel to buffer.
put() is a method of buffer, which is used to write data in buffer.
flip() switches the mode of the buffer from writing, to reading mode.


KBA Questions for Files >> slides 303.10.1 focus on first 30 slides *27-29, 35-37
IO Stream - is a continuous stream of data (conceptually endless flow of data)
If a file does not exist, it will throw a FileNotFound Exception

KBA 303.12
*Generics and Java Collections Classes* SLides
https://docs.google.com/presentation/d/1a5m6EbORKmqCYqbU8PDOKfW7VqEAhnUW_8v7rVrsXaQ/edit#slide=id.p1
*Input and Output* Slides
https://docs.google.com/presentation/d/157Mqa82VMQXW9hxG1lbSZO_Sf_gzcRlgSG0IWIoQUsY/edit#slide=id.g146603c9da6_0_218
*Functional Programming & Lambda Expressions* 
https://docs.google.com/presentation/d/1UrzL5sjGlmIjMSolaoi30WnM8Bc0Yy7aaiZ8978aa30/edit#slide=id.gfe440235d1_0_1059
# what kind of exception thrown for specified file not found > fileNotFoundException
# when we want to manually throw an exception, what keyword do we use? > Throw
# keyword throws > is done at the function level *at definition of method line, with name/params*
  > works with checked exceptions
  > there can be multiple exceptions declared
# keyword throw > is done at the statement level (within a function/method ) *requires that the exception be defined in the method declaration signature*
# checked exceptions
  > must be explicitly declared in the function signature, and checked at compile time
# unchecked exceptions
  > such as ArrayIndexOutOfBounds can be thrown but it does not need to be declared in the method signature

# Set Interface Class Types (Implementations)
  > HashSet
  > LinkedHashSet
  > TreeSet
  > EnumSet

# List Interface Implementations
  > ArrayList
  > LinkedList
  > Vector
  > Stack

# Queue Interface Implementations
  > PriorityQueue
  > ArrayDequeue

# Which package is the main package for the java framework in and contains the collections framework
  > java.util

# Map Interface Implementations
  > EnumMap
  > HashMap
  > TreeMap

# What 2 main things about a set are different than a list
  > A set cannot have duplicate elements (unique)
  > A List can have duplicates
  > A set is unordered
  > A List is ordered

# We use the size() method to see how many elements are in a List
# In Arrays we use length to see how many elements are in it.

# When you are declaring a List<datatype> it will provide type safety, and enforce that type safety for that List

# Lists - typesafety, Size method, 

# Maps - 
  > have a key and a value pair
  > keys are unique
  > a key can only have one value associated with it
  > you can have duplicate values in the map, they don't need to be unique

# Stack
  > uses a List interface
  > can have duplicate elements
  > Last in First Out

# what of these data structures can have duplicate elements
  > Stack, List, Array

# cannot have duplicate elements
  > Sets

  >A TreeSet sorts data in ascending order

# Input and Output package
  > java.io package

# A Byte Stream
  > reads bytes, can read anything, but is more general, and not normally used to read character data
  
# Character Stream 
  > Used to read and write character data typically

# Scanner - nextLine(), nextInt(), hasNextLine()
  > on KBA saying readNextLine() is a correct answer of the method... this is incorrect, but is set as the right answer on the test


# Non Blocking IO
  1. Channels and Buffers
  2. Selectors (Thread)
  3. Non-Blocking I/O

    *The Scanner is not part of Non-Blocking I/O*

# InputStream
  > Used to read data byte-by-byte *important*

# What is a stream
  > Conceptually endless flow of data

# A Functional Interface
  > contains exactly one abstract method

# Slide 28 in Functional Programming
  > You can create a functional interface without the @functional interface annotation >>> TRUE
  > Pick the right output from anonymous implementation of a functional interface

# Correct Syntax for Lambda Expressions
  slides 23-25
  > multiple parameters need parentheses
  > multiple lines of code need curly braces
  > implicit return does not need an explicit return statement on the same line

# Try-Catch-Finally Block
  > If exception is caught, code in catch block will run

  > computer will never be able to divide by zero, will throw and exception



***SQL KBA NOTES***


# *Maven*
> Maven is a library or packaage manager for java
# Central Repository
  > mvnrepository.com/artifact
*Maven Build LifeCycle/Commands*
  # Maven clean
  # Maven compile
  # Maven package
  # Maven deploy




