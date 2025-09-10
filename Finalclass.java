/*when a class is declared with the final keyword in java , it is called a final class.
 * A final class cannot be extended(inherited)
 */
final class A
{
     // methods and fields
}
// The following class is illegal
class B extends A 
{ 
    // COMPILE-ERROR! Can't subclass A
}

public class Finalclass {
    
}
