class SuperMethod extends SuperClassEx {
    public SuperMethod() {
        super("Java");
    }

    public static void main(String[] args) {
        SuperMethod superMethod = new SuperMethod();
    }
}

class SuperClassEx {
    SuperClassEx(String name) {
        System.out.println("This constructor received name argument " + name);
    }
}
