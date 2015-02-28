package bob;

import java.io.InputStream;

import modeldep.ModelDependency;

public class BobModel implements ModelDependency {

    public InputStream getModel() {
        return this.getClass().getResourceAsStream("/bob.txt");
    }
}
