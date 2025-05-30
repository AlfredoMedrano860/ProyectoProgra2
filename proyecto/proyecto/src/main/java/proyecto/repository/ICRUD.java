package proyecto.repository;

import java.util.ArrayList;

public interface ICRUD <T>{
    public T add(T element);
    public ArrayList<T>getAll();
    public T update(T element);
    public T edit(T element);
    public T delete(String id);
    public T search(String id);
}
