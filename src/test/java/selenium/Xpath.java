//package selenium;
//
//public class Xpath {
////    Xpath=//tagname[@attribute='value'];
////    Xpath=//input[@name='uid']
////    Xpath=//input[@type='text']
////    Xpath=//label[@id='message23']
////    Xpath=//input[@value='RESET']
////    Xpath=//*[@class='barone']
////    Xpath=//a[@href='http://demo.guru99.com/']
////    Xpath=//img[@src='//guru99.com/images/home/java.png']
////    Xpath=//*[contains(@name,'btn')]
////    Xpath=//*[contains(@id,'message')]
////    Xpath=//*[contains(text(),'here')]
////    Xpath=//*[contains(@href,'guru99.com')]
////    Xpath=//*[@type='submit' or @name='btnReset']
////    Xpath=//input[@type='submit' and @name='btnLogin']
////    Xpath=//label[starts-with(@id,'message')]
////    Xpath=//td[text()='UserID']
////    Xpath=//*[@type='text']//following::input
////    Xpath=//*[@type='text']//following::input[1]
////    Xpath=//*[text()='Enterprise Testing']//ancestor::div
////    Xpath=//*[text()='Enterprise Testing']//ancestor::div[1]
////    Xpath=//*[@id='java_technologies']//child::li
////    Xpath=//*[@type='submit']//preceding::input
////    Xpath=//*[@type='submit']//following-sibling::input
////    Xpath=//*[@id='rt-feature']//parent::div
////    Xpath =//*[@type='password']//self::input
////    Xpath=//*[@id='rt-feature']//descendant::a
//
//
//    /*
//     *    31 August 2024
//     *    Indresh Maurya
//     *    Sr Test Automation Engineer
//     */
//
//    class Animal {
//        public void greet() {
//            System.out.println("Hello");
//        }
//    }
//
//    class Cat extends Domestic {
//        public void greet() {
//            System.out.println("Meow");
//        }
//    }
//
//    class Domestic {
//        public void greet() {
//            System.out.println("Domestic");
//        }
//    }
//
//
//    public class Main {
//
//        public static void main(String[] args) {
//            Domestic c = new Cat();
//            greet(c);
//        }
//
//        public static void greet(Animal c) {
//            c.greet();
//        }
//
//    }
//
////-----------
//
//    Constructor?
//
//    Object <> Class
//
//    class abstract Starwars {
//        Starwars() {
//            System.out.println("In Starwars");
//        }
//    }
//
//    class Force extends Starwars{
//        String name;
//
//        Force(String name) {
//            // this.name = name;
//            super();
//        }
//
//        public static void main(String[] args) {
//            Force luke = new Force(“Luke”);
//            System.out.println(“Hello ” + luke.name);
//        }
//
//    }
//
////-----------
//
//    Abstract Class?
//
//    Arrays?
//
//    String[] str = {"Hello", "Indresh", "Maurya"};
//
//    str[str.length] => AIOB
//
//    str[0] = {"hello", "again"};
//
//    str => {{"hello", "again"}, "Indresh", "Maurya"};
//
//
//    Object obj = {"Hello", 'I', 1, 3, false, 32};
//
//
//    String immutable =>
//
//    String name = "Indresh";
//
//    name = name.concat("Maurya");
//
//    name => IndreshMaurya
//
//    List?
//
//    List<?> aList = new ArrayList<?>();
//aList.add("Indresh");
//
//aList.size();
//
//aList.add(2, "Maurya");
//
//    aList =>
//
//    Map =>
//
//    HashMap hm<S,I> = {{"One", 1},{"Two", 2},{"One", 3}, {null, null}};
//
//hm.get(null); => NPE, null
//
//
//    Exceptions
//
//    public static void main(String[] args) {
//        try {
//            int a = 0;
//            int b = 5;
//            int c = b / a;
//        } catch (Exception e) {
//            e.printStackTrace();  xxx
//        } catch (IOException e2) {
//            e2.printStackTrace();
//        } catch (ArithmeticException e3) {
//            e3.printStackTrace(); XXX
//        }
//    }
//
//throws, try..catch
//
//    public void anError throws Exception{
//        int c = 5/0;
//    }
//
//    public void anError {
//        try{
//            int c = 5/0;
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//
//// ---------------------
//
//    findByElement   => WE   => ENFE
//    findByElements  => <WE> => ENFE
//
// <div>
//	<ul>
//    <li>One</li>
//    <li>Two</li>   X select
//    <li id=‘three’>Three</li>
//  </ul>
//</div>
//
//    xpath/css => text (Two), Index [2]
////li[@id='three']
//
//
//// PageFactory
//
//    @FindBy
//
//    Parallel Execution
//
//    Selenium Grid
//
//    Waits > Selenium
//
//    @beforeclass
//    Implicit Wait -> 5s
//
//    @test
//    Explicit Wait -> 3s
//
//    element -> ??s  3s
//
//    DesiredCapabilities?
//
//    StaleElementReferenceException
//
//
//    pom.xml
//
//    headers >
//
//}
