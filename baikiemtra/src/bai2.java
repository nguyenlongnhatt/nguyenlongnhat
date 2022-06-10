public class bai2 {
    public static void main(String[] args) {
        String str = "You only live once, but if you do it right, once is enough";
        char kyTu='o';
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("số từ trong chuỗi là : " + count);


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            } else if (str.indexOf(i) == kyTu) {

            }
            System.out.println("vị trí xuất hiện ký tự o là: " + str.indexOf(i));
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + str + " = " + count);

    }
}





