/**
 * Remove todas as ocorrências de um valor especificado do array fornecido, modificando-o in-place.
 * O método altera o array de entrada para que a primeira parte contenha os elementos diferentes do valor especificado.
 * A ordem relativa dos elementos pode ser alterada. Após a remoção, o método retorna o novo tamanho do array.
 *
 * @param nums o array de inteiros de entrada
 * @param val o valor a ser removido do array
 * @return o número de elementos restantes após a remoção do valor especificado
 */
public class RemoverElemento {
    public int removeElement(int[] nums, int val) {

        int j = 0;
          
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;  
    }
}
// Funciona apenas no LeetCode;