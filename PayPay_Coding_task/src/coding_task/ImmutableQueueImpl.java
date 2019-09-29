package coding_task;

/**
 * This is an immutable class implemented Queue class.
 * This class is written comments at check point, so please check it!
 *
 * @author Tomoya Urushibara
 *
 * @param <T> Type Wild Card.
 */
// I wrote final modifier to forbidden inheritance.
public final class ImmutableQueueImpl<T extends Object> implements Queue<T> {

	/** Immutable Queue Object. */
	private final Queue<T> queue;

	/**
	 * Constracta.
	 * @param Queue Object.
	 */
	public ImmutableQueueImpl(Queue<T> queue) {
		this.queue = queue;
	}

	/**
	 * Input Queue Object.
	 * @return queue A result element is empty or not.
	 */
	@Override
	public Queue<T> enQueue(T t) {
		queue.enQueue(t);
		return queue;
	}

	/**
	 * Remove first Queue Object.
	 * @return queue A result element is empty or not.
	 */
	@Override
	public Queue<T> deQueue() {
		queue.deQueue();
		return queue;
	}

	/**
	 * Get first Queue object.
	 * @return T Queue Object.
	 */
	@Override
	public T head() {
		T element = queue.head();
		return element;
	}

	/**
	 * Check Queue Object is emoty or not.
	 * @return boolean A result element is empty or not.
	 */
	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

}
