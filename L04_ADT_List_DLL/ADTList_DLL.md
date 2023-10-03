when attaching nodes to a doubly-linked list there are more links, and therefore more cases to be concerned about.

(1) The list is empty. Add the incoming node to the head of the list. The next pointer and the before pointer point to nothing (null)

[//]: # ([Block] Insert when the list is empty gif)
![ADTList_DLL_Insert_empty](https://github.com/Osraj/CSC212_Course/assets/46506381/2666e02a-105f-460c-a9f7-ef5835a57f01)


(2) There is one node in the list, and we append the incoming node to the front of the list. Here we append the incoming node's next to the head of the list, and the node that was already there points the before pointer back at the incoming node.

[//]: # ([Block] Insert when at the start of a list gif)
![ADTList_DLL_Insert_atStart](https://github.com/Osraj/CSC212_Course/assets/46506381/b6171765-71c1-4960-9b05-de4c37496acd)


(3) Okay, now assume the incoming node goes in between two nodes. This is more complicated. Attach the incoming node's before to the previous node, and then attach the incoming node's next to the node that's next in the list. Now, relink the previous node's next to point at the incoming node, and then do the same with the node in front, but this time with the before link. enter image 

[//]: # ([Block] Insert when at the middle of a list gif)
![ADTList_DLL_Insert_atEnd](https://github.com/Osraj/CSC212_Course/assets/46506381/43b329a1-a581-4d9f-a589-ca0c614239d4)


(4) Okay, one last case to be concerned about. Append the incoming node at the end of the list. This is similar to appending to the front of the list, but now, we use the incoming node's back pointer to point at the previous node, and like all the other cases, don't forget to update the link at the previous node. In other words, point the previous node's next pointer at the incoming node.

[//]: # ([Block] Insert when at the end of a list gif)
![ADTList_DLL_Insert_atMiddle](https://github.com/Osraj/CSC212_Course/assets/46506381/acffda72-2c4f-44e9-b773-eb50da9fbf08)
