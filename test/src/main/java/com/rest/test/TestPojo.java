	package com.rest.test;
	
	public class TestPojo {
		public String getProperty() {
			return property;
		}
	
		public void setProperty(String property) {
			this.property = property;
		}
	
		String property;
	
		@Override
		public String toString() {
			return "Property: " + property;
		}
	
	}
