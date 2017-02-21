package nineinfosys.photography;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import nineinfosys.photography.Cameratypes.Cameratypes;
import nineinfosys.photography.Category.Category;
import nineinfosys.photography.Exposure.Exposure;
import nineinfosys.photography.Rules.Rules;


public class Pager extends FragmentStatePagerAdapter {


    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;

    }

    public Pager(FragmentManager fm) {
        super(fm);

    }

    //Overriding method getItem
   @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
       String title = "";
        switch (position) {
            case 0:
                Category tab1 = new Category();

                return tab1;
            case 1:
                Cameratypes tab2 = new Cameratypes();
                return tab2;
            case 2:
                Exposure tab3 = new Exposure();
                return tab3;
            case 3:
                Rules tab4 = new Rules();
                return tab4;
            case 4:
                Tips tab5 = new Tips();
                return tab5;

            default:
                return null;
        }

    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}