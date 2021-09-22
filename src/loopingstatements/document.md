1) For Loop:
   * The Java for loop is used to iterate a part of the program several times. 
   * If the number of iteration is fixed, it is recommended to use for loop.
  
    Syntax:
    for(initialization; condition; increment/decrement){    
        //statement or code to be executed    
    }

   * Initialization: It is the initial condition which is executed once when the loop starts.
                     Here, we can initialize the variable, or we can use an already initialized variable. 
                    It is an optional condition.
   * Condition: It is the second condition which is executed each time to test the condition of the loop.
                It continues execution until the condition is false. It must return boolean value either true or false. 
                It is an optional condition.
   * Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
   * Statement: The statement of the loop is executed each time until the second condition is false.

3) While Loop:
   * The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true.
     As soon as the Boolean condition becomes false, the loop automatically stops.

   * The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to use the while loop.

   Syntax:  
   while (condition){    
      //code to be executed   
      Increment / decrement statement  
   }
4) do while loop:
   * The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true.
     If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.
   
   Syntax:  
   do{    
      //code to be executed / loop body  
      //update statement   
   }while (condition);  