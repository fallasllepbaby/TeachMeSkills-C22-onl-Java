public class RAM {
    private String name;

    private int size;

    public RAM(String name, int size){
        this.name = name;
        this.size = size;
    }

    public RAM(){

    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void getInformation(){
        System.out.println("RAM name - " + this.getName());
        System.out.println("RAM size - " + this.getSize());
        System.out.println();
    }
}
