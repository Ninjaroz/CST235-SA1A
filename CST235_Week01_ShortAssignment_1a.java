/**
 * @author Gary
 *
 */
public class CST235_Week01_ShortAssignment_1a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VideoSizeCalculator newVideo = new VideoSizeCalculator(63,"1080p");
		VideoSizeCalculator newVideo2 = new VideoSizeCalculator (102, "720p");
		System.out.println("This file is in format: " + newVideo.getType() + " and is " + newVideo.getSeconds() 
		+ " seconds long." + "\n");
		newVideo.CalculateVideoSize();
		System.out.println("\n" +"This file is in format: " + newVideo2.getType() + " and is " + newVideo2.getSeconds() 
		+ " seconds long." + "\n");
		newVideo2.CalculateVideoSize();
	}
	}
