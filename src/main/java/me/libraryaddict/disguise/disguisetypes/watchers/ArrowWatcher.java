package me.libraryaddict.disguise.disguisetypes.watchers;

import me.libraryaddict.disguise.disguisetypes.Disguise;
import me.libraryaddict.disguise.disguisetypes.FlagWatcher;
import me.libraryaddict.disguise.disguisetypes.MetaIndex;

public class ArrowWatcher extends FlagWatcher {
    public ArrowWatcher(Disguise disguise) {
        super(disguise);
    }

    public boolean isCritical() {
        return getData(MetaIndex.ARROW_CRITICAL) == 1;
    }

    public void setCritical(boolean critical) {
        setData(MetaIndex.ARROW_CRITICAL, (byte) (critical ? 1 : 0));
        sendData(MetaIndex.ARROW_CRITICAL);
    }
}
