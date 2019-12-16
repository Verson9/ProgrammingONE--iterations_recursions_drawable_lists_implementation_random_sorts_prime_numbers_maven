class Cat {
    int age;
    String name;
    static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public static int getNumberOfCats() {
        if(counter > 5){
            for(int i = 5; i < counter;i++){
                System.out.println("You have too many cats");
            }
        }
        return counter;

    }
}