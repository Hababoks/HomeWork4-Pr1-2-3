public class Main {
    public static void main(String[] args) {
        String s = "I study Basic Java!";
        System.out.println(s.charAt(0));
        System.out.println(s.length() -1);
        System.out.println(s.charAt(18));
        boolean old = s.contains("Java");
        System.out.println("String contains 'Java' : " + old);
        old = s.contains("Jaga");
        System.out.println("String contains 'Jaga' : " + old);
        System.out.println(s.replace("a", "o"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(14 ,18));

    }
}
