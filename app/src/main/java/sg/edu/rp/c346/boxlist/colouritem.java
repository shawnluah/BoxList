package sg.edu.rp.c346.boxlist;

/**
 * Created by 17010564 on 24/7/2018.
 */

public class colouritem {
    private boolean isOrange;
    private boolean isBlue;
    private boolean isBrown;

    public colouritem(boolean isOrange, boolean isBlue, boolean isBrown) {
        this.isOrange = isOrange;
        this.isBlue = isBlue;
        this.isBrown = isBrown;
    }

    public boolean isOrange() {
        return isOrange;
    }

    public void setOrange(boolean orange) {
        isOrange = orange;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }

    public boolean isBrown() {
        return isBrown;
    }

    public void setBrown(boolean brown) {
        isBrown = brown;
    }
    @Override
    public String toString() {
        return ""+ isBlue + "" + isOrange+ "" + isBrown;
    }
}
