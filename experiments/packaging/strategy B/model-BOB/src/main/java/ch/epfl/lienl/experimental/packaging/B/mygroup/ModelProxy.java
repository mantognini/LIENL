package ch.epfl.lienl.experimental.packaging.B.mygroup;

import java.io.InputStream;

// This class should not be edited in model subversion
public final class ModelProxy {
    static public ClassLoader getLoader() {
        return ModelProxy.class.getClassLoader();
    }

    static public InputStream getStream(String filepath) {
        return getLoader().getResourceAsStream(filepath);
    }
}
