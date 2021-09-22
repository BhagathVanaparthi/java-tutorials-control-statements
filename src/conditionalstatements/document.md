1) Simple if statement:
   * It is the most basic statement among all control flow statements in Java.
   * It evaluates a Boolean expression and enables the program to enter a block of code if the expression evaluates to true
  
    Syntax: 
    if(condition) {
        statement 1; //executes when condition is true
    }

2) if-else statement
   * The if-else statement is an extension to the if-statement, which uses another block of code, i.e., else block.
   * The else block is executed if the condition of the if-block is evaluated as false.
   
   Syntax:
   if(condition) {
      statement 1; //executes when condition is true
   }
   else{
      statement 2; //executes when condition is false
   } 
3) Switch Statement:
   * In Java, Switch statements are similar to if-else-if statements.
   * The switch statement contains multiple blocks of code called cases and a single case is executed based on the variable which is being switched.
   * The switch statement is easier to use instead of if-else-if statements.
   * It also enhances the readability of the program.
   
   Syntax:  
   switch(expression) {
     case x:
        // code block
         break;
     case y:
        // code block
        break;
     default:
        // code block
     }