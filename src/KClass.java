public class KClass {
    static String addKbeforeFs(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'f' || text.charAt(i) == 'F') {
                result += 'K';
            }
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println( addKbeforeFs("fluffy"));
    }

}
