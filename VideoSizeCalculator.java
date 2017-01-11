import java.io.Serializable;

/**
 * 
 */

/**
 * @author Gary
 *
 */
public class VideoSizeCalculator implements Serializable {
	// instance variables
		private int seconds;
		private String type;	
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + seconds;
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			return result;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			VideoSizeCalculator other = (VideoSizeCalculator) obj;
			if (seconds != other.seconds)
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}
		// No argument constructor
		public VideoSizeCalculator(){
			super();
		}
		// Argument constructor
		public VideoSizeCalculator(int sec, String format){
			seconds = sec;
			type = format;
		}
		/**
		 * @return the seconds
		 */
		public int getSeconds() {
			return seconds;
		}
		/**
		 * @param seconds the seconds to set
		 */
		public void setSeconds(int seconds) {
			this.seconds = seconds;
		}
		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}
		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}
		/**
		 * 
		 * @param seconds
		 * @param Type
		 * Calculates file size 16 mb for 1080p and 1.6 mb for 720p per frame for 30 frames
		 */
		public void CalculateVideoSize(){
			if (type.equals("1080p") == true){	
				System.out.println("File is: " + seconds * Math.pow(30, 2) * 16 + "MB in size." + "\n"
				+ "File is " + seconds * Math.pow(30, 2) * 16 / 1000 + "GB in size.");	
				return;
			}
			System.out.println("File is: " + seconds * Math.pow(30, 2) * 1.6 + "MB in size." + "\n"
			+ "File is " + seconds * Math.pow(30, 2) * 1.6 / 1000 + "GB in size.");
			return;
		}
}
