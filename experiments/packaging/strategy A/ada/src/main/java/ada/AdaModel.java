package ada;

import java.io.InputStream;

import modeldep.ModelDependency;

public class AdaModel implements ModelDependency {

    public InputStream getModel() {
        return this.getClass().getResourceAsStream("/ada.txt");
    }
}
