import java.util.*;
import java.lang.*;
public class Value {

	// if name is null then this object is a constant value
	// if name != null but type is empty or null this object is a function header
	// if name != null and type > 1 this object is a record
	private String name;
	private ArrayList<Object> type;
	private Object content;
	private Object returnType;
	private ArrayList<Object> paramType;


	//Constant
	public Value(Object content) {
		this.content = content;
	}

	//Record
	public Value(String name, ArrayList<Object> type) {
		this.name = name;
		this.type = type;
	}

	//Function
	public Value(String name, Object returnType, ArrayList<Object> paramType) {
		this.name = name;
		this.returnType = returnType;
		this.paramType = paramType;
	}

	//Regular single value
	public Value(String name, Object type, Object content) {
		this.name = name;
		this.type.add(0, type);
		this.content = content;
	}

	//Pointer to another Value
	public Value(Value value) {
		this = value;
	}
	

    @Override
    public String toString() {
        return name;
    }
}
