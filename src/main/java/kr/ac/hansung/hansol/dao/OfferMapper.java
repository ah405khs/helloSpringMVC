package kr.ac.hansung.hansol.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.hansol.model.Offer;

public class OfferMapper implements RowMapper<Offer>{

	@Override
	public Offer mapRow(ResultSet rs, int rewNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Offer offer = new Offer();
		
		offer.setId(rs.getInt("id"));
		offer.setName(rs.getString("name"));
		offer.setEmail(rs.getString("email"));
		offer.setText(rs.getString("text"));
		
		
		return offer;
	}
	

}
