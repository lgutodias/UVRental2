package interfaces;

import java.util.List;

public interface MembershipPlan<T> {
	
	public List<T> getAll();
	public void add(T t);
	public void delete(int index);
	public void delete(T t);
	public int size();
	public T get(int index);

}
