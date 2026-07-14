package com.kodewala.set.hashset;

class Employee {
	
		private String name;

		public Employee(String name) {
			super();
			// TODO Auto-generated constructor stub
			this.name = name;
		}
		
		public boolean equals(Object obj) {
			
			Employee e = (Employee) obj;
			return this.name.equals(obj);
		}
	
}
