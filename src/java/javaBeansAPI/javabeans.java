/**
 * importing a few methods from the javabeans api
 */
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
*
* @author aaron.fonseca, kristoffer.hayes, ronald.pearl
*/

public class CST213_Mini_Project_Question_2 {
	
  public static void main(String[] argv) throws Exception {

	// create java.beans introspector 
    BeanInfo myBean = Introspector.getBeanInfo(MyBean.class);
    
    // create array of java beans properties
    PropertyDescriptor[] PropDes = myBean.getPropertyDescriptors();
    for (int i = 0; i < PropDes.length; i++) {
      String propName = PropDes[i].getDisplayName();
      System.out.println(propName); // Print out all properties from bean.
    }

  }
}


@SuppressWarnings("serial")
class MyBean implements java.io.Serializable {
	
	private String name = "Mini-CLC";
	private int age = 32;
	
  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
	  this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
	    this.name = name;
	  }

}

   