
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author toshiba
 */
public class BcryptTest {

    @Test
    public void encrypt() {
        String encoded = new BCryptPasswordEncoder().encode("admin");
        System.out.println(encoded);
    }

    @Test
    public void matchEncrypt() {
        boolean encoded = new BCryptPasswordEncoder().matches("admin", "$2a$10$YYa4lMRxLnmFnG8Rc4ZQVOzTz4rFwdGhQjlG5yZ9C0zDzYgymPorC");
        System.out.println(encoded);
    }

}
