package ch.epfl.lienl.experimental.packaging.C.mygroup;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;

import org.junit.Test;

public class AppTest {

    @Test
    public void test() {
        InputStream is = ModelProxy.getStream("file.txt");

        Algo myAlgo = new Algo();
        assertEquals("Hello, Ada!", myAlgo.process(is));
    }

}