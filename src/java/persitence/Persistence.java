/**
 * A few classes showing the persistence of a JavaBean
 */

package persitence;


/**
 * EXAMPLE 1: 
 * 
 * Creating persistence automatically for the entire Bean by
 * implementing the Serializable interface.
 */
public class Persistence implements java.io.Serializable {
    
    private String name;
    private transient String email;     // This will not be serialized
    
    public Persistence() {}
    
    //...

}

/**
 * EXAMPLE 2: 
 * 
 * Creating persistence selectively with a file format, you can implement 
 * the Externalizable interface.
 */
class Persistence2 implements java.io.Externalizable {
    
    private String name;
    private String email;
    
    public Persistence2() {}
    
    //...
    
    @Override
    public void readExternal(java.io.ObjectInput r) {
        
    }
    
    @Override
    public void writeExternal(java.io.ObjectOutput w) {
        
    }
}