package ch.epfl.lienl.experimental.packaging.C.mygroup;

import java.io.InputStream;
import java.util.Scanner;

public class Algo {
    /* Read the input stream and return its content */
    public String process(InputStream is) {
        try (Scanner s = new Scanner(is)) {
            s.useDelimiter("\\A");
            return s.hasNext() ? s.next() : "";
        }
    }
}
