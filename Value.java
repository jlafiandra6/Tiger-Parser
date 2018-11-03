import java.util.*;
import java.lang.*;
public class Value {

	// if name is null then this object is a constant value
	// if name != null but type is empty or null this object is a function header
	// if name != null and type > 1 this object is a record
	private String name;
	private String type;
	private Object content;
	private String returnType;
	private Object paramType;


	//Constant
	public Value(Object content) {
		this.content = content;
	}

	//Record
	public Value(String name, String type) {
		this.name = name;
		this.type = type;
	}


	//Regular single value
	public Value(String name, String type, Object content) {
		this.name = name;
		this.type = type;
		this.content = content;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Object getContent() {
		return this.content;
	}
	public void setContent(Object content) {
		 this.content = content;
	}

	public String getType() {
		return this.type;
	}
	public String getRetType() {
		return this.returnType;
	}
	public void setType(String type) {
	 	this.type = type;
	}

	public Object getParams() {
		return this.paramType;
	}
	public void setParams(Object params) {
		this.paramType = params;
	}
	public void setReturn(String returnType) {
		this.returnType = returnType;
	}


    @Override
    public String toString() {
        return name;
    }
}
