package com.github.maven.example;

/**
 * Simple wigdet class that can be enabled or disabled
 */
public class Widget {

	private boolean enabled;

	/**
	 * Create new enabled widget
	 */
	public Widget() {
		enabled = true;
	}

	/**
	 * Is the widget currently enabled?
	 *
	 * @return true if enabled, false otherwise
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Set the widget enable state
	 *
	 * @param enabled
	 * @return this widget
	 */
	public Widget setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	/**
	 * Is the widget currently enabled?
	 *
	 * @return true if enabled, false otherwise
	 */
	public boolean testIsEnabled() {
		return enabled;
	}
	/**
	 * Set the widget enable state
	 *
	 * @param enabled
	 * @return this widget
	 */
	public Widget testSetEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}
	
	/**
	*This method checks if a day is Friday.	
	*/
	public static boolean checkFriday(String indate)throws ParseException{
		Calendar date = getDate(indate);
		boolean isF = date.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
		System.out.println(date.getTime());
		return isF;				
	}
}
