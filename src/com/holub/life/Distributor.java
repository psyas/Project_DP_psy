package com.holub.life;

import com.holub.tools.Publisher;

import javax.swing.*;

public abstract class Distributor {
    public abstract void deliverTo( Object subscriber );

    //dohyun strategy pattern
    public static class TickDistributor extends Distributor
    {
        private boolean menuIsActive()
        {	MenuElement[] path =
                MenuSelectionManager.defaultManager().getSelectedPath();
            return ( path != null && path.length > 0 );
        }
        public void deliverTo( Object subscriber )
        {	if( !menuIsActive() )
            ((Clock.Listener)subscriber).tick();
        }


    }

    public static class NotifyDistributor extends Distributor
    {
        String arg;
        public NotifyDistributor(String arg){
            this.arg = arg;
        }
        public void deliverTo( Object subscriber )
        {	//((Publisher.Test.Observer)subscriber).notify(arg);
        }

    }



}
									// "visit" method.
