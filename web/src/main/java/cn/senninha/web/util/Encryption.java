package cn.senninha.web.util;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 加密方法
 */
public class Encryption {
    public String salt;
    public String password;
    private static Logger logger = LoggerFactory.getLogger(Encryption.class);

    private Encryption() {

    }

    // 生成加密
    public static Encryption encryption(String password) {
        Encryption encryption = new Encryption();
        try {
            String src = new String(password.getBytes(), "utf-8");
            String base64str = Base64.encodeBase64String(src.getBytes());
            byte[] saltSrc = new byte[src.getBytes().length];
            SecureRandom random = new SecureRandom();
            random.nextBytes(saltSrc);
            encryption.salt = new String(saltSrc, "utf-8");
            String md5 = DigestUtils.md5Hex(base64str + encryption.salt);
            encryption.password = md5;

        } catch (UnsupportedEncodingException e) {
            logger.error("加密出错:{}", e);
        }
        return encryption;
    }

    // 验证密码正确与否
    public static boolean verification(String loginPassword, String password, String salt) {
        if (StringUtils.isEmpty(loginPassword) || StringUtils.isEmpty(password) || StringUtils.isEmpty(salt)) {
            return false;
        }
        String base64str = Base64.encodeBase64String(loginPassword.getBytes());
        String md5 = DigestUtils.md5Hex(base64str + salt);
        if (md5.equals(password)) {
            return true;
        }
        return false;
    }
}