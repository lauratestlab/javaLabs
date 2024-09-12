//import org.example.Mallon.TodoItem;
//import org.example.Mallon.TodoList;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
////import org.mallon.TodoItem;
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.mockito.Mock;
//import org.junit.jupiter.api.Test;
//import org.mallon.TodoItem;
//import org.mallon.TodoList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//
//public class TodoItemTest {
//    TodoItem t;
//    TodoList list;
//    @Mock
//
//    @BeforeEach
//    public void setup() {
//        t = new TodoItem("example");
//        list = new TodoList("Steven");
//
//    }
//
//
//    @Test
//    public void createNoDescription() {
//        TodoItem i = new TodoItem("Test");
//        assertEquals("", i.getDescription());
//    }
//
//    @Test
//    public void addDescription() {
//        TodoItem i = new TodoItem("Test");
//        i.setDescription("My New Todo");
//        assertEquals("My New Todo", i.getDescription());
//    }
//
//    @Test
//    public void setDescription() {
////        created a variable i that contains the constructor
////        Its set to ask for a title and in this case the title is Test
//        TodoItem i = new TodoItem("Test");
////     i.setDescription is the variable that contains the title, it is calling the SetDescription
////     And I pass Test through it to get the description
//        i.setDescription("Test");
////        The test was passed the description did not change
//        assertEquals("", i.getDescription());
//
//    }
//
//    @Test
//    public void setDescriptionDifferntTitle() {
//        //   i is the instance of the TodoItem class
//        TodoItem i = new TodoItem("Test");
////            In this test I am setting the Description to "New".
////            this is done by using the dot method to class methods from within the class
////            the setDescription was called.
//        i.setDescription("New ");
//        assertEquals("New ", i.getDescription());
//    }
//
//    @Test
//    public void setComplete() {
////      This is used to call the setComplete method
//        t.setComplete();
////      This is used to used to set the boolean value to true
//        assertTrue(t.isComplete(), "This is true");
//
//    }
//
//    @Test
//    public void setCompleteTrue() {
////      The boolean is automatically set to false
//        t.setComplete();
////       This is asserting that the boolean is
//        assertFalse(t.setComplete(), "This is false");
//    }
//
//    @Test
//    public void addTodoCheck() {
////      called the instance of the TodoList and did the dot method to call the add method and passed the instance of TodoItem which is t
//        list.addTodo(t);
////       Used asserNotNUll to ensure that the list is not empty
//        assertNotNull(list);
//    }
//
//    @Test
//    public void getAllTodos() {
////        This is the empty list is what the items will be added to.
//        List<TodoItem> itemList = new ArrayList<>();
//        itemList.add(t);
////        This is the list that contains the items.
//        list.addTodo(t);
////        This is the list that will be iterated through
//        Iterable<TodoItem> orginalList = list.getAllTodos();
//
//        System.out.println(itemList.equals(orginalList));
////        The reason why assertEquals works in this case is because the itemList and the orginialList are the same list
////        If not it could not be compared
//        assertEquals(itemList, orginalList);
//
//        assertIterableEquals(itemList, orginalList);
//    }
//    @Test
//    public void getIncompletedTodoList(){
////      called the setComplete which set to false by default
//        t.setComplete();
////      This is the list that contains the items.
//        list.addTodo(t);
//
//        Iterable<TodoItem> items = list.getTodos(false);
//        List<TodoItem> itemList = new ArrayList<>();
//        for(TodoItem toDoItem: items){
//            itemList.add(toDoItem);
//        }
////      There are no items in the list that is why it is set to zero
//        assertEquals(0, itemList.size());
//
//    }
//    @Test
//    public void getCompletedTodoList(){
//
//        t.setComplete();
//        list.addTodo(t);
//
//        Iterable<TodoItem> items = list.getTodos();
//        List<TodoItem> itemList = new ArrayList<>();
//        for(TodoItem toDoItem: items){
//            itemList.add(toDoItem);
//        }
////      There are no items in the list that is why it is set to one
//        assertEquals(0, itemList.size());
//
//    }
//}

