/**
 * Объявление пакета, в котором находится класс.
 */
package tests;
/**
 * Добавление библиотеки для тестирования.
 */
import static org.junit.jupiter.api.Assertions.*;
/**
 * Добавление библиотеки для тестирования.
 */
import org.junit.jupiter.api.Test;
/**
 * Добавление библиотек для проверки результата теста.
 */
import junit.framework.Assert;
/**
 * Добавление классов выполнения расчёта напряжения для жилых помещений.
 */
import kk.f1;
/**
 * Создание класса для тестирования номинала напряжения в электрической цепи.
 */
public class test5 {
	/**
	 * Создание тестовых методов.
	 */
	@Test
	void test5() {
		/**
		 * Максимальная мощность 110.
		 * Напряжение сети 220.
		 * Необходимый коэффициент для расчёта 1.2.
		 */
		  float k1=(float)110,r1=(float) ((k1*1.2)/220);
		  /**
		   * result1-значение из функции sums, расположенный в классе f1.
		   */
			float result1=f1.sums(k1,r1);
			/**
			 * tests -выходное значение.
			 */
			float tests= (float)0.600;
			/**
			   * итоговая проверка, tests и result1 сравниваются на равенство.
			   */
	    Assert.assertEquals(tests, result1);
	   /**
		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
		*/
	}
	/**
	 * Окончание создания класса для расчёта номинала в электрической цепи для жилых помещений.
	 */	
}
