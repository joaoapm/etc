package com.boot.das_boot;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.das_boot.controller.ShipwreckController;
import com.boot.das_boot.model.Shipwreck;
import com.boot.das_boot.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController sc;

	@Mock
	private ShipwreckRepository shipwreckRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testShipwreckGet() {
		Shipwreck shipwreck = new Shipwreck();
		shipwreck.setId(1l);
		when(shipwreckRepository.findOne(1l)).thenReturn(shipwreck);


		Shipwreck sw = sc.get(1l);
		
		verify(shipwreckRepository).findOne(1l);
		
		//assertEquals(1l, sw.getId().longValue());
		assertThat(sw.getId(), is(1l));

	}
}
