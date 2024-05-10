package model;

import java.awt.Color;

public class mymodel {
	private Color text;
	private Color background;
	private boolean hienthi;

	public mymodel() {

		this.text = Color.BLACK;
		this.background = Color.WHITE;
		this.hienthi = true;

	}

	public Color getText() {
		return text;
	}

	public void setText(Color text) {
		this.text = text;
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}

	public boolean isHienthi() {
		return hienthi;
	}

	public void setHienthi(boolean hienthi) {
		this.hienthi = hienthi;
	}

}
