package StringLearn;

public class StringLearn {

    public static void stringDataToBeSent(String str) {
        if (str.contains("k")) {
            System.out.println(str + " " + "contains" + "  " + "k");
        }
        String[] stringArray = str.split("_");
        for(String j:stringArray)
        System.out.println("the String Array is" + "  " + j);
        System.out.println("character at 0 is"+"   "+str.charAt(0));
      str.concat("thangavel    ");
        System.out.println(str);
        System.out.println(str);
        System.out.println(str.repeat(3));
        char[] ch=str.toCharArray();
        for(int i=str.length()-1; i>=0;i--){
            System.out.print(ch[i]);
        }
        str.trim();
        System.out.println(str);
        str.strip();
        System.out.println(str);
        System.out.println(str.indexOf("k"));
    }

    public static void main(String args[]) {

        stringDataToBeSent("kart_hik     ");


    }
}
