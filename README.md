# CompareObjects
Compare object by overriding Equals method

1. Object class is the top most class that contains equals method.

2. Equality

     Flight flightOne = new Flight();
     Flight flightTwo = new Flight();

     flinghtOne == flightTwo will return false because they are two separate object and does not reference to the same object.

 3. Solution is to override the equals method provided in the Object.class

 4. Steps to override
      - Check instance
      - Cast object class to Flight.
      - Set the equal criteria.
