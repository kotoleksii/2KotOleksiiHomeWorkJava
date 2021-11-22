package edu.itstep;

public class ArrayListUser {

    private User[] _data;
    private int _size = 0;
    
    public ArrayListUser(){
        _data = new User[size];
    }

    public int size() {
        return _size;
    }

    public User get(int index) {
        checkIndex(index);
        return _data[index];
    }

    public User getFirst() {
        return get(0);
    }

    public User getLast() {
        return get(size() - 1);
    }

    public void addFirst(User user) {

    }

    public void addLast(User user) {

    }

    public void set(int index, User user) {
        checkIndex(index);
        _data[index] = user;
    }

    public void delete(int index) {
        checkIndex(index);

        for (int i = index; i < _size; i++)
            _data[i] = _data[i + 1];
        _data[_size] = null;
        _size--;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= _size) {
            System.out.println("Error!");
        }
    }
}
