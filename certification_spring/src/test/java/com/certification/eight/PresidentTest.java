package com.certification.eight;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PresidentTest {

	@Test
	public void testBrazilPresident() {
		List<President> presidents = new ArrayList<>();
		presidents.add(new President("Bozo", false, 67));
		presidents.add(new President("Dilma", true, 54));

		President pres = presidents.stream().filter(p -> p.isPrepared() == false).collect(Collectors.toList()).get(0);
		assertTrue(pres.getNamePresident().equals("Bozo"));
		
		Long countNumber = presidents.stream().filter(p -> p.isPrepared() == false).count();
		log.info(countNumber.toString());
		
		
		List<President> ps = presidents.stream().filter(p -> p.isPrepared() == false).limit(1).collect(Collectors.toList());
		log.info(ps.get(0).getNamePresident());
		
		List<President>listCompare = presidents.stream().sorted((p1,p2)-> p1.getNamePresident().compareTo(p2.getNamePresident()))
				.collect(Collectors.toList());
		
		listCompare.forEach(p-> log.info(p.getNamePresident() + " names"));
		
		President maxAge = presidents.stream().min(Comparator.comparing(President :: getAge)).get();
		log.info(maxAge.getNamePresident() + " : MAX AGE");
	}
}
