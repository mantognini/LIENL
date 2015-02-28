package modeldep;

import java.io.IOException;
import java.io.InputStream;

public class ModelDependencyHelper {

    /**
     * @param modelId
     *            the name of the class implementing {@link ModelDependency}
     * @return the model
     * @throws IOException
     */
    public static InputStream getModel(String modelId) throws IOException {

        try {
            @SuppressWarnings("unchecked")
            Class<ModelDependency> modelDependency = (Class<ModelDependency>) Class
                    .forName(modelId);
            return modelDependency.newInstance().getModel();

        } catch (ClassNotFoundException e) {
            throw new IOException("no model with id " + modelId);
        } catch (Exception e) {
            throw new IOException("could not get model with id " + modelId, e);
        }
    }
}
