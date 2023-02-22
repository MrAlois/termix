package cz.monetplus.transport.termix.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import lombok.experimental.UtilityClass;

/**
 * @author Alois Šenkyřík asenkyrik@monetplus.cz
 * @version 1.0
 * Created: 22.02.2023
 */

@UtilityClass
public class DataUtils {

    public int getRandomNumber(int min, int max) throws NoSuchAlgorithmException {
        return SecureRandom.getInstanceStrong().ints(min, max)
                .findAny()
                .getAsInt();
    }
}
