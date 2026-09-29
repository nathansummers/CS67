What really helped me understand the use of polymorphism was the example of drivers and vehicles from the reading. The ability to use a single variable that could change classes will make it much easier to write flexible and reusable code.    

What I changed:
    Added heating and cooling to the planets
    Added atmosphere for planets and habitability for all celestial bodies
    Added default constructors for planets and stars

Method overloading and overriding:
    New default constructors for planets and stars use method overloading
    Habitability check for planets uses method overriding, so that planets need a breathable atmosphere and correct temperature to be habitable, while stars need the correct mass to support planets 