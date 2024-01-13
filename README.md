The Difference between abstract class and interface.

Abstract class->
An abstract class is a class that cannot be instantiated on its own and typically contains one or more abstract methods.

Real world analogy
Imagine you are building a zoo management system. You have different animals like lions, elephants, and giraffes.
An abstract class, let's call it Animal, can represent common features like eat and makeSound. However, since each 
animal makes a different sound, you declare makeSound as an abstract method. Concrete animal classes, like Lion and 
Elephant, will extend Animal and provide their specific makeSound implementations.


An interface->
This is a contract of methods that must be implemented by classes that implement the interface.
It declares the method signatures hence doesn't contain any implementation by itself.
Interface is declared using the 'interface' keyword.

Real world anology
Now, consider a remote control scenario. You have various electronic devices like TVs, air conditioners, and sound
systems. An interface, say RemoteControl, defines methods like turnOn and turnOff. Each electronic device, regardless
of its type, can implement this interface to ensure they all have these basic functionalities.
