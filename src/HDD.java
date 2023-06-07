public class HDD {
    private String name;

    private int size;

    private String type;

    public HDD(String name, int size, String type){
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public HDD(){

    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getInformation(){
        System.out.println("HDD name - " + this.getName());
        System.out.println("HDD size - " + this.getSize());
        System.out.println("HDD type - " + this.getType());
        System.out.println();
    }
}

