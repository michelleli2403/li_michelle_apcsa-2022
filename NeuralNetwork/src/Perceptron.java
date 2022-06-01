import java.util.Arrays;

public class Perceptron {
	
	private int[] weights;
	private int[] inputs;
	private int bias;
	private int threshold;
	private int learningRate;
	
	public Perceptron(int inputs, int threshold, int learningRate) {
		this.threshold=threshold;
		this.learningRate=learningRate;
		weights = new int[inputs];
		bias=0;
		System.out.println("Initial weights: " + Arrays.toString(weights));
		System.out.println("Initial bias: " + bias);
		System.out.println("Threshold: " + this.threshold);
		System.out.println("Learning rate: " + this.learningRate);
	}
	
	public int predict(int[] inputs) {
		int z = 0;
		int activation = 0;
		for (int i=0; i<weights.length; i++) {
			z += inputs[i] * weights[i];
		}
		z += bias;
		System.out.println("z = " + inputs[0] + " * " + weights[0] + " + " + inputs[1] + " * " + weights[1] + " = " + z);
		
		if (z>0) {
			activation=1;
		}
		else {
			activation=0;
		}
		
		return activation;
	}
	
	public void train() {
		int yhat=0;
		int labels=0;
		for (int i=0; i<threshold; i++) {
			System.out.println("---------Training Iteration: " + i + "-----------");
			for (int j=0; j<inputs.length; j++) {
				
			}
			yhat=predict(inputs);
		}
	}
}
