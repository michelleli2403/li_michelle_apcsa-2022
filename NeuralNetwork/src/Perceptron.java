import java.util.Arrays;

public class Perceptron {

	private double[] weights;
	private int[] inputs;
	private int bias;
	private int threshold;
	private int learningRate;

	public Perceptron(int inputs, int threshold, int learningRate) {
		this.threshold = threshold;
		this.learningRate = learningRate;
		weights = new double[inputs];
		bias = 0;
		System.out.println("Initial weights: " + Arrays.toString(weights));
		System.out.println("Initial bias: " + bias);
		System.out.println("Threshold: " + this.threshold);
		System.out.println("Learning rate: " + this.learningRate + "\n");
	}

	public int predict(int[] inputs) {
		double z = 0;
		int activation = 0;
		for (int i = 0; i < weights.length; i++) {
			z += inputs[i] * weights[i];
		}
		z += bias;
		System.out
				.println("z = " + inputs[0] + " * " + weights[0] + " + " + inputs[1] + " * " + weights[1] + " = " + z);

		if (z > 0) {
			activation = 1;
		} else {
			activation = 0;
		}

		return activation;
	}

	public void train(int[][] trainingInputs, int[] labels) {
		int yhat=0;
		for (int i=0; i<threshold; i++) {
			System.out.println("---------Training Iteration: " + i + "-----------");
			for (int j=0; j<trainingInputs.length; j++) {
				System.out.println("Current inputs, weights, bias: " + Arrays.toString(trainingInputs[j]) + " " + Arrays.toString(weights) + " " + bias);
				yhat=predict(trainingInputs[j]);
				System.out.println("Activation(yhat) = " + yhat);
				int error = labels[j] - yhat;
				System.out.println("Error = " + labels[j] + "-" + yhat + "=" + error);
				for (int k=0; k<weights.length; k++) {
					weights[k]=learningRate*error*labels[j];
					System.out.println("Fdffff"+Arrays.toString(weights));
				}
				bias+=learningRate*error;
				System.out.println("Updated Weights: " + Arrays.toString(weights));
				System.out.println("Updated Bias: " + bias + "\n");
				
					
			}
		}
	}

	public static void main(String[] args) {
		int[][] inputMatrix = new int[4][2];

		int[] labels = new int[] { 1, 0, 0, 0 };
		inputMatrix[0][0] = 1;
		inputMatrix[0][1] = 1;
		inputMatrix[1][0] = 1;
		inputMatrix[1][1] = 0;
		inputMatrix[2][0] = 0;
		inputMatrix[2][1] = 1;
		inputMatrix[3][0] = 0;
		inputMatrix[3][1] = 0;

		Perceptron perceptron = new Perceptron(2, 10, 1);
		perceptron.train(inputMatrix, labels);

		int a = 1;
		int b = 1;
		int[] inputs = new int[] { a, b };
		System.out.println("--------- Input ---------" + Arrays.toString(inputs));
		int output = perceptron.predict(inputs);
		System.out.println("--------- Output --------" + output);
	}
}
