when attaching nodes to a doubly-linked list there are more links, and therefore more cases to be concerned about.

(1) The list is empty. Add the incoming node to the head of the list. The next pointer and the before pointer point to nothing (null)

[//]: # ([Block] Insert when the list is empty gif)
<img align="left" alt="ADTList_DLL_Insert_empty" width="400" src="L04_ADT_List_DLL/Insert()/ADTList_DLL_Insert_empty.gif">

(2) There is one node in the list, and we append the incoming node to the front of the list. Here we append the incoming node's next to the head of the list, and the node that was already there points the before pointer back at the incoming node.

enter image description here

(3) Okay, now assume the incoming node goes in between two nodes. This is more complicated. Attach the incoming node's before to the previous node, and then attach the incoming node's next to the node that's next in the list. Now, relink the previous node's next to point at the incoming node, and then do the same with the node in front, but this time with the before link. enter image description here

(4) Okay, one last case to be concerned about. Append the incoming node at the end of the list. This is similar to appending to the front of the list, but now, we use the incoming node's back pointer to point at the previous node, and like all the other cases, don't forget to update the link at the previous node. In other words, point the previous node's next pointer at the incoming node.

enter image description here
