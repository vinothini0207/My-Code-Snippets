package com.let_code_kaushik;

public class YouTuber_5 {
	
	private void deleteVideo(String videoId) {
		System.out.println("Deleted video: "+videoId);
	}
	private void deleteVideo(int videoId) {
		System.out.println("Deleted video: "+videoId);
	}
	
	public void createVideo(){
		System.out.println("Video created.");
	}
	
	private boolean uploadVideo() {
		System.out.println("Uploading.....");
		return true;
	}
	
	public String shareVideo() {
		return "facebook";
	}
	public static void main(String[] args) {
		YouTuber_5 yt=new YouTuber_5();
		yt.deleteVideo("vino21@");
		yt.deleteVideo(5);
		yt.uploadVideo();
	}

}
