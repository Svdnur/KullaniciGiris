import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String userName, password1, password2;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz:");
        userName = input.nextLine();

        if (userName.equals("patika")) {

            System.out.println("Şifrenizi giriniz:");
            password1 = input.nextLine();

            if (password1.equals("java123")) {

                System.out.println("Doğru giriş yaptınız.");

            } else {

                System.out.println("Yanlış giriş yaptınız.");
                System.out.println("Şifrenizi değiştirmek istiyorsanız 1 'e basınız.");

                select = input.nextInt();

                if (select != 1) {
                    System.out.println("Giriş yapamadınız.");
                }

                System.out.println("Lütfen yeni şifrenizi giriniz:");

                password2 = input.nextLine();


                if (password2.equals("java123")) {

                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                } else {

                    System.out.println("Yeni şifreniz oluşturuldu.");
                }


            }

        } else {
            System.out.println("Kullanıcı adını yanlış girdiniz");
        }
    }
}
