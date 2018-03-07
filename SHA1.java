package sha1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1 {

        public static void main(String[] args) throws NoSuchAlgorithmException {
            String value = "longlivethequeen";
            String wanted = "783679aaebe5fbae5f4d7e2330698d543bdd153d";
            String hash = "";
            String stream = "";
            //System.out.println(sha1("longlivethequeen2000"));
            for (int x = 0; x < 10; x++) {

                for (int y = 0; y < 10; y++) {

                    for (int z = 0; z < 10; z++) {

                        for (int v = 0; v < 10; v++) {
                            stream = value + "" + x + "" + y + "" + z + "" + v;
                            hash = sha1(stream);
                            if (hash.equals(wanted)){
                                System.out.println("Hashed value = "+ hash);
                                System.out.println("Password for the hashed value is = "+ stream);
                            }
                        }
                    }
                }
            }
            System.out.println("");
            System.out.println("Run has ended between longlivethequeen0000 - longlivethequeen9999");
            System.out.println("Above are the results of found pairs.");

        }
        //Gets string input to be hashed and returns the hashed value
        //The code can be found at http://www.sha1-online.com/sha1-java/
        static String sha1(String input) throws NoSuchAlgorithmException {

            MessageDigest mDigest = MessageDigest.getInstance("SHA1");
            byte[] result = mDigest.digest(input.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < result.length; i++) {
                sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
            }

        return sb.toString();
        }
    }
