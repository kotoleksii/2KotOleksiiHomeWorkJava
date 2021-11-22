package edu.itstep;

public class ArrayListUser {

    private User[] _data;
    private int _size = 0;

    public ArrayListUser() {
        _data = new User[_size];
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
        return get(_size - 1);
    }

    public void addFirst(User user) {
        User[] temp = new User[_data.length + 1];
        temp[0] = user;
        for (int i = 1; i < temp.length; i++) {
            temp[i] = _data[i - 1];
        }
        _data = temp;
        _size++;
    }

    public void addLast(User user) {
        User[] temp = new User[_data.length + 1];
        for (int i = 0; i < _data.length; i++) {
            temp[i] = _data[i];
        }
        temp[temp.length - 1] = user;
        _data = temp;
        _size++;
    }

    public void set(int index, User user) {
        checkIndex(index);
        _data[index] = user;
    }

    public void delete(int index) {
        User[] temp = new User[_data.length - 1];
        for (int i = 0; i < _data.length; i++) {
            if (i != index)
                temp[i] = _data[i];
        }
        _data = temp;
        _size--;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= _size) {
            System.out.println("Error!");
        }
    }
}
