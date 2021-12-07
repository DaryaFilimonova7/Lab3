/*
2. Пользователь вводит с клавиатуры строчку, являющуюся паролем.
Проверить, надежно ли составлен пароль. Пароль считается надежным,
если он состоит из 8 или более символов. Символом может быть цифра,
английская буква, знак подчеркивания. Пароль должен содержать хотя бы
одну заглавную букву, одну маленькую букву и одну цифру.
*/
import java.util.Scanner;
import java.util.regex.*;
public class Lab3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Ввод пароля:
        System.out.print("Enter your password: ");
        String password = null;
        while (!in.hasNext("quit")) {
            password = in.nextLine();
            break;
        }

        // Регулярное выражение (шаблон):
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\w)(?=.*[0-9]).{8,}$");
        // Поиск подстроки,которая удовлетворяет условию:
        Matcher m = p.matcher(password);
        if (m.find( )) {
            System.out.println("The password is strong. "); // + m.group(0) );

        }else {
            System.out.println("The password is weak. Please, restart the program and try again. ");
        }

        in.close();
    }
}