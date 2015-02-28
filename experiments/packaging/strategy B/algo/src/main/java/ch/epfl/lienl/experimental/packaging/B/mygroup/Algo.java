package ch.epfl.lienl.experimental.packaging.B.mygroup;

import java.io.InputStream;
import java.util.Scanner;

public class Algo {
    /* Read the input stream and return its content */
    String process() {
        InputStream is = ModelProxy.getStream("file.txt");

        try (Scanner s = new Scanner(is)) {
            s.useDelimiter("\\A");
            return s.hasNext() ? s.next() : "";
        }
    }
}
