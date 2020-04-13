# Object Oriented Principles

1. Identify the aspects of your application that vary and separate them from what stays the same.
                -- Take what varies and "encapsulate" it, so it wont affect the rest of your code.

2. Program to an interface, not an implementation.
                -- Gives the advantages of, programming to supertype, i.e. polymorphism.

3. Favour Composition over Inheritance.
                -- Provides Delegation Feature, results in loose coupling of component.

4. Strive for loosely coupled designs, between objects that interact.

5. Classes should be open for extension, but closed for modification.
                -- The Open Closed Principle
                
6. Depend upon abstractions, Do not depend upon concrete classes.
                -- The Dependency Inversion Principle
                
7. Principle of least knowledge: talk only to your immediate friends.
                -- For Any Objects, while designing a system, be careful the number of classes it interacts with.

8. Don't Call Us, We will Call You.
                -- The Hollywood Principle.

9. A class should have one, and only one reason to change.


# Object Oriented Patterns & Definitions

Strategy - defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy
lets the algorithm vary independently from clients that use it.

Observer - defines a one to many dependency between objects so that when one objects changes state, all
of its dependents are notified and updated automatically.

Decorator - attaches additional responsibility to an object dynamically. Decorators provide a flexible
alternative to subclassing for extending functionality.

Factory - defines an interface for creating an object, but let subclass decides which class to instantiate.
Factory method lets a class defer instantiation to the subclass.

Singleton - ensure a class only has, one and only one instance and provide a global point of access to it.

Command - encapsulates a request as an object, thereby letting you parameterize clients with different
requests, queue or log requests and support undoable operations.

Adapter - converts a interface of the class to another interface clients expects. Lets class work together
that could not because on incompatible interfaces.

Facade - provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher level
interface that makes the sub system easier to use.

Template Method - Define the skeleton of an algorithm in an operation deferring some steps to subclass.
Template Method lets subclass redefine certain steps of an algorithm without changing the algorithm
structure.

State - Allow an object to alter its behaviour when its internal state changes. The object will appear
to change its class.

Iterator - provides a way to access an element of an aggregate object sequentially without exposing
its underlying representation.

Composite - Compose objects into tree structures to represent part-whole hierarchies Composite lets client
treat individual objects and compositions of objects uniformly.  