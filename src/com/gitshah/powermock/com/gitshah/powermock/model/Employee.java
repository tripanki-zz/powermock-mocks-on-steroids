package com.gitshah.powermock.com.gitshah.powermock.model;

/**
 * Created by Ankit Tripathi on 07-07-2014.
 * For further queries/suggestions please mail at ankittripathi0000@gmail.com.
 */
public class Employee {

    public Employee() {}

    public static int count() {
        throw new UnsupportedOperationException();
    }

    public static void giveIncrementOf(int percentage) {
        throw new UnsupportedOperationException();
    }

    public void save() {
    }

    /**
     * The method that identifies if the employee
     * is not yet persisted in the DB.
     * @return true if employee is not yet
     * persisted in the DB, false otherwise.
     * Currently this method throws
     * UnsupportedOperationException
     */
    public boolean isNew() {
        throw new UnsupportedOperationException();
    }

    /**
     * This method is responsible to update
     * an existing employee's information into the DB.
     * Currently this method throws
     * UnsupportedOperationException
     */
    public void update() {
        throw new UnsupportedOperationException();
    }

    /**
     * This method is responsible to create
     * a new employee into the DB.
     * Currently this method throws
     * UnsupportedOperationException
     */
    public void create() {
        throw new UnsupportedOperationException();
    }
}
