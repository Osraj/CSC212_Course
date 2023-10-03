
**Case 1: Empty List**
- If the list is empty:
  - Create the new node.
  - Set both its `next` and `before` pointers to null.
  - Set the head of the list to the new node.

[//]: # ([Block] Insert when the list is empty gif)
![ADTList_DLL_Insert_empty](https://github.com/Osraj/CSC212_Course/assets/46506381/2666e02a-105f-460c-a9f7-ef5835a57f01)


**Case 2: Adding to the Front**
- If you want to add a node to the front of the list:
  - Create the new node.
  - Make its `next` pointer point to the current head of the list.
  - Update the `before` pointer of the old head to point back to the new node.
  - Set the new node as the new head of the list.

[//]: # ([Block] Insert when at the start of a list gif)
![ADTList_DLL_Insert_atStart](https://github.com/Osraj/CSC212_Course/assets/46506381/b6171765-71c1-4960-9b05-de4c37496acd)


**Case 3: Inserting Between Nodes**
- When inserting a node between two existing nodes:
  - Make the new node's `before` pointer point to the previous node.
  - Make its `next` pointer point to the next node.
  - Update the `next` pointer of the previous node to point to the new node.
  - Update the `before` pointer of the next node to point back to the new node.

[//]: # ([Block] Insert when at the middle of a list gif)
![ADTList_DLL_Insert_atEnd](https://github.com/Osraj/CSC212_Course/assets/46506381/43b329a1-a581-4d9f-a589-ca0c614239d4)


**Case 4: Appending at the End**
- To add a node at the end of the list:
  - Make the new node's `before` pointer point to the current last node.
  - Update the `next` pointer of the previous last node to point to the new node.
  - Set the new node as the new last node, and it should point back to the previous last node.

[//]: # ([Block] Insert when at the end of a list gif)
![ADTList_DLL_Insert_atMiddle](https://github.com/Osraj/CSC212_Course/assets/46506381/acffda72-2c4f-44e9-b773-eb50da9fbf08)
