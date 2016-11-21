#Viagogo coding test

##Running the solution

This is an Intellij project. To run it, you will need an up-to-date version of IntelliJ IDEA and JDK installed on your computer. 
I submit in this form in order to enable a full insight into how I developed the solution. 
If you prefer any other form of submission, please let me know.

##Assumptions

1. Manhattan distance from a point (a,b) to point (c, d) is equal to |a-c| + |b-d|
2. Maximum of 30 random events can be generated
3. Maximum price of a ticket is 50 dollars

##Multiple events

The solution which I developed can process any number of events with the same distance away from a user-entered point.
Thus, there is no problem to have multiple events happening at the same location.
The only issue is that in case of same location or distance away from point, there is no logical strcuture of how a decision about which item to put on top of another in proximity list.
This becomes especially siginificant with a big number of events at the same place, i.e. greater than 5.

##Scaling the solution

To cut down processign time I would look for a more effcient way to analyse distances from user-set point.
For instnace, there is no point considering an event if its x or y Manhattan distance is greater than total of the 5th stored event.
In addition, a more efficient sorting algorthm colud be used, as opposed to Collections.sort provided by Java
