import java.io.*;
import java.util.*;

public class TigerSymbolTable {
	private Map<String, Object> table = new HashMap<String, Object>();
	private TigerSymbolTable parent = null;

	public TigerSymbolTable(Map<String, Object> table) {
		this.table = table;
	}

	public TigerSymbolTable() {

	}

	public Map<String, Object> getTable() {
		return table;
	}

	public Object assign(String name, Object value) {
		return table.put(name, value);
	}

	public void setParent(TigerSymbolTable parent) {
		this.parent = parent;
	}

	public boolean hasParent() {
		if (this.parent == null)
			return false;
		return true;
	}

	public TigerSymbolTable getParent() {
		return this.parent;
	}

	public boolean isLocal(String varName) {
		return table.containsKey(varName);
	}

	public Object getValue(String varName) {
		if (table.containsKey(varName)) {
			return table.get(varName);
		}
		if (this.hasParent()) {
			return getParent().getValue(varName);
		}
		return null;
	}

	public Object removeLocally(String varName) {
		return table.remove(varName);
	}

	public Object undefine(String name) {
		Object undefinedObject = null;
	    if (table.containsKey(name)){
	      undefinedObject = table.remove(name);
	    }

	    if (hasParent())
	    {
	      Object parentTableRemovedElement = getParent().undefine(name);
	      if (undefinedObject == null)
	      {
	        undefinedObject = parentTableRemovedElement;
	      }
	    }

	    return undefinedObject;
	}
	//Deleting scope would be done in Visitor by assiging current scope pointer
	//to its parent
	public TigerSymbolTable newScope() {
		TigerSymbolTable scope = new TigerSymbolTable();
		scope.setParent(this);
		return scope;
	}
}
