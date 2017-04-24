 public class Main {
        public static void main(String[] args) {
            for (int i = 0; i < 50000; i++) {
                Main cat = new Main();
                Dog dog = new Dog();
            }
        }

        protected void finalize() throws Throwable
        {
            System.out.println("Cat was destroyed");
        }

    }

    class Dog {
        protected void finalize() throws Throwable
        {
            System.out.println("Dog was destroyed");
        }
    }
