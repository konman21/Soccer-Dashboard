package de.uni_erlangen.wi1.footballdashboard.opta_api.EVENT_INFO;

import de.uni_erlangen.wi1.footballdashboard.opta_api.API_TYPE_IDS;
import de.uni_erlangen.wi1.footballdashboard.opta_api.OPTA_Event;

/**
 * Created by knukro on 5/22/17.
 */

public class Keeper_Sweeper extends OPTA_Event
{

    public Keeper_Sweeper(boolean outcome, int period_id, int min, int sec, int playerId, int teamId, double x, double y)
    {
        super(outcome, period_id, min, sec, playerId, teamId, x, y);
    }

    @Override
    public int getID()
    {
        return API_TYPE_IDS.KEEPER_SWEEPER;
    }

    @Override
    public String getDescription()
    {
        return gov.getPlayerName(playerId, teamId) + "cleared the ball" + (outcome ? ", but possession changed" : "");
    }

}
