class Static{
         //static method
        public static void greet(){
            System.out.println("Hello Coders");
        }
        public static void main(String[] args) {
            //calling static method
            greet();
            //using the class name
            Static.greet();
        }

    }
//java program to demonstrate static method
/*Static methods belong to the class,
not its objects, and they are stored in the Permanent Generation Space
of the heap. Their local variables and arguments are stored in the stack.
hey can be called without creating an instance of the class,
using ClassName.methodName(args). */