package reflectionproblems.basiclevel.getclassinformation;

class SampleClass {
    private int id;
    private String name;

    public SampleClass() {
    }

    public SampleClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    private void secretMethod() {
        System.out.println("This is a private method.");
    }

}
