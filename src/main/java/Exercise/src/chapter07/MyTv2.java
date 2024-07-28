package chapter07;

public class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int preChannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setChannel(int channel) {
		this.preChannel = this.channel;
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getPreChannel() {
		return preChannel;
	}

	public void setPreChannel(int preChannel) {
		this.preChannel = preChannel;
	}

	public void gotoPrevChannel() {
		int tempChannel = this.channel;
		this.channel = this.preChannel;
		this.preChannel = tempChannel;
	}
}
