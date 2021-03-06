/* Copyright (C) Kais Dukes, 2009.
 * 
 * This file is part of JQuranTree.
 * 
 * JQuranTree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * JQuranTree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with JQuranTree. If not, see <http://www.gnu.org/licenses/>.
 */

package org.jqurantree.arabic.encoding.buckwalter;

import static org.junit.Assert.assertEquals;

import org.jqurantree.arabic.ArabicTextBuilder;
import org.jqurantree.arabic.CharacterType;
import org.jqurantree.arabic.DiacriticType;
import org.junit.Test;

public class ExtendedBuckwalterEncodingTest {

	@Test
	public void testAlifWithHamzaAbove() {

		// Anamta.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Alif + Fatha + HamzaAbove
		builder.add(CharacterType.Alif, DiacriticType.Fatha,
				DiacriticType.HamzaAbove);

		// Noon + Sukun
		builder.add(CharacterType.Noon, DiacriticType.Sukun);

		// Ain + Fatha
		builder.add(CharacterType.Ain, DiacriticType.Fatha);

		// Meem + Sukun
		builder.add(CharacterType.Meem, DiacriticType.Sukun);

		// Ta + Fatha
		builder.add(CharacterType.Ta, DiacriticType.Fatha);

		// Validate.
		assertEquals(">anoEamota", builder.toText().toBuckwalter());
	}

	@Test
	public void testWawWithHamzaAbove() {

		// Yominoon.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Ya + Damma
		builder.add(CharacterType.Ya, DiacriticType.Damma);

		// Waw + Sukun + HamzaAbove
		builder.add(CharacterType.Waw, DiacriticType.Sukun,
				DiacriticType.HamzaAbove);

		// Meem + Kasra
		builder.add(CharacterType.Meem, DiacriticType.Kasra);

		// Noon + Damma
		builder.add(CharacterType.Noon, DiacriticType.Damma);

		// Waw
		builder.add(CharacterType.Waw);

		// Noon + Fatha
		builder.add(CharacterType.Noon, DiacriticType.Fatha);

		// Validate.
		assertEquals("yu&ominuwna", builder.toText().toBuckwalter());
	}

	@Test
	public void testAlifWithHamzaBelow() {

		// Eyaaka.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Alif + Kasra + HamzaBelow
		builder.add(CharacterType.Alif, DiacriticType.Kasra,
				DiacriticType.HamzaBelow);

		// Ya + Fatha + Shadda
		builder
				.add(CharacterType.Ya, DiacriticType.Fatha,
						DiacriticType.Shadda);

		// Alif
		builder.add(CharacterType.Alif);

		// Kaf + Fatha
		builder.add(CharacterType.Kaf, DiacriticType.Fatha);

		// Validate.
		assertEquals("<iy~aAka", builder.toText().toBuckwalter());
	}

	@Test
	public void testYayWithHamzaAbove() {

		// Olaaika.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Alif + Damma + HamzaAbove
		builder.add(CharacterType.Alif, DiacriticType.Damma,
				DiacriticType.HamzaAbove);

		// Waw
		builder.add(CharacterType.Waw);

		// SmallHighRoundedZero
		builder.add(CharacterType.SmallHighRoundedZero);

		// Lam + Fatha
		builder.add(CharacterType.Lam, DiacriticType.Fatha);

		// Alif + Maddah + AlifKhanjareeya
		builder.add(CharacterType.Alif, DiacriticType.Maddah,
				DiacriticType.AlifKhanjareeya);

		// Ya + Kasra + HamzaAbove
		builder.add(CharacterType.Ya, DiacriticType.Kasra,
				DiacriticType.HamzaAbove);

		// Kaf + Fatha
		builder.add(CharacterType.Kaf, DiacriticType.Fatha);

		// Validate.
		assertEquals(">uw@la`^}ika", builder.toText().toBuckwalter());
	}

	@Test
	public void testAlifKhanjareeya() {

		// Al-Rahmaan.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Alif + HamzatWasl
		builder.add(CharacterType.Alif, DiacriticType.HamzatWasl);

		// Lam
		builder.add(CharacterType.Lam);

		// Ra + Fatha + Shadda
		builder
				.add(CharacterType.Ra, DiacriticType.Fatha,
						DiacriticType.Shadda);

		// HHa + Sukun
		builder.add(CharacterType.HHa, DiacriticType.Sukun);

		// Meem + Fatha
		builder.add(CharacterType.Meem, DiacriticType.Fatha);

		// Alif + AlifKhanjareeya
		builder.add(CharacterType.Alif, DiacriticType.AlifKhanjareeya);

		// Noon + Kasra
		builder.add(CharacterType.Noon, DiacriticType.Kasra);

		// Validate.
		assertEquals("{lr~aHoma`ni", builder.toText().toBuckwalter());
	}

	@Test
	public void testAlifWithHamzatWasl() {

		// Allah.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Alif + HamzatWasl
		builder.add(CharacterType.Alif, DiacriticType.HamzatWasl);

		// Lam
		builder.add(CharacterType.Lam);

		// Lam + Fatha + Shadda
		builder.add(CharacterType.Lam, DiacriticType.Fatha,
				DiacriticType.Shadda);

		// Ha + Kasra
		builder.add(CharacterType.Ha, DiacriticType.Kasra);

		// Validate.
		assertEquals("{ll~ahi", builder.toText().toBuckwalter());
	}

	@Test
	public void testHamzaAbove() {

		// Anbioonee.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Alif + Fatha + HamzaAbove
		builder.add(CharacterType.Alif, DiacriticType.Fatha,
				DiacriticType.HamzaAbove);

		// Noon
		builder.add(CharacterType.Noon);

		// SmallHighMeemIsolatedForm
		builder.add(CharacterType.SmallHighMeemIsolatedForm);

		// Ba + Kasra
		builder.add(CharacterType.Ba, DiacriticType.Kasra);

		// Tatweel + Damma + HamzaAbove
		builder.add(CharacterType.Tatweel, DiacriticType.Damma,
				DiacriticType.HamzaAbove);

		// Waw
		builder.add(CharacterType.Waw);

		// Noon + Kasra
		builder.add(CharacterType.Noon, DiacriticType.Kasra);

		// AlifMaksura
		builder.add(CharacterType.AlifMaksura);

		// Validate.
		assertEquals(">an[bi_#uwniY", builder.toText().toBuckwalter());
	}

	@Test
	public void testFathatan() {

		// Hoddan.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Ha + Damma
		builder.add(CharacterType.Ha, DiacriticType.Damma);

		// Dal + Fathatan
		builder.add(CharacterType.Dal, DiacriticType.Fathatan);

		// AlifMaksura
		builder.add(CharacterType.AlifMaksura);

		// Validate.
		assertEquals("hudFY", builder.toText().toBuckwalter());
	}

	@Test
	public void testDammatan() {

		// Sawaoon.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// Seen + Fatha
		builder.add(CharacterType.Seen, DiacriticType.Fatha);

		// Waw + Fatha
		builder.add(CharacterType.Waw, DiacriticType.Fatha);

		// Alif + Maddah
		builder.add(CharacterType.Alif, DiacriticType.Maddah);

		// Hamza + Dammatan
		builder.add(CharacterType.Hamza, DiacriticType.Dammatan);

		// Validate.
		assertEquals("sawaA^'N", builder.toText().toBuckwalter());
	}

	@Test
	public void testKastratan() {

		// Dthulumaatin.
		ArabicTextBuilder builder = new ArabicTextBuilder();

		// DTha + Damma
		builder.add(CharacterType.DTha, DiacriticType.Damma);

		// Lam + Damma
		builder.add(CharacterType.Lam, DiacriticType.Damma);

		// Meem + Fatha
		builder.add(CharacterType.Meem, DiacriticType.Fatha);

		// Alif + AlifKhanjareeya
		builder.add(CharacterType.Alif, DiacriticType.AlifKhanjareeya);

		// Ta + Kasratan
		builder.add(CharacterType.Ta, DiacriticType.Kasratan);

		// Validate.
		assertEquals("Zuluma`tK", builder.toText().toBuckwalter());
	}
}
