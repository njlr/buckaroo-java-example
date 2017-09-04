public final class Hello {

    public String getGreeting(String name) {
        return "Hello, " + name + ". ";
    }

    public static void main(String[] args) {
        final Hello hello = new Hello();
        System.out.println(hello.getGreeting("world"));
    }

}
