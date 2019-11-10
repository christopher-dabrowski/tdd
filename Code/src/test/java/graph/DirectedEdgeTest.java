package graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DirectedEdgeTest {
	@Test
	public void doNothing(){
		//Given
		Node<Integer> node1 = new Node<>(5);
		Node<Integer> node2 = new Node<>(7);

		//When
		DirectedEdge<Integer> a = new DirectedEdge<>(node1, node2);
		//Then
		assertNotNull(a);
	}
}