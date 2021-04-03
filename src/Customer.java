
public class Customer 
{

		private int customerId;
		private String firstName;
		
		public Customer(int neuCustomerId, String neuFirstName)
		{
			setCustomerId(neuCustomerId);
			setFirstName(neuFirstName);
			
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
}
