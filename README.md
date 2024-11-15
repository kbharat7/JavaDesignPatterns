# JavaDesignPatterns
I am documentingm my learnings of Java Design Patterns, Credits: CodeDecode Youtube Channel https://www.youtube.com/@CodeDecode/videos
1. Factory Design Pattern : com.learn.design.patterns.factorydesignpattern<br/>
We do not want to expose the creational logic to the client and we create object using a standard interface.<br>
It is also known as a Virtual Constructor<br>

Steps:
Create a main class which calls the factory class
Factory class returns the required class instance


Main Class -> Factory Class -> Profession (“Engineer”, “Doctor”, “Teacher”)

2. Abstract Factory Design Pattern : com.learn.design.patterns.abstractfactorydesignpattern<br/>
We have a double layer of Abstraction<br>
The factors too are abstracted over a factory<br>
This Factory is called as Factory of Factories<br>
Lets a class return a factory of classes<br>
So, it is 1 level higher than Factory pattern<br>
Steps:<br>
Main -> Factory of Factory class(Abstract Factory class) -> (this internally classes Factory producer) -> Then, the factory class returns required instance


