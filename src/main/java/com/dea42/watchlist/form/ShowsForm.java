package com.dea42.watchlist.form;

import com.dea42.watchlist.entity.Shows;
import com.dea42.watchlist.utils.MessageHelper;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Title: shows Form <br>
 * Description: Class for holding data from the shows table for editing. <br>
 * Copyright: Copyright (c) 2001-2021<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.1<br>
 * @version 0.7.1<br>
 */

@Data
public class ShowsForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Length(max=56)
	private String cancelled;
    @Length(max=47)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String epguidesshowname;
	private Integer id;
    @Length(max=47)
	private String incanceledas;
    @Length(max=10)
	private String lastshow;
    @Length(max=14)
	private String network;
    @Length(max=43)
	private String premiere;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date premieredate;
    @Length(max=56)
	private String status;
    @Length(max=47)
	private String tivoname;

	/**
	 * Clones Shows obj into form
	 *
	 * @param obj
	 */
	public static ShowsForm getInstance(Shows obj) {
		ShowsForm form = new ShowsForm();
		if (obj != null) {
			form.setCancelled(obj.getCancelled());
			form.setEpguidesshowname(obj.getEpguidesshowname());
			form.setId(obj.getId());
			form.setIncanceledas(obj.getIncanceledas());
			form.setLastshow(obj.getLastshow());
			form.setNetwork(obj.getNetwork());
			form.setPremiere(obj.getPremiere());
			form.setPremieredate(obj.getPremieredate());
			form.setStatus(obj.getStatus());
			form.setTivoname(obj.getTivoname());
		}
		return form;
	}
}
