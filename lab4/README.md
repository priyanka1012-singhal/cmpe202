# CRC  Cards
CLASS: Customer

RESPONSIBILITIES:

1. Maintains Customer Details and party size
2. Maintains the state of each Customer Object
3. Implements Chain interface i.e sets next Chain (Customer) object and IF the table size is greater than or equal to its party size then either confirms or leaves 
ELSE  
Notifies the next customer in chain for processing.

COLLABORATORS:
Customer

##############
CLASS: Table

RESPONSIBILITIES:

1. Maintains the table details such as table size and state.
2. Implements subject interface. When the State changes to 'Available' notifies the Waiter class for further action


COLLABORATORS:
Waiter

#############
CLASS: Waiter

RESPONSIBILITIES:

1. Registers the customer ’s party Size and other details

2. This is observing the state of Table. When the table is 'Available'. This object is notified. Notifies the next customer in chain for processing. Based on the partysize customer takes a random call whether to Leave or Confirm. 
3. When the customer leaves. The logic goes to next customer in chain for processing otherwise the chain breaks.

Adds customer in a chain of waiting list



COLLABORATORS:
Table
Customer

#############
Explanation
Patterns used:

1. Observer Pattern
2. Chain of Responsibility 

Observer Pattern
Subject - Table
Observer - Waiter

Observer Pattern plays and important role in notifying the Waiter object when the Table object has state = 'Available'. Control then goes to the Waiter's update method to check conditions such as party size and table size for table assignment.

Chain of Responsibility Pattern
Chain interface has 2 methods setNext() and performTask()
Chain interface is implemented by Customer class. We are chaining the different objects of Customer class here. So that if the waiter notifies the customer and he chooses leave or if the table Size is smaller than the party Size then chain is set to the next customer object (or Chain object).





