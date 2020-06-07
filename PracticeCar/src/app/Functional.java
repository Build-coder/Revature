package app;

// CarPart should implement a Functional interface
public interface Functional {

    // which declares a method "function()"
    void function();
}

/**
 * 1. No variables are allowed to be declared by the interface
 * 
 * 2. An interface is about actions that are allowed, not about data
 *    or implementation of those actions
 * 
 * 3. The keyword public is not placed in front of the function prototypes
 *    By def, all functions listed in an interface must be public functions
 * 
 * 4. There is no code after the function prototype. The normal {} are
 *    replaced with a single semi-colon
 */