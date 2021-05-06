package OOP__;

public class What_are_the_OOP_Concepts_in_Java {
    /*
    What are the OOP Concepts in Java? (oopis)
  ● There are four components: Encapsulation, Inheritance, Abstraction and Polymorphism.
  ● Encapsulation: (Encis)
    ○ It is hiding data by making the variables private and giving them public access with getters and setters.
    ○ In my project: I created multiple POJO/BEAN classes(Json to java (Gson, Jakson )) in order to manage test data and actual data.
     EX: I take JSON from API response and convert to object of my POJO class all variables are private with getters and setter.
      Also in order to store credentials or sensitive data in my framework I have used encapsulation, configuration
      reader also known as property file or excel sheet to hide data from the outside world to get access.
      I use Apache POI in the data store in Excel in order to extract/read and modify data.
  ● Inheritance Inhis,inher, Inheritanceis)
    ○ It is used to build is-a relationship between parent and child classes using extends keyword.
    Inheritance allows sub class to inherit the features (fields and methods) of parent class,
    but parent class cannot inherit anything from child class.
    And also child class cannot inherit Constructor from parent class, because Constructor
    name should be the same with class name
    IS A relation: inherited relations between parent and child class
    ○ In my project, I have an abstract BasePage class. It is used as the parent/super class for all of the page classes
     since it’s extended by all page classes. For example, it initializes PageFactory and contains common global web elements/methods.
     I have wait UntilLoaderScreenDisappear(), navigateToModule (String tab, String module), etc.
 ●  Abstraction: (Absis, Abstractionis)
    ○ It is about hiding the implementation but showing the functionality only. Abstraction helps us to focus on what
    the object does instead of how it does it. It displays just the essential things to the user and hides the internal information.
    Two ways to achieve abstraction in Java: Abstract classes (partial abstraction) and interface (full/pure abstraction).
    In Page Object Model design pattern, we write locators (such as id, name, xpath etc.,) in a Page Class.
    We utilize these locators in tests but wecan’tsee these locators in the tests.
    Literally we hide the locators from the tests.
 INTERFACE: (INTis) Basic statement we all know in Selenium is WebDriver driver = new FirefoxDriver() and WebDriver
 itself is an Interface. WebDriver is an Interface and FirefoxDriver is a class.
 ●  Polymorphism: (Polis,polyis, Polymorphismis)
    ○ It is performing one single action/method in different ways or forms. Polymorphism implemented with method overloading and overriding.
    ○ In my project, I use implicit wait in Selenium. Implicit wait is an example of method overloading.
    In Implicit wait I use different parameters like SECONDS, MINUTES, HOURS etc.,
    I am using as method overriding In my project: I override .toString(), .equals(), and .hashCode() methods.

     */
}
