import java.lang.Math;

public class ActivationRELU {

  public double[] forward(double[] inputs) {
    double[] outputs = new double[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      outputs[i] = Math.max(0, inputs[i]);
    }
    return outputs;
  }

  public double[][] forward(double[][] inputs) {
    double[][] outputs = new double[inputs.length][inputs[0].length];
    for (int i = 0; i < inputs.length; i++) {
      for (int k = 0; k < inputs[i].length; k++) {
          outputs[i][k] = Math.max(0, inputs[i][k]);
      }
    }
    return outputs;

  }

}
