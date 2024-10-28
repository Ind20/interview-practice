package problems;


public class OverrideToString {
    private final String name;
    private final String post;

    public OverrideToString(String name, String post){
        this.name = name;
        this.post = post;
    }

    @Override
    public String toString(){
        return "{\"name\" : \""+name+"\", \"post\" : \""+post+"\"}";
    }

    public static void main(String[] args) {
        OverrideToString obj = new OverrideToString("indresh", "QA");
        String str = obj.toString();
        System.out.println(str);
        System.out.println(obj);
    }
}
