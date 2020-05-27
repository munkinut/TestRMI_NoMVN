package net.munki.play.rmi.interfaces;
 
public interface Task<T> {
    T execute();
}