package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import modeldep.ModelDependencyHelper;

public class MyAlgo {

    public void print(String name) throws IOException {

        InputStream model = ModelDependencyHelper.getModel(name + "Model");

        BufferedReader in = new BufferedReader(new InputStreamReader(model));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
