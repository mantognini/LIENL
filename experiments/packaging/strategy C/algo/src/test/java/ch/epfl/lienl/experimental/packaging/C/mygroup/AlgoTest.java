package ch.epfl.lienl.experimental.packaging.C.mygroup;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

public class AlgoTest {

    @Test
    public void test() {
        String content = "Hi, Algo";
        InputStream is = new ByteArrayInputStream(content.getBytes());

        Algo myAlgo = new Algo();
        assertEquals(content, myAlgo.process(is));
    }

}
