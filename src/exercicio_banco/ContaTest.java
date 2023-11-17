package exercicio_banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaTest {
	
	Conta origem;
	Conta destino;
	Conta universitaria;
	
	@BeforeEach
	void executaAntes() {
		origem = new Conta();
		origem.setSaldo(100);
		origem.setNumero(123);
		origem.setAgencia(456);
		origem.setCliente("Cliente 1");
		
		destino = new Conta(100, 100, "A", 100);
		
		universitaria = new ContaUniversitaria(1,1,"U",100);
	}

	@Test 
	void depositoTest() {
		assertTrue(origem.deposito(100));
		assertEquals(200, origem.getSaldo());
	}
	
	@Test
	void saquePossivelTest() {
		assertTrue(origem.saque(50));
		assertEquals(50, origem.getSaldo());
	}
	@Test
	void saqueImpossivelTest() {
		assertFalse(origem.saque(200));
		assertEquals(100, origem.getSaldo());
	}
	
	@Test
	void toStringTest() {
		assertEquals("A", destino.getCliente());
		assertEquals(456, origem.getAgencia());
		assertEquals("100-A- R$100.0\n", destino.toString());
	}
	
	@Test
	void TransferenciaPossivelTest() {
		assertTrue(origem.transferencia(destino, 50));
		assertEquals(50, origem.getSaldo());
		assertEquals(150, destino.getSaldo());
	}
	
	@Test
	void TransferenciaImpossivelTest() {
		assertFalse(origem.transferencia(destino, 200));
		assertEquals(100, origem.getSaldo());
		assertEquals(100, destino.getSaldo());
	}
	
	@Test
	void TransferenciaContaUniversitariaFail() {
		origem.setSaldo(5000);
		assertFalse(origem.transferencia(universitaria, 4000));
		assertEquals(5000, origem.getSaldo());
		assertEquals(100, universitaria.getSaldo());
	}

}
