# CRC  Cards
CLASS: Customer

RESPONSIBILITIES:
Maintains Customer Details
Maintains the state of each Customer Object
Implements Chain interface i.e sets next Chain (Customer) object and IF the table size is greater than or equal to customer’s party size then Notifies the customer, 
ELSE  then
Notifies the next customer in chain for processing.

COLLABORATORS:
Chain
State
WaitState
LeaveState
ConfirmState

##############
CLASS: WaitState

RESPONSIBILITIES:
Randomly assign next state (LeaveState or ConfirmState) to the customer object in chain
Notifies the next customer in chain for processing 

COLLABORATORS:

##############
CLASS: LeaveState

RESPONSIBILITIES:

Notifies the next customer in chain that the table is available

COLLABORATORS:

##############
CLASS: ConfirmState

RESPONSIBILITIES:

Assigns the table to the customer.

COLLABORATORS:

##############
CLASS: Table

RESPONSIBILITIES:

Bean class maintains the table details such as table size and state

COLLABORATORS:

#############
CLASS: Waiter

RESPONSIBILITIES:

Registers the customer ’s party Size and other details

Adds customer in a chain of waiting list

Returns the next available table

Notifies the next customer in chain for processing when the table is available. 

COLLABORATORS:
List of Table (Tables)
Chain

#############
Explanation
Patterns used:
1. State Pattern
2. Chain of Responsibility 

State Pattern
WaitState
LeaveState
ConfirmState

State pattern plays an important role in changing the customer state and performing state wise logic. when the customer is in waitState upon notification he can either be in a LeaveState or ConfirmState. When Customer is in a ConfirmState then the table is assigned to him otherwise another customer is notified.

Chain of Responsibility Pattern
Chain interface has 2 methods setNext() and performTask()
Chain interface is implemented by Customer class. We are chaining the different objects of Customer class here. So that if the waiter notifies the customer and he chooses leaveState or if the table Size is smaller than the party Size then chain is set to the next customer object (or Chain object).





