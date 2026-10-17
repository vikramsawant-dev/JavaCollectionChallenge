import java.util.*;

public class JavaCollectionChallenge 
{

    static Scanner sc = new Scanner(System.in);

    // ArrayList Challenge
    static void arrayListChallenge() 
    {
        ArrayList<String> books = new ArrayList<>();

        while (true) 
        {
            System.out.println("\n--- ArrayList Challenge ---");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Update Element");
            System.out.println("4. Search Element");
            System.out.println("5. Display Elements");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter choice: ");

            int choice = readInt();

            switch (choice)
            {
                case 1:

                    System.out.print("Enter book name: ");
                    books.add(sc.nextLine());

                    System.out.println("Book added successfully.");
                    break;

                case 2:

                    System.out.print("Enter book name to remove: ");
                    
                    String removeBook = sc.nextLine();

                    if (books.remove(removeBook))
                        System.out.println("Book removed successfully.");
                    else
                        System.out.println("Book not found.");
                    break;

                case 3:

                    System.out.print("Enter index to update: ");
                    int index = readInt();

                    if (index >= 0 && index < books.size()) 
                    {
                        System.out.print("Enter new book name: ");
                        
                        books.set(index, sc.nextLine());

                        System.out.println("Book updated successfully.");
                    } 
                    else 
                    {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book name to search: ");

                    String searchBook = sc.nextLine();

                    if (books.contains(searchBook))
                        System.out.println("Book found.");
                    else
                        System.out.println("Book not found.");
                    break;

                case 5:

                    System.out.println("Books: " + books);
                    break;

                case 6:

                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }

    // HashMap Challenge
    static void hashMapChallenge() 
    {
        HashMap<Integer, String> students = new HashMap<>();

        while (true) 
        {
            System.out.println("\n--- HashMap Challenge ---");
            System.out.println("1. Insert Student");
            System.out.println("2. Retrieve Student");
            System.out.println("3. Update Student");
            System.out.println("4. Check Key");
            System.out.println("5. Display All Students");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter choice: ");

            int choice = readInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter student ID: ");

                    int id = readInt();
                    System.out.print("Enter student name: ");

                    String name = sc.nextLine();

                    students.put(id, name);
                    System.out.println("Student inserted successfully.");
                    break;

                case 2:

                    System.out.print("Enter student ID: ");

                    id = readInt();
                    if (students.containsKey(id))
                        System.out.println("Student: " + students.get(id));
                    else
                        System.out.println("Student not found.");
                    break;

                case 3:

                    System.out.print("Enter student ID to update: ");
                    
                    id = readInt();
                    if (students.containsKey(id)) 
                    {
                        System.out.print("Enter new name: ");

                        students.put(id, sc.nextLine());
                        System.out.println("Student updated successfully.");
                    } 
                    else 
                    {
                        System.out.println("Student ID not found.");
                    }
                    break;

                case 4:

                    System.out.print("Enter student ID: ");
                    id = readInt();

                    System.out.println(students.containsKey(id)
                            ? "Key exists."
                            : "Key does not exist.");
                    break;

                case 5:

                    if (students.isEmpty()) 
                    {
                        System.out.println("No students available.");
                    } 
                    else 
                    {
                        for (Map.Entry<Integer, String> entry
                                : students.entrySet()) 
                        {
                            System.out.println(
                                "ID: " + entry.getKey()
                                + ", Name: " + entry.getValue());
                        }
                    }
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Queue Challenge
    static void queueChallenge() 
    {
        Queue<String> queue = new LinkedList<>();

        while (true) 
        {
            System.out.println("\n--- Queue Challenge ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Peek Front Item");
            System.out.println("4. Display Queue");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter choice: ");

            int choice = readInt();

            switch (choice) 
            {
                case 1:

                    System.out.print("Enter customer name: ");
                    queue.offer(sc.nextLine());

                    System.out.println("Item added to queue.");
                    break;

                case 2:

                    String removed = queue.poll();

                    if (removed == null)
                        System.out.println("Queue is empty.");
                    else
                        System.out.println("Removed item: " + removed);
                    break;

                case 3:

                    String front = queue.peek();

                    if (front == null)
                        System.out.println("Queue is empty.");
                    else
                        System.out.println("Front item: " + front);
                    break;

                case 4:

                    System.out.println("Queue: " + queue);
                    break;

                case 5:

                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }

    // Safe integer input
    static int readInt() 
    {
        while (true) 
        {
            try 
            {
                int value = Integer.parseInt(sc.nextLine().trim());
                return value;
            } 
            catch (NumberFormatException e) 
            {
                System.out.print("Invalid input. Enter an integer: ");
            }
        }
    }

    // Main Method
    public static void main(String[] args) 
    {
        while (true) 
        {
            System.out.println("\n===== JAVA COLLECTIONS CHALLENGE =====");
            System.out.println("1. ArrayList Challenge");
            System.out.println("2. HashMap Challenge");
            System.out.println("3. Queue Challenge");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt();

            switch (choice) 
            {
                case 1:

                    arrayListChallenge();
                    break;

                case 2:

                    hashMapChallenge();
                    break;

                case 3:

                    queueChallenge();
                    break;

                case 4:

                    System.out.println("Program terminated successfully.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
