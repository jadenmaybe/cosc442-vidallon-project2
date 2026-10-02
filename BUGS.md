1. in VendingMachine.java line 64, the for loop iterates through i <= NUM_SLOTS when it should be i < NUM_SLOTS to prevent an
   ArrayIndexOutOfBoundsException
2. in VendingMachine.java line 161, the if statement was comparing amount < 1 instead of amount < 0, which should be allowed 
   as stated in the comments for the method. (throw vendingMachineException if amount < 0). This caused valid amounts, such as 0.25, to
   throw an exception.