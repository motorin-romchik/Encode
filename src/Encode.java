public class Encode {
    public static void main(String args[]){
        String msg = "This is a test message";
        String encmsg = "", decmsg = "";
        int key = 8899;

        System.out.println("Исходное сообщение: \n "+ msg);

        //шифровка
        for (int i =0 ; i < msg.length(); i++){
            encmsg = encmsg + (char)(msg.charAt(i) ^ key);
        }
        System.out.println("Зашифрованное сообщение:\n "+ encmsg);
        //дешифровка
        for (int i = 0; i < msg.length();i++){
            decmsg = decmsg + (char)(encmsg.charAt(i)^key);
        }
        System.out.println("Расшифровка: \n"+ decmsg);
    }
}
