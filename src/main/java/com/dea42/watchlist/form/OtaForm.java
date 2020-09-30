package com.dea42.watchlist.form;

import java.io.Serializable;


import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Ota;

import com.dea42.watchlist.entity.Account;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: ota Form <br>
 * Description: Class for holding data from the ota table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.4.1<br>
 * @version 1.0.0<br>
 */

public class OtaForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer atticant;
	private Integer chan;
    @Length(max=9)
	private String channelname;
	private BigDecimal channelnumber;
    @Length(max=17)
	private String channelnumberchannelnameincluded;
    @Length(max=31)
	private String comments;
    @Length(max=4)
	private String direction;
    @Length(max=3)
	private String enabled;
    @Length(max=9)
	private String fccinfo;
    @Length(max=6)
	private String fccinfolink;
	private Integer freq;
	private Integer id;
    @Length(max=2)
	private String lang;
	private Integer listed;
	private Integer mytivoavgstrength;
    @Length(max=8)
	private String network;
    @Length(max=3)
	private String off;
    @Length(max=41)
	private String recommendedantenna;
    @Length(max=5)
	private String rez;
    @Length(max=20)
	private String shelfant;
    @Length(max=9)
	private String station;
	private Integer subchan;
    @Length(max=4)
	private String tvfoolestsignal;
	private Account account;
    @Length(max=4)
	private String watchable;

	/**
	 * Basic constructor
	 */
	public OtaForm() {
	}

	/**
	 * Clones Ota obj into form
	 *
	 * @param obj
	 */
	public static OtaForm getInstance(Ota obj) {
		OtaForm form = new OtaForm();
		form.setAtticant(obj.getAtticant());
		form.setChan(obj.getChan());
		form.setChannelname(obj.getChannelname());
		form.setChannelnumber(obj.getChannelnumber());
		form.setChannelnumberchannelnameincluded(obj.getChannelnumberchannelnameincluded());
		form.setComments(obj.getComments());
		form.setDirection(obj.getDirection());
		form.setEnabled(obj.getEnabled());
		form.setFccinfo(obj.getFccinfo());
		form.setFccinfolink(obj.getFccinfolink());
		form.setFreq(obj.getFreq());
		form.setId(obj.getId());
		form.setLang(obj.getLang());
		form.setListed(obj.getListed());
		form.setMytivoavgstrength(obj.getMytivoavgstrength());
		form.setNetwork(obj.getNetwork());
		form.setOff(obj.getOff());
		form.setRecommendedantenna(obj.getRecommendedantenna());
		form.setRez(obj.getRez());
		form.setShelfant(obj.getShelfant());
		form.setStation(obj.getStation());
		form.setSubchan(obj.getSubchan());
		form.setTvfoolestsignal(obj.getTvfoolestsignal());
		form.setAccount(obj.getAccount());
		form.setWatchable(obj.getWatchable());
		return form;
	}
	/**
	 * returns value of the AtticAnt column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getAtticant() {
		if (atticant == null)
	    	return 0;
		return atticant.intValue();
	}

	/**
	 * sets value of the AtticAnt column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setAtticant(Integer newVal) {
		atticant = newVal;
	}

	/**
	 * returns value of the Chan column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getChan() {
		if (chan == null)
	    	return 0;
		return chan.intValue();
	}

	/**
	 * sets value of the Chan column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setChan(Integer newVal) {
		chan = newVal;
	}

	/**
	 * returns value of the ChannelName column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getChannelname() {
		return channelname;
	}

	/**
	 * sets value of the ChannelName column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 9
	 */
	public void setChannelname(String newVal) {
		channelname = newVal;
	}

	/**
	 * returns value of the ChannelNumber column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public BigDecimal getChannelnumber() {
		if (channelnumber == null)
	    	return BigDecimal.ZERO;
		return channelnumber;
	}

	/**
	 * sets value of the ChannelNumber column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setChannelnumber(BigDecimal newVal) {
		channelnumber = newVal;
	}

	/**
	 * returns value of the ChannelNumberChannelNameIncluded column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getChannelnumberchannelnameincluded() {
		return channelnumberchannelnameincluded;
	}

	/**
	 * sets value of the ChannelNumberChannelNameIncluded column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 17
	 */
	public void setChannelnumberchannelnameincluded(String newVal) {
		channelnumberchannelnameincluded = newVal;
	}

	/**
	 * returns value of the Comments column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * sets value of the Comments column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 31
	 */
	public void setComments(String newVal) {
		comments = newVal;
	}

	/**
	 * returns value of the Direction column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * sets value of the Direction column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4
	 */
	public void setDirection(String newVal) {
		direction = newVal;
	}

	/**
	 * returns value of the Enabled column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getEnabled() {
		return enabled;
	}

	/**
	 * sets value of the Enabled column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 3
	 */
	public void setEnabled(String newVal) {
		enabled = newVal;
	}

	/**
	 * returns value of the FccInfo column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFccinfo() {
		return fccinfo;
	}

	/**
	 * sets value of the FccInfo column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 9
	 */
	public void setFccinfo(String newVal) {
		fccinfo = newVal;
	}

	/**
	 * returns value of the FccInfoLink column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getFccinfolink() {
		return fccinfolink;
	}

	/**
	 * sets value of the FccInfoLink column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 6
	 */
	public void setFccinfolink(String newVal) {
		fccinfolink = newVal;
	}

	/**
	 * returns value of the Freq column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getFreq() {
		if (freq == null)
	    	return 0;
		return freq.intValue();
	}

	/**
	 * sets value of the Freq column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setFreq(Integer newVal) {
		freq = newVal;
	}

	/**
	 * returns value of the id column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getId() {
		if (id == null)
	    	return 0;
		return id.intValue();
	}

	/**
	 * sets value of the id column of this row of data
	 * default value for this field set by the DB is null
	 * This is the primary key for this table
	 */
	public void setId(Integer newVal) {
		id = newVal;
	}

	/**
	 * returns value of the Lang column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * sets value of the Lang column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 2
	 */
	public void setLang(String newVal) {
		lang = newVal;
	}

	/**
	 * returns value of the Listed column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getListed() {
		if (listed == null)
	    	return 0;
		return listed.intValue();
	}

	/**
	 * sets value of the Listed column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setListed(Integer newVal) {
		listed = newVal;
	}

	/**
	 * returns value of the MyTivoAvgStrength column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getMytivoavgstrength() {
		if (mytivoavgstrength == null)
	    	return 0;
		return mytivoavgstrength.intValue();
	}

	/**
	 * sets value of the MyTivoAvgStrength column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setMytivoavgstrength(Integer newVal) {
		mytivoavgstrength = newVal;
	}

	/**
	 * returns value of the Network column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * sets value of the Network column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 8
	 */
	public void setNetwork(String newVal) {
		network = newVal;
	}

	/**
	 * returns value of the Off column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getOff() {
		return off;
	}

	/**
	 * sets value of the Off column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 3
	 */
	public void setOff(String newVal) {
		off = newVal;
	}

	/**
	 * returns value of the RecommendedAntenna column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRecommendedantenna() {
		return recommendedantenna;
	}

	/**
	 * sets value of the RecommendedAntenna column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 41
	 */
	public void setRecommendedantenna(String newVal) {
		recommendedantenna = newVal;
	}

	/**
	 * returns value of the Rez column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getRez() {
		return rez;
	}

	/**
	 * sets value of the Rez column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 5
	 */
	public void setRez(String newVal) {
		rez = newVal;
	}

	/**
	 * returns value of the ShelfAnt column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getShelfant() {
		return shelfant;
	}

	/**
	 * sets value of the ShelfAnt column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 20
	 */
	public void setShelfant(String newVal) {
		shelfant = newVal;
	}

	/**
	 * returns value of the Station column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getStation() {
		return station;
	}

	/**
	 * sets value of the Station column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 9
	 */
	public void setStation(String newVal) {
		station = newVal;
	}

	/**
	 * returns value of the SubChan column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Integer getSubchan() {
		if (subchan == null)
	    	return 0;
		return subchan.intValue();
	}

	/**
	 * sets value of the SubChan column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setSubchan(Integer newVal) {
		subchan = newVal;
	}

	/**
	 * returns value of the TvFoolEstSignal column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getTvfoolestsignal() {
		return tvfoolestsignal;
	}

	/**
	 * sets value of the TvFoolEstSignal column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4
	 */
	public void setTvfoolestsignal(String newVal) {
		tvfoolestsignal = newVal;
	}

	/**
	 * returns value of the Userid column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * sets value of the Userid column of this row of data
	 * default value for this field set by the DB is null
	 */
	public void setAccount(Account newVal) {
		account = newVal;
	}

	/**
	 * returns value of the Watchable column of this row of data
	 *
	 * @return value of this column in this row
	 */
	public String getWatchable() {
		return watchable;
	}

	/**
	 * sets value of the Watchable column of this row of data
	 * default value for this field set by the DB is null
	 * This field has a max length of 4
	 */
	public void setWatchable(String newVal) {
		watchable = newVal;
	}

	/**
	 * Returns a String showing the values of this bean - mainly for debuging
	 *
	 * @return String
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Ota [");
		builder.append("atticant=").append(atticant);
		builder.append(", chan=").append(chan);
		builder.append(", channelname=").append(channelname);
		builder.append(", channelnumber=").append(channelnumber);
		builder.append(", channelnumberchannelnameincluded=").append(channelnumberchannelnameincluded);
		builder.append(", comments=").append(comments);
		builder.append(", direction=").append(direction);
		builder.append(", enabled=").append(enabled);
		builder.append(", fccinfo=").append(fccinfo);
		builder.append(", fccinfolink=").append(fccinfolink);
		builder.append(", freq=").append(freq);
		builder.append(", id=").append(id);
		builder.append(", lang=").append(lang);
		builder.append(", listed=").append(listed);
		builder.append(", mytivoavgstrength=").append(mytivoavgstrength);
		builder.append(", network=").append(network);
		builder.append(", off=").append(off);
		builder.append(", recommendedantenna=").append(recommendedantenna);
		builder.append(", rez=").append(rez);
		builder.append(", shelfant=").append(shelfant);
		builder.append(", station=").append(station);
		builder.append(", subchan=").append(subchan);
		builder.append(", tvfoolestsignal=").append(tvfoolestsignal);
		builder.append(", account=").append(account);
		builder.append(", watchable=").append(watchable);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((atticant == null) ? 0 : atticant.hashCode());
		result = prime * result + ((chan == null) ? 0 : chan.hashCode());
		result = prime * result + ((channelname == null) ? 0 : channelname.hashCode());
		result = prime * result + ((channelnumber == null) ? 0 : channelnumber.hashCode());
		result = prime * result + ((channelnumberchannelnameincluded == null) ? 0 : channelnumberchannelnameincluded.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + ((enabled == null) ? 0 : enabled.hashCode());
		result = prime * result + ((fccinfo == null) ? 0 : fccinfo.hashCode());
		result = prime * result + ((fccinfolink == null) ? 0 : fccinfolink.hashCode());
		result = prime * result + ((freq == null) ? 0 : freq.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result + ((listed == null) ? 0 : listed.hashCode());
		result = prime * result + ((mytivoavgstrength == null) ? 0 : mytivoavgstrength.hashCode());
		result = prime * result + ((network == null) ? 0 : network.hashCode());
		result = prime * result + ((off == null) ? 0 : off.hashCode());
		result = prime * result + ((recommendedantenna == null) ? 0 : recommendedantenna.hashCode());
		result = prime * result + ((rez == null) ? 0 : rez.hashCode());
		result = prime * result + ((shelfant == null) ? 0 : shelfant.hashCode());
		result = prime * result + ((station == null) ? 0 : station.hashCode());
		result = prime * result + ((subchan == null) ? 0 : subchan.hashCode());
		result = prime * result + ((tvfoolestsignal == null) ? 0 : tvfoolestsignal.hashCode());
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((watchable == null) ? 0 : watchable.hashCode());
		return result;
	}

	/**
	 * Mainly for mock testing
	 *
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ota other = (Ota) obj;

		if (getAtticant() == null) {
			if (other.getAtticant() != null)
				return false;
		} else if (!getAtticant().equals(other.getAtticant()))
			return false;

		if (getChan() == null) {
			if (other.getChan() != null)
				return false;
		} else if (!getChan().equals(other.getChan()))
			return false;

		if (getChannelname() == null) {
			if (other.getChannelname() != null)
				return false;
		} else if (!getChannelname().equals(other.getChannelname()))
			return false;

		if (getChannelnumber() == null) {
			if (other.getChannelnumber() != null)
				return false;
		} else if (!getChannelnumber().equals(other.getChannelnumber()))
			return false;

		if (getChannelnumberchannelnameincluded() == null) {
			if (other.getChannelnumberchannelnameincluded() != null)
				return false;
		} else if (!getChannelnumberchannelnameincluded().equals(other.getChannelnumberchannelnameincluded()))
			return false;

		if (getComments() == null) {
			if (other.getComments() != null)
				return false;
		} else if (!getComments().equals(other.getComments()))
			return false;

		if (getDirection() == null) {
			if (other.getDirection() != null)
				return false;
		} else if (!getDirection().equals(other.getDirection()))
			return false;

		if (getEnabled() == null) {
			if (other.getEnabled() != null)
				return false;
		} else if (!getEnabled().equals(other.getEnabled()))
			return false;

		if (getFccinfo() == null) {
			if (other.getFccinfo() != null)
				return false;
		} else if (!getFccinfo().equals(other.getFccinfo()))
			return false;

		if (getFccinfolink() == null) {
			if (other.getFccinfolink() != null)
				return false;
		} else if (!getFccinfolink().equals(other.getFccinfolink()))
			return false;

		if (getFreq() == null) {
			if (other.getFreq() != null)
				return false;
		} else if (!getFreq().equals(other.getFreq()))
			return false;

		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;

		if (getLang() == null) {
			if (other.getLang() != null)
				return false;
		} else if (!getLang().equals(other.getLang()))
			return false;

		if (getListed() == null) {
			if (other.getListed() != null)
				return false;
		} else if (!getListed().equals(other.getListed()))
			return false;

		if (getMytivoavgstrength() == null) {
			if (other.getMytivoavgstrength() != null)
				return false;
		} else if (!getMytivoavgstrength().equals(other.getMytivoavgstrength()))
			return false;

		if (getNetwork() == null) {
			if (other.getNetwork() != null)
				return false;
		} else if (!getNetwork().equals(other.getNetwork()))
			return false;

		if (getOff() == null) {
			if (other.getOff() != null)
				return false;
		} else if (!getOff().equals(other.getOff()))
			return false;

		if (getRecommendedantenna() == null) {
			if (other.getRecommendedantenna() != null)
				return false;
		} else if (!getRecommendedantenna().equals(other.getRecommendedantenna()))
			return false;

		if (getRez() == null) {
			if (other.getRez() != null)
				return false;
		} else if (!getRez().equals(other.getRez()))
			return false;

		if (getShelfant() == null) {
			if (other.getShelfant() != null)
				return false;
		} else if (!getShelfant().equals(other.getShelfant()))
			return false;

		if (getStation() == null) {
			if (other.getStation() != null)
				return false;
		} else if (!getStation().equals(other.getStation()))
			return false;

		if (getSubchan() == null) {
			if (other.getSubchan() != null)
				return false;
		} else if (!getSubchan().equals(other.getSubchan()))
			return false;

		if (getTvfoolestsignal() == null) {
			if (other.getTvfoolestsignal() != null)
				return false;
		} else if (!getTvfoolestsignal().equals(other.getTvfoolestsignal()))
			return false;

		if (getAccount() == null) {
			if (other.getAccount() != null)
				return false;
		} else if (!getAccount().equals(other.getAccount()))
			return false;

		if (getWatchable() == null) {
			if (other.getWatchable() != null)
				return false;
		} else if (!getWatchable().equals(other.getWatchable()))
			return false;

		return true;
	}

}