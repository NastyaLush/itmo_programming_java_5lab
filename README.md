## Stage 1 (Lab 5)

Implement a console application that manages a collection of objects in interactive mode. The collection must store objects of the `Product` class, whose description is given below.

The developed program must meet the following requirements:

- The class whose instances are managed by the program must implement a default sort order.
- All field requirements of the class (specified as comments) must be fulfilled.
- Use a collection of type `java.util.HashMap` for storage.
- When the application starts, the collection must be automatically populated with values from a file.
- The file name must be passed to the program via an environment variable.
- Data must be stored in the file in XML format.
- Reading data from the file must be implemented using `java.io.FileReader*`.
- Writing data to the file must be implemented using `java.io.FileWriter`.
- All classes in the program must be documented in Javadoc format.
- The program must handle invalid data correctly (user input errors, missing file access permissions, etc.).


-----

In interactive mode, the program must support the following commands:

- `help` : display help for the available commands
- `info` : output information about the collection to standard output (type, initialization date, number of elements, etc.)
- `show` : output all elements of the collection in string representation to standard output
- `insert null {element}` : add a new element with the specified key
- `update id {element}` : update the value of the collection element whose `id` equals the specified one
- `remove_key null` : remove an element from the collection by its key
- `clear` : clear the collection
- `save` : save the collection to a file
- `execute_script file_name` : read and execute a script from the specified file. The script contains commands in the same form as the user enters them in interactive mode.
- `exit` : terminate the program (without saving to the file)
- `remove_lower {element}` : remove from the collection all elements that are less than the specified one
- `history` : output the last 10 commands (without their arguments)
- `remove_lower_key null` : remove from the collection all elements whose key is less than the specified one
- `remove_any_by_unit_of_measure unitOfMeasure` : remove one element from the collection whose `unitOfMeasure` field value is equivalent to the specified one
- `average_of_manufacture_cost` : output the average value of the `manufactureCost` field for all elements
- `group_counting_by_price` : group the collection elements by the value of the `price` field and output the number of elements in each group

**Command Input Format:**

* All command arguments that are standard data types (primitive types, wrapper classes, `String`, date/time classes) must be entered on the same line as the command name.
* All composite data types (class objects stored in a collection) must be entered one field per line.
* When entering composite data types, the user must be shown a prompt containing the field name (for example, “Enter date of birth:”).
* If a field is an enum, the name of one of its constants must be entered (the list of constants must be displayed beforehand).
* If the user input is invalid (e.g., a string that is not a valid enum constant; a string entered instead of a number; a number outside the allowed range, etc.), an error message must be displayed and the user must be prompted to re-enter the field.
* To enter `null` values, use an empty string.
* Fields marked with the comment “The value of this field must be generated automatically” must not be entered manually by the user when adding a new object.

---

**Description of the classes stored in the collection:**



        public class Product {  
            private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически  
            private String name; //Поле не может быть null, Строка не может быть пустой  
            private Coordinates coordinates; //Поле не может быть null  
            private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически  
            private Long price; //Поле не может быть null, Значение поля должно быть больше 0  
            private int manufactureCost;  
            private UnitOfMeasure unitOfMeasure; //Поле не может быть null  
            private Person owner; //Поле может быть null  
        }  
        public class Coordinates {  
                private Integer x; //Значение поля должно быть больше -233, Поле не может быть null  
                private Float y; //Поле не может быть null  
                }  
        public class Person {  
                private String name; //Поле не может быть null, Строка не может быть пустой  
                private java.time.ZonedDateTime birthday; //Поле не может быть null  
                private int height; //Значение поля должно быть больше 0  
                private Location location; //Поле не может быть null  
        }  
        public class Location {  
                private long x;  
                private int y;  
                private String name; //Строка не может быть пустой, Поле не может быть null  
        }  
        public enum UnitOfMeasure {  
                PCS,  
                MILLILITERS,  
                GRAMS;  
        } 

