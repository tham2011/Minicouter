package controler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.myview;

public class mycontroler implements ActionListener {
	private myview vi;

	public mycontroler(myview vi) {

		this.vi = vi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button.equals("red text")) {
			vi.changerText(Color.RED);
		} else if (button.equals("yellow text")) {
			vi.changerText(Color.YELLOW);

		} else if (button.equals("green text")) {
			vi.changerText(Color.GREEN);
		} else if (button.equals("red backgroud")) {
			vi.changerBackgroud(Color.RED);
		} else if (button.equals("yellow backgroud")) {
			vi.changerBackgroud(Color.YELLOW);

		} else if (button.equals("green backgroud")) {
			vi.changerBackgroud(Color.GREEN);
		}

	}

}
