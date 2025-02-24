# **2025-OBJPROG-LAB025**
Week 05 - Methods in Java

Laboratory # 25 - Week 05 - Guided Coding Exercise 4: Class Methods and Class Variables (Static Members)

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 25 - Week 05 - Guided Coding Exercise 4: Class Methods and Class Variables (Static Members)**

   **Objective:**
   - Understand and use access modifiers (public, private, protected).
   - Define methods and attributes within a class.

   **File Naming Convention:**
   - `ItemDemo.java`

   **Desired Output:**
   ```txt
   Item: Laptop
   Item: Smartphone
   Item: Tablet
   Total objects created: 3
   ```

   **Notable Observations:**
   - The objectCount variable is shared by all instances of the Item class. Each time a new Item object is created, the objectCount is incremented, and this change is reflected across all objects.
   - You can call the static method displayObjectCount() directly using the class name, without needing an object instance.

   **Java Programming Best Practices:**
   - Use static variables when you want to share data across all objects of a class.
   - Use static methods to define utility functions or methods that don't operate on specific object instances.
   - Use descriptive names for static variables and methods.
      
   **Step-by-Step Instructions:**

   1. Create the Item Class
      - Create a new Java file named `ItemDemo.java`.
      - Define a class called `Item`.
      ```Java      
      class Item {
          // Code will go here
      }
      ```
            
   2. Add a Static Variable
      - Inside the Item class, declare a static variable named objectCount of type int. Initialize it to 0.
      - Use the static keyword to indicate that this variable belongs to the class itself, not to any specific object of the class.
      ```Java
      class Item {
          static int objectCount = 0;
      }
      ```

   3. Add an Instance Variable
      - Inside the Item class, declare an instance variable named itemName of type String.
      ```Java
      class Item {
          //... (static variable)...
          String itemName;
      }
      ```

   4. Create a Constructor
      - Inside the Item class, create a constructor that takes a String parameter named itemName.
      - Inside the constructor, initialize the itemName instance variable with the value of the itemName parameter.
      - Increment the static objectCount variable by 1.
      ```Java
      class Item {
          //... (variables)...
      
          public Item(String itemName) {
              this.itemName = itemName;
              objectCount++;
          }
      }
      ```

   5. Add a Static Method
      - Inside the Item class, create a static method named displayObjectCount.
      - This method should not return any value (void).
      - Use the static keyword to indicate that this method belongs to the class.
      - Inside the displayObjectCount method, add a println statement to print the value of the objectCount variable.
      ```Java
      class Item {
          //... (variables and constructor)...
      
          public static void displayObjectCount() {
              System.out.println("Total objects created: " + objectCount);
          }
      }
      ```

   6. Add an Instance Method
      - Inside the Item class, create an instance method named displayItem.
      - This method should not return any value (void).
      - Inside the displayItem method, add a println statement to print the name of the item.
      ```Java
      class Item {
          //... (other methods)...
      
          public void displayItem() {
              System.out.println("Item: " + itemName);
          }
      }
      ```

   7. Create the main Method
      - In the same file (ItemDemo.java), outside the Item class, create the main method.
      ```Java
      public class ItemDemo {
          public static void main(String[] args) {
              // Code will go here
          }
      }
      ```

   8. Create Item Objects
      - Inside the main method, create three objects of the Item class named item1, item2, and item3, each with a different item name (e.g., "Laptop", "Smartphone", "Tablet").
      ```Java
      Item item1 = new Item("Laptop");
      Item item2 = new Item("Smartphone");
      Item item3 = new Item("Tablet");
      ```
      
   9. Call the Instance and Static Methods
      - In the main method, call the displayItem() method on each of the Item objects (item1, item2, item3).
      ```Java
      item1.displayItem();
      item2.displayItem();
      item3.displayItem();
      ```
      - Call the static displayObjectCount() method using the class name: Item.displayObjectCount();
      ```Java
      Item.displayObjectCount();
      ```
      
   10. Compile and Run
       - Save the file as `ItemDemo.java`.
       - Compile the code using `javac ItemDemo.java` in your terminal or command prompt.
       - Run the compiled code using `java ItemDemo`.

   **Conclusion**
   This exercise introduced the concept of static members (class variables and class methods) in Java. Static members belong to the class itself, not to any specific object. They are shared among all instances of the class. By understanding static members, you can write more efficient and organized code, especially when dealing with data or behaviors that are common to all objects of a class.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 25"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
