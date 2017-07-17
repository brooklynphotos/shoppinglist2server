package photos.brooklyn.shoppinglist.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Priority {
	HIGH((short)1),MEDIUM((short)2),LOW((short)3),UNIMPORTANT((short)4);
	
	private short level;

	private Priority(short level) {
		this.level = level;
	}
	
	@JsonValue
	public short getLevel() {
		return level;
	}
}
