package ch.epfl.lienl.experimental.packaging.C.mygroup;

import java.io.InputStream;

public final class ModelProxy {
    static public ClassLoader getLoader() {
        return ModelProxy.class.getClassLoader();
    }

    static public InputStream getStream(String filepath) {
        return getLoader().getResourceAsStream(filepath);
    }
}