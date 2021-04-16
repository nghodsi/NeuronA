import java.util.*;

public class NeuronA {


	public static void main (String [] args) {
		double[] arr = {0, 0.2, 0.4, 0.5, 0.6, 0.8, 1};
		for (int i = 0; i < arr.length; i++){
			System.out.println ("Input:" + arr[i] + " Out:" + neuron(arr[i]));
		}
	}

	public static double neuron (double input){
		double y;
		if (input <= 0.5){
			y = input;
		}
		else{
			y = 1 - input;
		}
		return y/2;
	}
}