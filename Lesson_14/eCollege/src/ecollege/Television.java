package ecollege;

/**
 * @author Denis Cechina
 */
public class Television {

    private int channel, volumeLevel;
    protected boolean on_off;

    {
        channel = 1;
        volumeLevel = 1;
        on_off = false;
    }

    public Television(int channel, int volumeLevel, boolean on_off) {
        if (channel > 0 && channel <= 120) {
            this.channel = channel;
        } else {
            System.out.println("Something went wrong please try one more time!");
        }

        if (volumeLevel > 0 && volumeLevel <= 7) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("Something went wrong please try one more time!");
        }

        if (on_off == true) {
            this.on_off = on_off;
        } else {
            this.on_off = false;
        }
    }

    public void setChannel(int newChannel) {
        if (this.on_off == true && newChannel > 0 && newChannel <= 120) {
            this.channel = newChannel;
        } else {
            System.out.println("Something went wrong please try one more time!");
        }
    }

    public int getChannel() {
        return this.channel;
    }

    public void setVolume(int newVolumeLevel) {
        if (this.on_off == true && newVolumeLevel > 0 && newVolumeLevel <= 7) {
            this.volumeLevel = newVolumeLevel;
        } else {
            System.out.println("Something went wrong please try one more time!");
        }
    }

    public int getVolume() {
        return this.volumeLevel;
    }

    public void setOn_Off(boolean on_off) {
        if (on_off == true) {
            this.on_off = on_off;
        } else {
            this.on_off = false;
        }
    }

    public boolean getOn_Off() {
        return this.on_off;
    }

    public void channelUp() {
        if (this.on_off == true && this.channel < 120) {
            this.channel++;
        } else {
            System.out.println("The maximul channel number reached (120)");
        }
    }

    public void channelDown() {
        if (this.on_off == true && this.channel > 1) {
            this.channel--;
        } else {
            System.out.println("The minimum channel number reached (1)");
        }
    }

    public void volumeUp() {
        if (this.on_off == true && this.volumeLevel < 7) {
            this.volumeLevel++;
        } else {
            System.out.println("The maximun volume level reached (7)");
        }
    }

    public void volumeDown() {
        if (this.on_off == true && this.volumeLevel > 1) {
            this.volumeLevel--;
        } else {
            System.out.println("The minimum volume level reached (1)");
        }
    }

    @Override
    public String toString() {
        return "Channel = " + this.channel + ", Volume Level = "
                + this.volumeLevel + ", On = " + this.on_off;
    }
}
